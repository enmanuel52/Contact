package com.example.contact.ui.view.fragment

import android.app.Activity.RESULT_OK
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.contact.R
import com.example.contact.data.database.entities.ContactEntity
import com.example.contact.databinding.FragmentAddBinding
import com.example.contact.ui.viewmodel.fragment.AddFragmentViewModel
import com.example.contact.utils.MyClicListenner
import com.example.contact.utils.showBottomSheetLayout
import com.github.dhaval2404.imagepicker.ImagePicker
import com.google.android.material.snackbar.Snackbar
import com.squareup.picasso.Picasso
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddFragment : Fragment() {

    private lateinit var _binding: FragmentAddBinding
    private val binding get() = _binding

    private val args by navArgs<AddFragmentArgs>()

    private val addFragmentViewModel: AddFragmentViewModel by viewModels()

    private lateinit var imagePicker: ImagePicker.Builder

    private var url: String? = null

    private val pictureResponse =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if (it.resultCode == RESULT_OK) {
                val uri = it.data?.data
                if (uri != null) {
                    url = uri.path
                    binding.avatar.setImageURI(uri)
                }
            }
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentAddBinding.inflate(inflater, container, false)

        //Body

        imagePicker = getImagePicker()
        initListenners()
        addFragmentViewModel.onCreate(args.id)
        subscribeUi()

        return binding.root
    }

    private fun subscribeUi() {
        addFragmentViewModel.contact.observe(viewLifecycleOwner) {
            if (it != null) {
                binding.etName.setText(it.name, TextView.BufferType.EDITABLE)
                binding.etNumber.setText(it.number.toString(), TextView.BufferType.EDITABLE)
                if (it.urlPicture != null){
                    Uri.parse(it.urlPicture).also { binding.avatar.setImageURI(it) }
                    url = it.urlPicture
                }
                else
                    Picasso.get().load(R.drawable.person_96px).into(binding.avatar)
            }
        }
    }

    private fun initListenners() {
        with(binding) {
            avatarBut.setOnClickListener {
                showBottomSheetLayout(activity = requireActivity(), listenner = object : MyClicListenner {
                    override fun clic(index: Int) {
                        when(index){
                            0 -> takePicture()
                            1 -> takePictureFromGallery()
                            2 -> removePhoto()
                        }
                    }

                })
            }
        }
    }

    private fun removePhoto() {
        binding.avatar.setImageResource(R.drawable.person_96px)
        url = null
    }

    //AppBar
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //menu inflate
        //binding.addToolbar.inflateMenu(R.menu.fragment_add_toolbar)

        //back
        binding.addToolbar.setNavigationIcon(R.drawable.back_icon)
        binding.addToolbar.setNavigationOnClickListener { findNavController().popBackStack() }
        //menu events
        binding.saveBut.setOnClickListener {
                    //save
                    val name = binding.etName.text.toString()
                    val number = binding.etNumber.text.toString()
                    if (name.isNotEmpty() && number.isNotEmpty()) {
                        if (number.length <= 10) {
                            addFragmentViewModel.onSave(
                                ContactEntity(
                                    name = name,
                                    number = number.toLong(),
                                    urlPicture = url,
                                )
                            )

                            findNavController().popBackStack()
                        } else {
                            Snackbar.make(
                                binding.root,
                                "The number is less than 11 digits",
                                Snackbar.LENGTH_SHORT
                            ).show()
                        }
                    } else {
                        Snackbar.make(binding.root, "Fill all fields", Snackbar.LENGTH_SHORT).show()
                    }
        }
    }

    private fun takePicture() {
        imagePicker
            .cameraOnly()
            .createIntent { pictureResponse.launch(it) }
    }

    private fun takePictureFromGallery() {
        imagePicker.galleryOnly()
            /*.galleryMimeTypes(
                mimeTypes = arrayOf(
                    "image/png",
                    "image/jpg",
                    "image/jpeg",
                )
            )*/
            .createIntent { pictureResponse.launch(it) }
    }

    private fun getImagePicker() =
        ImagePicker.with(requireActivity())
            .cropSquare()
            .compress(1024)
            .maxResultSize(512, 512)
}