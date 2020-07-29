package com.iqonic.woobox.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u00f0\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u001a\u0006\u0010\t\u001a\u00020\n\u001a\u0006\u0010\u000b\u001a\u00020\n\u001a\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0006j\b\u0012\u0004\u0012\u00020\r`\b\u001a&\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0006j\b\u0012\u0004\u0012\u00020\r`\b2\u0006\u0010\u0002\u001a\u00020\r\u001a\r\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0012\u001a\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0006j\b\u0012\u0004\u0012\u00020\u0014`\b\u001a\u0006\u0010\u0015\u001a\u00020\n\u001a\u0006\u0010\u0016\u001a\u00020\n\u001a\u0006\u0010\u0017\u001a\u00020\n\u001a\u0006\u0010\u0018\u001a\u00020\n\u001a&\u0010\u0019\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\b2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u0006j\b\u0012\u0004\u0012\u00020\u001d`\b\u001a\u0006\u0010\u001e\u001a\u00020\n\u001a\u0006\u0010\u001f\u001a\u00020\n\u001a\u0006\u0010 \u001a\u00020\n\u001a\u0006\u0010!\u001a\u00020\n\u001a\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020#0\u0006j\b\u0012\u0004\u0012\u00020#`\b\u001a\u0018\u0010$\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020%\u001a\u000e\u0010\'\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010(\u001a\u00020%\u001a\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0006j\b\u0012\u0004\u0012\u00020\u0003`\b\u001a\u0016\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u000f\u001a\u0016\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0003\u001a\u001e\u00102\u001a\u00020\u00012\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\n\u001a*\u00107\u001a\u0004\u0018\u0001082\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00010<\u001a&\u0010=\u001a\u00020\u0001*\u00020>2\u0006\u0010?\u001a\u00020\u00072\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010:\u001a&\u0010A\u001a\u00020\u0001*\u00020>2\u0006\u0010B\u001a\u00020C2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010:\u001a&\u0010D\u001a\u00020\u0001*\u00020>2\u0006\u0010B\u001a\u00020C2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010:\u001a&\u0010E\u001a\u00020\u0001*\u00020F2\u0006\u0010B\u001a\u00020C2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00010:\u001a\n\u0010I\u001a\u00020\u0001*\u00020>\u001a\n\u0010J\u001a\u00020\u0001*\u00020>\u001a\n\u0010K\u001a\u00020\u0001*\u00020>\u001a\f\u0010L\u001a\u0004\u0018\u00010M*\u000204\u001a\f\u0010N\u001a\u0004\u0018\u00010M*\u000204\u001a\f\u0010O\u001a\u0004\u0018\u00010M*\u000204\u001a\u0082\u0001\u0010P\u001a\u00020Q*\u00020>2\u0006\u0010R\u001a\u00020\n2\b\b\u0002\u0010S\u001a\u00020\n2\b\b\u0002\u0010T\u001a\u00020\n2\b\b\u0002\u0010U\u001a\u00020\n2\'\u0010V\u001a#\u0012\u0013\u0012\u00110X\u00a2\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b([\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010W2\'\u0010\\\u001a#\u0012\u0013\u0012\u00110X\u00a2\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b([\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010W\u001a\u0011\u0010]\u001a\u0004\u0018\u00010\u000f*\u00020F\u00a2\u0006\u0002\u0010^\u001a8\u0010_\u001a\u00020\u0001*\u00020F2\b\b\u0002\u0010`\u001a\u00020\u000f2\"\u0010G\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020a0\u0006j\b\u0012\u0004\u0012\u00020a`\b\u0012\u0004\u0012\u00020\u00010:\u001a\n\u0010b\u001a\u00020\n*\u000204\u001a\u0014\u0010c\u001a\u00020\u0001*\u00020d2\b\b\u0001\u0010e\u001a\u00020\u000f\u001a&\u0010f\u001a\u00020\u0001*\u00020d2\u0006\u0010g\u001a\u00020\n2\b\b\u0002\u0010e\u001a\u00020\u000f2\b\b\u0002\u0010h\u001a\u00020\u000f\u001a\n\u0010i\u001a\u00020\u0001*\u00020>\u001a\u0012\u0010j\u001a\u00020\u0001*\u0002042\u0006\u0010k\u001a\u00020\n\u001a\"\u0010l\u001a\u00020\u0001*\u00020>2\b\b\u0002\u0010m\u001a\u00020n2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00010<\u001a\u001c\u0010p\u001a\u00020\u0001*\u00020F2\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010q\u001a\u00020%\u001a\n\u0010r\u001a\u00020s*\u00020>\u001a&\u0010t\u001a\u00020\u0001*\u00020>2\u0006\u0010B\u001a\u00020C2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010:\u001a&\u0010u\u001a\u00020\u0001*\u00020>2\u0006\u0010B\u001a\u00020C2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010:\u001a\n\u0010v\u001a\u00020\u0001*\u00020w\u001aJ\u0010x\u001a\u00020\u0001*\u00020F2\u0006\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020%2\u0006\u0010|\u001a\u00020\n2\u0012\u0010}\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010:2\u0012\u0010~\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010:\u001a&\u0010\u007f\u001a\u00020\u0001*\u00020>2\u0006\u0010B\u001a\u00020C2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010:\u001a\u0014\u0010\u0080\u0001\u001a\u00020\u0001*\u00020>2\u0007\u0010\u0081\u0001\u001a\u00020\n\u001a\u000b\u0010\u0082\u0001\u001a\u00020\u0001*\u00020>\u001a\u000b\u0010\u0083\u0001\u001a\u00020\u0001*\u00020>\u001a\u000b\u0010\u0084\u0001\u001a\u00020\u0001*\u00020>\u001a\u000b\u0010\u0085\u0001\u001a\u00020\u0001*\u00020>\u001a\u0014\u0010\u0086\u0001\u001a\u00020\u0001*\u00020>2\u0007\u0010\u0087\u0001\u001a\u00020\u0003\u001aD\u0010\u0088\u0001\u001a\u00020\u0001*\u00020F2\u0007\u0010\u0089\u0001\u001a\u00020\n2\u0006\u0010|\u001a\u00020\n2\u0012\u0010}\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010:2\u0012\u0010~\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010:\u001ai\u0010\u008a\u0001\u001a\u00020\u0001*\u00020F2\u0007\u0010\u0089\u0001\u001a\u00020\n2\u0007\u0010\u008b\u0001\u001a\u00020\n2\u0007\u0010\u008c\u0001\u001a\u00020\n2\u0007\u0010\u008d\u0001\u001a\u00020\n2\u0007\u0010\u008e\u0001\u001a\u00020\n2\u0007\u0010\u008f\u0001\u001a\u00020\n2\u0012\u0010}\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010:2\u0012\u0010~\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010:\u001a\u0013\u0010\u0090\u0001\u001a\u00020\u0001*\u00020F2\u0006\u0010\u0002\u001a\u00020\r\u00a8\u0006\u0091\u0001"}, d2 = {"addToRecentProduct", "", "product", "Lcom/iqonic/woobox/models/ProductDataNew;", "clearLoginPref", "getAddressList", "Ljava/util/ArrayList;", "Lcom/iqonic/woobox/models/Address;", "Lkotlin/collections/ArrayList;", "getApiToken", "", "getCartCount", "getCartListFromPref", "Lcom/iqonic/woobox/models/CartResponse;", "getCartPositionIfExist", "", "list", "getCartTotalAmount", "()Ljava/lang/Integer;", "getCategoryDataFromPref", "Lcom/iqonic/woobox/models/CategoryData;", "getDefaultCurrency", "getEmail", "getFirstName", "getLastName", "getPositionIfExist", "getSharedPrefInstance", "Lcom/iqonic/woobox/utils/SharedPrefUtils;", "getSlideImagesFromPref", "Lcom/iqonic/woobox/models/SliderImagesResponse;", "getThemeColor", "getUserId", "getUserName", "getUserProfile", "getWishListFromPref", "Lcom/iqonic/woobox/models/WishListData;", "isExistInCart", "", "selectedColor", "isExistInWishList", "isLoggedIn", "recentProduct", "setExpandableListViewHeight", "listView", "Landroid/widget/ExpandableListView;", "group", "setProductItem", "view", "Landroid/view/View;", "item", "shareMyApp", "context", "Landroid/content/Context;", "subject", "message", "startOTPTimer", "Landroid/os/CountDownTimer;", "onTimerTick", "Lkotlin/Function1;", "onTimerFinished", "Lkotlin/Function0;", "addAddress", "Landroid/app/Activity;", "address", "onSuccess", "addToWishList", "requestModel", "Lcom/iqonic/woobox/models/RequestModel;", "changePassword", "createCustomer", "Lcom/iqonic/woobox/AppBaseActivity;", "onApiSuccess", "Lcom/iqonic/woobox/models/LoginData;", "fetchAndStoreAddressData", "fetchAndStoreCartData", "fetchAndStoreWishListData", "fontBold", "Landroid/graphics/Typeface;", "fontMedium", "fontSemiBold", "getAlertDialog", "Landroidx/appcompat/app/AlertDialog;", "aMsgText", "aTitleText", "aPositiveText", "aNegativeText", "onPositiveClick", "Lkotlin/Function2;", "Landroid/content/DialogInterface;", "Lkotlin/ParameterName;", "name", "dialog", "onNegativeClick", "getCartTotal", "(Lcom/iqonic/woobox/AppBaseActivity;)Ljava/lang/Integer;", "getOrders", "page", "Lcom/iqonic/woobox/models/MyOrderData;", "getUserFullName", "loadImageFromDrawable", "Landroid/widget/ImageView;", "aPlaceHolderImage", "loadImageFromUrl", "aImageUrl", "aErrorImage", "makeTransparentStatusBar", "openCustomTab", "url", "openLottieDialog", "jsonFileCode", "Lcom/iqonic/woobox/utils/extensions/JsonFileCode;", "onLottieClick", "processPayment", "isContainRedirectUrl", "productLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "removeAddress", "removeFromWishList", "rvItemAnimation", "Landroidx/recyclerview/widget/RecyclerView;", "saveLoginResponse", "it", "Lcom/iqonic/woobox/models/LoginResponse;", "isSocialLogin", "password", "onResult", "onError", "saveProfileImage", "sendBroadcast", "action", "sendCartCountChangeBroadcast", "sendOrderCountChangeBroadcast", "sendProfileUpdateBroadcast", "sendWishListBroadcast", "showProductDetail", "model", "signIn", "email", "socialLogin", "accessToken", "firstName", "lastName", "loginType", "photoURL", "updateItem", "app_debug"})
public final class AppExtensionsKt {
    
