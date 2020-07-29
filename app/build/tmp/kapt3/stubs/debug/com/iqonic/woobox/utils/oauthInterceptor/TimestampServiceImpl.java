package com.iqonic.woobox.utils.oauthInterceptor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0000\u00a2\u0006\u0002\b\u0011R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/iqonic/woobox/utils/oauthInterceptor/TimestampServiceImpl;", "Lcom/iqonic/woobox/utils/oauthInterceptor/TimestampService;", "()V", "nonce", "", "getNonce", "()Ljava/lang/String;", "timer", "Lcom/iqonic/woobox/utils/oauthInterceptor/TimestampServiceImpl$Timer;", "timestampInSeconds", "getTimestampInSeconds", "ts", "", "getTs", "()J", "setTimer", "", "setTimer$app_debug", "Timer", "app_debug"})
public final class TimestampServiceImpl implements com.iqonic.woobox.utils.oauthInterceptor.TimestampService {
    private com.iqonic.woobox.utils.oauthInterceptor.TimestampServiceImpl.Timer timer;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getNonce() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getTimestampInSeconds() {
        return null;
    }
    
    private final long getTs() {
        return 0L;
    }
    
    public final void setTimer$app_debug(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.utils.oauthInterceptor.TimestampServiceImpl.Timer timer) {
    }
    
    public TimestampServiceImpl() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/iqonic/woobox/utils/oauthInterceptor/TimestampServiceImpl$Timer;", "", "()V", "milis", "", "getMilis", "()J", "rand", "Ljava/util/Random;", "randomInteger", "", "getRandomInteger", "()I", "app_debug"})
    public static final class Timer {
        private final java.util.Random rand = null;
        
        public final long getMilis() {
            return 0L;
        }
        
        public final int getRandomInteger() {
            return 0;
        }
        
        public Timer() {
            super();
        }
    }
}