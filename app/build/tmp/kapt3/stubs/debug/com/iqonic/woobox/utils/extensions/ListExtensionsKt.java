package com.iqonic.woobox.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u008e\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u001f\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001\u00a2\u0006\u0002\u0010\u0004\u001aM\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u000f\u00a2\u0006\u0002\u0010\u0010\u001aH\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u000f\u001aM\u0010\u0005\u001a\u00020\u0006*\u00020\u00122\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u000f\u00a2\u0006\u0002\u0010\u0013\u001aH\u0010\u0005\u001a\u00020\u0006*\u00020\u00122\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\u00112\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u000f\u001a\u00ba\u0001\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00010\f2\u0006\u0010\u0015\u001a\u00020\u00162#\u0010\u0017\u001a\u001f\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0018\u00a2\u0006\u0002\b\u001a2\u001a\b\u0002\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u000f2\u001a\b\u0002\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u000f2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e\u00a2\u0006\u0002\u0010 \u001a\u008f\u0002\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00162A\u0010\u0017\u001a=\u0012\u0004\u0012\u00020\u0019\u0012\u0013\u0012\u0011H\u0001\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00060\u0018\u00a2\u0006\u0002\b\u001a28\b\u0002\u0010\u001b\u001a2\u0012\u0013\u0012\u0011H\u0001\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00060\u000f28\b\u0002\u0010\u001c\u001a2\u0012\u0013\u0012\u0011H\u0001\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00060\u000f2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e\u001a%\u0010$\u001a\u00020\u0006*\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\f2\u0006\u0010(\u001a\u00020)\u00a2\u0006\u0002\u0010*\u001a \u0010$\u001a\u00020\u0006*\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\u00112\u0006\u0010(\u001a\u00020)\u001a\u00e0\u0001\u0010+\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0,2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00162!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\t0.2)\u0010\u0017\u001a%\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060/\u00a2\u0006\u0002\b\u001a2\u001a\b\u0002\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u000f2\u001a\b\u0002\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u000f2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e\u001a\u001e\u00100\u001a\u00020\u0006*\u00020%2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060.\u001a*\u00101\u001a\u00020\u0006*\u00020%2\u001e\u00101\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0018\u001a\u001e\u00103\u001a\u00020\u0006*\u00020%2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060.\u001a\u001f\u00104\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010#\u001a\u00020\t\u00a2\u0006\u0002\u00105\u001a\'\u00106\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010#\u001a\u00020\t\u00a2\u0006\u0002\u00107\u00a8\u00068"}, d2 = {"addItem", "T", "Landroidx/recyclerview/widget/RecyclerView;", "item", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/Object;)Ljava/lang/Object;", "create", "", "Landroid/widget/AutoCompleteTextView;", "itemLayout", "", "textViewId", "items", "", "", "onItemSelected", "Lkotlin/Function2;", "(Landroid/widget/AutoCompleteTextView;II[Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "", "Landroid/widget/Spinner;", "(Landroid/widget/Spinner;II[Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "itemSize", "layoutMgr", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "onBindView", "Lkotlin/Function3;", "Landroid/view/View;", "Lkotlin/ExtensionFunctionType;", "itemClick", "itemLongClick", "onScrollTop", "Lkotlin/Function0;", "onScrollBottom", "(Landroidx/recyclerview/widget/RecyclerView;II[Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$LayoutManager;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/ParameterName;", "name", "position", "createFragmentPager", "Landroidx/viewpager/widget/ViewPager;", "fragments", "Landroidx/fragment/app/Fragment;", "supportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/viewpager/widget/ViewPager;[Landroidx/fragment/app/Fragment;Landroidx/fragment/app/FragmentManager;)V", "createTypedList", "", "itemTypes", "Lkotlin/Function1;", "Lkotlin/Function4;", "onPageScrollStateChanged", "onPageScrolled", "", "onPageSelected", "removeItem", "(Landroidx/recyclerview/widget/RecyclerView;I)Ljava/lang/Object;", "updateItem", "(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/Object;I)Ljava/lang/Object;", "app_debug"})
public final class ListExtensionsKt {
    
    public static final void create(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner $this$create, @androidx.annotation.LayoutRes()
    int itemLayout, @androidx.annotation.IdRes()
    int textViewId, @org.jetbrains.annotations.NotNull()
    java.lang.String[] items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> onItemSelected) {
    }
    
    public static final void create(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner $this$create, @androidx.annotation.LayoutRes()
    int itemLayout, @androidx.annotation.IdRes()
    int textViewId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> onItemSelected) {
    }
    
    public static final void create(@org.jetbrains.annotations.NotNull()
    android.widget.AutoCompleteTextView $this$create, @androidx.annotation.LayoutRes()
    int itemLayout, @androidx.annotation.IdRes()
    int textViewId, @org.jetbrains.annotations.NotNull()
    java.lang.String[] items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> onItemSelected) {
    }
    
    public static final void create(@org.jetbrains.annotations.NotNull()
    android.widget.AutoCompleteTextView $this$create, @androidx.annotation.LayoutRes()
    int itemLayout, @androidx.annotation.IdRes()
    int textViewId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> items, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> onItemSelected) {
    }
    
    public static final <T extends java.lang.Object>void create(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$create, int itemSize, int itemLayout, @org.jetbrains.annotations.NotNull()
    T[] items, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutMgr, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.View, ? super T, ? super java.lang.Integer, kotlin.Unit> onBindView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemLongClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onScrollTop, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onScrollBottom) {
    }
    
    public static final <T extends java.lang.Object>void create(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$create, int itemSize, int itemLayout, @org.jetbrains.annotations.NotNull()
    java.util.List<T> items, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutMgr, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.View, ? super T, ? super java.lang.Integer, kotlin.Unit> onBindView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemLongClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onScrollTop, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onScrollBottom) {
    }
    
    public static final <T extends java.lang.Object>void createTypedList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$createTypedList, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, java.lang.Integer> itemLayout, @org.jetbrains.annotations.NotNull()
    java.util.List<T> items, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.LayoutManager layoutMgr, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> itemTypes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function4<? super android.view.View, ? super T, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> onBindView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super java.lang.Integer, kotlin.Unit> itemLongClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onScrollTop, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onScrollBottom) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public static final <T extends java.lang.Object>T addItem(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$addItem, T item) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public static final <T extends java.lang.Object>T updateItem(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$updateItem, T item, int position) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public static final <T extends java.lang.Object>T removeItem(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$removeItem, int position) {
        return null;
    }
    
    public static final void createFragmentPager(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager $this$createFragmentPager, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment[] fragments, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager supportFragmentManager) {
    }
    
    public static final void createFragmentPager(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager $this$createFragmentPager, @org.jetbrains.annotations.NotNull()
    java.util.List<androidx.fragment.app.Fragment> fragments, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager supportFragmentManager) {
    }
    
    public static final void onPageScrollStateChanged(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager $this$onPageScrollStateChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onPageScrollStateChanged) {
    }
    
    public static final void onPageScrolled(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager $this$onPageScrolled, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Float, ? super java.lang.Integer, kotlin.Unit> onPageScrolled) {
    }
    
    public static final void onPageSelected(@org.jetbrains.annotations.NotNull()
    androidx.viewpager.widget.ViewPager $this$onPageSelected, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onPageSelected) {
    }
}