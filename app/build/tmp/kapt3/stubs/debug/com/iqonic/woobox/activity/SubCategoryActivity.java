package com.iqonic.woobox.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0012\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0012\u0010\u001d\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/iqonic/woobox/activity/SubCategoryActivity;", "Lcom/iqonic/woobox/AppBaseActivity;", "()V", "imgLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "mCategoryData", "Lcom/iqonic/woobox/models/CategoryData;", "mFeaturedAdapter", "Lcom/iqonic/woobox/adapter/RecyclerViewAdapter;", "Lcom/iqonic/woobox/models/ProductDataNew;", "mNewArrivalAdapter", "mViewAllProductFragment", "Lcom/iqonic/woobox/fragments/ViewAllProductFragment;", "getFeaturedAdapter", "getFeaturedProducts", "", "getSubCategoryProducts", "loadSearchFragment", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "setupSubCategory", "app_debug"})
public final class SubCategoryActivity extends com.iqonic.woobox.AppBaseActivity {
    private com.iqonic.woobox.models.CategoryData mCategoryData;
    private android.widget.LinearLayout.LayoutParams imgLayoutParams;
    private com.iqonic.woobox.adapter.RecyclerViewAdapter<com.iqonic.woobox.models.ProductDataNew> mFeaturedAdapter;
    private com.iqonic.woobox.adapter.RecyclerViewAdapter<com.iqonic.woobox.models.ProductDataNew> mNewArrivalAdapter;
    private com.iqonic.woobox.fragments.ViewAllProductFragment mViewAllProductFragment;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupSubCategory() {
    }
    
    private final void getFeaturedProducts() {
    }
    
    private final void getSubCategoryProducts() {
    }
    
    @java.lang.Override()
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void loadSearchFragment() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final com.iqonic.woobox.adapter.RecyclerViewAdapter<com.iqonic.woobox.models.ProductDataNew> getFeaturedAdapter() {
        return null;
    }
    
    public SubCategoryActivity() {
        super();
    }
}