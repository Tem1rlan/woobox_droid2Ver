package com.iqonic.woobox.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\f\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\u00020\u0004B&\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0015\u001a\u00020\tH\u0007J\b\u0010\u0016\u001a\u00020\tH\u0007R\u0016\u0010\f\u001a\n \r*\u0004\u0018\u00010\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/iqonic/woobox/utils/extensions/BroadcastReceiverExt;", "T", "Landroid/content/Context;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/LifecycleObserver;", "context", "constructor", "Lkotlin/Function1;", "Lcom/iqonic/woobox/utils/extensions/Builder;", "", "Lkotlin/ExtensionFunctionType;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "appContext", "kotlin.jvm.PlatformType", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "filter", "Landroid/content/IntentFilter;", "instructions", "", "Lcom/iqonic/woobox/utils/extensions/Instructions;", "start", "stop", "app_debug"})
public final class BroadcastReceiverExt<T extends android.content.Context & androidx.lifecycle.LifecycleOwner> implements androidx.lifecycle.LifecycleObserver {
    private final android.content.Context appContext = null;
    private final android.content.IntentFilter filter = null;
    private final java.util.List<com.iqonic.woobox.utils.extensions.Instructions> instructions = null;
    private final android.content.BroadcastReceiver broadcastReceiver = null;
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_START)
    public final void start() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    public final void stop() {
    }
    
    public BroadcastReceiverExt(@org.jetbrains.annotations.NotNull()
    T context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.woobox.utils.extensions.Builder, kotlin.Unit> constructor) {
        super();
    }
}