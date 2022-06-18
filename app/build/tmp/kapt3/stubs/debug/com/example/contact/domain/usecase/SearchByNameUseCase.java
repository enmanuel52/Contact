package com.example.contact.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/contact/domain/usecase/SearchByNameUseCase;", "", "repository", "Lcom/example/contact/domain/repository/Repository;", "(Lcom/example/contact/domain/repository/Repository;)V", "invoke", "", "Lcom/example/contact/data/database/entities/ContactEntity;", "name", "", "app_debug"})
public final class SearchByNameUseCase {
    private final com.example.contact.domain.repository.Repository repository = null;
    
    @javax.inject.Inject()
    public SearchByNameUseCase(@org.jetbrains.annotations.NotNull()
    com.example.contact.domain.repository.Repository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.contact.data.database.entities.ContactEntity> invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
}