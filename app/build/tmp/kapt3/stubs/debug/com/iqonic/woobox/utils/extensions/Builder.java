package com.iqonic.woobox.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0000\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H\u0000\u00a2\u0006\u0002\b\bJ\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u00a2\u0006\u0002\b\tJ&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000fj\u0002`\u0011J&\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000fj\u0002`\u0011J&\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000b0\u000fj\u0002`\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/iqonic/woobox/utils/extensions/Builder;", "", "()V", "filter", "Landroid/content/IntentFilter;", "instructions", "", "Lcom/iqonic/woobox/utils/extensions/Instructions;", "filter$app_debug", "instructions$app_debug", "onAction", "", "action", "", "execution", "Lkotlin/Function1;", "Landroid/content/Intent;", "Lcom/iqonic/woobox/utils/extensions/Execution;", "onCategory", "category", "onDataScheme", "scheme", "app_debug"})
public final class Builder {
    private final android.content.IntentFilter filter = null;
    private final java.util.List<com.iqonic.woobox.utils.extensions.Instructions> instructions = null;
    
    public final void onAction(@org.jetbrains.annotations.NotNull()
    java.lang.String action, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> execution) {
    }
    
    public final void onDataScheme(@org.jetbrains.annotations.NotNull()
    java.lang.String scheme, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> execution) {
    }
    
    public final void onCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> execution) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.IntentFilter filter$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.iqonic.woobox.utils.extensions.Instructions> instructions$app_debug() {
        return null;
    }
    
    public Builder() {
        super();
    }
}