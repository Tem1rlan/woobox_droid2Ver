package com.iqonic.woobox.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001+B\u00af\u0001\b\u0016\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\n\u0012)\u0010\u000e\u001a%\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u000f\u00a2\u0006\u0002\b\u0012\u0012\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0014\u0012\u001a\b\u0002\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0014\u00a2\u0006\u0002\u0010\u0016B\u00af\u0001\b\u0016\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\n\u0012)\u0010\u000e\u001a%\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u000f\u00a2\u0006\u0002\b\u0012\u0012\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0014\u0012\u001a\b\u0002\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0014\u00a2\u0006\u0002\u0010\u0018J\u0013\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0006H\u0016J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\u0016J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0006H\u0017J\u0013\u0010\'\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0002\u0010(J\u001b\u0010)\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0002\u0010*R1\u0010\u000e\u001a%\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u000f\u00a2\u0006\u0002\b\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001aR\u0016\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/iqonic/woobox/utils/extensions/TypedRecyclerAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iqonic/woobox/utils/extensions/TypedRecyclerAdapter$TypedViewHolder;", "layoutForType", "", "", "items", "", "itemTypes", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "creator", "Lkotlin/Function4;", "Landroid/view/View;", "", "Lkotlin/ExtensionFunctionType;", "itemClick", "Lkotlin/Function2;", "itemLongClick", "(Ljava/util/Map;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "", "(Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "currentType", "[Ljava/lang/Object;", "itemsList", "addItem", "item", "(Ljava/lang/Object;)V", "getItemCount", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "(I)Ljava/lang/Object;", "updateItem", "(Ljava/lang/Object;I)V", "TypedViewHolder", "app_debug"})
public final class TypedRecyclerAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.iqonic.woobox.utils.extensions.TypedRecyclerAdapter.TypedViewHolder> {
    private final java.util.Map<java.lang.Integer, java.lang.Integer> layoutForType = null;
    private T[] items;
    private java.util.List<T> itemsList;
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> itemTypes;
    private final kotlin.jvm.functions.Function4<android.view.View, T, java.lang.Integer, java.lang.Integer, kotlin.Unit> creator = null;
    private final kotlin.jvm.functions.Function2<T, java.lang.Integer, kotlin.Unit> itemClick = null;
    private final kotlin.jvm.functions.Function2<T, java.lang.Integer, kotlin.Unit> itemLongClick = null;
    private int currentType;
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
    @java.lang.Override()
    public com.iqonic.woobox.utils.extensions.TypedRecyclerAdapter.TypedViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.utils.extensions.TypedRecyclerAdapter.TypedViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void addItem(T item) {
    }
    
    public final void updateItem(T item, int position) {
    }
    
    public final T removeItem(int position) {
        return null;
    }
    
    public TypedRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, java.lang.Integer> layoutForType, @org.jetbrains.annotations.NotNull()
    T[] items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> itemTypes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super android.view.View, ? super T, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> creator, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemLongClick) {
        super();
    }
    
    public TypedRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, java.lang.Integer> layoutForType, @org.jetbrains.annotations.NotNull()
    java.util.List<T> items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> itemTypes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super android.view.View, ? super T, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> creator, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemLongClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/iqonic/woobox/utils/extensions/TypedRecyclerAdapter$TypedViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class TypedViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public TypedViewHolder(@org.jetbrains.annotations.Nullable()
        android.view.View itemView) {
            super(null);
        }
    }
}