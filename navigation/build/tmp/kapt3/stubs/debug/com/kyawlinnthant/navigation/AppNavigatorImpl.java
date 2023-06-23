package com.kyawlinnthant.navigation;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/kyawlinnthant/navigation/AppNavigatorImpl;", "Lcom/kyawlinnthant/navigation/AppNavigator;", "()V", "instructor", "Lkotlinx/coroutines/channels/Channel;", "Lcom/kyawlinnthant/navigation/NavigationIntent;", "getInstructor", "()Lkotlinx/coroutines/channels/Channel;", "back", "", "route", "", "inclusive", "", "to", "popupToRoute", "isSingleTop", "navigation_debug"})
public final class AppNavigatorImpl implements com.kyawlinnthant.navigation.AppNavigator {
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.Channel<com.kyawlinnthant.navigation.NavigationIntent> instructor = null;
    
    @javax.inject.Inject
    public AppNavigatorImpl() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.Channel<com.kyawlinnthant.navigation.NavigationIntent> getInstructor() {
        return null;
    }
    
    @java.lang.Override
    public void back(@org.jetbrains.annotations.Nullable
    java.lang.String route, boolean inclusive) {
    }
    
    @java.lang.Override
    public void to(@org.jetbrains.annotations.NotNull
    java.lang.String route, @org.jetbrains.annotations.Nullable
    java.lang.String popupToRoute, boolean inclusive, boolean isSingleTop) {
    }
}