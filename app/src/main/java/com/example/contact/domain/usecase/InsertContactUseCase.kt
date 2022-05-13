package com.example.contact.domain.usecase

import com.example.contact.data.ContactRepository
import com.example.contact.data.database.entities.ContactEntity
import javax.inject.Inject

class InsertContactUseCase @Inject constructor(
    private val repository: ContactRepository,
){
    suspend operator fun invoke(contactEntity: ContactEntity){
        repository.insertContact(contactEntity)
    }
}