package com.example.contact.data.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fH\'J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/contact/data/database/dao/ContactDao;", "", "deleteContact", "", "contactEntity", "Lcom/example/contact/data/database/entities/ContactEntity;", "(Lcom/example/contact/data/database/entities/ContactEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteContactByName", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllContacts", "Landroidx/lifecycle/LiveData;", "", "getContact", "insertContact", "updateContact", "app_debug"})
public abstract interface ContactDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM contact_table ORDER BY name ASC")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.contact.data.database.entities.ContactEntity>> getAllContacts();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM contact_table WHERE id LIKE :id ")
    public abstract com.example.contact.data.database.entities.ContactEntity getContact(int id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertContact(@org.jetbrains.annotations.NotNull()
    com.example.contact.data.database.entities.ContactEntity contactEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object updateContact(@org.jetbrains.annotations.NotNull()
    com.example.contact.data.database.entities.ContactEntity contactEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteContact(@org.jetbrains.annotations.NotNull()
    com.example.contact.data.database.entities.ContactEntity contactEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM contact_table WHERE id = :id")
    public abstract java.lang.Object deleteContactByName(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}