    public static final boolean isLoggedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getDefaultCurrency() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getThemeColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getUserFullName(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getUserFullName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getUserProfile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getApiToken() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getCartCount() {
        return null;
    }
    
    /**
     * Add shared preference related to user session here
     */
    public static final void clearLoginPref() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.iqonic.woobox.utils.SharedPrefUtils getSharedPrefInstance() {
        return null;
    }
    
    public static final void rvItemAnimation(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$rvItemAnimation) {
    }
    
    public static final void openCustomTab(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openCustomTab, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    public static final void loadImageFromUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImageFromUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String aImageUrl, int aPlaceHolderImage, int aErrorImage) {
    }
    
    public static final void loadImageFromDrawable(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImageFromDrawable, @androidx.annotation.DrawableRes()
    int aPlaceHolderImage) {
    }
    
    public static final void shareMyApp(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String subject, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Typeface fontMedium(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$fontMedium) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Typeface fontSemiBold(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$fontSemiBold) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Typeface fontBold(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$fontBold) {
        return null;
    }
    
    public static final void makeTransparentStatusBar(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$makeTransparentStatusBar) {
    }
    
    public static final void openLottieDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$openLottieDialog, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.utils.extensions.JsonFileCode jsonFileCode, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLottieClick) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.appcompat.app.AlertDialog getAlertDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$getAlertDialog, @org.jetbrains.annotations.NotNull()
    java.lang.String aMsgText, @org.jetbrains.annotations.NotNull()
    java.lang.String aTitleText, @org.jetbrains.annotations.NotNull()
    java.lang.String aPositiveText, @org.jetbrains.annotations.NotNull()
    java.lang.String aNegativeText, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super android.content.DialogInterface, ? super java.lang.Integer, kotlin.Unit> onPositiveClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super android.content.DialogInterface, ? super java.lang.Integer, kotlin.Unit> onNegativeClick) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.widget.LinearLayout.LayoutParams productLayoutParams(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$productLayoutParams) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.os.CountDownTimer startOTPTimer(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onTimerTick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onTimerFinished) {
        return null;
    }
    
