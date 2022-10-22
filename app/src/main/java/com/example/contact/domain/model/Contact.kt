package com.example.contact.domain.model

import com.example.contact.data.database.entities.ContactEntity

data class Contact(
    val id: Int,
    val name: String,
    val number: Long,
    val image: String?,
)

fun ContactEntity.toDomain() = Contact(id = id, name = name, number = number, image = urlPicture)