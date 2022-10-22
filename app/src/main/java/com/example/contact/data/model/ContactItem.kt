package com.example.contact.data.model

import com.example.contact.data.database.entities.ContactEntity

data class ContactItem(
    val id: Int,
    val image: String?,
    val name: String,
    val selected: Boolean = false
)

fun ContactEntity.toContactItem() = ContactItem(this.id, this.urlPicture, this.name)
