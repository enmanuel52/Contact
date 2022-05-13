package com.example.contact.data.model

import com.example.contact.data.database.entities.ContactEntity

data class Contact(
    val name: String,
    val number: Int,
)

fun ContactEntity.toDomain() = Contact(name = name, number = number)