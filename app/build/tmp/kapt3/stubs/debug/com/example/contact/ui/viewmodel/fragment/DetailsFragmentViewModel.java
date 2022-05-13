package com.example.contact.ui.viewmodel.fragment;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/contact/ui/viewmodel/fragment/DetailsFragmentViewModel;", "Landroidx/lifecycle/ViewModel;", "loadContactUseCase", "Lcom/example/contact/domain/usecase/LoadContactUseCase;", "deleteContactUseCase", "Lcom/example/contact/domain/usecase/DeleteContactUseCase;", "(Lcom/example/contact/domain/usecase/LoadContactUseCase;Lcom/example/contact/domain/usecase/DeleteContactUseCase;)V", "contact", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/contact/data/database/entities/ContactEntity;", "getContact", "()Landroidx/lifecycle/MutableLiveData;", "onCreate", "", "id", "", "onDelete", "app_debug"})
public final class DetailsFragmentViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.contact.domain.usecase.LoadContactUseCase loadContactUseCase = null;
    private final com.example.contact.domain.usecase.DeleteContactUseCase deleteContactUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.contact.data.database.entities.ContactEntity> contact = null;
    
    @javax.inject.Inject()
    public DetailsFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.example.contact.domain.usecase.LoadContactUseCase loadContactUseCase, @org.jetbrains.annotations.NotNull()
    com.example.contact.domain.usecase.DeleteContactUseCase deleteContactUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.contact.data.database.entities.ContactEntity> getContact() {
        return null;
    }
    
    public final void onCreate(int id) {
    }
    
    public final void onDelete(int id) {
    }
}