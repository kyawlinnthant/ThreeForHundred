package com.kyawlinnthant.database;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class QuoteDaoTest_MembersInjector implements MembersInjector<QuoteDaoTest> {
  private final Provider<QuoteDatabase> dbProvider;

  public QuoteDaoTest_MembersInjector(Provider<QuoteDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  public static MembersInjector<QuoteDaoTest> create(Provider<QuoteDatabase> dbProvider) {
    return new QuoteDaoTest_MembersInjector(dbProvider);
  }

  @Override
  public void injectMembers(QuoteDaoTest instance) {
    injectDb(instance, dbProvider.get());
  }

  @InjectedFieldSignature("com.kyawlinnthant.database.QuoteDaoTest.db")
  public static void injectDb(QuoteDaoTest instance, QuoteDatabase db) {
    instance.db = db;
  }
}
