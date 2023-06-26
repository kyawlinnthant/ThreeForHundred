package com.kyawlinnthant.database;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class DbModule_ProvideDaoFactory implements Factory<QuoteDao> {
  private final Provider<QuoteDatabase> dbProvider;

  public DbModule_ProvideDaoFactory(Provider<QuoteDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public QuoteDao get() {
    return provideDao(dbProvider.get());
  }

  public static DbModule_ProvideDaoFactory create(Provider<QuoteDatabase> dbProvider) {
    return new DbModule_ProvideDaoFactory(dbProvider);
  }

  public static QuoteDao provideDao(QuoteDatabase db) {
    return Preconditions.checkNotNullFromProvides(DbModule.INSTANCE.provideDao(db));
  }
}
