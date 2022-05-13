package com.example.contact.di

import android.content.Context
import androidx.room.Room
import com.example.contact.data.ContactRepository
import com.example.contact.data.database.ContactDataBase
import com.example.contact.data.database.dao.ContactDao
import com.example.contact.domain.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ContactModule {

    private val ContactDatabaseName = "contact_table"

    @Singleton
    @Provides
    fun provideRoom(@ApplicationContext context: Context) = synchronized(this){
        Room.databaseBuilder(context, ContactDataBase::class.java, ContactDatabaseName)
            .fallbackToDestructiveMigration().
        allowMainThreadQueries().build()
    }

    @Provides
    fun provideContactDao(dataBase: ContactDataBase) = dataBase.getPersonDao()

    @Provides
    fun contactRepo(
        contactDao: ContactDao
    ): Repository = ContactRepository(contactDao)

}