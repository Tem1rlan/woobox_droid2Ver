package com.iqonic.woobox.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001:\b\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u001c\u0010%\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\r\"\u0004\b\'\u0010\u000fR\u001c\u0010(\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR\u001e\u0010+\u001a\u0004\u0018\u00010,X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00101\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00102\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\r\"\u0004\b4\u0010\u000fR\u001c\u00105\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\r\"\u0004\b7\u0010\u000fR\u001c\u00108\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\r\"\u0004\b:\u0010\u000fR.\u0010;\u001a\u0016\u0012\u0004\u0012\u00020=\u0018\u00010<j\n\u0012\u0004\u0012\u00020=\u0018\u0001`>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010C\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\r\"\u0004\bE\u0010\u000fR\u001c\u0010F\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\r\"\u0004\bH\u0010\u000fR\u001e\u0010I\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bJ\u0010\u0006\"\u0004\bK\u0010\bR\u001e\u0010L\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bM\u0010\u0006\"\u0004\bN\u0010\bR\u001c\u0010O\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\r\"\u0004\bQ\u0010\u000fR\u001c\u0010R\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\r\"\u0004\bT\u0010\u000fR\u001c\u0010U\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\r\"\u0004\bW\u0010\u000fR\u001c\u0010X\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\r\"\u0004\bZ\u0010\u000fR\u001c\u0010[\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\r\"\u0004\b]\u0010\u000fR\u001c\u0010^\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\r\"\u0004\b`\u0010\u000fR\u001e\u0010a\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\bb\u0010\u0006\"\u0004\bc\u0010\bR\u001c\u0010d\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\r\"\u0004\bf\u0010\u000fR\u001c\u0010g\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\r\"\u0004\bi\u0010\u000fR\u001c\u0010j\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\r\"\u0004\bl\u0010\u000fR\u001c\u0010m\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\r\"\u0004\bo\u0010\u000fR\u001e\u0010p\u001a\u0004\u0018\u00010,X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00101\u001a\u0004\bq\u0010.\"\u0004\br\u00100R.\u0010s\u001a\u0016\u0012\u0004\u0012\u00020t\u0018\u00010<j\n\u0012\u0004\u0012\u00020t\u0018\u0001`>X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u0010@\"\u0004\bv\u0010BR\u001c\u0010w\u001a\u0004\u0018\u00010xX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u001c\u0010}\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b~\u0010\r\"\u0004\b\u007f\u0010\u000fR\u001f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010\r\"\u0005\b\u0082\u0001\u0010\u000fR\u001f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0084\u0001\u0010\r\"\u0005\b\u0085\u0001\u0010\u000fR\u001f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010\r\"\u0005\b\u0088\u0001\u0010\u000fR\u001f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008a\u0001\u0010\r\"\u0005\b\u008b\u0001\u0010\u000fR\u001f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010\r\"\u0005\b\u008e\u0001\u0010\u000fR\u001f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0090\u0001\u0010\r\"\u0005\b\u0091\u0001\u0010\u000f\u00a8\u0006\u0096\u0001"}, d2 = {"Lcom/iqonic/woobox/models/RequestModel;", "", "()V", "ID", "", "getID", "()Ljava/lang/Integer;", "setID", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "base64_img", "getBase64_img", "setBase64_img", "cart_id", "getCart_id", "setCart_id", "cat_id", "getCat_id", "setCat_id", "category", "getCategory", "setCategory", "color", "getColor", "setColor", "customer_id", "getCustomer_id", "setCustomer_id", "email", "getEmail", "setEmail", "firstName", "getFirstName", "setFirstName", "first_name", "getFirst_name", "setFirst_name", "force", "", "getForce", "()Ljava/lang/Boolean;", "setForce", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "id", "getId", "setId", "lastName", "getLastName", "setLastName", "last_name", "getLast_name", "setLast_name", "line_items", "Ljava/util/ArrayList;", "Lcom/iqonic/woobox/models/LinItemsRequest;", "Lkotlin/collections/ArrayList;", "getLine_items", "()Ljava/util/ArrayList;", "setLine_items", "(Ljava/util/ArrayList;)V", "loginType", "getLoginType", "setLoginType", "mobile_no", "getMobile_no", "setMobile_no", "order_id", "getOrder_id", "setOrder_id", "page", "getPage", "setPage", "password", "getPassword", "setPassword", "payment_method", "getPayment_method", "setPayment_method", "payment_method_title", "getPayment_method_title", "setPayment_method_title", "photoURL", "getPhotoURL", "setPhotoURL", "pro_id", "getPro_id", "setPro_id", "product_id", "getProduct_id", "setProduct_id", "quantity", "getQuantity", "setQuantity", "rating", "getRating", "setRating", "review", "getReview", "setReview", "reviewer", "getReviewer", "setReviewer", "reviewer_email", "getReviewer_email", "setReviewer_email", "set_paid", "getSet_paid", "setSet_paid", "shipping", "Lcom/iqonic/woobox/models/BillingShippingRequest;", "getShipping", "setShipping", "shipping_lines", "Lcom/iqonic/woobox/models/ShippingLineRequest;", "getShipping_lines", "()Lcom/iqonic/woobox/models/ShippingLineRequest;", "setShipping_lines", "(Lcom/iqonic/woobox/models/ShippingLineRequest;)V", "size", "getSize", "setSize", "status", "getStatus", "setStatus", "text", "getText", "setText", "txn_id", "getTxn_id", "setTxn_id", "user_id", "getUser_id", "setUser_id", "user_login", "getUser_login", "setUser_login", "username", "getUsername", "setUsername", "FilterBrands", "FilterCategories", "FilterColors", "FilterSizes", "app_debug"})
public final class RequestModel {
    
