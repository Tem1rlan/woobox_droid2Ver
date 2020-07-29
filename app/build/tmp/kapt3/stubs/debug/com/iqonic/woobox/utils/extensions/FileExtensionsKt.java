package com.iqonic.woobox.utils.extensions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\f*\u00020\u0002\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010\u001a\n\u0010\u0011\u001a\u00020\u0002*\u00020\u000e\u001a\n\u0010\u0012\u001a\u00020\u000e*\u00020\u0002\u001a\n\u0010\u0012\u001a\u00020\u000e*\u00020\f\u00a8\u0006\u0013"}, d2 = {"copy", "", "Ljava/io/File;", "dest", "copyDirectory", "copyFile", "deleteAll", "move", "moveDirectory", "open", "Ljava/io/InputStream;", "readToString", "", "realPath", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "toFile", "toUri", "app_debug"})
public final class FileExtensionsKt {
    
    /**
     * Read File data as String and Returns the Result
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String readToString(@org.jetbrains.annotations.NotNull()
    java.io.File $this$readToString) {
        return null;
    }
    
    /**
     * Open File in InputStream
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.io.InputStream open(@org.jetbrains.annotations.NotNull()
    java.io.File $this$open) {
        return null;
    }
    
    /**
     * Move File/Dir to new Destination
     */
    public static final void move(@org.jetbrains.annotations.NotNull()
    java.io.File $this$move, @org.jetbrains.annotations.NotNull()
    java.io.File dest) {
    }
    
    /**
     * Copy File/Dir to new Destination
     */
    public static final void copy(@org.jetbrains.annotations.NotNull()
    java.io.File $this$copy, @org.jetbrains.annotations.NotNull()
    java.io.File dest) {
    }
    
    /**
     * Delete the File or if its a Directory the delete all the contents
     */
    public static final void deleteAll(@org.jetbrains.annotations.NotNull()
    java.io.File $this$deleteAll) {
    }
    
    private static final void copyFile(@org.jetbrains.annotations.NotNull()
    java.io.File $this$copyFile, java.io.File dest) {
    }
    
    private static final void copyDirectory(@org.jetbrains.annotations.NotNull()
    java.io.File $this$copyDirectory, java.io.File dest) {
    }
    
    private static final void moveDirectory(@org.jetbrains.annotations.NotNull()
    java.io.File $this$moveDirectory, java.io.File dest) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.net.Uri realPath(@org.jetbrains.annotations.NotNull()
    android.net.Uri $this$realPath, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.net.Uri toUri(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$toUri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.net.Uri toUri(@org.jetbrains.annotations.NotNull()
    java.io.File $this$toUri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File toFile(@org.jetbrains.annotations.NotNull()
    android.net.Uri $this$toFile) {
        return null;
    }
}