package com.example.contact.ui;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = ContactApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface ContactApp_GeneratedInjector {
  void injectContactApp(ContactApp contactApp);
}
