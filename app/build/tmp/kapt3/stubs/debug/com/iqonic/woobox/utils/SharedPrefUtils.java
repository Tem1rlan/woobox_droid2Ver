package com.iqonic.woobox.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\nJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000fJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\fJ\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/iqonic/woobox/utils/SharedPrefUtils;", "", "()V", "mSharedPreferences", "Landroid/content/SharedPreferences;", "mSharedPreferencesEditor", "Landroid/content/SharedPreferences$Editor;", "clear", "", "getBooleanValue", "", "keyFlag", "", "defaultValue", "getIntValue", "", "key", "getLongValue", "", "getStringValue", "removeKey", "setValue", "value", "app_debug"})
public final class SharedPrefUtils {
    private final android.content.SharedPreferences mSharedPreferences = null;
    private android.content.SharedPreferences.Editor mSharedPreferencesEditor;
    
    public final void setValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.Object value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStringValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue) {
        return null;
    }
    
    public final int getIntValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defaultValue) {
        return 0;
    }
    
    public final long getLongValue(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long defaultValue) {
        return 0L;
    }
    
    public final boolean getBooleanValue(@org.jetbrains.annotations.NotNull()
    java.lang.String keyFlag, boolean defaultValue) {
        return false;
    }
    
    public final void removeKey(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    public final void clear() {
    }
    
    public SharedPrefUtils() {
        super();
    }
}