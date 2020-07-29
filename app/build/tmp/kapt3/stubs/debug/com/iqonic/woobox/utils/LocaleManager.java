package com.iqonic.woobox.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003J\u0016\u0010\u0012\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/iqonic/woobox/utils/LocaleManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "language", "", "getLanguage", "()Ljava/lang/String;", "persistLanguage", "", "setLocale", "c", "setLocaleForApi24", "config", "Landroid/content/res/Configuration;", "target", "Ljava/util/Locale;", "setNewLocale", "updateResources", "Companion", "app_debug"})
public final class LocaleManager {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LANGUAGE_ENGLISH = "en";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LANGUAGE_UKRAINIAN = "uk";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LANGUAGE_RUSSIAN = "ru";
    private static final java.lang.String LANGUAGE_KEY = "language_key";
    public static final com.iqonic.woobox.utils.LocaleManager.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context setLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context c) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context setNewLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context c, @org.jetbrains.annotations.NotNull()
    java.lang.String language) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"ApplySharedPref"})
    private final void persistLanguage(java.lang.String language) {
    }
    
    private final android.content.Context updateResources(android.content.Context context, java.lang.String language) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.N)
    private final void setLocaleForApi24(android.content.res.Configuration config, java.util.Locale target) {
    }
    
    public LocaleManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/iqonic/woobox/utils/LocaleManager$Companion;", "", "()V", "LANGUAGE_ENGLISH", "", "getLANGUAGE_ENGLISH", "()Ljava/lang/String;", "LANGUAGE_KEY", "LANGUAGE_RUSSIAN", "getLANGUAGE_RUSSIAN", "LANGUAGE_UKRAINIAN", "getLANGUAGE_UKRAINIAN", "getLocale", "Ljava/util/Locale;", "res", "Landroid/content/res/Resources;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLANGUAGE_ENGLISH() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLANGUAGE_UKRAINIAN() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLANGUAGE_RUSSIAN() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Locale getLocale(@org.jetbrains.annotations.NotNull()
        android.content.res.Resources res) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}