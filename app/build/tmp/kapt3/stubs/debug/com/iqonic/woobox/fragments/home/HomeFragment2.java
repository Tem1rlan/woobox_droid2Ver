package com.iqonic.woobox.fragments.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u001cj\b\u0012\u0004\u0012\u00020\u000b`\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\b\u0010 \u001a\u00020\u0016H\u0002J\b\u0010!\u001a\u00020\u0016H\u0002J\b\u0010\"\u001a\u00020\u0016H\u0002J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010&\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\u001a\u00103\u001a\u00020\u00162\u0006\u00104\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u00105\u001a\u00020\u0016H\u0002J\u0018\u00106\u001a\u00020\u00162\u0006\u00104\u001a\u00020)2\u0006\u00101\u001a\u00020\u000bH\u0002J\b\u00107\u001a\u00020\u0016H\u0002J\b\u00108\u001a\u00020\u0016H\u0002J\b\u00109\u001a\u00020\u0016H\u0002J\b\u0010:\u001a\u00020\u0016H\u0002J\b\u0010;\u001a\u00020\u0016H\u0002J\b\u0010<\u001a\u00020\u0016H\u0002J\b\u0010=\u001a\u00020\u0016H\u0002J\b\u0010>\u001a\u00020\u0016H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006?"}, d2 = {"Lcom/iqonic/woobox/fragments/home/HomeFragment2;", "Lcom/iqonic/woobox/fragments/BaseFragment;", "()V", "imgLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "mCategoryAdapter", "Lcom/iqonic/woobox/base/BaseRecyclerAdapter;", "Lcom/iqonic/woobox/models/CategoryData;", "Lcom/iqonic/woobox/databinding/ItemCategory2Binding;", "mDealProductAdapter", "Lcom/iqonic/woobox/adapter/RecyclerViewAdapter;", "Lcom/iqonic/woobox/models/ProductDataNew;", "mFeaturedProductAdapter", "mNewArrivalProductAdapter", "mOfferProductAdapter", "mRecentProductAdapter", "mSuggestedProductAdapter", "mTestimonialsAdapter", "Lcom/iqonic/woobox/models/Testimonials;", "mYouMayLikeProductAdapter", "onNetworkRetry", "Lkotlin/Function0;", "", "getOnNetworkRetry", "()Lkotlin/jvm/functions/Function0;", "setOnNetworkRetry", "(Lkotlin/jvm/functions/Function0;)V", "getRecentItems", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSliders", "listAllProductCategories", "listAllProducts", "listFeaturedProducts", "loadApis", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "setClickEventListener", "setProductItem2", "setTestimonialAdapter", "setupDealProductAdapter", "setupFeaturedProductAdapter", "setupNewArrivalProductAdapter", "setupOfferProductAdapter", "setupRecentProductAdapter", "setupSuggestedProductAdapter", "setupYouMayLikeProductAdapter", "app_debug"})
public final class HomeFragment2 extends com.iqonic.woobox.fragments.BaseFragment {
    private android.widget.LinearLayout.LayoutParams imgLayoutParams;
    private com.iqonic.woobox.base.BaseRecyclerAdapter<com.iqonic.woobox.models.CategoryData, com.iqonic.woobox.databinding.ItemCategory2Binding> mCategoryAdapter;
    private com.iqonic.woobox.adapter.RecyclerViewAdapter<com.iqonic.woobox.models.ProductDataNew> mFeaturedProductAdapter;
    private com.iqonic.woobox.adapter.RecyclerViewAdapter<com.iqonic.woobox.models.ProductDataNew> mNewArrivalProductAdapter;
    private com.iqonic.woobox.adapter.RecyclerViewAdapter<com.iqonic.woobox.models.ProductDataNew> mOfferProductAdapter;
    private com.iqonic.woobox.adapter.RecyclerViewAdapter<com.iqonic.woobox.models.ProductDataNew> mYouMayLikeProductAdapter;
    private com.iqonic.woobox.adapter.RecyclerViewAdapter<com.iqonic.woobox.models.ProductDataNew> mDealProductAdapter;
    private com.iqonic.woobox.adapter.RecyclerViewAdapter<com.iqonic.woobox.models.ProductDataNew> mSuggestedProductAdapter;
    private com.iqonic.woobox.adapter.RecyclerViewAdapter<com.iqonic.woobox.models.ProductDataNew> mRecentProductAdapter;
    private com.iqonic.woobox.adapter.RecyclerViewAdapter<com.iqonic.woobox.models.Testimonials> mTestimonialsAdapter;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onNetworkRetry;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnNetworkRetry() {
        return null;
    }
    
    public final void setOnNetworkRetry(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadApis() {
    }
    
    private final void getSliders() {
    }
    
    private final void listAllProducts() {
    }
    
    private final void listFeaturedProducts() {
    }
    
    private final void listAllProductCategories() {
    }
    
    private final void setupRecentProductAdapter() {
    }
    
    private final void setupNewArrivalProductAdapter() {
    }
    
    private final void setupFeaturedProductAdapter() {
    }
    
    private final void setupOfferProductAdapter() {
    }
    
    private final void setupSuggestedProductAdapter() {
    }
    
    private final void setupYouMayLikeProductAdapter() {
    }
    
    private final void setupDealProductAdapter() {
    }
    
    private final void setTestimonialAdapter() {
    }
    
    private final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> getRecentItems() {
        return null;
    }
    
    private final void setClickEventListener() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setProductItem2(android.view.View view, com.iqonic.woobox.models.ProductDataNew item) {
    }
    
    public HomeFragment2() {
        super();
    }
}