package com.iqonic.woobox;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0014J\b\u0010 \u001a\u00020\u0013H\u0014J\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#J\u0006\u0010%\u001a\u00020\u0013J\u0006\u0010&\u001a\u00020\u0013J\u000e\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u0004J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/iqonic/woobox/AppBaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "isAdShown", "", "()Z", "setAdShown", "(Z)V", "language", "Ljava/util/Locale;", "getLanguage", "()Ljava/util/Locale;", "setLanguage", "(Ljava/util/Locale;)V", "progressDialog", "Landroid/app/Dialog;", "themeApp", "", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "changeLanguage", "context", "locale", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "onStart", "setToolbar", "mToolbar", "Landroidx/appcompat/widget/Toolbar;", "setToolbarWithoutBackButton", "showBannerAds", "showInterstitialAd", "showProgress", "show", "updateBaseContextLocale", "app_debug"})
public class AppBaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.app.Dialog progressDialog;
    @org.jetbrains.annotations.Nullable()
    private java.util.Locale language;
    private int themeApp;
    private boolean isAdShown;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Locale getLanguage() {
        return null;
    }
    
    public final void setLanguage(@org.jetbrains.annotations.Nullable()
    java.util.Locale p0) {
    }
    
    public final boolean isAdShown() {
        return false;
    }
    
    public final void setAdShown(boolean p0) {
    }
    
    public final void setToolbarWithoutBackButton(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar mToolbar) {
    }
    
    public final void setToolbar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar mToolbar) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void showBannerAds() {
    }
    
    public final void showInterstitialAd() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void showProgress(boolean show) {
    }
    
    private final android.content.Context changeLanguage(android.content.Context context, java.util.Locale locale) {
        return null;
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.Nullable()
    android.content.Context newBase) {
    }
    
    private final android.content.Context updateBaseContextLocale(android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public AppBaseActivity() {
        super();
    }
}