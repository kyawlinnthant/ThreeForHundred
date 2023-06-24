package com.kyawlinnthant.database;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TestDbModule_ProvideInMemoryDbFactory implements Factory<QuoteDatabase> {
  private final Provider<Context> contextProvider;

  public TestDbModule_ProvideInMemoryDbFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public QuoteDatabase get() {
    return provideInMemoryDb(contextProvider.get());
  }

  public static TestDbModule_ProvideInMemoryDbFactory create(Provider<Context> contextProvider) {
    return new TestDbModule_ProvideInMemoryDbFactory(contextProvider);
  }

  public static QuoteDatabase provideInMemoryDb(Context context) {
    return Preconditions.checkNotNullFromProvides(TestDbModule.INSTANCE.provideInMemoryDb(context));
  }
}
