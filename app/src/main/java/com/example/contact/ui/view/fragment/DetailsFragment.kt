package com.example.contact.ui.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.contact.R
import com.example.contact.databinding.FragmentDetailsBinding
import com.example.contact.ui.viewmodel.fragment.DetailsFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class DetailsFragment : Fragment() {

    lateinit var _binding: FragmentDetailsBinding
    val binding get() = _binding
    val args by navArgs<DetailsFragmentArgs>()

    val detailsFragmentViewModel: DetailsFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)

        detailsFragmentViewModel.contact.observe(viewLifecycleOwner){
            binding.etName.text = it.name
            binding.tvNumber.text = it.number.toString()
        }

        detailsFragmentViewModel.onCreate(args.id)

        return binding.root
    }

    override fun onResume() {
        detailsFragmentViewModel.onCreate(args.id)
        super.onResume()
    }

    //AppBar
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //menu inflate
        binding.detailsToolbar.inflateMenu(R.menu.fragment_details_toolbar)

        //back
        binding.detailsToolbar.setNavigationIcon(R.drawable.back_icon)
        binding.detailsToolbar.setNavigationOnClickListener { findNavController().popBackStack() }
        //menu events
        binding.detailsToolbar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.editIcon -> {
                    //to add with a name
                    findNavController().navigate(DetailsFragmentDirections.actionDetailsFragmentToAddFragment(
                        args.id
                        )
                    )
                    true
                }
                R.id.deleteIcon -> {
                    detailsFragmentViewModel.onDelete(
                        args.id
                    )
                    findNavController().popBackStack()
                    true
                }
                else -> true
            }
        }
    }
}