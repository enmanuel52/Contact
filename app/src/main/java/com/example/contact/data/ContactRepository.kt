package com.example.contact.data

import com.example.contact.data.database.dao.ContactDao
import com.example.contact.data.database.entities.ContactEntity
import com.example.contact.domain.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class ContactRepository @Inject constructor(
    private val contactDao: ContactDao
): Repository{

    //only from database
    override fun getAllContacts()= contactDao.getAllContacts()

    override suspend fun insertContact(contactEntity: ContactEntity) = withContext(Dispatchers.IO){
        contactDao.insertContact(contactEntity)
    }

    override suspend fun updateContact(contactEntity: ContactEntity) = contactDao.updateContact(contactEntity)

    override suspend fun deleteContact(contactEntity: ContactEntity) = contactDao.deleteContact(contactEntity)

    override fun getContact(id: Int): ContactEntity = contactDao.getContact(id)

    override fun searchByName(name: String): List<ContactEntity> = contactDao.searchByName(name)

    suspend fun deleteContactById(id: Int) = contactDao.deleteContactById(id)
}