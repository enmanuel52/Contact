package com.example.contact.ui.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.contact.R
import com.example.contact.data.database.entities.ContactEntity
import com.example.contact.databinding.FragmentAddBinding
import com.example.contact.ui.viewmodel.fragment.AddFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddFragment : Fragment() {

    private lateinit var _binding: FragmentAddBinding
    private val binding get() = _binding

    private val args by navArgs<AddFragmentArgs>()

    private val addFragmentViewModel: AddFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentAddBinding.inflate(inflater, container, false)

        //Body
        addFragmentViewModel.onCreate(args.id)
        addFragmentViewModel.contact.observe(viewLifecycleOwner) {
            if(it != null){
                binding.etName.setText(it.name, TextView.BufferType.EDITABLE)
                binding.etNumber.setText(it.number.toString(), TextView.BufferType.EDITABLE)
            }
        }

        return binding.root
    }

    //AppBar
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //menu inflate
        binding.addToolbar.inflateMenu(R.menu.fragment_add_toolbar)

        //back
        binding.addToolbar.setNavigationIcon(R.drawable.back_icon)
        binding.addToolbar.setNavigationOnClickListener { findNavController().popBackStack() }
        //menu events
        binding.addToolbar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.saveIcon -> {
                    //save
                    val name = binding.etName.text.toString()
                    val number = binding.etNumber.text.toString()
                    if(name.isNotEmpty() && number.isNotEmpty()) {
                        addFragmentViewModel.onSave(
                            ContactEntity(
                                name = name,
                                number = number.toLong(),
                            )
                        )
                        findNavController().popBackStack()
                    } else{
                        Toast.makeText(requireContext(), "Fill all fields", Toast.LENGTH_SHORT).show()
                    }
                    true
                }
                else -> true
            }
        }
    }
}