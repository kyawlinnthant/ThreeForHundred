package com.kyawlinnthant.navigation;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppNavigatorImpl_Factory implements Factory<AppNavigatorImpl> {
  @Override
  public AppNavigatorImpl get() {
    return newInstance();
  }

  public static AppNavigatorImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AppNavigatorImpl newInstance() {
    return new AppNavigatorImpl();
  }

  private static final class InstanceHolder {
    private static final AppNavigatorImpl_Factory INSTANCE = new AppNavigatorImpl_Factory();
  }
}
