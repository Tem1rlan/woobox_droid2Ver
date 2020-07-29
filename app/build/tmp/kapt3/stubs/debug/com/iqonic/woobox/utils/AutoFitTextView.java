package com.iqonic.woobox.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0014J(\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0015H\u0014J(\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0015H\u0014J\u0018\u0010\"\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0015H\u0002J\u000e\u0010\f\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0015J\u000e\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0015R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\r\u00a8\u0006%"}, d2 = {"Lcom/iqonic/woobox/utils/AutoFitTextView;", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "maxTextSize", "", "getMaxTextSize", "()F", "setMaxTextSize", "(F)V", "minTextSize", "getMinTextSize", "setMinTextSize", "init", "", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "onSizeChanged", "w", "h", "oldw", "oldh", "onTextChanged", "text", "", "start", "before", "after", "refitText", "", "textWidth", "app_debug"})
public final class AutoFitTextView extends android.widget.TextView {
    private float minTextSize;
    private float maxTextSize;
    private java.util.HashMap _$_findViewCache;
    
    public final float getMinTextSize() {
        return 0.0F;
    }
    
    public final void setMinTextSize(float p0) {
    }
    
    public final float getMaxTextSize() {
        return 0.0F;
    }
    
    public final void setMaxTextSize(float p0) {
    }
    
    private final void init() {
    }
    
    private final void refitText(java.lang.String text, int textWidth) {
    }
    
    @java.lang.Override()
    protected void onTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int start, int before, int after) {
    }
    
    @java.lang.Override()
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    public final void setMinTextSize(int minTextSize) {
    }
    
    public final void setMaxTextSize(int minTextSize) {
    }
    
    public AutoFitTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public AutoFitTextView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
}