    /**
     * Request for login
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String username;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String password;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String user_login;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String user_id;
    
    /**
     * Request for social login
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String accessToken;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String firstName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lastName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String loginType;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String photoURL;
    
    /**
     * Request for post product review
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String pro_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String product_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String review;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String reviewer;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String reviewer_email;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String rating;
    
    /**
     * Request for update order
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String status;
    
    /**
     * Request for delete product review
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean force;
    
    /**
     * Request for update review
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String id;
    
    /**
     * Request for add item to cart
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer cart_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer quantity;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String size;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String color;
    
    /**
     * Request for Create /update cart item
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String first_name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String last_name;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mobile_no;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String base64_img;
    
    /**
     * Request for create order
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String payment_method_title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean set_paid;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.iqonic.woobox.models.BillingShippingRequest> shipping;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.iqonic.woobox.models.LinItemsRequest> line_items;
    @org.jetbrains.annotations.Nullable()
    private com.iqonic.woobox.models.ShippingLineRequest shipping_lines;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer customer_id;
    
    /**
     * Request for process payment
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String txn_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer order_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String payment_method;
    
    /**
     * Search Request
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer page;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String text;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer cat_id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer category;
    
    /**
     * Requests for Address
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer ID;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_login() {
        return null;
    }
    
    public final void setUser_login(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUser_id() {
        return null;
    }
    
    public final void setUser_id(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    public final void setAccessToken(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirstName() {
        return null;
    }
    
    public final void setFirstName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastName() {
        return null;
    }
    
    public final void setLastName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLoginType() {
        return null;
    }
    
    public final void setLoginType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhotoURL() {
        return null;
    }
    
    public final void setPhotoURL(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPro_id() {
        return null;
    }
    
    public final void setPro_id(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProduct_id() {
        return null;
    }
    
    public final void setProduct_id(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReview() {
        return null;
    }
    
    public final void setReview(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReviewer() {
        return null;
    }
    
    public final void setReviewer(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReviewer_email() {
        return null;
    }
    
    public final void setReviewer_email(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRating() {
        return null;
    }
    
    public final void setRating(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getForce() {
        return null;
    }
    
    public final void setForce(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCart_id() {
        return null;
    }
    
    public final void setCart_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getQuantity() {
        return null;
    }
    
    public final void setQuantity(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSize() {
        return null;
    }
    
    public final void setSize(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getColor() {
        return null;
    }
    
    public final void setColor(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirst_name() {
        return null;
    }
    
    public final void setFirst_name(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLast_name() {
        return null;
    }
    
    public final void setLast_name(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMobile_no() {
        return null;
    }
    
    public final void setMobile_no(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBase64_img() {
        return null;
    }
    
    public final void setBase64_img(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPayment_method_title() {
        return null;
    }
    
    public final void setPayment_method_title(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSet_paid() {
        return null;
    }
    
    public final void setSet_paid(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.iqonic.woobox.models.BillingShippingRequest> getShipping() {
        return null;
    }
    
    public final void setShipping(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.iqonic.woobox.models.BillingShippingRequest> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.iqonic.woobox.models.LinItemsRequest> getLine_items() {
        return null;
    }
    
    public final void setLine_items(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.iqonic.woobox.models.LinItemsRequest> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.iqonic.woobox.models.ShippingLineRequest getShipping_lines() {
        return null;
    }
    
    public final void setShipping_lines(@org.jetbrains.annotations.Nullable()
    com.iqonic.woobox.models.ShippingLineRequest p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCustomer_id() {
        return null;
    }
    
    public final void setCustomer_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTxn_id() {
        return null;
    }
    
    public final void setTxn_id(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOrder_id() {
        return null;
    }
    
    public final void setOrder_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPayment_method() {
        return null;
    }
    
    public final void setPayment_method(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPage() {
        return null;
    }
    
    public final void setPage(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCat_id() {
        return null;
    }
    
    public final void setCat_id(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getID() {
        return null;
    }
    
    public final void setID(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public RequestModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ>\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u0007\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lcom/iqonic/woobox/models/RequestModel$FilterColors;", "", "term_id", "", "name", "", "slug", "isSelected", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSlug", "setSlug", "getTerm_id", "()Ljava/lang/Integer;", "setTerm_id", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/iqonic/woobox/models/RequestModel$FilterColors;", "equals", "other", "hashCode", "toString", "app_debug"})
    public static final class FilterColors {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer term_id;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String slug;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean isSelected;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTerm_id() {
            return null;
        }
        
        public final void setTerm_id(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSlug() {
            return null;
        }
        
        public final void setSlug(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSelected() {
            return null;
        }
        
        public final void setSelected(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        public FilterColors(@org.jetbrains.annotations.Nullable()
        java.lang.Integer term_id, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String slug, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSelected) {
            super();
        }
        
        public FilterColors() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.models.RequestModel.FilterColors copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer term_id, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.String slug, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSelected) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ2\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0006\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/iqonic/woobox/models/RequestModel$FilterBrands;", "", "term_id", "", "name", "", "isSelected", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getTerm_id", "()Ljava/lang/Integer;", "setTerm_id", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/iqonic/woobox/models/RequestModel$FilterBrands;", "equals", "other", "hashCode", "toString", "app_debug"})
    public static final class FilterBrands {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer term_id;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean isSelected;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTerm_id() {
            return null;
        }
        
        public final void setTerm_id(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSelected() {
            return null;
        }
        
        public final void setSelected(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        public FilterBrands(@org.jetbrains.annotations.Nullable()
        java.lang.Integer term_id, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSelected) {
            super();
        }
        
        public FilterBrands() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.models.RequestModel.FilterBrands copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer term_id, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSelected) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ2\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\u0006\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/iqonic/woobox/models/RequestModel$FilterSizes;", "", "term_id", "", "name", "", "isSelected", "", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getTerm_id", "()Ljava/lang/Integer;", "setTerm_id", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/iqonic/woobox/models/RequestModel$FilterSizes;", "equals", "other", "hashCode", "toString", "app_debug"})
    public static final class FilterSizes {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer term_id;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean isSelected;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTerm_id() {
            return null;
        }
        
        public final void setTerm_id(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSelected() {
            return null;
        }
        
        public final void setSelected(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        public FilterSizes(@org.jetbrains.annotations.Nullable()
        java.lang.Integer term_id, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSelected) {
            super();
        }
        
        public FilterSizes() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.models.RequestModel.FilterSizes copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer term_id, @org.jetbrains.annotations.Nullable()
        java.lang.String name, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSelected) {
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
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014JJ\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\t\u0010&\u001a\u00020\u0006H\u00d6\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lcom/iqonic/woobox/models/RequestModel$FilterCategories;", "", "term_id", "", "cat_ID", "cat_name", "", "slug", "isSelected", "", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getCat_ID", "()Ljava/lang/Integer;", "setCat_ID", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCat_name", "()Ljava/lang/String;", "setCat_name", "(Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "setSelected", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSlug", "setSlug", "getTerm_id", "setTerm_id", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/iqonic/woobox/models/RequestModel$FilterCategories;", "equals", "other", "hashCode", "toString", "app_debug"})
    public static final class FilterCategories {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer term_id;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer cat_ID;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String cat_name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String slug;
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean isSelected;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getTerm_id() {
            return null;
        }
        
        public final void setTerm_id(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCat_ID() {
            return null;
        }
        
        public final void setCat_ID(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCat_name() {
            return null;
        }
        
        public final void setCat_name(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSlug() {
            return null;
        }
        
        public final void setSlug(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean isSelected() {
            return null;
        }
        
        public final void setSelected(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        public FilterCategories(@org.jetbrains.annotations.Nullable()
        java.lang.Integer term_id, @org.jetbrains.annotations.Nullable()
        java.lang.Integer cat_ID, @org.jetbrains.annotations.Nullable()
        java.lang.String cat_name, @org.jetbrains.annotations.Nullable()
        java.lang.String slug, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSelected) {
            super();
        }
        
        public FilterCategories() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.iqonic.woobox.models.RequestModel.FilterCategories copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer term_id, @org.jetbrains.annotations.Nullable()
        java.lang.Integer cat_ID, @org.jetbrains.annotations.Nullable()
        java.lang.String cat_name, @org.jetbrains.annotations.Nullable()
        java.lang.String slug, @org.jetbrains.annotations.Nullable()
        java.lang.Boolean isSelected) {
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