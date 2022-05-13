package com.example.contact.domain.usecase

import com.example.contact.data.ContactRepository
import com.example.contact.data.database.entities.ContactEntity
import javax.inject.Inject

class UpdateContactUseCase @Inject constructor(
    private val repository: ContactRepository,
){
    suspend operator fun invoke(contactEntity: ContactEntity){
        repository.updateContact(contactEntity)
    }
}