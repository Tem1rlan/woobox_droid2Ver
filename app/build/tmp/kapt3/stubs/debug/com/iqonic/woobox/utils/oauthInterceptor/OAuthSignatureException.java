package com.iqonic.woobox.utils.oauthInterceptor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/iqonic/woobox/utils/oauthInterceptor/OAuthSignatureException;", "Lcom/iqonic/woobox/utils/oauthInterceptor/OAuthException;", "stringToSign", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/String;Ljava/lang/Exception;)V", "Companion", "app_debug"})
public final class OAuthSignatureException extends com.iqonic.woobox.utils.oauthInterceptor.OAuthException {
    private static final long serialVersionUID = 1L;
    private static final java.lang.String MSG = "Error while signing string: %s";
    public static final com.iqonic.woobox.utils.oauthInterceptor.OAuthSignatureException.Companion Companion = null;
    
    public OAuthSignatureException(@org.jetbrains.annotations.NotNull()
    java.lang.String stringToSign, @org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
        super(null, null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/iqonic/woobox/utils/oauthInterceptor/OAuthSignatureException$Companion;", "", "()V", "MSG", "", "serialVersionUID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}