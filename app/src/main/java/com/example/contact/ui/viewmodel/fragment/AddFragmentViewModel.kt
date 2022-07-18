package com.example.contact.ui.viewmodel.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contact.data.database.entities.ContactEntity
import com.example.contact.domain.usecase.InsertContactUseCase
import com.example.contact.domain.usecase.LoadContactUseCase
import com.example.contact.domain.usecase.UpdateContactUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddFragmentViewModel @Inject constructor(
    private val loadContactUseCase: LoadContactUseCase,
    private val insertContactUseCase: InsertContactUseCase,
    private val updateContactUseCase: UpdateContactUseCase
) : ViewModel() {
    val contact = MutableLiveData<ContactEntity?>()

    fun onCreate(id: Int) {
        if (id != -1) {
            viewModelScope.launch {
                contact.value = loadContactUseCase(id)
            }
        }
    }

    fun onSave(contactEntity: ContactEntity) {
        viewModelScope.launch {
            if (contactEntity.id == -1)
                insertContactUseCase(contactEntity)
            else
                updateContactUseCase(contactEntity)
        }
    }
}