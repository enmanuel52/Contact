package com.example.contact.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0019\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0019\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/contact/data/ContactRepository;", "Lcom/example/contact/domain/repository/Repository;", "contactDao", "Lcom/example/contact/data/database/dao/ContactDao;", "(Lcom/example/contact/data/database/dao/ContactDao;)V", "deleteContact", "", "contactEntity", "Lcom/example/contact/data/database/entities/ContactEntity;", "(Lcom/example/contact/data/database/entities/ContactEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteContactById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllContacts", "", "getContact", "insertContact", "searchByName", "name", "", "updateContact", "app_debug"})
public final class ContactRepository implements com.example.contact.domain.repository.Repository {
    private final com.example.contact.data.database.dao.ContactDao contactDao = null;
    
    @javax.inject.Inject()
    public ContactRepository(@org.jetbrains.annotations.NotNull()
    com.example.contact.data.database.dao.ContactDao contactDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.example.contact.data.database.entities.ContactEntity> getAllContacts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertContact(@org.jetbrains.annotations.NotNull()
    com.example.contact.data.database.entities.ContactEntity contactEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateContact(@org.jetbrains.annotations.NotNull()
    com.example.contact.data.database.entities.ContactEntity contactEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteContact(@org.jetbrains.annotations.NotNull()
    com.example.contact.data.database.entities.ContactEntity contactEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.contact.data.database.entities.ContactEntity getContact(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.example.contact.data.database.entities.ContactEntity> searchByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteContactById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}