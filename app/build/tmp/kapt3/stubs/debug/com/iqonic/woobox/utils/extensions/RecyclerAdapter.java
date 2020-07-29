package com.iqonic.woobox.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001%B\u0084\u0001\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012#\u0010\t\u001a\u001f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\b\r\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000f\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000f\u00a2\u0006\u0002\u0010\u0011B\u0084\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012#\u0010\t\u001a\u001f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\b\r\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000f\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000f\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\u0018\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0005H\u0016J\u0018\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005H\u0016J\u0013\u0010!\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\"J\u001b\u0010#\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\u0002\u0010$R \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0014R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u001f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\u0002\b\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/iqonic/woobox/utils/extensions/RecyclerAdapter;", "T", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/iqonic/woobox/utils/extensions/RecyclerAdapter$ViewHolder;", "itemLayout", "", "items", "", "itemSize", "onBindView", "Lkotlin/Function3;", "Landroid/view/View;", "", "Lkotlin/ExtensionFunctionType;", "itemClick", "Lkotlin/Function2;", "itemLongClick", "(I[Ljava/lang/Object;ILkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "", "(IILjava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "[Ljava/lang/Object;", "itemsList", "addItem", "item", "(Ljava/lang/Object;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItem", "(I)Ljava/lang/Object;", "updateItem", "(Ljava/lang/Object;I)V", "ViewHolder", "app_debug"})
public final class RecyclerAdapter<T extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.iqonic.woobox.utils.extensions.RecyclerAdapter.ViewHolder> {
    @androidx.annotation.LayoutRes()
    private final int itemLayout = 0;
    private int itemSize;
    private T[] items;
    private java.util.List<T> itemsList;
    private final kotlin.jvm.functions.Function3<android.view.View, T, java.lang.Integer, kotlin.Unit> onBindView = null;
    private final kotlin.jvm.functions.Function2<T, java.lang.Integer, kotlin.Unit> itemClick = null;
    private final kotlin.jvm.functions.Function2<T, java.lang.Integer, kotlin.Unit> itemLongClick = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.iqonic.woobox.utils.extensions.RecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.utils.extensions.RecyclerAdapter.ViewHolder holder, int position) {
    }
    
    public final void addItem(T item) {
    }
    
    public final void updateItem(T item, int position) {
    }
    
    public final T removeItem(int position) {
        return null;
    }
    
    public RecyclerAdapter(int itemLayout, @org.jetbrains.annotations.NotNull()
    T[] items, int itemSize, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.View, ? super T, ? super java.lang.Integer, kotlin.Unit> onBindView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemLongClick) {
        super();
    }
    
    public RecyclerAdapter(int itemSize, int itemLayout, @org.jetbrains.annotations.NotNull()
    java.util.List<T> items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.View, ? super T, ? super java.lang.Integer, kotlin.Unit> onBindView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemLongClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/iqonic/woobox/utils/extensions/RecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ViewHolder(@org.jetbrains.annotations.Nullable()
        android.view.View itemView) {
            super(null);
        }
    }
}