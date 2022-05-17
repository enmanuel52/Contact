package com.example.contact.data.model

import com.example.contact.data.database.entities.ContactEntity

data class Contact(
    val name: String,
    val number: Long,
)

fun ContactEntity.toDomain() = Contact(name = name, number = number)