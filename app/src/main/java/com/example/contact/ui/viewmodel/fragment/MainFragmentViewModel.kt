package com.example.contact.ui.viewmodel.fragment

import android.util.Log
import androidx.lifecycle.LiveData
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
    val contactList: MutableStateFlow<List<ContactEntity>> = MutableStateFlow(emptyList())

    private val _selectedIds = MutableStateFlow<List<Int>>(emptyList())
    val seletedIds = _selectedIds.asStateFlow()

    fun getAllContacts() {
        contactList.value = loadAllContactsUseCase()
    }

    fun searchContactByName(name: String) {
        contactList.value = searchByNameUseCase(name)
    }

    fun updateIds(action: Action, id: Int? = null) = viewModelScope.launch {
        val ids = _selectedIds.value.toMutableList()
        when (action) {
            Action.Delete -> {
                for (i1 in ids)
                    deleteContactUseCase(i1)
                    getAllContacts()

                ids.clear()
            }
            Action.Select -> {
                if (ids.contains(id))
                    ids.remove(id)
                else
                    ids.add(id!!)
            }
            Action.Clear -> {
                ids.clear()
            }
        }
        Log.d("My Ids", ids.toString())
        _selectedIds.update {
            ids
        }
    }
}