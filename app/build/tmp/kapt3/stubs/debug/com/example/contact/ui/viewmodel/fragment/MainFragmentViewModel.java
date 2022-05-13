package com.example.contact.ui.viewmodel.fragment;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/contact/ui/viewmodel/fragment/MainFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "loadAllContactsUseCase", "Lcom/example/contact/domain/usecase/LoadAllContactsUseCase;", "(Lcom/example/contact/domain/usecase/LoadAllContactsUseCase;)V", "contactList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/contact/data/database/entities/ContactEntity;", "getContactList", "()Landroidx/lifecycle/LiveData;", "setContactList", "(Landroidx/lifecycle/LiveData;)V", "app_debug"})
public final class MainFragmentViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.contact.domain.usecase.LoadAllContactsUseCase loadAllContactsUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.contact.data.database.entities.ContactEntity>> contactList;
    
    @javax.inject.Inject()
    public MainFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.example.contact.domain.usecase.LoadAllContactsUseCase loadAllContactsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.contact.data.database.entities.ContactEntity>> getContactList() {
        return null;
    }
    
    public final void setContactList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.contact.data.database.entities.ContactEntity>> p0) {
    }
}