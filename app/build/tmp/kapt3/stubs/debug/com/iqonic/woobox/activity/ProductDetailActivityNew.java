package com.iqonic.woobox.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u001c\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0003J\u0012\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\u0012\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0018H\u0002J\u0006\u0010\'\u001a\u00020\u0018J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0014H\u0003J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0014H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcom/iqonic/woobox/activity/ProductDetailActivityNew;", "Lcom/iqonic/woobox/AppBaseActivity;", "()V", "i", "", "getI", "()I", "setI", "(I)V", "isAddedTocart", "", "mAttributeAdapter", "Lcom/iqonic/woobox/adapter/RecyclerViewAdapter;", "", "mImages", "Ljava/util/ArrayList;", "mMenuCart", "Landroid/view/View;", "mPId", "mProductModel", "Lcom/iqonic/woobox/models/ProductModelNew;", "mYearAdapter", "Landroid/widget/ArrayAdapter;", "addItemToCart", "", "calculateDiscount", "", "salePrice", "regularPrice", "getPriceDetails", "details", "getProductDetail", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "removeCartItem", "setCartCount", "setPriceDetail", "its", "showUpComingSale", "app_debug"})
public final class ProductDetailActivityNew extends com.iqonic.woobox.AppBaseActivity {
    private int mPId;
    private final java.util.ArrayList<java.lang.String> mImages = null;
    private android.view.View mMenuCart;
    private boolean isAddedTocart;
    private int i;
    private com.iqonic.woobox.adapter.RecyclerViewAdapter<java.lang.String> mAttributeAdapter;
    private android.widget.ArrayAdapter<java.lang.String> mYearAdapter;
    private com.iqonic.woobox.models.ProductModelNew mProductModel;
    private java.util.HashMap _$_findViewCache;
    
    public final int getI() {
        return 0;
    }
    
    public final void setI(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    public final void setCartCount() {
    }
    
    private final void addItemToCart() {
    }
    
    private final void removeCartItem() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void getProductDetail() {
    }
    
    private final float calculateDiscount(java.lang.String salePrice, java.lang.String regularPrice) {
        return 0.0F;
    }
    
    private final java.lang.String getPriceDetails(com.iqonic.woobox.models.ProductModelNew details) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void setPriceDetail(com.iqonic.woobox.models.ProductModelNew its) {
    }
    
    /**
     * Show Upcoming sale details
     */
    private final void showUpComingSale(com.iqonic.woobox.models.ProductModelNew its) {
    }
    
    public ProductDetailActivityNew() {
        super();
    }
}