package com.example.contact.ui.viewmodel.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.contact.data.ContactRepository
import com.example.contact.data.database.entities.ContactEntity
import com.example.contact.domain.usecase.DeleteContactUseCase
import com.example.contact.domain.usecase.LoadContactUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailsFragmentViewModel @Inject constructor(
    private val loadContactUseCase: LoadContactUseCase,
    private val deleteContactUseCase: DeleteContactUseCase,
) : ViewModel(){
    val contact = MutableLiveData<ContactEntity>()

    //revisar esto
    fun onCreate(id: Int) {
        contact.value = loadContactUseCase(id)
    }

    fun onDelete(id: Int){
        viewModelScope.launch {
            deleteContactUseCase(id)
        }
    }
}