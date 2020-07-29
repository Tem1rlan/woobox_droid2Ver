package com.iqonic.woobox.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u00e0\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u001a\b\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001d\u0010\u0006\u001a\u00020\u0007\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086\b\u001a\u001e\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u001a\u001c\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u001a\u001a\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012\u001a\u0012\u0010\u0017\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012\u001a\n\u0010\u001a\u001a\u00020\u0001*\u00020\u001b\u001a\n\u0010\u001c\u001a\u00020\u0001*\u00020\u001d\u001a\u0012\u0010\u0019\u001a\u00020\u0012*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0012\u001a\u0014\u0010\u001e\u001a\u00020\u001f*\u00020 2\b\b\u0002\u0010!\u001a\u00020\u0005\u001a\u0014\u0010\"\u001a\u00020\u001f*\u00020 2\b\b\u0002\u0010!\u001a\u00020\u0005\u001a\u0012\u0010#\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015\u001a\n\u0010$\u001a\u00020\u0001*\u00020 \u001a\u0011\u0010$\u001a\u0004\u0018\u00010\u0001*\u00020\u0015\u00a2\u0006\u0002\u0010%\u001a&\u0010&\u001a\u00020\u0012*\u00020\'2\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0)\u00a2\u0006\u0002\b+H\u0086\b\u001a\u0015\u0010,\u001a\u00020-*\u00020.2\u0006\u0010/\u001a\u00020\u0012H\u0086\u0004\u001aJ\u00100\u001a\u00020\u0001\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\t*\u00020 2\b\b\u0002\u00101\u001a\u00020\u00122\n\b\u0002\u00102\u001a\u0004\u0018\u0001032\u0019\b\n\u00104\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010)\u00a2\u0006\u0002\b+H\u0086\b\u001a\u0019\u00105\u001a\u00020\u0001\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\t*\u00020 H\u0086\b\u001a\n\u00106\u001a\u00020\u0001*\u00020 \u001a\u0014\u00107\u001a\u00020\u0001*\u00020 2\b\b\u0002\u00108\u001a\u00020\u0012\u001a\u0014\u00109\u001a\u00020\u0001*\u00020 2\b\b\u0002\u0010:\u001a\u00020\u0012\u001a\u0016\u0010;\u001a\u00020\u0001*\u00020 2\b\b\u0002\u00108\u001a\u00020\u0012H\u0007\u001a\u0016\u0010<\u001a\u00020\u0001*\u00020 2\b\b\u0002\u0010:\u001a\u00020\u0012H\u0007\u001a\f\u0010=\u001a\u00020\u0001*\u00020 H\u0007\u001af\u0010>\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020?*\u0002H\b2K\u0010@\u001aG\u0012\u0013\u0012\u00110-\u00a2\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\u0012\u00a2\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0004\u0012\u00020\u00010A\u00a2\u0006\u0002\u0010G\u001a7\u0010>\u001a\u00020\u0001\"\b\b\u0000\u0010\b*\u00020-*\u0002H\b2\u0019\b\u0004\u0010(\u001a\u0013\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00010)\u00a2\u0006\u0002\b+H\u0086\b\u00a2\u0006\u0002\u0010H\u001a7\u0010I\u001a\u00020\u0001\"\b\b\u0000\u0010\b*\u00020-*\u0002H\b2\u0019\b\u0004\u0010(\u001a\u0013\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00010)\u00a2\u0006\u0002\b+H\u0086\b\u00a2\u0006\u0002\u0010H\u001a*\u0010J\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020-0K2\u0018\u0010J\u001a\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00010L\u001a*\u0010N\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020-0K2\u0018\u0010N\u001a\u0014\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010L\u001a\u001b\u0010O\u001a\u0002H\b\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0P\u00a2\u0006\u0002\u0010Q\u001a\u0012\u0010R\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015\u001a\u001a\u0010S\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0012\u001a5\u0010T\u001a\u00020\u0001*\u00020U2\u0006\u0010V\u001a\u00020W2!\u0010X\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00010)\u001a@\u0010Z\u001a\u00020\u0001*\u00020U2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020W0\\2!\u0010X\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(Y\u0012\u0004\u0012\u00020\u00010)\u00a2\u0006\u0002\u0010]\u001a\u0014\u0010^\u001a\u00020\u0001*\u00020_2\b\b\u0002\u0010!\u001a\u00020\u0005\u001a\u0012\u0010`\u001a\u00020a*\u00020a2\u0006\u0010\u0019\u001a\u00020\u0012\u001a\u0014\u0010b\u001a\u00020\u0001*\u00020_2\b\b\u0002\u0010!\u001a\u00020\u0005\u001a\u0012\u0010c\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015\u001a\n\u0010d\u001a\u00020\u0001*\u00020U\u001a\u0012\u0010e\u001a\u00020\u0001*\u00020 2\u0006\u0010D\u001a\u00020-\u001a5\u0010f\u001a\u00020\u0001*\u00020U2\u0006\u0010g\u001a\u00020\u00122!\u0010X\u001a\u001d\u0012\u0013\u0012\u00110W\u00a2\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(h\u0012\u0004\u0012\u00020\u00010)\u001a\u001c\u0010i\u001a\u00020\u0001*\u00020 2\u0006\u0010j\u001a\u00020W2\b\b\u0002\u0010k\u001a\u00020\u0012\u001a\u0012\u0010i\u001a\u00020\u0001*\u00020\u00152\u0006\u0010j\u001a\u00020W\u001a\u0012\u0010l\u001a\u00020\u0001*\u00020 2\u0006\u0010j\u001a\u00020W\u001a\u0012\u0010m\u001a\u00020\u0001*\u00020\u00132\u0006\u0010n\u001a\u00020\u0005\u001a\u0016\u0010o\u001a\u00020p*\u00020p2\b\b\u0001\u0010\u0019\u001a\u00020\u0012H\u0000\u001a\n\u0010q\u001a\u00020W*\u00020\u0012\u001a\u001e\u0010r\u001a\u00020\u0001*\u00020 2\b\b\u0001\u0010s\u001a\u00020\u00122\b\b\u0002\u0010t\u001a\u00020\u0012\u001a\u001c\u0010r\u001a\u00020\u0001*\u00020 2\u0006\u0010u\u001a\u00020W2\b\b\u0002\u0010t\u001a\u00020\u0012\u001a\u001e\u0010r\u001a\u00020\u0001*\u00020\u00152\b\b\u0001\u0010s\u001a\u00020\u00122\b\b\u0002\u0010t\u001a\u00020\u0012\u001a\u001c\u0010r\u001a\u00020\u0001*\u00020\u00152\u0006\u0010u\u001a\u00020W2\b\b\u0002\u0010t\u001a\u00020\u0012\u001a\n\u0010v\u001a\u00020W*\u00020\u0012\u001a\u0018\u0010w\u001a\u00020\u0001*\u00020 2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u00a8\u0006x"}, d2 = {"async", "", "run", "Lkotlin/Function0;", "isNetworkAvailable", "", "newIntent", "Landroid/content/Intent;", "T", "", "context", "Landroid/content/Context;", "runDelayed", "delayMillis", "", "action", "runDelayedOnUiThread", "addFragment", "", "Landroidx/appcompat/app/AppCompatActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "frameId", "applyColorFilter", "Landroid/widget/ImageView;", "color", "applyStrike", "Landroid/widget/TextView;", "changeToolbarFont", "Landroidx/appcompat/widget/Toolbar;", "getHorizontalLayout", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/app/Activity;", "aReverseLayout", "getVerticalLayout", "hideFragment", "hideSoftKeyboard", "(Landroidx/fragment/app/Fragment;)Lkotlin/Unit;", "inTransaction", "Landroidx/fragment/app/FragmentManager;", "func", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/ExtensionFunctionType;", "inflate", "Landroid/view/View;", "Landroid/view/ViewGroup;", "layoutRes", "launchActivity", "requestCode", "options", "Landroid/os/Bundle;", "init", "launchActivityWithNewTask", "launchPermissionSettingScreen", "lightNavigation", "navigationBarColor", "lightStatusBar", "statusBarColor", "makeNormalNavigationBar", "makeNormalStatusBar", "makeTranslucentNavigationBar", "onClick", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "event", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "view", "position", "type", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Lkotlin/jvm/functions/Function3;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "onLongClick", "onSlide", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lkotlin/Function2;", "", "onStateChanged", "randomItem", "", "(Ljava/util/List;)Ljava/lang/Object;", "removeFragment", "replaceFragment", "requestPermission", "Landroidx/fragment/app/FragmentActivity;", "permission", "", "onResult", "isGranted", "requestPermissions", "permissions", "", "(Landroidx/fragment/app/FragmentActivity;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "setHorizontalLayout", "Landroidx/recyclerview/widget/RecyclerView;", "setTextColor", "Lcom/google/android/material/snackbar/Snackbar;", "setVerticalLayout", "showFragment", "showGPSEnableDialog", "showPermissionAlert", "showQtyChangeDialog", "qt", "string", "snackBar", "msg", "length", "snackBarError", "switchToDarkMode", "isDark", "tint", "Landroid/graphics/drawable/Drawable;", "toDecimalFormat", "toast", "stringRes", "duration", "text", "twoDigitTime", "ui", "app_debug"})
public final class ExtensionsKt {
    
    @androidx.annotation.RequiresPermission(value = "android.permission.ACCESS_NETWORK_STATE")
    public static final boolean isNetworkAvailable() {
        return false;
    }
    
    public static final <T extends android.view.View>void onClick(@org.jetbrains.annotations.NotNull()
    T $this$onClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> func) {
    }
    
    public static final <T extends android.view.View>void onLongClick(@org.jetbrains.annotations.NotNull()
    T $this$onLongClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> func) {
    }
    
    public static final int inTransaction(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager $this$inTransaction, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentTransaction, ? extends androidx.fragment.app.FragmentTransaction> func) {
        return 0;
    }
    
    public static final void snackBar(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$snackBar, @org.jetbrains.annotations.NotNull()
    java.lang.String msg, int length) {
    }
    
    public static final void snackBar(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$snackBar, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    public static final void snackBarError(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$snackBarError, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.material.snackbar.Snackbar setTextColor(@org.jetbrains.annotations.NotNull()
    com.google.android.material.snackbar.Snackbar $this$setTextColor, int color) {
        return null;
    }
    
    public static final void showPermissionAlert(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$showPermissionAlert, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public static final int replaceFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$replaceFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int frameId) {
        return 0;
    }
    
    public static final int addFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$addFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, int frameId) {
        return 0;
    }
    
    public static final int removeFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$removeFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        return 0;
    }
    
    public static final int showFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$showFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        return 0;
    }
    
    public static final int hideFragment(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$hideFragment, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        return 0;
    }
    
    public static final void async(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> run) {
    }
    
    public static final void ui(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$ui, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> run) {
    }
    
    public static final boolean runDelayed(long delayMillis, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        return false;
    }
    
    public static final boolean runDelayedOnUiThread(long delayMillis, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends androidx.recyclerview.widget.RecyclerView.ViewHolder>T onClick(@org.jetbrains.annotations.NotNull()
    T $this$onClick, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.View, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> event) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.view.View inflate(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup $this$inflate, int layoutRes) {
        return null;
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$toast, @androidx.annotation.StringRes()
    int stringRes, int duration) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toast, @androidx.annotation.StringRes()
    int stringRes, int duration) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final kotlin.Unit hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$hideSoftKeyboard) {
        return null;
    }
    
    public static final void hideSoftKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$hideSoftKeyboard) {
    }
    
    public static final void changeToolbarFont(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar $this$changeToolbarFont) {
    }
    
    public static final void applyColorFilter(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$applyColorFilter, int color) {
    }
    
    public static final void applyStrike(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$applyStrike) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String twoDigitTime(int $this$twoDigitTime) {
        return null;
    }
    
    public static final void launchPermissionSettingScreen(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$launchPermissionSettingScreen) {
    }
    
    public static final void requestPermission(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$requestPermission, @org.jetbrains.annotations.NotNull()
    java.lang.String permission, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onResult) {
    }
    
    public static final void requestPermissions(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$requestPermissions, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onResult) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.drawable.Drawable tint(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable $this$tint, @androidx.annotation.ColorInt()
    int color) {
        return null;
    }
    
    public static final void setVerticalLayout(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$setVerticalLayout, boolean aReverseLayout) {
    }
    
    public static final void setHorizontalLayout(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$setHorizontalLayout, boolean aReverseLayout) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.recyclerview.widget.LinearLayoutManager getHorizontalLayout(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$getHorizontalLayout, boolean aReverseLayout) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final androidx.recyclerview.widget.LinearLayoutManager getVerticalLayout(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$getVerticalLayout, boolean aReverseLayout) {
        return null;
    }
    
    public static final void showGPSEnableDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$showGPSEnableDialog) {
    }
    
    public static final void showQtyChangeDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $this$showQtyChangeDialog, int qt, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onResult) {
    }
    
    public static final int color(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$color, int color) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toDecimalFormat(int $this$toDecimalFormat) {
        return null;
    }
    
    public static final <T extends java.lang.Object>T randomItem(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> $this$randomItem) {
        return null;
    }
    
    public static final void onSlide(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> $this$onSlide, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super android.view.View, ? super java.lang.Float, kotlin.Unit> onSlide) {
    }
    
    public static final void onStateChanged(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> $this$onStateChanged, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super android.view.View, ? super java.lang.Integer, kotlin.Unit> onStateChanged) {
    }
    
    public static final void switchToDarkMode(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $this$switchToDarkMode, boolean isDark) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.KITKAT)
    public static final void makeNormalStatusBar(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$makeNormalStatusBar, int statusBarColor) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.KITKAT)
    public static final void makeTranslucentNavigationBar(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$makeTranslucentNavigationBar) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.KITKAT)
    public static final void makeNormalNavigationBar(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$makeNormalNavigationBar, int navigationBarColor) {
    }
    
    public static final void lightStatusBar(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$lightStatusBar, int statusBarColor) {
    }
    
    public static final void lightNavigation(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$lightNavigation, int navigationBarColor) {
    }
}