package com.iqonic.woobox.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\b\b\u0002\u0010\u0003*\u00020\u0004*\b\b\u0003\u0010\u0005*\u00020\u00042\u00020\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB7\b\u0014\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\r\u00a2\u0006\u0002\u0010\u000eJ.\u0010\u0015\u001a\u00020\u00162\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\rJ-\u0010\u0017\u001a\u00028\u00032\u0006\u0010\u0018\u001a\u00028\u00032\u0006\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H&\u00a2\u0006\u0002\u0010\u001cJ%\u0010\u001d\u001a\u00028\u00022\u0006\u0010\u0018\u001a\u00028\u00022\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0010H&\u00a2\u0006\u0002\u0010\u001fJ\u001d\u0010 \u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0016\u00a2\u0006\u0002\u0010!J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\u0010H\u0002J2\u0010%\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0015\u0010-\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0010H\u0016\u00a2\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\u0010H\u0016J\u0010\u00100\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J*\u00101\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u00102\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010*\u001a\u00020+H\u0016J\"\u00103\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010&2\u0006\u00104\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+H\u0002J\b\u00105\u001a\u00020(H\u0016J\b\u00106\u001a\u000207H\u0002J\u0018\u00108\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u0006\u00109\u001a\u00020\u0016J\u0016\u0010:\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010J\u000e\u0010;\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0010R\u0012\u0010\u000f\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R \u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lcom/iqonic/woobox/base/IExpandableListAdapter;", "G", "C", "GV", "Landroidx/databinding/ViewDataBinding;", "CV", "Landroid/widget/BaseExpandableListAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mGroupItems", "Ljava/util/ArrayList;", "mChildItemsMap", "Ljava/util/HashMap;", "(Landroid/content/Context;Ljava/util/ArrayList;Ljava/util/HashMap;)V", "childItemResId", "", "getChildItemResId", "()I", "groupItemResId", "getGroupItemResId", "addExpandableItems", "", "bindChildView", "view", "childObject", "groupPosition", "childPosition", "(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;II)Landroidx/databinding/ViewDataBinding;", "bindGroupView", "groupObject", "(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;I)Landroidx/databinding/ViewDataBinding;", "getChild", "(II)Ljava/lang/Object;", "getChildId", "", "getChildItems", "getChildView", "Landroid/view/View;", "isLastChild", "", "convertView", "parent", "Landroid/view/ViewGroup;", "getChildrenCount", "getGroup", "(I)Ljava/lang/Object;", "getGroupCount", "getGroupId", "getGroupView", "isExpanded", "getViewBinding", "itemResId", "hasStableIds", "inflater", "Landroid/view/LayoutInflater;", "isChildSelectable", "removeAllItems", "removeChildItem", "removeGroupItem", "app_debug"})
public abstract class IExpandableListAdapter<G extends java.lang.Object, C extends java.lang.Object, GV extends androidx.databinding.ViewDataBinding, CV extends androidx.databinding.ViewDataBinding> extends android.widget.BaseExpandableListAdapter {
    private android.content.Context context;
    private java.util.ArrayList<G> mGroupItems;
    private java.util.HashMap<G, java.util.ArrayList<C>> mChildItemsMap;
    
    public abstract int getChildItemResId();
    
    public abstract int getGroupItemResId();
    
    @java.lang.Override()
    public int getGroupCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract CV bindChildView(@org.jetbrains.annotations.NotNull()
    CV view, C childObject, int groupPosition, int childPosition);
    
    @org.jetbrains.annotations.NotNull()
    public abstract GV bindGroupView(@org.jetbrains.annotations.NotNull()
    GV view, G groupObject, int groupPosition);
    
    @java.lang.Override()
    public C getChild(int groupPosition, int childPosition) {
        return null;
    }
    
    @java.lang.Override()
    public long getChildId(int groupPosition, int childPosition) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getChildView(int groupPosition, int childPosition, boolean isLastChild, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    private final androidx.databinding.ViewDataBinding getViewBinding(android.view.View view, int itemResId, android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public int getChildrenCount(int groupPosition) {
        return 0;
    }
    
    @java.lang.Override()
    public G getGroup(int groupPosition) {
        return null;
    }
    
    @java.lang.Override()
    public long getGroupId(int groupPosition) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View getGroupView(int groupPosition, boolean isExpanded, @org.jetbrains.annotations.Nullable()
    android.view.View convertView, @org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public boolean hasStableIds() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
    
    private final android.view.LayoutInflater inflater() {
        return null;
    }
    
    private final java.util.ArrayList<C> getChildItems(int groupPosition) {
        return null;
    }
    
    public final void addExpandableItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<G> mGroupItems, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<G, java.util.ArrayList<C>> mChildItemsMap) {
    }
    
    public final void removeAllItems() {
    }
    
    public final void removeGroupItem(int groupPosition) {
    }
    
    public final void removeChildItem(int groupPosition, int childPosition) {
    }
    
    public IExpandableListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    protected IExpandableListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<G> mGroupItems, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<G, java.util.ArrayList<C>> mChildItemsMap) {
        super();
    }
}