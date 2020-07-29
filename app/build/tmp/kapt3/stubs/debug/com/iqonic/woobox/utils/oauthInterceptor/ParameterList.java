package com.iqonic.woobox.utils.oauthInterceptor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u0015\b\u0010\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006B\u001b\b\u0016\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0000J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\tJ\u0006\u0010\u0015\u001a\u00020\tJ\u0006\u0010\u0016\u001a\u00020\tJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0005J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u000bj\b\u0012\u0004\u0012\u00020\u0005`\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/iqonic/woobox/utils/oauthInterceptor/ParameterList;", "", "()V", "params", "", "Lcom/iqonic/woobox/utils/oauthInterceptor/Parameter;", "(Ljava/util/List;)V", "map", "", "", "(Ljava/util/Map;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "add", "", "key", "value", "addAll", "other", "addQuerystring", "queryString", "asFormUrlEncodedString", "asOauthBaseString", "contains", "", "param", "size", "", "sort", "Companion", "app_debug"})
public final class ParameterList {
    private final java.util.ArrayList<com.iqonic.woobox.utils.oauthInterceptor.Parameter> params = null;
    private static final char QUERY_STRING_SEPARATOR = '?';
    private static final java.lang.String PARAM_SEPARATOR = "&";
    private static final java.lang.String PAIR_SEPARATOR = "=";
    private static final java.lang.String EMPTY_STRING = "";
    public static final com.iqonic.woobox.utils.oauthInterceptor.ParameterList.Companion Companion = null;
    
    public final void add(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String asOauthBaseString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String asFormUrlEncodedString() {
        return null;
    }
    
    public final void addAll(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.utils.oauthInterceptor.ParameterList other) {
    }
    
    public final void addQuerystring(@org.jetbrains.annotations.NotNull()
    java.lang.String queryString) {
    }
    
    public final boolean contains(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.utils.oauthInterceptor.Parameter param) {
        return false;
    }
    
    public final int size() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.woobox.utils.oauthInterceptor.ParameterList sort() {
        return null;
    }
    
    public ParameterList() {
        super();
    }
    
    public ParameterList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.iqonic.woobox.utils.oauthInterceptor.Parameter> params) {
        super();
    }
    
    public ParameterList(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> map) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/iqonic/woobox/utils/oauthInterceptor/ParameterList$Companion;", "", "()V", "EMPTY_STRING", "", "PAIR_SEPARATOR", "PARAM_SEPARATOR", "QUERY_STRING_SEPARATOR", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}