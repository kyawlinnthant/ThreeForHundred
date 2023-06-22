package com.kyawlinnthant.dispatchers;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@QualifierMetadata("com.kyawlinnthant.dispatchers.DispatchersModule.DEFAULT")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DispatchersModule_ProvideDefaultDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return provideDefaultDispatcher();
  }

  public static DispatchersModule_ProvideDefaultDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher provideDefaultDispatcher() {
    return Preconditions.checkNotNullFromProvides(DispatchersModule.INSTANCE.provideDefaultDispatcher());
  }

  private static final class InstanceHolder {
    private static final DispatchersModule_ProvideDefaultDispatcherFactory INSTANCE = new DispatchersModule_ProvideDefaultDispatcherFactory();
  }
}
