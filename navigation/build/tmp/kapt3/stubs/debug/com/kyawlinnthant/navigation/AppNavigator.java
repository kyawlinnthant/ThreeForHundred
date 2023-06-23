package com.kyawlinnthant.navigation;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH&J0\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\fH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/kyawlinnthant/navigation/AppNavigator;", "", "instructor", "Lkotlinx/coroutines/channels/Channel;", "Lcom/kyawlinnthant/navigation/NavigationIntent;", "getInstructor", "()Lkotlinx/coroutines/channels/Channel;", "back", "", "route", "", "inclusive", "", "to", "popupToRoute", "isSingleTop", "navigation_debug"})
public abstract interface AppNavigator {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.channels.Channel<com.kyawlinnthant.navigation.NavigationIntent> getInstructor();
    
    public abstract void back(@org.jetbrains.annotations.Nullable
    java.lang.String route, boolean inclusive);
    
    public abstract void to(@org.jetbrains.annotations.NotNull
    java.lang.String route, @org.jetbrains.annotations.Nullable
    java.lang.String popupToRoute, boolean inclusive, boolean isSingleTop);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}