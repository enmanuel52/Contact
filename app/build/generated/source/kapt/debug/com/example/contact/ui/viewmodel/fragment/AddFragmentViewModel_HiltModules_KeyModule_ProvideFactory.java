// Generated by Dagger (https://dagger.dev).
package com.example.contact.ui.viewmodel.fragment;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddFragmentViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static AddFragmentViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(AddFragmentViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final AddFragmentViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new AddFragmentViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
