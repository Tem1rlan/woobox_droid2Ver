package com.iqonic.woobox.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000V\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001ae\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u00020\u00050\n2#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00050\n2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010\u001a\u000e\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u000e\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u0010\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u001a*\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001a\u00a8\u0006 "}, d2 = {"bodyToString", "", "request", "Lokhttp3/Request;", "callApi", "", "T", "call", "Lretrofit2/Call;", "onApiSuccess", "Lkotlin/Function1;", "onApiError", "Lkotlin/ParameterName;", "name", "aError", "onNetworkError", "Lkotlin/Function0;", "getErrorMessageByHttpCode", "aHttpCode", "", "getJsonMsg", "errorBody", "Lokhttp3/ResponseBody;", "getRestApis", "Lcom/iqonic/woobox/network/RestApis;", "useSignature", "", "logData", "response", "time", "", "isError", "app_debug"})
public final class NetworkExtensionsKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final com.iqonic.woobox.network.RestApis getRestApis(boolean useSignature) {
        return null;
    }
    
    public static final <T extends java.lang.Object>void callApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Call<T> call, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onApiSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onApiError, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onNetworkError) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String bodyToString(@org.jetbrains.annotations.Nullable()
    okhttp3.Request request) {
        return null;
    }
    
    public static final void logData(@org.jetbrains.annotations.NotNull()
    okhttp3.Request request, @org.jetbrains.annotations.NotNull()
    java.lang.String response, long time, boolean isError) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getJsonMsg(@org.jetbrains.annotations.NotNull()
    okhttp3.ResponseBody errorBody) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getErrorMessageByHttpCode(int aHttpCode) {
        return null;
    }
}