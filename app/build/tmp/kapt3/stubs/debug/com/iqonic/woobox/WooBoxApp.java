package com.iqonic.woobox;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0004H\u0016\u00a8\u0006\f"}, d2 = {"Lcom/iqonic/woobox/WooBoxApp;", "Landroidx/multidex/MultiDexApplication;", "()V", "attachBaseContext", "", "base", "Landroid/content/Context;", "enableNotification", "isEnabled", "", "onCreate", "Companion", "app_debug"})
public final class WooBoxApp extends androidx.multidex.MultiDexApplication {
    @org.jetbrains.annotations.NotNull()
    public static com.iqonic.woobox.utils.LocaleManager localeManager;
    private static com.iqonic.woobox.WooBoxApp appInstance;
    @org.jetbrains.annotations.Nullable()
    private static com.iqonic.woobox.network.RestApis restApis;
    @org.jetbrains.annotations.Nullable()
    private static okhttp3.OkHttpClient okHttpClient;
    @org.jetbrains.annotations.Nullable()
    private static com.iqonic.woobox.utils.SharedPrefUtils sharedPrefUtils;
    @org.jetbrains.annotations.Nullable()
    private static android.app.Dialog noInternetDialog;
    @org.jetbrains.annotations.NotNull()
    public static java.lang.String language;
    private static int appTheme;
    public static final com.iqonic.woobox.WooBoxApp.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public final void enableNotification(boolean isEnabled) {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    public WooBoxApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J\u000e\u00103\u001a\u0002002\u0006\u00104\u001a\u00020\fJ\u0006\u00105\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u00066"}, d2 = {"Lcom/iqonic/woobox/WooBoxApp$Companion;", "", "()V", "appInstance", "Lcom/iqonic/woobox/WooBoxApp;", "appTheme", "", "getAppTheme", "()I", "setAppTheme", "(I)V", "language", "", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "localeManager", "Lcom/iqonic/woobox/utils/LocaleManager;", "getLocaleManager", "()Lcom/iqonic/woobox/utils/LocaleManager;", "setLocaleManager", "(Lcom/iqonic/woobox/utils/LocaleManager;)V", "noInternetDialog", "Landroid/app/Dialog;", "getNoInternetDialog", "()Landroid/app/Dialog;", "setNoInternetDialog", "(Landroid/app/Dialog;)V", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "setOkHttpClient", "(Lokhttp3/OkHttpClient;)V", "restApis", "Lcom/iqonic/woobox/network/RestApis;", "getRestApis", "()Lcom/iqonic/woobox/network/RestApis;", "setRestApis", "(Lcom/iqonic/woobox/network/RestApis;)V", "sharedPrefUtils", "Lcom/iqonic/woobox/utils/SharedPrefUtils;", "getSharedPrefUtils", "()Lcom/iqonic/woobox/utils/SharedPrefUtils;", "setSharedPrefUtils", "(Lcom/iqonic/woobox/utils/SharedPrefUtils;)V", "changeAppTheme", "", "isDark", "", "changeLanguage", "aLanguage", "getAppInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.utils.LocaleManager getLocaleManager() {
            return null;
        }
        
        public final void setLocaleManager(@org.jetbrains.annotations.NotNull()
        com.iqonic.woobox.utils.LocaleManager p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.iqonic.woobox.network.RestApis getRestApis() {
            return null;
        }
        
        public final void setRestApis(@org.jetbrains.annotations.Nullable()
        com.iqonic.woobox.network.RestApis p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final okhttp3.OkHttpClient getOkHttpClient() {
            return null;
        }
        
        public final void setOkHttpClient(@org.jetbrains.annotations.Nullable()
        okhttp3.OkHttpClient p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.iqonic.woobox.utils.SharedPrefUtils getSharedPrefUtils() {
            return null;
        }
        
        public final void setSharedPrefUtils(@org.jetbrains.annotations.Nullable()
        com.iqonic.woobox.utils.SharedPrefUtils p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.app.Dialog getNoInternetDialog() {
            return null;
        }
        
        public final void setNoInternetDialog(@org.jetbrains.annotations.Nullable()
        android.app.Dialog p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLanguage() {
            return null;
        }
        
        public final void setLanguage(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int getAppTheme() {
            return 0;
        }
        
        public final void setAppTheme(int p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.WooBoxApp getAppInstance() {
            return null;
        }
        
        public final void changeAppTheme(boolean isDark) {
        }
        
        public final void changeLanguage(@org.jetbrains.annotations.NotNull()
        java.lang.String aLanguage) {
        }
        
        private Companion() {
            super();
        }
    }
}