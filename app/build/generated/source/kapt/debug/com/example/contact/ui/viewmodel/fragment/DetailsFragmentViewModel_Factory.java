// Generated by Dagger (https://dagger.dev).
package com.example.contact.ui.viewmodel.fragment;

import com.example.contact.domain.usecase.DeleteContactUseCase;
import com.example.contact.domain.usecase.LoadContactUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DetailsFragmentViewModel_Factory implements Factory<DetailsFragmentViewModel> {
  private final Provider<LoadContactUseCase> loadContactUseCaseProvider;

  private final Provider<DeleteContactUseCase> deleteContactUseCaseProvider;

  public DetailsFragmentViewModel_Factory(Provider<LoadContactUseCase> loadContactUseCaseProvider,
      Provider<DeleteContactUseCase> deleteContactUseCaseProvider) {
    this.loadContactUseCaseProvider = loadContactUseCaseProvider;
    this.deleteContactUseCaseProvider = deleteContactUseCaseProvider;
  }

  @Override
  public DetailsFragmentViewModel get() {
    return newInstance(loadContactUseCaseProvider.get(), deleteContactUseCaseProvider.get());
  }

  public static DetailsFragmentViewModel_Factory create(
      Provider<LoadContactUseCase> loadContactUseCaseProvider,
      Provider<DeleteContactUseCase> deleteContactUseCaseProvider) {
    return new DetailsFragmentViewModel_Factory(loadContactUseCaseProvider, deleteContactUseCaseProvider);
  }

  public static DetailsFragmentViewModel newInstance(LoadContactUseCase loadContactUseCase,
      DeleteContactUseCase deleteContactUseCase) {
    return new DetailsFragmentViewModel(loadContactUseCase, deleteContactUseCase);
  }
}
