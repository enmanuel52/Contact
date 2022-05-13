package com.example.contact.domain.usecase

import com.example.contact.data.ContactRepository
import com.example.contact.domain.repository.Repository
import javax.inject.Inject

class LoadAllContactsUseCase @Inject constructor(
    private val repository: Repository
) {
    operator fun invoke() = repository.getAllContacts()
}