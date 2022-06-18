package com.example.contact.ui.view.fragment

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contact.ClicListenner
import com.example.contact.R
import com.example.contact.databinding.FragmentMainBinding
import com.example.contact.ui.adapter.RecyclerAdapter
import com.example.contact.ui.viewmodel.fragment.MainFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainFragment : Fragment(), ClicListenner {
    private lateinit var _binding: FragmentMainBinding
    private val binding get() = _binding
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
        setListenners()

        return binding.root
    }

    private fun setListenners() {
        binding.addBut.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToAddFragment())
        }
    }

    private fun updateRecyclerAdapter() {
        mainFragmentViewModel.getAllContacts()

        viewLifecycleOwner.lifecycleScope.launch {
            mainFragmentViewModel.contactList.flowWithLifecycle(lifecycle, Lifecycle.State.STARTED)
                .collectLatest {
                    recyclerAdapter.items = it
                    recyclerAdapter.notifyDataSetChanged()
                }
        }
    }

    override fun clic(id: Int) { //send the info
        findNavController().navigate(MainFragmentDirections.actionMainFragmentToDetailsFragment(id))
    }

    //AppBar
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //menu inflate
        binding.mainToolbar.inflateMenu(R.menu.fragment_main_toolbar)

        //set the searchView
        val searchManager = requireActivity().getSystemService(Context.SEARCH_SERVICE) as SearchManager
        (binding.mainToolbar.menu.findItem(R.id.searchIcon).actionView as SearchView).apply {
            // Assumes current activity is the searchable activity
            setSearchableInfo(searchManager.getSearchableInfo(requireActivity().componentName))


            setOnQueryTextListener(object: SearchView.OnQueryTextListener{
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return true
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    //search contacts
                    if(newText != null) {
                        mainFragmentViewModel.searchContactByName(name = newText)
                    }
                    else
                        mainFragmentViewModel.getAllContacts()

                    return true
                }

            })

            setOnQueryTextFocusChangeListener { _, b ->
                if(!b){
                    //show all contacts
                    mainFragmentViewModel.getAllContacts()
                }
            }
        }

        //menu events
        binding.mainToolbar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.deleteIcon -> {
                    //after
                    true
                }
                else -> true
            }
        }
    }
}