package com.kyawlinnthant.database;

@dagger.hilt.android.testing.HiltAndroidTest
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0010H\u0007J\b\u0010\u0013\u001a\u00020\u0010H\u0007R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u00020\n8G\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/kyawlinnthant/database/QuoteDaoTest;", "", "()V", "db", "Lcom/kyawlinnthant/database/QuoteDatabase;", "getDb", "()Lcom/kyawlinnthant/database/QuoteDatabase;", "setDb", "(Lcom/kyawlinnthant/database/QuoteDatabase;)V", "mainRule", "Ldagger/hilt/android/testing/HiltAndroidRule;", "getMainRule", "()Ldagger/hilt/android/testing/HiltAndroidRule;", "quoteDao", "Lcom/kyawlinnthant/database/QuoteDao;", "insert_successfully", "", "Lkotlinx/coroutines/test/TestResult;", "setup", "teardown", "database_debugAndroidTest"})
@kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
public final class QuoteDaoTest {
    @org.jetbrains.annotations.NotNull
    private final dagger.hilt.android.testing.HiltAndroidRule mainRule = null;
    @javax.inject.Inject
    public com.kyawlinnthant.database.QuoteDatabase db;
    private com.kyawlinnthant.database.QuoteDao quoteDao;
    
    public QuoteDaoTest() {
        super();
    }
    
    @org.junit.Rule
    @org.jetbrains.annotations.NotNull
    public final dagger.hilt.android.testing.HiltAndroidRule getMainRule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.kyawlinnthant.database.QuoteDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull
    com.kyawlinnthant.database.QuoteDatabase p0) {
    }
    
    @org.junit.Before
    public final void setup() {
    }
    
    @org.junit.After
    public final void teardown() {
    }
    
    @org.junit.Test
    public final void insert_successfully() {
    }
}