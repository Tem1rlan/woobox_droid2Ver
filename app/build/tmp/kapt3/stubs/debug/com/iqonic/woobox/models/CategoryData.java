package com.iqonic.woobox.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\t\u0010(\u001a\u00020\u0004H\u00c6\u0003J\t\u0010)\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0011H\u00c6\u0003J\t\u0010+\u001a\u00020\u0013H\u00c6\u0003J\t\u0010,\u001a\u00020\u0006H\u00c6\u0003J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u00100\u001a\u00020\u0006H\u00c6\u0003J\t\u00101\u001a\u00020\u0004H\u00c6\u0003J\t\u00102\u001a\u00020\u0006H\u00c6\u0003J\t\u00103\u001a\u00020\u0006H\u00c6\u0003J\u0097\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u00c6\u0001J\u0013\u00105\u001a\u00020\u00132\b\u00106\u001a\u0004\u0018\u000107H\u00d6\u0003J\t\u00108\u001a\u00020\u0006H\u00d6\u0001J\t\u00109\u001a\u00020\u0004H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R%\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0016\u00a8\u0006:"}, d2 = {"Lcom/iqonic/woobox/models/CategoryData;", "Lcom/iqonic/woobox/models/BaseResponse;", "Ljava/io/Serializable;", "description", "", "term_id", "", "id", "cat_ID", "image", "menu_order", "name", "parent", "category_count", "slug", "subcategory", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isSelected", "", "(Ljava/lang/String;IIILjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/util/ArrayList;Z)V", "getCat_ID", "()I", "getCategory_count", "getDescription", "()Ljava/lang/String;", "getId", "getImage", "()Z", "setSelected", "(Z)V", "getMenu_order", "getName", "setName", "(Ljava/lang/String;)V", "getParent", "getSlug", "getSubcategory", "()Ljava/util/ArrayList;", "getTerm_id", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_debug"})
public final class CategoryData extends com.iqonic.woobox.models.BaseResponse implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    private final int term_id = 0;
    private final int id = 0;
    private final int cat_ID = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String image = null;
    private final int menu_order = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    private final int parent = 0;
    private final int category_count = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String slug = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.ArrayList<java.lang.Integer> subcategory = null;
    private boolean isSelected;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final int getTerm_id() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final int getCat_ID() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImage() {
        return null;
    }
    
    public final int getMenu_order() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getParent() {
        return 0;
    }
    
    public final int getCategory_count() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSlug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.Integer> getSubcategory() {
        return null;
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    public CategoryData(@org.jetbrains.annotations.NotNull()
    java.lang.String description, int term_id, int id, int cat_ID, @org.jetbrains.annotations.Nullable()
    java.lang.String image, int menu_order, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int parent, int category_count, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Integer> subcategory, boolean isSelected) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<java.lang.Integer> component11() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.woobox.models.CategoryData copy(@org.jetbrains.annotations.NotNull()
    java.lang.String description, int term_id, int id, int cat_ID, @org.jetbrains.annotations.Nullable()
    java.lang.String image, int menu_order, @org.jetbrains.annotations.NotNull()
    java.lang.String name, int parent, int category_count, @org.jetbrains.annotations.NotNull()
    java.lang.String slug, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<java.lang.Integer> subcategory, boolean isSelected) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}