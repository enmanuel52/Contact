package com.example.contact.domain.usecase

import com.example.contact.domain.repository.Repository
import javax.inject.Inject

class SearchByNameUseCase @Inject constructor(
    private val repository: Repository
) {
    operator fun invoke(name: String) = repository.searchByName(name)
}