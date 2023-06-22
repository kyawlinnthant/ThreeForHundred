package com.kyawlinnthant.navigation;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/kyawlinnthant/navigation/NavigationModule;", "", "bindsNavigator", "Lcom/kyawlinnthant/navigation/AppNavigator;", "navigator", "Lcom/kyawlinnthant/navigation/AppNavigatorImpl;", "navigation_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract interface NavigationModule {
    
    @dagger.Binds
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public abstract com.kyawlinnthant.navigation.AppNavigator bindsNavigator(@org.jetbrains.annotations.NotNull
    com.kyawlinnthant.navigation.AppNavigatorImpl navigator);
}