    public static final void showProductDetail(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$showProductDetail, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.ProductDataNew model) {
    }
    
    public static final void sendCartCountChangeBroadcast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$sendCartCountChangeBroadcast) {
    }
    
    public static final void sendProfileUpdateBroadcast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$sendProfileUpdateBroadcast) {
    }
    
    public static final void sendWishListBroadcast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$sendWishListBroadcast) {
    }
    
    public static final void sendOrderCountChangeBroadcast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$sendOrderCountChangeBroadcast) {
    }
    
    public static final void sendBroadcast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$sendBroadcast, @org.jetbrains.annotations.NotNull()
    java.lang.String action) {
    }
    
    public static final void setExpandableListViewHeight(@org.jetbrains.annotations.NotNull()
    android.widget.ExpandableListView listView, int group) {
    }
    
    public static final void getOrders(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.AppBaseActivity $this$getOrders, int page, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.ArrayList<com.iqonic.woobox.models.MyOrderData>, kotlin.Unit> onApiSuccess) {
    }
    
    public static final void createCustomer(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.AppBaseActivity $this$createCustomer, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.RequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.iqonic.woobox.models.LoginData, kotlin.Unit> onApiSuccess) {
    }
    
    public static final void signIn(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.AppBaseActivity $this$signIn, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onResult, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError) {
    }
    
    public static final void socialLogin(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.AppBaseActivity $this$socialLogin, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String accessToken, @org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    java.lang.String loginType, @org.jetbrains.annotations.NotNull()
    java.lang.String photoURL, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onResult, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError) {
    }
    
    public static final void saveLoginResponse(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.AppBaseActivity $this$saveLoginResponse, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.LoginResponse it, boolean isSocialLogin, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onResult, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError) {
    }
    
    public static final void processPayment(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.AppBaseActivity $this$processPayment, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.RequestModel requestModel, boolean isContainRedirectUrl) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> recentProduct() {
        return null;
    }
    
    public static final void addToRecentProduct(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.ProductDataNew product) {
    }
    
    public static final int getPositionIfExist(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> list, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.ProductDataNew product) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.ArrayList<com.iqonic.woobox.models.Address> getAddressList() {
        return null;
    }
    
    public static final int getCartPositionIfExist(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.CartResponse> list, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.CartResponse product) {
        return 0;
    }
    
    public static final void updateItem(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.AppBaseActivity $this$updateItem, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.CartResponse product) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Integer getCartTotal(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.AppBaseActivity $this$getCartTotal) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Integer getCartTotalAmount() {
        return null;
    }
    
    public static final boolean isExistInCart(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.ProductDataNew product, boolean selectedColor) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.ArrayList<com.iqonic.woobox.models.CartResponse> getCartListFromPref() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.ArrayList<com.iqonic.woobox.models.WishListData> getWishListFromPref() {
        return null;
    }
    
    public static final boolean isExistInWishList(@org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.ProductDataNew product) {
        return false;
    }
    
    public static final void fetchAndStoreCartData(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$fetchAndStoreCartData) {
    }
    
    public static final void fetchAndStoreWishListData(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$fetchAndStoreWishListData) {
    }
    
    public static final void addToWishList(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$addToWishList, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.RequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onSuccess) {
    }
    
    public static final void removeFromWishList(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$removeFromWishList, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.RequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onSuccess) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.ArrayList<com.iqonic.woobox.models.SliderImagesResponse> getSlideImagesFromPref() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.ArrayList<com.iqonic.woobox.models.CategoryData> getCategoryDataFromPref() {
        return null;
    }
    
    public static final void setProductItem(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.ProductDataNew item) {
    }
    
    public static final void fetchAndStoreAddressData(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$fetchAndStoreAddressData) {
    }
    
    public static final void addAddress(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$addAddress, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.Address address, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onSuccess) {
    }
    
    public static final void removeAddress(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$removeAddress, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.RequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onSuccess) {
    }
    
    public static final void changePassword(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$changePassword, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.RequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onSuccess) {
    }
    
    public static final void saveProfileImage(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$saveProfileImage, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.RequestModel requestModel, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onSuccess) {
    }
}