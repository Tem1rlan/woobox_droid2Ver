package com.iqonic.woobox.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u008a\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\u001ak\u0010\u0000\u001a,\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u0001H\u0004H\u00040\u0001\"\u0004\b\u0000\u0010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\u00062#\u0010\u0007\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u0001H\u0004\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\b\u001a \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002\u001a\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u001a&\u0010\u0018\u001a\u0004\u0018\u00010\u0014*\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u001a\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u0014*\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b\u001a\u001d\u0010\u001c\u001a\u00020\u000e*\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000eH\u0086\u0002\u001a\f\u0010\u001f\u001a\u0004\u0018\u00010\u0014*\u00020\u0014\u001a$\u0010 \u001a\u00020\u0014*\u00020\u00142\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u001a\u001c\u0010$\u001a\u00020\u0014*\u00020\u00142\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u001a2\u0010\'\u001a\u00020\u0017*\u00020\u00142\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001a\u007f\u0010,\u001a,\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00170\u00170\u0001*\u00020\u00142\u0006\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u00172!\u0010-\u001a\u001d\u0012\u0013\u0012\u00110)\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020\f0\bH\u0007\u001a%\u0010/\u001a\u00020\f*\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000eH\u0086\u0002\u001a\u0016\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e02*\u00020\u0014\u001a\u0014\u00103\u001a\u00020)*\u00020\u00142\b\b\u0002\u00104\u001a\u00020+\u001a\f\u00105\u001a\u0004\u0018\u00010\u0014*\u000206\u001a\u0012\u00105\u001a\u00020\u0014*\u0002072\u0006\u00108\u001a\u000209\u001a\u0014\u0010:\u001a\u00020;*\u00020\u00142\b\b\u0002\u00104\u001a\u00020+\u001a\u0012\u0010<\u001a\u000206*\u00020\u00142\u0006\u00108\u001a\u000209\u001a\u0014\u0010=\u001a\u0004\u0018\u00010\u0014*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017\u001a(\u0010>\u001a\u00020\u0014*\u00020\u00142\b\b\u0002\u0010?\u001a\u00020&2\b\b\u0002\u0010@\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u001a.\u0010A\u001a\u00020\u0014*\u00020\u00142\u0006\u0010B\u001a\u00020&2\b\b\u0002\u0010?\u001a\u00020&2\b\b\u0003\u0010@\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017\u00a8\u0006C"}, d2 = {"asyncAwait", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "T", "asyncRunnable", "Lkotlin/Function0;", "awaitRunnable", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "", "calculateInSampleSize", "", "options", "Landroid/graphics/BitmapFactory$Options;", "maxWidth", "maxHeight", "compressByQuality", "Landroid/graphics/Bitmap;", "quality", "recycle", "", "compressBySampleSize", "crop", "r", "Landroid/graphics/Rect;", "get", "x", "y", "makeCircle", "resize", "w", "", "h", "rotateTo", "angle", "", "save", "to", "", "format", "Landroid/graphics/Bitmap$CompressFormat;", "saveAsync", "onComplete", "isSaved", "set", "pixel", "size", "Lkotlin/Pair;", "toBase64", "compressFormat", "toBitmap", "Landroid/graphics/drawable/Drawable;", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "toByteArray", "", "toDrawable", "toGrayScale", "toRound", "borderSize", "borderColor", "toRoundCorner", "radius", "app_debug"})
public final class BitmapExtensionsKt {
    
    /**
     * Returns Bitmap Width And Height Presented as a Pair of two Int where pair.first is width and pair.second is height
     */
    @org.jetbrains.annotations.NotNull()
    public static final kotlin.Pair<java.lang.Integer, java.lang.Integer> size(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$size) {
        return null;
    }
    
