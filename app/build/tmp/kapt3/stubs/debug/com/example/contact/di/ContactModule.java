package com.example.contact.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/contact/di/ContactModule;", "", "()V", "ContactDatabaseName", "", "contactRepo", "Lcom/example/contact/domain/repository/Repository;", "contactDao", "Lcom/example/contact/data/database/dao/ContactDao;", "provideContactDao", "dataBase", "Lcom/example/contact/data/database/ContactDataBase;", "provideRoom", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class ContactModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.contact.di.ContactModule INSTANCE = null;
    private static final java.lang.String ContactDatabaseName = "contact_table";
    
    private ContactModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.contact.data.database.ContactDataBase provideRoom(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.contact.data.database.dao.ContactDao provideContactDao(@org.jetbrains.annotations.NotNull()
    com.example.contact.data.database.ContactDataBase dataBase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.contact.domain.repository.Repository contactRepo(@org.jetbrains.annotations.NotNull()
    com.example.contact.data.database.dao.ContactDao contactDao) {
        return null;
    }
}