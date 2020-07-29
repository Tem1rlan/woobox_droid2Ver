package com.iqonic.woobox.utils.oauthInterceptor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0018\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/iqonic/woobox/utils/oauthInterceptor/Preconditions;", "", "()V", "DEFAULT_MESSAGE", "", "URL_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "check", "", "requirements", "", "error", "checkEmptyString", "string", "errorMsg", "checkNotNull", "object", "checkValidOAuthCallback", "url", "checkValidUrl", "isUrl", "app_debug"})
public final class Preconditions {
    private static final java.lang.String DEFAULT_MESSAGE = "Received an invalid parameter";
    private static final java.util.regex.Pattern URL_PATTERN = null;
    public static final com.iqonic.woobox.utils.oauthInterceptor.Preconditions INSTANCE = null;
    
    public final void checkNotNull(@org.jetbrains.annotations.Nullable()
    java.lang.Object object, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMsg) {
    }
    
    public final void checkEmptyString(@org.jetbrains.annotations.Nullable()
    java.lang.String string, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMsg) {
    }
    
    public final void checkValidUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMsg) {
    }
    
    public final void checkValidOAuthCallback(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMsg) {
    }
    
    private final boolean isUrl(java.lang.String url) {
        return false;
    }
    
    private final void check(boolean requirements, java.lang.String error) {
    }
    
    private Preconditions() {
        super();
    }
}