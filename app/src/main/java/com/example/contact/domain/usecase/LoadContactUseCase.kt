package com.example.contact.domain.usecase

import com.example.contact.domain.repository.Repository
import javax.inject.Inject

class LoadContactUseCase @Inject constructor(
    private val repository: Repository
) {
    operator fun invoke(id: Int) = repository.getContact(id)
}