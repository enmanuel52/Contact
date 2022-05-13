package com.example.contact.ui.viewmodel.fragment;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/contact/ui/viewmodel/fragment/AddFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "loadContactUseCase", "Lcom/example/contact/domain/usecase/LoadContactUseCase;", "insertContactUseCase", "Lcom/example/contact/domain/usecase/InsertContactUseCase;", "updateContactUseCase", "Lcom/example/contact/domain/usecase/UpdateContactUseCase;", "(Lcom/example/contact/domain/usecase/LoadContactUseCase;Lcom/example/contact/domain/usecase/InsertContactUseCase;Lcom/example/contact/domain/usecase/UpdateContactUseCase;)V", "contact", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/contact/data/database/entities/ContactEntity;", "getContact", "()Landroidx/lifecycle/MutableLiveData;", "onCreate", "", "id", "", "onSave", "contactEntity", "app_debug"})
public final class AddFragmentViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.contact.domain.usecase.LoadContactUseCase loadContactUseCase = null;
    private final com.example.contact.domain.usecase.InsertContactUseCase insertContactUseCase = null;
    private final com.example.contact.domain.usecase.UpdateContactUseCase updateContactUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.contact.data.database.entities.ContactEntity> contact = null;
    
    @javax.inject.Inject()
    public AddFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.example.contact.domain.usecase.LoadContactUseCase loadContactUseCase, @org.jetbrains.annotations.NotNull()
    com.example.contact.domain.usecase.InsertContactUseCase insertContactUseCase, @org.jetbrains.annotations.NotNull()
    com.example.contact.domain.usecase.UpdateContactUseCase updateContactUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.contact.data.database.entities.ContactEntity> getContact() {
        return null;
    }
    
    public final void onCreate(int id) {
    }
    
    public final void onSave(@org.jetbrains.annotations.NotNull()
    com.example.contact.data.database.entities.ContactEntity contactEntity) {
    }
}