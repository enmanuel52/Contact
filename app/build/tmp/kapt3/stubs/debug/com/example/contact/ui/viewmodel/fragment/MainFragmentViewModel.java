package com.example.contact.ui.viewmodel.fragment;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\u001f\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u001fR\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/example/contact/ui/viewmodel/fragment/MainFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "loadAllContactsUseCase", "Lcom/example/contact/domain/usecase/LoadAllContactsUseCase;", "searchByNameUseCase", "Lcom/example/contact/domain/usecase/SearchByNameUseCase;", "deleteContactUseCase", "Lcom/example/contact/domain/usecase/DeleteContactUseCase;", "(Lcom/example/contact/domain/usecase/LoadAllContactsUseCase;Lcom/example/contact/domain/usecase/SearchByNameUseCase;Lcom/example/contact/domain/usecase/DeleteContactUseCase;)V", "_selectedIds", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "", "contactList", "Lcom/example/contact/data/database/entities/ContactEntity;", "getContactList", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "seletedIds", "Lkotlinx/coroutines/flow/StateFlow;", "getSeletedIds", "()Lkotlinx/coroutines/flow/StateFlow;", "getAllContacts", "", "searchContactByName", "name", "", "updateIds", "Lkotlinx/coroutines/Job;", "action", "Lcom/example/contact/Action;", "id", "(Lcom/example/contact/Action;Ljava/lang/Integer;)Lkotlinx/coroutines/Job;", "app_debug"})
public final class MainFragmentViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.contact.domain.usecase.LoadAllContactsUseCase loadAllContactsUseCase = null;
    private final com.example.contact.domain.usecase.SearchByNameUseCase searchByNameUseCase = null;
    private final com.example.contact.domain.usecase.DeleteContactUseCase deleteContactUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.contact.data.database.entities.ContactEntity>> contactList = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<java.lang.Integer>> _selectedIds = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.Integer>> seletedIds = null;
    
    @javax.inject.Inject()
    public MainFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.example.contact.domain.usecase.LoadAllContactsUseCase loadAllContactsUseCase, @org.jetbrains.annotations.NotNull()
    com.example.contact.domain.usecase.SearchByNameUseCase searchByNameUseCase, @org.jetbrains.annotations.NotNull()
    com.example.contact.domain.usecase.DeleteContactUseCase deleteContactUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.contact.data.database.entities.ContactEntity>> getContactList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<java.lang.Integer>> getSeletedIds() {
        return null;
    }
    
    public final void getAllContacts() {
    }
    
    public final void searchContactByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateIds(@org.jetbrains.annotations.NotNull()
    com.example.contact.Action action, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
}