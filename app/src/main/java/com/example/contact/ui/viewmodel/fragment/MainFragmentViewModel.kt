package com.example.contact.ui.viewmodel.fragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contact.Action
import com.example.contact.data.database.entities.ContactEntity
import com.example.contact.domain.usecase.DeleteContactUseCase
import com.example.contact.domain.usecase.LoadAllContactsUseCase
import com.example.contact.domain.usecase.SearchByNameUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainFragmentViewModel @Inject constructor(
    private val loadAllContactsUseCase: LoadAllContactsUseCase,
    private val searchByNameUseCase: SearchByNameUseCase,
    private val deleteContactUseCase: DeleteContactUseCase,
) : ViewModel() {
    val contactList: Flow<List<ContactEntity>> = loadAllContactsUseCase()

    private val _contactListState = MutableStateFlow<List<ContactEntity>>(emptyList())
    val contactListState = _contactListState.asStateFlow()

    //for select approach
    private val _selectedIds = MutableStateFlow<List<Int>>(emptyList())
    val selectedIds = _selectedIds.asStateFlow()

    init {
        getAllContacts()
    }

    fun getAllContacts() = viewModelScope.launch {
        _contactListState.update {
            contactList.first()
        }
    }

    fun searchContactByName(name: String) {
        _contactListState.update {
            searchByNameUseCase(name)
        }
    }

    fun selectId(id: Int) {
        val ids = _selectedIds.value.toMutableList()

        if (ids.contains(id))
            ids.remove(id)
        else
            ids.add(id)

        _selectedIds.update {
            ids
        }
    }

    fun onSelectedAction(action: Action) = viewModelScope.launch {
        val ids = _selectedIds.value.toMutableList()
        when (action) {
            Action.Delete -> {
                for (i1 in ids)
                    deleteContactUseCase(i1)
            }
            Action.Clear -> {}
        }
        ids.clear()
        _selectedIds.update {
            ids
        }
    }
}