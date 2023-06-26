package com.kyawlinnthant.dispatchers;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/kyawlinnthant/dispatchers/DispatchersModule;", "", "()V", "provideDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideIoDispatcher", "provideMainDispatcher", "provideUnconfinedDispatcher", "DEFAULT", "IO", "MAIN", "UNCONFINED", "dispatchers_release"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class DispatchersModule {
    @org.jetbrains.annotations.NotNull
    public static final com.kyawlinnthant.dispatchers.DispatchersModule INSTANCE = null;
    
    private DispatchersModule() {
        super();
    }
    
    @dagger.Provides
    @com.kyawlinnthant.dispatchers.DispatchersModule.DEFAULT
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineDispatcher provideDefaultDispatcher() {
        return null;
    }
    
    @dagger.Provides
    @com.kyawlinnthant.dispatchers.DispatchersModule.IO
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
        return null;
    }
    
    @dagger.Provides
    @com.kyawlinnthant.dispatchers.DispatchersModule.MAIN
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineDispatcher provideMainDispatcher() {
        return null;
    }
    
    @dagger.Provides
    @com.kyawlinnthant.dispatchers.DispatchersModule.UNCONFINED
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineDispatcher provideUnconfinedDispatcher() {
        return null;
    }
    
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
    @javax.inject.Qualifier
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/kyawlinnthant/dispatchers/DispatchersModule$DEFAULT;", "", "dispatchers_release"})
    public static abstract @interface DEFAULT {
    }
    
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
    @javax.inject.Qualifier
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/kyawlinnthant/dispatchers/DispatchersModule$IO;", "", "dispatchers_release"})
    public static abstract @interface IO {
    }
    
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
    @javax.inject.Qualifier
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/kyawlinnthant/dispatchers/DispatchersModule$MAIN;", "", "dispatchers_release"})
    public static abstract @interface MAIN {
    }
    
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
    @javax.inject.Qualifier
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/kyawlinnthant/dispatchers/DispatchersModule$UNCONFINED;", "", "dispatchers_release"})
    public static abstract @interface UNCONFINED {
    }
}