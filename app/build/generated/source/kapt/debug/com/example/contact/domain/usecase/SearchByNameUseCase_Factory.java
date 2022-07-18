// Generated by Dagger (https://dagger.dev).
package com.example.contact.domain.usecase;

import com.example.contact.domain.repository.Repository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchByNameUseCase_Factory implements Factory<SearchByNameUseCase> {
  private final Provider<Repository> repositoryProvider;

  public SearchByNameUseCase_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SearchByNameUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static SearchByNameUseCase_Factory create(Provider<Repository> repositoryProvider) {
    return new SearchByNameUseCase_Factory(repositoryProvider);
  }

  public static SearchByNameUseCase newInstance(Repository repository) {
    return new SearchByNameUseCase(repository);
  }
}