package com.example.contact.ui.viewmodel.fragment;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/contact/ui/viewmodel/fragment/MainFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "loadAllContactsUseCase", "Lcom/example/contact/domain/usecase/LoadAllContactsUseCase;", "searchByNameUseCase", "Lcom/example/contact/domain/usecase/SearchByNameUseCase;", "(Lcom/example/contact/domain/usecase/LoadAllContactsUseCase;Lcom/example/contact/domain/usecase/SearchByNameUseCase;)V", "contactList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/example/contact/data/database/entities/ContactEntity;", "getContactList", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setContactList", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "getAllContacts", "", "searchContactByName", "name", "", "app_debug"})
public final class MainFragmentViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.contact.domain.usecase.LoadAllContactsUseCase loadAllContactsUseCase = null;
    private final com.example.contact.domain.usecase.SearchByNameUseCase searchByNameUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.contact.data.database.entities.ContactEntity>> contactList;
    
    @javax.inject.Inject()
    public MainFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.example.contact.domain.usecase.LoadAllContactsUseCase loadAllContactsUseCase, @org.jetbrains.annotations.NotNull()
    com.example.contact.domain.usecase.SearchByNameUseCase searchByNameUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.contact.data.database.entities.ContactEntity>> getContactList() {
        return null;
    }
    
    public final void setContactList(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.contact.data.database.entities.ContactEntity>> p0) {
    }
    
    public final void getAllContacts() {
    }
    
    public final void searchContactByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
}