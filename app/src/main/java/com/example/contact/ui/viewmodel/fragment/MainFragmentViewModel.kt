package com.example.contact.ui.viewmodel.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.contact.data.database.entities.ContactEntity
import com.example.contact.domain.usecase.LoadAllContactsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class MainFragmentViewModel @Inject constructor(
    private val loadAllContactsUseCase: LoadAllContactsUseCase
) : ViewModel() {
    var contactList: MutableStateFlow<List<ContactEntity>> = MutableStateFlow(emptyList())

    fun updateView(){
        contactList.value = loadAllContactsUseCase()
    }
}