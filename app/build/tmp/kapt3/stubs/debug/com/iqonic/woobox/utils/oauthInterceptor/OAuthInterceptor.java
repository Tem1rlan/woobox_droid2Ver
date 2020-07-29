package com.iqonic.woobox.utils.oauthInterceptor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000e\u000fB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/iqonic/woobox/utils/oauthInterceptor/OAuthInterceptor;", "Lokhttp3/Interceptor;", "consumerKey", "", "consumerSecret", "tokenSecret", "token", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "urlEncoded", "url", "Builder", "Companion", "app_debug"})
public final class OAuthInterceptor implements okhttp3.Interceptor {
    private final java.lang.String consumerKey = null;
    private final java.lang.String consumerSecret = null;
    private final java.lang.String tokenSecret = null;
    private final java.lang.String token = null;
    private static final java.lang.String OAUTH_CONSUMER_KEY = "oauth_consumer_key";
    private static final java.lang.String OAUTH_NONCE = "oauth_nonce";
    private static final java.lang.String OAUTH_SIGNATURE = "oauth_signature";
    private static final java.lang.String OAUTH_SIGNATURE_METHOD = "oauth_signature_method";
    private static final java.lang.String OAUTH_SIGNATURE_METHOD_VALUE = "HMAC-SHA1";
    private static final java.lang.String OAUTH_TIMESTAMP = "oauth_timestamp";
    private static final java.lang.String OAUTH_VERSION = "oauth_version";
    private static final java.lang.String OAUTH_VERSION_VALUE = "1.0";
    private static final java.lang.String OAUTH_TOKEN = "oauth_token";
    public static final com.iqonic.woobox.utils.oauthInterceptor.OAuthInterceptor.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
    okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        return null;
    }
    
    private final java.lang.String urlEncoded(java.lang.String url) {
        return null;
    }
    
    public OAuthInterceptor(@org.jetbrains.annotations.NotNull()
    java.lang.String consumerKey, @org.jetbrains.annotations.NotNull()
    java.lang.String consumerSecret, @org.jetbrains.annotations.NotNull()
    java.lang.String tokenSecret, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/iqonic/woobox/utils/oauthInterceptor/OAuthInterceptor$Builder;", "", "()V", "consumerKey", "", "consumerSecret", "token", "tokenSecret", "type", "", "build", "Lcom/iqonic/woobox/utils/oauthInterceptor/OAuthInterceptor;", "app_debug"})
    public static final class Builder {
        private java.lang.String consumerKey;
        private java.lang.String consumerSecret;
        private java.lang.String tokenSecret;
        private java.lang.String token;
        private final int type = 0;
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.utils.oauthInterceptor.OAuthInterceptor.Builder consumerKey(@org.jetbrains.annotations.NotNull()
        java.lang.String consumerKey) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.utils.oauthInterceptor.OAuthInterceptor.Builder consumerSecret(@org.jetbrains.annotations.NotNull()
        java.lang.String consumerSecret) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.utils.oauthInterceptor.OAuthInterceptor.Builder tokenSecret(@org.jetbrains.annotations.NotNull()
        java.lang.String tokenSecret) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.utils.oauthInterceptor.OAuthInterceptor.Builder token(@org.jetbrains.annotations.NotNull()
        java.lang.String token) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.utils.oauthInterceptor.OAuthInterceptor build() {
            return null;
        }
        
        public Builder() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/iqonic/woobox/utils/oauthInterceptor/OAuthInterceptor$Companion;", "", "()V", "OAUTH_CONSUMER_KEY", "", "OAUTH_NONCE", "OAUTH_SIGNATURE", "OAUTH_SIGNATURE_METHOD", "OAUTH_SIGNATURE_METHOD_VALUE", "OAUTH_TIMESTAMP", "OAUTH_TOKEN", "OAUTH_VERSION", "OAUTH_VERSION_VALUE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}