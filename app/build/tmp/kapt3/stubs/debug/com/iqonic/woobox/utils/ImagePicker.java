package com.iqonic.woobox.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001b\u001a\u00020\u0017H\u0002J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0004H\u0002J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 H\u0002J*\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0017J\u001c\u0010%\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010&\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\'\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0004J\u0010\u0010*\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J,\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010&\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010/\u001a\u00020\rH\u0007J&\u00100\u001a\u00020,2\u0006\u00101\u001a\u0002022\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\rJ\u001e\u00103\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0004J\u0016\u00107\u001a\u00020,2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006J\u0010\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020.H\u0002J\u0010\u0010:\u001a\u00020,2\u0006\u00101\u001a\u000202H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/iqonic/woobox/utils/ImagePicker;", "", "()V", "BASE_IMAGE_NAME", "", "DEFAULT_MIN_HEIGHT_QUALITY", "", "DEFAULT_MIN_WIDTH_QUALITY", "DEFAULT_REQUEST_CODE", "TAG", "kotlin.jvm.PlatformType", "mChooserTitle", "mGalleryOnly", "", "mPickImageRequestCode", "getMPickImageRequestCode", "()I", "setMPickImageRequestCode", "(I)V", "minHeightQuality", "minWidthQuality", "addIntentsToList", "", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "list", "intent", "appManifestContainsPermission", "permission", "getFilePathFromUri", "uri", "Landroid/net/Uri;", "getImagePathFromResult", "requestCode", "resultCode", "imageReturnedIntent", "getPickImageIntent", "chooserTitle", "getTemporalFile", "Ljava/io/File;", "payload", "hasCameraAccess", "pickImage", "", "fragment", "Landroidx/fragment/app/Fragment;", "galleryOnly", "pickImageActivity", "activity", "Landroid/app/Activity;", "savePicture", "bitmap", "Landroid/graphics/Bitmap;", "imageSuffix", "setMinQuality", "startChooser", "fragmentContext", "startChoosers", "app_debug"})
public final class ImagePicker {
    private static final int DEFAULT_REQUEST_CODE = 234;
    private static final java.lang.String BASE_IMAGE_NAME = "i_prefix_";
    private static final int DEFAULT_MIN_WIDTH_QUALITY = 800;
    private static final int DEFAULT_MIN_HEIGHT_QUALITY = 800;
    private static final java.lang.String TAG = null;
    private static int minWidthQuality;
    private static int minHeightQuality;
    private static java.lang.String mChooserTitle;
    private static int mPickImageRequestCode;
    private static boolean mGalleryOnly;
    public static final com.iqonic.woobox.utils.ImagePicker INSTANCE = null;
    
    public final int getMPickImageRequestCode() {
        return 0;
    }
    
    public final void setMPickImageRequestCode(int p0) {
    }
    
    /**
     * Launch a dialog to pick an image from camera/gallery apps.
     * @param fragment     which will launch the dialog and will get the result in
     * onActivityResult()
     * @param chooserTitle will appear on the picker dialog.
     * @param requestCode REQUEST code that will be returned in result.
     */
    public final void pickImage(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String chooserTitle, int requestCode, boolean galleryOnly) {
    }
    
    /**
     * Launch a dialog to pick an image from camera/gallery apps.
     * @param fragment     which will launch the dialog and will get the result in
     * onActivityResult()
     * @param chooserTitle will appear on the picker dialog.
     * @param requestCode REQUEST code that will be returned in result.
     */
    public final void pickImage(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String chooserTitle, int requestCode) {
    }
    
    /**
     * Launch a dialog to pick an image from camera/gallery apps.
     * @param fragment     which will launch the dialog and will get the result in
     * onActivityResult()
     * @param chooserTitle will appear on the picker dialog.
     * @param requestCode REQUEST code that will be returned in result.
     */
    public final void pickImage(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String chooserTitle) {
    }
    
    public final void pickImageActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String chooserTitle, int requestCode, boolean galleryOnly) {
    }
    
    private final void startChoosers(android.app.Activity activity) {
    }
    
    private final void startChooser(androidx.fragment.app.Fragment fragmentContext) {
    }
    
    /**
     * Get an Intent which will launch a dialog to pick an image from camera/gallery apps.
     *
     * @param context      context.
     * @param chooserTitle will appear on the picker dialog.
     * @return intent launcher.
     */
    @org.jetbrains.annotations.Nullable()
    public final android.content.Intent getPickImageIntent(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String chooserTitle) {
        return null;
    }
    
    private final java.util.List<android.content.Intent> addIntentsToList(android.content.Context context, java.util.List<android.content.Intent> list, android.content.Intent intent) {
        return null;
    }
    
    /**
     * Checks if the current context has permission to access the camera.
     * @param context             context.
     */
    private final boolean hasCameraAccess(android.content.Context context) {
        return false;
    }
    
    /**
     * Checks if the androidmanifest.xml contains the given permission.
     * @param context             context.
     * @return Boolean, indicating if the permission is present.
     */
    private final boolean appManifestContainsPermission(android.content.Context context, java.lang.String permission) {
        return false;
    }
    
    /**
     * Called after launching the picker with the same values of Activity.getImageFromResult
     * in order to resolve the result and get the image path.
     *
     * @param context             context.
     * @param requestCode         used to identify the pick image action.
     * @param resultCode          -1 means the result is OK.
     * @param imageReturnedIntent returned intent where is the image data.
     * @param
     * @return path to the saved image.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImagePathFromResult(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent imageReturnedIntent) {
        return null;
    }
    
    /**
     * Get stream, save the picture to the temp file and return path.
     *
     * @param context context
     * @param uri uri of the incoming file
     * @return path to the saved image.
     */
    private final java.lang.String getFilePathFromUri(android.content.Context context, android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String savePicture(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    java.lang.String imageSuffix) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getTemporalFile(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String payload) {
        return null;
    }
    
    public final void setMinQuality(int minWidthQuality, int minHeightQuality) {
    }
    
    private ImagePicker() {
        super();
    }
}