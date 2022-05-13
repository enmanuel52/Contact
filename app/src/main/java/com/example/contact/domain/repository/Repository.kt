package com.example.contact.domain.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.contact.data.database.entities.ContactEntity

interface Repository {

    fun getAllContacts(): LiveData<List<ContactEntity>>

    suspend fun insertContact(contactEntity: ContactEntity)

    suspend fun updateContact(contactEntity: ContactEntity)

    suspend fun deleteContact(contactEntity: ContactEntity)

    fun getContact(id: Int): ContactEntity
}