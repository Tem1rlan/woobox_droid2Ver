package com.iqonic.woobox.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0006\u0010\u000e\u001a\u00020\u0005\u00a8\u0006\u0010"}, d2 = {"Lcom/iqonic/woobox/fragments/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnFocusChangeListener;", "()V", "hideProgress", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onFocusChange", "v", "Landroid/view/View;", "hasFocus", "", "showProgress", "biggerDotTranformation", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment implements android.view.View.OnFocusChangeListener {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onFocusChange(@org.jetbrains.annotations.Nullable()
    android.view.View v, boolean hasFocus) {
    }
    
    public final void hideProgress() {
    }
    
    public final void showProgress() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public BaseFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/iqonic/woobox/fragments/BaseFragment$biggerDotTranformation;", "Landroid/text/method/PasswordTransformationMethod;", "()V", "BIGGER_DOT", "", "DOT", "getTransformation", "", "source", "view", "Landroid/view/View;", "PasswordCharSequence", "app_debug"})
    public static final class biggerDotTranformation extends android.text.method.PasswordTransformationMethod {
        private static final char DOT = '\u2022';
        private static final char BIGGER_DOT = '\u25cf';
        public static final com.iqonic.woobox.fragments.BaseFragment.biggerDotTranformation INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.CharSequence getTransformation(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence source, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
            return null;
        }
        
        private biggerDotTranformation() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0003J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005H\u0096\u0002J\u0019\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0096\u0001R\u0012\u0010\u0004\u001a\u00020\u0005X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/iqonic/woobox/fragments/BaseFragment$biggerDotTranformation$PasswordCharSequence;", "", "transformation", "(Ljava/lang/CharSequence;)V", "length", "", "getLength", "()I", "getTransformation", "()Ljava/lang/CharSequence;", "get", "", "index", "subSequence", "startIndex", "endIndex", "app_debug"})
        static final class PasswordCharSequence implements java.lang.CharSequence {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.CharSequence transformation = null;
            
            @java.lang.Override()
            public char get(int index) {
                return '\u0000';
            }
            
            @java.lang.Override()
            public final char charAt(int p0) {
                return '\u0000';
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.CharSequence getTransformation() {
                return null;
            }
            
            public PasswordCharSequence(@org.jetbrains.annotations.NotNull()
            java.lang.CharSequence transformation) {
                super();
            }
            
            @java.lang.Override()
            public int getLength() {
                return 0;
            }
            
            @java.lang.Override()
            public final int length() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.CharSequence subSequence(int startIndex, int endIndex) {
                return null;
            }
        }
    }
}