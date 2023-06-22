package com.kyawlinnthant.dispatchers;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.CoroutineDispatcher;

@ScopeMetadata
@QualifierMetadata("com.kyawlinnthant.dispatchers.DispatchersModule.UNCONFINED")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DispatchersModule_ProvideUnconfinedDispatcherFactory implements Factory<CoroutineDispatcher> {
  @Override
  public CoroutineDispatcher get() {
    return provideUnconfinedDispatcher();
  }

  public static DispatchersModule_ProvideUnconfinedDispatcherFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CoroutineDispatcher provideUnconfinedDispatcher() {
    return Preconditions.checkNotNullFromProvides(DispatchersModule.INSTANCE.provideUnconfinedDispatcher());
  }

  private static final class InstanceHolder {
    private static final DispatchersModule_ProvideUnconfinedDispatcherFactory INSTANCE = new DispatchersModule_ProvideUnconfinedDispatcherFactory();
  }
}
