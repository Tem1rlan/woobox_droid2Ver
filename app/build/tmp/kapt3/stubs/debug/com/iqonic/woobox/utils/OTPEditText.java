package com.iqonic.woobox.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B-\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/iqonic/woobox/utils/OTPEditText;", "", "mEditTextList", "", "Landroid/widget/EditText;", "context", "Landroidx/fragment/app/FragmentActivity;", "transaparant", "Landroid/graphics/drawable/Drawable;", "dot", "([Landroid/widget/EditText;Landroidx/fragment/app/FragmentActivity;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "getDot", "()Landroid/graphics/drawable/Drawable;", "focusChangeListener", "Landroid/view/View$OnFocusChangeListener;", "getMEditTextList", "()[Landroid/widget/EditText;", "[Landroid/widget/EditText;", "getTransaparant", "CodeTextWatcher", "PinOnKeyListener", "app_debug"})
public final class OTPEditText {
    private final android.view.View.OnFocusChangeListener focusChangeListener = null;
    @org.jetbrains.annotations.NotNull()
    private final android.widget.EditText[] mEditTextList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.FragmentActivity context = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.drawable.Drawable transaparant = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.drawable.Drawable dot = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText[] getMEditTextList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentActivity getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable getTransaparant() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.drawable.Drawable getDot() {
        return null;
    }
    
    public OTPEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText[] mEditTextList, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity context, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable transaparant, @org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable dot) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/iqonic/woobox/utils/OTPEditText$PinOnKeyListener;", "Landroid/view/View$OnKeyListener;", "mCurrentIndex", "", "(Lcom/iqonic/woobox/utils/OTPEditText;I)V", "onKey", "", "v", "Landroid/view/View;", "keyCode", "event", "Landroid/view/KeyEvent;", "app_debug"})
    public final class PinOnKeyListener implements android.view.View.OnKeyListener {
        private final int mCurrentIndex = 0;
        
        @java.lang.Override()
        public boolean onKey(@org.jetbrains.annotations.NotNull()
        android.view.View v, int keyCode, @org.jetbrains.annotations.NotNull()
        android.view.KeyEvent event) {
            return false;
        }
        
        public PinOnKeyListener(int mCurrentIndex) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J(\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\rH\u0002J(\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/iqonic/woobox/utils/OTPEditText$CodeTextWatcher;", "Landroid/text/TextWatcher;", "aCurrentIndex", "", "(Lcom/iqonic/woobox/utils/OTPEditText;I)V", "isAllEditTextsFilled", "", "()Z", "mIsFirst", "mIsLast", "mNewString", "", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "moveToNext", "moveToPrevious", "onTextChanged", "before", "app_debug"})
    public final class CodeTextWatcher implements android.text.TextWatcher {
        private boolean mIsFirst;
        private boolean mIsLast;
        private java.lang.String mNewString;
        private final int aCurrentIndex = 0;
        
        @java.lang.Override()
        public void beforeTextChanged(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence s, int start, int count, int after) {
        }
        
        @java.lang.Override()
        public void onTextChanged(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence s, int start, int before, int count) {
        }
        
        @android.annotation.SuppressLint(value = {"ResourceType"})
        @java.lang.Override()
        public void afterTextChanged(@org.jetbrains.annotations.NotNull()
        android.text.Editable s) {
        }
        
        private final boolean isAllEditTextsFilled() {
            return false;
        }
        
        private final void moveToNext() {
        }
        
        private final void moveToPrevious() {
        }
        
        public CodeTextWatcher(int aCurrentIndex) {
            super();
        }
    }
}