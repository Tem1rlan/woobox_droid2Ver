package com.iqonic.woobox.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 J2\u00020\u0001:\u0001JB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+H\u0002J\u0014\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00160\u000eH\u0002J\u0014\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002J\b\u0010.\u001a\u00020&H\u0002J\u0018\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0006j\b\u0012\u0004\u0012\u00020\u000f`\u001aH\u0002J\b\u00100\u001a\u00020&H\u0002J\u0010\u00101\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\u001a\u00102\u001a\u00020&2\u0006\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0002J\u0012\u00103\u001a\u00020&2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020\u0018H\u0002J\u0018\u00106\u001a\u00020&2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J&\u0010;\u001a\u0004\u0018\u00010\"2\u0006\u00109\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010A\u001a\u00020\u00132\u0006\u0010B\u001a\u00020CH\u0016J\u001a\u0010D\u001a\u00020&2\u0006\u0010E\u001a\u00020\"2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\b\u0010F\u001a\u00020&H\u0002J\u0006\u0010G\u001a\u00020&J\b\u0010H\u001a\u00020&H\u0002J \u0010I\u001a\u00020&2\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0006j\b\u0012\u0004\u0012\u00020\u000f`\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00160\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0006j\b\u0012\u0004\u0012\u00020\u0018`\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0006j\b\u0012\u0004\u0012\u00020\u0018`\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0006j\b\u0012\u0004\u0012\u00020\u0018`\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010$\u00a8\u0006K"}, d2 = {"Lcom/iqonic/woobox/fragments/ViewAllProductFragment;", "Lcom/iqonic/woobox/fragments/BaseFragment;", "()V", "countLoadMore", "", "mBrand", "Ljava/util/ArrayList;", "Lcom/iqonic/woobox/models/RequestModel$FilterBrands;", "mCategory", "Lcom/iqonic/woobox/models/RequestModel$FilterCategories;", "mCategoryId", "mColor", "Lcom/iqonic/woobox/models/RequestModel$FilterColors;", "mGridAdapter", "Lcom/iqonic/woobox/base/BaseRecyclerAdapter;", "Lcom/iqonic/woobox/models/ProductDataNew;", "Lcom/iqonic/woobox/databinding/ItemViewproductgridBinding;", "mId", "mIsFilterDataLoaded", "", "mIsLoading", "mListAdapter", "Lcom/iqonic/woobox/databinding/ItemNewestProductBinding;", "mProductAttributeResponseMsg", "", "mSelectedBrand", "Lkotlin/collections/ArrayList;", "mSelectedCategory", "mSelectedColor", "mSelectedPrice", "mSelectedSize", "mSize", "Lcom/iqonic/woobox/models/RequestModel$FilterSizes;", "menuCart", "Landroid/view/View;", "showPagination", "Ljava/lang/Boolean;", "dislikeProductImage", "", "ivFavourite", "Landroid/widget/ImageView;", "filterProduct", "aFilterProductRequest", "Lcom/iqonic/woobox/models/FilterProductRequest;", "getAdapter", "getGridAdapter", "getProductAttributes", "getRecentItems", "getSubCategoryProducts", "likeProductImage", "listAllProducts", "listFeaturedProducts", "noProductAvailable", "it", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onViewCreated", "view", "openFilterBottomSheet", "setCartCount", "setClickEventListener", "setProducts", "Companion", "app_debug"})
public final class ViewAllProductFragment extends com.iqonic.woobox.fragments.BaseFragment {
    private java.lang.Boolean showPagination;
    private final com.iqonic.woobox.base.BaseRecyclerAdapter<com.iqonic.woobox.models.ProductDataNew, com.iqonic.woobox.databinding.ItemNewestProductBinding> mListAdapter = null;
    private final com.iqonic.woobox.base.BaseRecyclerAdapter<com.iqonic.woobox.models.ProductDataNew, com.iqonic.woobox.databinding.ItemViewproductgridBinding> mGridAdapter = null;
    private android.view.View menuCart;
    private int mId;
    private int mCategoryId;
    private java.util.ArrayList<com.iqonic.woobox.models.RequestModel.FilterColors> mColor;
    private java.util.ArrayList<com.iqonic.woobox.models.RequestModel.FilterBrands> mBrand;
    private java.util.ArrayList<com.iqonic.woobox.models.RequestModel.FilterSizes> mSize;
    private java.util.ArrayList<com.iqonic.woobox.models.RequestModel.FilterCategories> mCategory;
    private java.util.ArrayList<java.lang.String> mSelectedColor;
    private java.util.ArrayList<java.lang.String> mSelectedBrand;
    private java.util.ArrayList<java.lang.String> mSelectedSize;
    private java.util.ArrayList<java.lang.Integer> mSelectedCategory;
    private java.util.ArrayList<java.lang.Integer> mSelectedPrice;
    private boolean mIsFilterDataLoaded;
    private java.lang.String mProductAttributeResponseMsg;
    private boolean mIsLoading;
    private int countLoadMore;
    public static final com.iqonic.woobox.fragments.ViewAllProductFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
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
    
    private final void getProductAttributes() {
    }
    
    private final void openFilterBottomSheet() {
    }
    
    private final void filterProduct(com.iqonic.woobox.models.FilterProductRequest aFilterProductRequest) {
    }
    
    private final void setProducts(java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> it) {
    }
    
    private final void noProductAvailable(java.lang.String it) {
    }
    
    public final void setCartCount() {
    }
    
    private final void getSubCategoryProducts() {
    }
    
    private final com.iqonic.woobox.base.BaseRecyclerAdapter<com.iqonic.woobox.models.ProductDataNew, com.iqonic.woobox.databinding.ItemNewestProductBinding> getAdapter() {
        return null;
    }
    
    private final com.iqonic.woobox.base.BaseRecyclerAdapter<com.iqonic.woobox.models.ProductDataNew, com.iqonic.woobox.databinding.ItemViewproductgridBinding> getGridAdapter() {
        return null;
    }
    
    private final void dislikeProductImage(android.widget.ImageView ivFavourite) {
    }
    
    private final void likeProductImage(android.widget.ImageView ivFavourite) {
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
    
    private final void listFeaturedProducts(int countLoadMore) {
    }
    
    private final void listAllProducts(int mId, int countLoadMore) {
    }
    
    private final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> getRecentItems() {
        return null;
    }
    
    public ViewAllProductFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lcom/iqonic/woobox/fragments/ViewAllProductFragment$Companion;", "", "()V", "getNewInstance", "Lcom/iqonic/woobox/fragments/ViewAllProductFragment;", "id", "", "mCategoryId", "showPagination", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.fragments.ViewAllProductFragment getNewInstance(int id, int mCategoryId, boolean showPagination) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}