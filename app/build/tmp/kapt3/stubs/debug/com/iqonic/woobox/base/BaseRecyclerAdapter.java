package com.iqonic.woobox.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u000289B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\u0014\u0010\u0019\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ\u0013\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0017J\u0013\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0007\u00a2\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0007H\u0016J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bJ%\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010%\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010&J\u0018\u0010\'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0007H\u0016J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0007H\u0016J-\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020/2\u0006\u0010$\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010%\u001a\u00028\u0001H&\u00a2\u0006\u0002\u00100J%\u00101\u001a\u00020\u00172\u0006\u0010.\u001a\u00020/2\u0006\u0010$\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u0007H&\u00a2\u0006\u0002\u00102J\u000e\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u0007J\u000e\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u0007J\u0006\u00107\u001a\u00020\u0017R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006:"}, d2 = {"Lcom/iqonic/woobox/base/BaseRecyclerAdapter;", "T", "VB", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "layoutResId", "", "getLayoutResId", "()I", "mModelList", "Ljava/util/ArrayList;", "getMModelList", "()Ljava/util/ArrayList;", "setMModelList", "(Ljava/util/ArrayList;)V", "size", "getSize", "()Ljava/lang/Integer;", "setSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "addItems", "", "aList", "addMoreItems", "addNewItem", "item", "(Ljava/lang/Object;)V", "clearData", "getItem", "position", "(I)Ljava/lang/Object;", "getItemCount", "getModel", "onBindData", "model", "dataBinding", "(Ljava/lang/Object;ILjava/lang/Object;)V", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onItemClick", "view", "Landroid/view/View;", "(Landroid/view/View;Ljava/lang/Object;ILjava/lang/Object;)V", "onItemLongClick", "(Landroid/view/View;Ljava/lang/Object;I)V", "removeItem", "pos", "setModelSize", "aSize", "sortByHighPrice", "DataViewHolder", "OnClickListener", "app_debug"})
public abstract class BaseRecyclerAdapter<T extends java.lang.Object, VB extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<T> mModelList;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer size;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<T> getMModelList() {
        return null;
    }
    
    public final void setMModelList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> p0) {
    }
    
    public abstract int getLayoutResId();
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSize() {
        return null;
    }
    
    public final void setSize(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public abstract void onBindData(T model, int position, VB dataBinding);
    
    public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
    android.view.View view, T model, int position, VB dataBinding);
    
    public abstract void onItemLongClick(@org.jetbrains.annotations.NotNull()
    android.view.View view, T model, int position);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    public final void setModelSize(int aSize) {
    }
    
    public final void addItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> aList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<T> getModel() {
        return null;
    }
    
    public final void sortByHighPrice() {
    }
    
    public final void addMoreItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<T> aList) {
    }
    
    public final void addNewItem(T item) {
    }
    
    public final void removeItem(int pos) {
    }
    
    public final T getItem(int position) {
        return null;
    }
    
    public final void clearData() {
    }
    
    public BaseRecyclerAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0014R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00028\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/iqonic/woobox/base/BaseRecyclerAdapter$DataViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/iqonic/woobox/base/BaseRecyclerAdapter$OnClickListener;", "binding", "Landroidx/databinding/ViewDataBinding;", "(Lcom/iqonic/woobox/base/BaseRecyclerAdapter;Landroidx/databinding/ViewDataBinding;)V", "listener", "getListener", "()Lcom/iqonic/woobox/base/BaseRecyclerAdapter$OnClickListener;", "mDataBinding", "getMDataBinding", "()Ljava/lang/Object;", "setMDataBinding", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "onClick", "", "view", "Landroid/view/View;", "t", "(Landroid/view/View;Ljava/lang/Object;)V", "app_debug"})
    public final class DataViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements com.iqonic.woobox.base.BaseRecyclerAdapter.OnClickListener<T> {
        private VB mDataBinding;
        @org.jetbrains.annotations.Nullable()
        private final com.iqonic.woobox.base.BaseRecyclerAdapter.OnClickListener<T> listener = null;
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View view, T t) {
        }
        
        public final VB getMDataBinding() {
            return null;
        }
        
        public final void setMDataBinding(VB p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.iqonic.woobox.base.BaseRecyclerAdapter.OnClickListener<T> getListener() {
            return null;
        }
        
        public DataViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0002H&\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/iqonic/woobox/base/BaseRecyclerAdapter$OnClickListener;", "T", "", "onClick", "", "view", "Landroid/view/View;", "t", "(Landroid/view/View;Ljava/lang/Object;)V", "app_debug"})
    public static abstract interface OnClickListener<T extends java.lang.Object> {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View view, T t);
    }
}