    /**
     * Save Bitmap to the provided Path.
     * Make Sure you have the permission to write the file to.
     */
    @androidx.annotation.RequiresPermission(value = "android.permission.WRITE_EXTERNAL_STORAGE")
    public static final boolean save(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$save, @org.jetbrains.annotations.NotNull()
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap.CompressFormat format, int quality, boolean recycle) {
        return false;
    }
    
    /**
     * Save Bitmap to the provided Path <b>Asynchronously</b> and private a callback when its done.
     *
     * Make Sure you have the permission to write the file to.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresPermission(value = "android.permission.WRITE_EXTERNAL_STORAGE")
    public static final android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> saveAsync(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$saveAsync, @org.jetbrains.annotations.NotNull()
    java.lang.String to, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap.CompressFormat format, int quality, boolean recycle, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onComplete) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>android.os.AsyncTask<java.lang.Void, java.lang.Void, T> asyncAwait(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends T> asyncRunnable, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> awaitRunnable) {
        return null;
    }
    
    /**
     * get Pixel from Bitmap Easily
     */
    public static final int get(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$get, int x, int y) {
        return 0;
    }
    
    /**
     * get Pixel to Bitmap Easily
     */
    public static final void set(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$set, int x, int y, int pixel) {
    }
    
    /**
     * Crop image easily.
     * @param r is the Rect to crop from the Bitmap
     *
     * @return cropped #android.graphics.Bitmap
     */
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Bitmap crop(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$crop, @org.jetbrains.annotations.NotNull()
    android.graphics.Rect r) {
        return null;
    }
    
    /**
     * Converts Bitmap to Base64 Easily.
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toBase64(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$toBase64, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap.CompressFormat compressFormat) {
        return null;
    }
    
    /**
     * resize Bitmap With a ease. Just call [resize] with the [w] and [h] and you will get new Resized Bitmap
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap resize(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$resize, @org.jetbrains.annotations.NotNull()
    java.lang.Number w, @org.jetbrains.annotations.NotNull()
    java.lang.Number h, boolean recycle) {
        return null;
    }
    
    /**
     * rotate Bitmap With a ease. Just call [rotateTo] with the [angle] and you will get new Resized Bitmap
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap rotateTo(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$rotateTo, float angle, boolean recycle) {
        return null;
    }
    
    /**
     * Makes the Bitmap Round with given params
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap toRound(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$toRound, float borderSize, int borderColor, boolean recycle) {
        return null;
    }
    
    /**
     * Blend the Bitmap Corners to Round with Given radius
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap toRoundCorner(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$toRoundCorner, float radius, float borderSize, @androidx.annotation.ColorInt()
    int borderColor, boolean recycle) {
        return null;
    }
    
    /**
     * Want the Image to GreyScale? Just call [toGrayScale] and get the grey Image.
     */
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Bitmap toGrayScale(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$toGrayScale, boolean recycle) {
        return null;
    }
    
    /**
     * Converts Bitmap to ByteArray Easily.
     */
    @org.jetbrains.annotations.NotNull()
    public static final byte[] toByteArray(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$toByteArray, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap.CompressFormat compressFormat) {
        return null;
    }
    
    /**
     * Compress Bitmap by Sample Size
     */
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Bitmap compressBySampleSize(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$compressBySampleSize, int maxWidth, int maxHeight, boolean recycle) {
        return null;
    }
    
    /**
     * Compress Bitmap by Quality
     */
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Bitmap compressByQuality(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$compressByQuality, int quality, boolean recycle) {
        return null;
    }
    
    private static final int calculateInSampleSize(android.graphics.BitmapFactory.Options options, int maxWidth, int maxHeight) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Bitmap makeCircle(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$makeCircle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.drawable.Drawable toDrawable(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap $this$toDrawable, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.Bitmap toBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable $this$toBitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Bitmap toBitmap(@org.jetbrains.annotations.NotNull()
    android.net.Uri $this$toBitmap, @org.jetbrains.annotations.NotNull()
    android.content.Context context) throws java.io.FileNotFoundException {
        return null;
    }
}