package com.example.contact.data.database.dao

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.*
import com.example.contact.data.database.entities.ContactEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao {

    @Query("SELECT * FROM contact_table ORDER BY name ASC")
    fun getAllContacts(): List<ContactEntity>

    @Query("SELECT * FROM contact_table WHERE id LIKE :id ")
    fun getContact(id: Int): ContactEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertContact(contactEntity: ContactEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateContact(contactEntity: ContactEntity)

    @Delete
    suspend fun deleteContact(contactEntity: ContactEntity)

    @Query("DELETE FROM contact_table WHERE id = :id")
    suspend fun deleteContactByName(id: Int)
}