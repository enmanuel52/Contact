package com.example.contact.domain.usecase

import com.example.contact.data.ContactRepository
import javax.inject.Inject

class DeleteContactUseCase @Inject constructor(
    private val repository: ContactRepository,
){
    suspend operator fun invoke(id: Int){
        repository.deleteContactById(id)
    }
}