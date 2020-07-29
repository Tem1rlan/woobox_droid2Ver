package com.iqonic.woobox.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0014J\u0010\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0002J\b\u00101\u001a\u000202H\u0017J\u001a\u00103\u001a\u00020,2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002J\u0018\u00104\u001a\u00020,2\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000bH\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0003X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u0014X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u0018R\u001a\u0010 \u001a\u00020!X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020\u000bX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000f\u00a8\u00067"}, d2 = {"Lcom/iqonic/woobox/utils/CurveContainer;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "TAG", "", "curvatureHeight", "", "getCurvatureHeight$app_debug", "()I", "setCurvatureHeight$app_debug", "(I)V", "height", "getHeight$app_debug", "setHeight$app_debug", "mClipPath", "Landroid/graphics/Path;", "getMClipPath$app_debug", "()Landroid/graphics/Path;", "setMClipPath$app_debug", "(Landroid/graphics/Path;)V", "mContext", "getMContext$app_debug", "()Landroid/content/Context;", "setMContext$app_debug", "mOutlinePath", "getMOutlinePath$app_debug", "setMOutlinePath$app_debug", "mPaint", "Landroid/graphics/Paint;", "getMPaint$app_debug", "()Landroid/graphics/Paint;", "setMPaint$app_debug", "(Landroid/graphics/Paint;)V", "porterDuffXfermode", "Landroid/graphics/PorterDuffXfermode;", "width", "getWidth$app_debug", "setWidth$app_debug", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "getDpForPixel", "pixel", "getOutlineProvider", "Landroid/view/ViewOutlineProvider;", "init", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "app_debug"})
public final class CurveContainer extends android.widget.RelativeLayout {
    @org.jetbrains.annotations.NotNull()
    public android.content.Context mContext;
    @org.jetbrains.annotations.NotNull()
    public android.graphics.Path mClipPath;
    @org.jetbrains.annotations.NotNull()
    public android.graphics.Path mOutlinePath;
    private int width;
    private int height;
    
    /**
     * @param curvatureHeight changes the amount of curve. Default is 50.
     */
    private int curvatureHeight;
    @org.jetbrains.annotations.NotNull()
    public android.graphics.Paint mPaint;
    private android.graphics.PorterDuffXfermode porterDuffXfermode;
    private final java.lang.String TAG = "CRESCENTO_CONTAINER";
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext$app_debug() {
        return null;
    }
    
    public final void setMContext$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Path getMClipPath$app_debug() {
        return null;
    }
    
    public final void setMClipPath$app_debug(@org.jetbrains.annotations.NotNull()
    android.graphics.Path p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Path getMOutlinePath$app_debug() {
        return null;
    }
    
    public final void setMOutlinePath$app_debug(@org.jetbrains.annotations.NotNull()
    android.graphics.Path p0) {
    }
    
    public final int getWidth$app_debug() {
        return 0;
    }
    
    public final void setWidth$app_debug(int p0) {
    }
    
    public final int getHeight$app_debug() {
        return 0;
    }
    
    public final void setHeight$app_debug(int p0) {
    }
    
    public final int getCurvatureHeight$app_debug() {
        return 0;
    }
    
    public final void setCurvatureHeight$app_debug(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Paint getMPaint$app_debug() {
        return null;
    }
    
    public final void setMPaint$app_debug(@org.jetbrains.annotations.NotNull()
    android.graphics.Paint p0) {
    }
    
    private final void init(android.content.Context context, android.util.AttributeSet attrs) {
    }
    
    @java.lang.Override()
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    @java.lang.Override()
    public android.view.ViewOutlineProvider getOutlineProvider() {
        return null;
    }
    
    @java.lang.Override()
    protected void dispatchDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    private final int getDpForPixel(int pixel) {
        return 0;
    }
    
    public CurveContainer(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public CurveContainer(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
}