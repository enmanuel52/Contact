package com.example.contact.ui.view.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contact.ClicListenner
import com.example.contact.R
import com.example.contact.data.model.toDomain
import com.example.contact.databinding.FragmentMainBinding
import com.example.contact.ui.adapter.RecyclerAdapter
import com.example.contact.ui.viewmodel.fragment.MainFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainFragment : Fragment(), ClicListenner {
    lateinit var _binding: FragmentMainBinding
    val binding get() = _binding
    private lateinit var recyclerAdapter: RecyclerAdapter

    private val mainFragmentViewModel: MainFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        //BODY
        recyclerAdapter = RecyclerAdapter(this)

        binding.mainRecycler.layoutManager = LinearLayoutManager(requireContext())
        binding.mainRecycler.adapter = recyclerAdapter

        updateRecyclerAdapter()

        return binding.root
    }

    private fun updateRecyclerAdapter() {
        lifecycleScope.launch{
            mainFragmentViewModel.updateView()
            mainFragmentViewModel.contactList.collect {
                recyclerAdapter.items = it
            }
        }
    }

    override fun onResume() {
        super.onResume()
        updateRecyclerAdapter()
    }

    override fun clic(id: Int) { //send the info
        findNavController().navigate(MainFragmentDirections.actionMainFragmentToDetailsFragment(id))
    }

    //AppBar
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //menu inflate
        binding.mainToolbar.inflateMenu(R.menu.fragment_main_toolbar)
        //menu events
        binding.mainToolbar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.addIcon -> {
                    //to add with null
                    findNavController().navigate(MainFragmentDirections.actionMainFragmentToAddFragment())
                    true
                }
                R.id.deleteIcon -> {
                    //after
                    true
                }
                else -> true
            }
        }
    }
}