package com.iqonic.woobox.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\"\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\b\b\u0002\u0010#\u001a\u00020\u0007H\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\n\u0010%\u001a\u0004\u0018\u00010\u0005H\u0002J\n\u0010&\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\'\u001a\u00020\u001eH\u0002J\b\u0010(\u001a\u00020\u001eH\u0002J\u0012\u0010)\u001a\u00020\u001e2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020\u001eH\u0002J\b\u0010-\u001a\u00020\u001eH\u0014J\b\u0010.\u001a\u00020\u001eH\u0002J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0007J\b\u00103\u001a\u00020\u001eH\u0002J\b\u00104\u001a\u00020\u001eH\u0002J\u0010\u00105\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u00106\u001a\u00020\u001eH\u0002J\u0016\u00107\u001a\u00020\u001e2\f\u00108\u001a\b\u0012\u0004\u0012\u00020:09H\u0002J\u001f\u0010;\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010<\u001a\u0004\u0018\u00010\u0007H\u0002\u00a2\u0006\u0002\u0010=R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lcom/iqonic/woobox/activity/ProductDetailActivity;", "Lcom/iqonic/woobox/AppBaseActivity;", "()V", "colorAdapter", "Lcom/iqonic/woobox/adapter/RecyclerViewAdapter;", "", "i", "", "getI", "()I", "setI", "(I)V", "isAddedToCart", "", "mColorFlag", "mImages", "Ljava/util/ArrayList;", "mIsColorExist", "mIsFirstTimeSize", "mIsInWishList", "mIsSizeExist", "mMainBinding", "Lcom/iqonic/woobox/databinding/ActivityProductDetailBinding;", "mProductId", "mProductModel", "Lcom/iqonic/woobox/models/ProductDataNew;", "mQuntity", "mSizeFlag", "sizeAdapter", "addItemToCart", "", "bindData", "changeFavIcon", "drawable", "backgroundColor", "iconTint", "checkWishListAndCart", "getSelectedColors", "getSelectedSize", "intHeaderView", "listProductReviews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFavouriteClick", "onResume", "removeCartItem", "round", "", "value", "places", "setCartCountFromPref", "setDescription", "setDetails", "setMoreInfo", "setRating", "data", "", "Lcom/iqonic/woobox/models/ProductReviewData;", "setStock", "stockQuantity", "(Lcom/iqonic/woobox/models/ProductDataNew;Ljava/lang/Integer;)V", "app_debug"})
public final class ProductDetailActivity extends com.iqonic.woobox.AppBaseActivity {
    private com.iqonic.woobox.databinding.ActivityProductDetailBinding mMainBinding;
    private com.iqonic.woobox.models.ProductDataNew mProductModel;
    private int mProductId;
    private boolean isAddedToCart;
    private final java.util.ArrayList<java.lang.String> mImages = null;
    private int i;
    private boolean mIsInWishList;
    private int mColorFlag;
    private int mSizeFlag;
    private java.lang.String mQuntity;
    private boolean mIsColorExist;
    private boolean mIsSizeExist;
    private boolean mIsFirstTimeSize;
    private com.iqonic.woobox.adapter.RecyclerViewAdapter<java.lang.String> colorAdapter;
    private com.iqonic.woobox.adapter.RecyclerViewAdapter<java.lang.String> sizeAdapter;
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
    
    private final void setCartCountFromPref() {
    }
    
    private final void setDetails(com.iqonic.woobox.models.ProductDataNew mProductModel) {
    }
    
    private final void setStock(com.iqonic.woobox.models.ProductDataNew mProductModel, java.lang.Integer stockQuantity) {
    }
    
    public final double round(double value, int places) {
        return 0.0;
    }
    
    private final void onFavouriteClick() {
    }
    
    private final void intHeaderView() {
    }
    
    private final void setMoreInfo() {
    }
    
    private final void setDescription() {
    }
    
    private final void bindData() {
    }
    
    private final java.lang.String getSelectedColors() {
        return null;
    }
    
    private final java.lang.String getSelectedSize() {
        return null;
    }
    
    private final void changeFavIcon(int drawable, int backgroundColor, int iconTint) {
    }
    
    private final void addItemToCart() {
    }
    
    private final void removeCartItem() {
    }
    
    private final void listProductReviews() {
    }
    
    private final void setRating(java.util.List<com.iqonic.woobox.models.ProductReviewData> data) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void checkWishListAndCart() {
    }
    
    public ProductDetailActivity() {
        super();
    }
}