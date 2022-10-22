package com.example.contact.domain.repository

import com.example.contact.data.database.entities.ContactEntity
import kotlinx.coroutines.flow.Flow

interface Repository {

    fun getAllContacts(): Flow<List<ContactEntity>>

    suspend fun insertContact(contactEntity: ContactEntity)

    suspend fun updateContact(contactEntity: ContactEntity)

    suspend fun deleteContact(contactEntity: ContactEntity)

    fun getContact(id: Int): ContactEntity

    fun searchByName(name: String): List<ContactEntity>
}