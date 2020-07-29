package com.iqonic.woobox.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0005FGHIJB\u0089\u0002\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005\u0012\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005\u0012\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005\u0012\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005\u0012\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\u0018\b\u0002\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0002\u0010\u001bJ\u0019\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\u00c6\u0003J\u0019\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0015H\u00c6\u0003J\t\u00105\u001a\u00020\u0017H\u00c6\u0003J\u0019\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010;\u001a\u00020\rH\u00c6\u0003J\u0019\u0010<\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005H\u00c6\u0003J\u0019\u0010=\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005H\u00c6\u0003J\u0019\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005H\u00c6\u0003J\u0019\u0010?\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005H\u00c6\u0003J\u008d\u0002\u0010@\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u00052\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u00052\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u00052\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u00052\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0018\b\u0002\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00c6\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\u0017H\u00d6\u0001J\t\u0010E\u001a\u00020\u0015H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R!\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R!\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%R!\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010%R!\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R!\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010%R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R!\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u0003j\b\u0012\u0004\u0012\u00020\u000f`\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010%\u00a8\u0006K"}, d2 = {"Lcom/iqonic/woobox/models/DashboardResponse;", "", "testimonials", "Ljava/util/ArrayList;", "Lcom/iqonic/woobox/models/Testimonials;", "Lkotlin/collections/ArrayList;", "banner_1", "Lcom/iqonic/woobox/models/DashboardResponse$Banner1;", "banner_2", "Lcom/iqonic/woobox/models/DashboardResponse$Banner2;", "banner_3", "Lcom/iqonic/woobox/models/DashboardResponse$Banner3;", "currency_symbol", "Lcom/iqonic/woobox/models/DashboardResponse$CurrencySymbol;", "deal_product", "Lcom/iqonic/woobox/models/ProductDataNew;", "newest", "featured", "offer", "suggested_product", "theme_color", "", "total_order", "", "you_may_like", "social_link", "Lcom/iqonic/woobox/models/DashboardResponse$SocialLink;", "(Ljava/util/ArrayList;Lcom/iqonic/woobox/models/DashboardResponse$Banner1;Lcom/iqonic/woobox/models/DashboardResponse$Banner2;Lcom/iqonic/woobox/models/DashboardResponse$Banner3;Lcom/iqonic/woobox/models/DashboardResponse$CurrencySymbol;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;ILjava/util/ArrayList;Lcom/iqonic/woobox/models/DashboardResponse$SocialLink;)V", "getBanner_1", "()Lcom/iqonic/woobox/models/DashboardResponse$Banner1;", "getBanner_2", "()Lcom/iqonic/woobox/models/DashboardResponse$Banner2;", "getBanner_3", "()Lcom/iqonic/woobox/models/DashboardResponse$Banner3;", "getCurrency_symbol", "()Lcom/iqonic/woobox/models/DashboardResponse$CurrencySymbol;", "getDeal_product", "()Ljava/util/ArrayList;", "getFeatured", "getNewest", "getOffer", "getSocial_link", "()Lcom/iqonic/woobox/models/DashboardResponse$SocialLink;", "getSuggested_product", "getTestimonials", "getTheme_color", "()Ljava/lang/String;", "getTotal_order", "()I", "getYou_may_like", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Banner1", "Banner2", "Banner3", "CurrencySymbol", "SocialLink", "app_debug"})
public final class DashboardResponse {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.iqonic.woobox.models.Testimonials> testimonials = null;
    @org.jetbrains.annotations.Nullable()
    private final com.iqonic.woobox.models.DashboardResponse.Banner1 banner_1 = null;
    @org.jetbrains.annotations.Nullable()
    private final com.iqonic.woobox.models.DashboardResponse.Banner2 banner_2 = null;
    @org.jetbrains.annotations.Nullable()
    private final com.iqonic.woobox.models.DashboardResponse.Banner3 banner_3 = null;
    @org.jetbrains.annotations.NotNull()
    private final com.iqonic.woobox.models.DashboardResponse.CurrencySymbol currency_symbol = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> deal_product = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> newest = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> featured = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> offer = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> suggested_product = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String theme_color = null;
    private final int total_order = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> you_may_like = null;
    @org.jetbrains.annotations.Nullable()
    private final com.iqonic.woobox.models.DashboardResponse.SocialLink social_link = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.Testimonials> getTestimonials() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.woobox.models.DashboardResponse.Banner1 getBanner_1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.woobox.models.DashboardResponse.Banner2 getBanner_2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.woobox.models.DashboardResponse.Banner3 getBanner_3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.woobox.models.DashboardResponse.CurrencySymbol getCurrency_symbol() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> getDeal_product() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> getNewest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> getFeatured() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> getOffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> getSuggested_product() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTheme_color() {
        return null;
    }
    
    public final int getTotal_order() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> getYou_may_like() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.woobox.models.DashboardResponse.SocialLink getSocial_link() {
        return null;
    }
    
    public DashboardResponse(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.Testimonials> testimonials, @org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.DashboardResponse.Banner1 banner_1, @org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.DashboardResponse.Banner2 banner_2, @org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.DashboardResponse.Banner3 banner_3, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.DashboardResponse.CurrencySymbol currency_symbol, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> deal_product, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> newest, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> featured, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> offer, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> suggested_product, @org.jetbrains.annotations.NotNull()
    java.lang.String theme_color, int total_order, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> you_may_like, @org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.DashboardResponse.SocialLink social_link) {
        super();
    }
    
    public DashboardResponse() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.Testimonials> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.woobox.models.DashboardResponse.Banner1 component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.woobox.models.DashboardResponse.Banner2 component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.woobox.models.DashboardResponse.Banner3 component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.woobox.models.DashboardResponse.CurrencySymbol component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.woobox.models.DashboardResponse.SocialLink component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.iqonic.woobox.models.DashboardResponse copy(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.Testimonials> testimonials, @org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.DashboardResponse.Banner1 banner_1, @org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.DashboardResponse.Banner2 banner_2, @org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.DashboardResponse.Banner3 banner_3, @org.jetbrains.annotations.NotNull()
    com.iqonic.woobox.models.DashboardResponse.CurrencySymbol currency_symbol, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> deal_product, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> newest, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> featured, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> offer, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> suggested_product, @org.jetbrains.annotations.NotNull()
    java.lang.String theme_color, int total_order, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew> you_may_like, @org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.DashboardResponse.SocialLink social_link) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/iqonic/woobox/models/DashboardResponse$Banner1;", "", "desc", "", "image", "thumb", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getImage", "getThumb", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Banner1 {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String desc = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String image = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String thumb = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDesc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getThumb() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public Banner1(@org.jetbrains.annotations.NotNull()
        java.lang.String desc, @org.jetbrains.annotations.NotNull()
        java.lang.String image, @org.jetbrains.annotations.NotNull()
        java.lang.String thumb, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            super();
        }
        
        public Banner1() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.models.DashboardResponse.Banner1 copy(@org.jetbrains.annotations.NotNull()
        java.lang.String desc, @org.jetbrains.annotations.NotNull()
        java.lang.String image, @org.jetbrains.annotations.NotNull()
        java.lang.String thumb, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/iqonic/woobox/models/DashboardResponse$Banner2;", "", "desc", "", "image", "thumb", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getImage", "getThumb", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Banner2 {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String desc = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String image = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String thumb = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDesc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getThumb() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public Banner2(@org.jetbrains.annotations.NotNull()
        java.lang.String desc, @org.jetbrains.annotations.NotNull()
        java.lang.String image, @org.jetbrains.annotations.NotNull()
        java.lang.String thumb, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            super();
        }
        
        public Banner2() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.models.DashboardResponse.Banner2 copy(@org.jetbrains.annotations.NotNull()
        java.lang.String desc, @org.jetbrains.annotations.NotNull()
        java.lang.String image, @org.jetbrains.annotations.NotNull()
        java.lang.String thumb, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lcom/iqonic/woobox/models/DashboardResponse$Banner3;", "", "desc", "", "image", "thumb", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "getImage", "getThumb", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Banner3 {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String desc = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String image = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String thumb = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDesc() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getThumb() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public Banner3(@org.jetbrains.annotations.NotNull()
        java.lang.String desc, @org.jetbrains.annotations.NotNull()
        java.lang.String image, @org.jetbrains.annotations.NotNull()
        java.lang.String thumb, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            super();
        }
        
        public Banner3() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.models.DashboardResponse.Banner3 copy(@org.jetbrains.annotations.NotNull()
        java.lang.String desc, @org.jetbrains.annotations.NotNull()
        java.lang.String image, @org.jetbrains.annotations.NotNull()
        java.lang.String thumb, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/iqonic/woobox/models/DashboardResponse$CurrencySymbol;", "", "currency", "", "currency_symbol", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getCurrency_symbol", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class CurrencySymbol {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String currency = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String currency_symbol = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCurrency() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCurrency_symbol() {
            return null;
        }
        
        public CurrencySymbol(@org.jetbrains.annotations.NotNull()
        java.lang.String currency, @org.jetbrains.annotations.NotNull()
        java.lang.String currency_symbol) {
            super();
        }
        
        public CurrencySymbol() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.models.DashboardResponse.CurrencySymbol copy(@org.jetbrains.annotations.NotNull()
        java.lang.String currency, @org.jetbrains.annotations.NotNull()
        java.lang.String currency_symbol) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003JY\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/iqonic/woobox/models/DashboardResponse$SocialLink;", "", "whatsapp", "", "facebook", "twitter", "instagram", "contact", "privacy_policy", "term_condition", "copyright_text", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContact", "()Ljava/lang/String;", "getCopyright_text", "getFacebook", "getInstagram", "getPrivacy_policy", "getTerm_condition", "getTwitter", "getWhatsapp", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class SocialLink {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String whatsapp = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String facebook = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String twitter = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String instagram = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String contact = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String privacy_policy = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String term_condition = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String copyright_text = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWhatsapp() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFacebook() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTwitter() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getInstagram() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getContact() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPrivacy_policy() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTerm_condition() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCopyright_text() {
            return null;
        }
        
        public SocialLink(@org.jetbrains.annotations.NotNull()
        java.lang.String whatsapp, @org.jetbrains.annotations.NotNull()
        java.lang.String facebook, @org.jetbrains.annotations.NotNull()
        java.lang.String twitter, @org.jetbrains.annotations.NotNull()
        java.lang.String instagram, @org.jetbrains.annotations.NotNull()
        java.lang.String contact, @org.jetbrains.annotations.NotNull()
        java.lang.String privacy_policy, @org.jetbrains.annotations.NotNull()
        java.lang.String term_condition, @org.jetbrains.annotations.NotNull()
        java.lang.String copyright_text) {
            super();
        }
        
        public SocialLink() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.models.DashboardResponse.SocialLink copy(@org.jetbrains.annotations.NotNull()
        java.lang.String whatsapp, @org.jetbrains.annotations.NotNull()
        java.lang.String facebook, @org.jetbrains.annotations.NotNull()
        java.lang.String twitter, @org.jetbrains.annotations.NotNull()
        java.lang.String instagram, @org.jetbrains.annotations.NotNull()
        java.lang.String contact, @org.jetbrains.annotations.NotNull()
        java.lang.String privacy_policy, @org.jetbrains.annotations.NotNull()
        java.lang.String term_condition, @org.jetbrains.annotations.NotNull()
        java.lang.String copyright_text) {
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
}