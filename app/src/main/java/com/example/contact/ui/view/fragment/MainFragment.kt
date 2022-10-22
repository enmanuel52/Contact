package com.example.contact.ui.view.fragment

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.view.*
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contact.Action
import com.example.contact.R
import com.example.contact.SelectedClickListener
import com.example.contact.databinding.FragmentMainBinding
import com.example.contact.domain.model.toDomain
import com.example.contact.ui.adapter.RecyclerAdapter
import com.example.contact.ui.viewmodel.fragment.MainFragmentViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainFragment : Fragment() {
    private lateinit var _binding: FragmentMainBinding
    private val binding get() = _binding
    private lateinit var recyclerAdapter: RecyclerAdapter

    private val viewModel: MainFragmentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container, false)

        //BODY
        initUi()
        subscribeUi()

        return binding.root
    }

    private fun initUi() {
        binding.addBut.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToAddFragment())
        }

        initRecycler()
    }

    private fun subscribeUi() {

        collectFlow(viewModel.contactList){ list ->
            recyclerAdapter.items = list.map {
                it.toDomain()
            }
            recyclerAdapter.notifyDataSetChanged()
        }

        collectFlow(viewModel.contactListState){ list ->
            recyclerAdapter.items = list.map {
                it.toDomain()
            }
            recyclerAdapter.notifyDataSetChanged()
        }

        collectFlow(viewModel.selectedIds){ list ->
            recyclerAdapter.selectedIds = list
            recyclerAdapter.notifyDataSetChanged()

            binding.mainToolbar.apply {
                if (list.isEmpty()) {
                    title = getString(R.string.app_name)
                    menu.findItem(R.id.deleteIcon).icon.setVisible(false, false)
                } else {
                    title = "${list.size} items selected"
                    menu.findItem(R.id.deleteIcon).icon.setVisible(true, false)
                }
            }
        }


    }

    //AppBar
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //menu inflate
        binding.mainToolbar.inflateMenu(R.menu.fragment_main_toolbar)

        //set the searchView
        val searchManager =
            requireActivity().getSystemService(Context.SEARCH_SERVICE) as SearchManager
        (binding.mainToolbar.menu.findItem(R.id.searchIcon).actionView as SearchView).apply {
            // Assumes current activity is the searchable activity
            setSearchableInfo(searchManager.getSearchableInfo(requireActivity().componentName))


            setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return true
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    //search contacts
                    if (newText != null) {
                        viewModel.searchContactByName(name = newText)
                    } else
                        viewModel.getAllContacts()

                    return true
                }

            })

            setOnQueryTextFocusChangeListener { _, b ->
                if (!b) {
                    //show all contacts
                    viewModel.getAllContacts()
                }
            }
        }

        //menu events
        binding.mainToolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.deleteIcon -> {
                    //after
                    viewModel.onSelectedAction(Action.Delete)
                    true
                }
                else -> true
            }
        }
    }

    private fun initRecycler() {
        recyclerAdapter = RecyclerAdapter(object : SelectedClickListener<Int> {

            override fun getIds(): List<Int> = viewModel.selectedIds.value

            override fun onClick(id: Int) {
                if (getIds().isEmpty()) {
                    //navigate
                    findNavController().navigate(
                        MainFragmentDirections.actionMainFragmentToDetailsFragment(
                            id
                        )
                    )
                } else {
                    viewModel.selectId(id)
                }
            }

            override fun onLongClick(id: Int) {
                viewModel.selectId(id)
            }

        })

        binding.mainRecycler.layoutManager = LinearLayoutManager(requireContext())
        binding.mainRecycler.adapter = recyclerAdapter
    }
}

fun <T> Fragment.collectFlow(flow: Flow<T>, collect: suspend (T) -> Unit) {
    viewLifecycleOwner.lifecycleScope.launch {
        repeatOnLifecycle(Lifecycle.State.STARTED){
            flow.collectLatest(collect)
        }
    }
}