package com.iqonic.woobox.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000b\f\rB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H&\u0082\u0001\u0003\u000e\u000f\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/iqonic/woobox/utils/extensions/Instructions;", "", "()V", "execution", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "Lcom/iqonic/woobox/utils/extensions/Execution;", "matches", "", "intent", "OnAction", "OnCategory", "OnDataScheme", "Lcom/iqonic/woobox/utils/extensions/Instructions$OnAction;", "Lcom/iqonic/woobox/utils/extensions/Instructions$OnDataScheme;", "Lcom/iqonic/woobox/utils/extensions/Instructions$OnCategory;", "app_debug"})
public abstract class Instructions {
    
    public abstract boolean matches(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function1<android.content.Intent, kotlin.Unit> execution();
    
    private Instructions() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bH\u00c6\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bH\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/iqonic/woobox/utils/extensions/Instructions$OnAction;", "Lcom/iqonic/woobox/utils/extensions/Instructions;", "action", "", "execution", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "Lcom/iqonic/woobox/utils/extensions/Execution;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getAction", "()Ljava/lang/String;", "getExecution", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "matches", "intent", "toString", "app_debug"})
    public static final class OnAction extends com.iqonic.woobox.utils.extensions.Instructions {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String action = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<android.content.Intent, kotlin.Unit> execution = null;
        
        @java.lang.Override()
        public boolean matches(@org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function1<android.content.Intent, kotlin.Unit> execution() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getAction() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<android.content.Intent, kotlin.Unit> getExecution() {
            return null;
        }
        
        public OnAction(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> execution) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<android.content.Intent, kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.utils.extensions.Instructions.OnAction copy(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> execution) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bH\u00c6\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bH\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/iqonic/woobox/utils/extensions/Instructions$OnDataScheme;", "Lcom/iqonic/woobox/utils/extensions/Instructions;", "scheme", "", "execution", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "Lcom/iqonic/woobox/utils/extensions/Execution;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getExecution", "()Lkotlin/jvm/functions/Function1;", "getScheme", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "matches", "intent", "toString", "app_debug"})
    public static final class OnDataScheme extends com.iqonic.woobox.utils.extensions.Instructions {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String scheme = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<android.content.Intent, kotlin.Unit> execution = null;
        
        @java.lang.Override()
        public boolean matches(@org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function1<android.content.Intent, kotlin.Unit> execution() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getScheme() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<android.content.Intent, kotlin.Unit> getExecution() {
            return null;
        }
        
        public OnDataScheme(@org.jetbrains.annotations.NotNull()
        java.lang.String scheme, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> execution) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<android.content.Intent, kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.utils.extensions.Instructions.OnDataScheme copy(@org.jetbrains.annotations.NotNull()
        java.lang.String scheme, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> execution) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bH\u00c6\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\bH\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001a"}, d2 = {"Lcom/iqonic/woobox/utils/extensions/Instructions$OnCategory;", "Lcom/iqonic/woobox/utils/extensions/Instructions;", "category", "", "execution", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "Lcom/iqonic/woobox/utils/extensions/Execution;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getCategory", "()Ljava/lang/String;", "getExecution", "()Lkotlin/jvm/functions/Function1;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "matches", "intent", "toString", "app_debug"})
    public static final class OnCategory extends com.iqonic.woobox.utils.extensions.Instructions {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String category = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.jvm.functions.Function1<android.content.Intent, kotlin.Unit> execution = null;
        
        @java.lang.Override()
        public boolean matches(@org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlin.jvm.functions.Function1<android.content.Intent, kotlin.Unit> execution() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCategory() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<android.content.Intent, kotlin.Unit> getExecution() {
            return null;
        }
        
        public OnCategory(@org.jetbrains.annotations.NotNull()
        java.lang.String category, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> execution) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.jvm.functions.Function1<android.content.Intent, kotlin.Unit> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.utils.extensions.Instructions.OnCategory copy(@org.jetbrains.annotations.NotNull()
        java.lang.String category, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> execution) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}