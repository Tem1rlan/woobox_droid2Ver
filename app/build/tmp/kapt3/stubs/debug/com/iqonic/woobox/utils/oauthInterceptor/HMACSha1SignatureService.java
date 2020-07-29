package com.iqonic.woobox.utils.oauthInterceptor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002J \u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0012"}, d2 = {"Lcom/iqonic/woobox/utils/oauthInterceptor/HMACSha1SignatureService;", "Lcom/iqonic/woobox/utils/oauthInterceptor/SignatureService;", "signatureMethod", "", "(Ljava/lang/String;)V", "getSignatureMethod", "()Ljava/lang/String;", "bytesToBase64String", "bytes", "", "doSign", "toSign", "keyString", "getSignature", "baseString", "apiSecret", "tokenSecret", "Companion", "app_debug"})
public final class HMACSha1SignatureService implements com.iqonic.woobox.utils.oauthInterceptor.SignatureService {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String signatureMethod = null;
    private static final java.lang.String CARRIAGE_RETURN = "\r\n";
    private static final java.lang.String UTF8 = "UTF-8";
    private static final java.lang.String HMAC_SHA1 = "HmacSHA1";
    private static final java.lang.String METHOD = "HMAC-SHA1";
    public static final com.iqonic.woobox.utils.oauthInterceptor.HMACSha1SignatureService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getSignature(@org.jetbrains.annotations.NotNull()
    java.lang.String baseString, @org.jetbrains.annotations.NotNull()
    java.lang.String apiSecret, @org.jetbrains.annotations.NotNull()
    java.lang.String tokenSecret) {
        return null;
    }
    
    private final java.lang.String doSign(java.lang.String toSign, java.lang.String keyString) throws java.lang.Exception {
        return null;
    }
    
    private final java.lang.String bytesToBase64String(byte[] bytes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getSignatureMethod() {
        return null;
    }
    
    public HMACSha1SignatureService(@org.jetbrains.annotations.NotNull()
    java.lang.String signatureMethod) {
        super();
    }
    
    public HMACSha1SignatureService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/iqonic/woobox/utils/oauthInterceptor/HMACSha1SignatureService$Companion;", "", "()V", "CARRIAGE_RETURN", "", "HMAC_SHA1", "METHOD", "UTF8", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}