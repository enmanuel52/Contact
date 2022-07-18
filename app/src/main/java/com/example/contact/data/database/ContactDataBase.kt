package com.example.contact.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.contact.data.database.dao.ContactDao
import com.example.contact.data.database.entities.ContactEntity

@Database(entities = [ContactEntity::class], version = 4)
abstract class ContactDataBase : RoomDatabase(){

    abstract  fun getPersonDao(): ContactDao
}