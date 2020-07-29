package com.iqonic.woobox.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/iqonic/woobox/activity/CardActivity;", "Lcom/iqonic/woobox/AppBaseActivity;", "()V", "mMenuCart", "Landroid/view/View;", "mMonthAdapter", "Landroid/widget/ArrayAdapter;", "", "getMMonthAdapter", "()Landroid/widget/ArrayAdapter;", "setMMonthAdapter", "(Landroid/widget/ArrayAdapter;)V", "mYearAdapter", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "setCartCount", "GenericTextWatcher", "app_debug"})
public final class CardActivity extends com.iqonic.woobox.AppBaseActivity {
    private android.widget.ArrayAdapter<java.lang.String> mYearAdapter;
    private android.view.View mMenuCart;
    @org.jetbrains.annotations.Nullable()
    private android.widget.ArrayAdapter<java.lang.String> mMonthAdapter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ArrayAdapter<java.lang.String> getMMonthAdapter() {
        return null;
    }
    
    public final void setMMonthAdapter(@org.jetbrains.annotations.Nullable()
    android.widget.ArrayAdapter<java.lang.String> p0) {
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
    
    public CardActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J(\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J(\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/iqonic/woobox/activity/CardActivity$GenericTextWatcher;", "Landroid/text/TextWatcher;", "view", "Landroid/view/View;", "(Lcom/iqonic/woobox/activity/CardActivity;Landroid/view/View;)V", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "beforeTextChanged", "arg0", "", "arg1", "", "arg2", "arg3", "onTextChanged", "app_debug"})
    public final class GenericTextWatcher implements android.text.TextWatcher {
        private final android.view.View view = null;
        
        @java.lang.Override()
        public void afterTextChanged(@org.jetbrains.annotations.NotNull()
        android.text.Editable editable) {
        }
        
        @java.lang.Override()
        public void beforeTextChanged(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        }
        
        @java.lang.Override()
        public void onTextChanged(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence arg0, int arg1, int arg2, int arg3) {
        }
        
        public GenericTextWatcher(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super();
        }
    }
}