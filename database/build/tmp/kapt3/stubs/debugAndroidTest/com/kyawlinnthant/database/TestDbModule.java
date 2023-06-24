package com.kyawlinnthant.database;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/kyawlinnthant/database/TestDbModule;", "", "()V", "provideInMemoryDb", "Lcom/kyawlinnthant/database/QuoteDatabase;", "context", "Landroid/content/Context;", "database_debugAndroidTest"})
@dagger.hilt.testing.TestInstallIn(components = {dagger.hilt.components.SingletonComponent.class}, replaces = {com.kyawlinnthant.database.DbModule.class})
public final class TestDbModule {
    @org.jetbrains.annotations.NotNull
    public static final com.kyawlinnthant.database.TestDbModule INSTANCE = null;
    
    private TestDbModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.kyawlinnthant.database.QuoteDatabase provideInMemoryDb(@dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
}