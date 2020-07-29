package com.iqonic.woobox.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00d0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\b2\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\t\u001a\u00020\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\r\u001a\u00020\b2\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\t\u001a\u00020\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J4\u0010\u001d\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 0\u00032\b\b\u0003\u0010!\u001a\u00020\b2\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\"H\'J\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J2\u0010$\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f0\u001ej\b\u0012\u0004\u0012\u00020\f` 0\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J(\u0010%\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020&0\u001ej\b\u0012\u0004\u0012\u00020&` 0\u00032\b\b\u0001\u0010\'\u001a\u00020\u0010H\'J2\u0010(\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020)0\u001ej\b\u0012\u0004\u0012\u00020)` 0\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J,\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J<\u0010,\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\"2\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J<\u0010-\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J(\u0010.\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020/0\u001ej\b\u0012\u0004\u0012\u00020/` 0\u00032\b\b\u0001\u0010\t\u001a\u00020\u0010H\'J\u0018\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0003\u0010\u0007\u001a\u00020\bH\'J\u001e\u00102\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002030\u001ej\b\u0012\u0004\u0012\u000203` 0\u0003H\'J(\u00104\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002050\u001ej\b\u0012\u0004\u0012\u000205` 0\u00032\b\b\u0003\u0010\u0007\u001a\u00020\bH\'J<\u00106\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002030\u001ej\b\u0012\u0004\u0012\u000203` 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J2\u00107\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002080\u001ej\b\u0012\u0004\u0012\u000208` 0\u00032\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J2\u00109\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00150\u001ej\b\u0012\u0004\u0012\u00020\u0015` 0\u00032\b\b\u0001\u0010:\u001a\u00020\u00102\b\b\u0001\u0010\'\u001a\u00020\u0010H\'J(\u0010;\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 0\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006H\'J\u001e\u0010<\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 0\u0003H\'J(\u0010=\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170\u001ej\b\u0012\u0004\u0012\u00020\u0017` 0\u00032\b\b\u0001\u0010\t\u001a\u00020\u0010H\'J(\u0010>\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020?0\u001ej\b\u0012\u0004\u0012\u00020?` 0\u00032\b\b\u0001\u0010@\u001a\u00020\u0010H\'J\u0018\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001e\u0010D\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020E0\u001ej\b\u0012\u0004\u0012\u00020E` 0\u0003H\'J(\u0010F\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020G0\u001ej\b\u0012\u0004\u0012\u00020G` 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J,\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J,\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J\u0018\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0003\u0010\t\u001a\u00020\bH\'J6\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\r\u001a\u00020\b2\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J<\u0010N\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J\u0018\u0010O\u001a\b\u0012\u0004\u0012\u00020C0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J,\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\b\b\u0003\u0010\t\u001a\u00020\bH\'J\u0018\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\t\u001a\u00020\u0010H\'J\"\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\t\u001a\u00020\u00102\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006T"}, d2 = {"Lcom/iqonic/woobox/network/RestApis;", "", "addItemToCart", "Lretrofit2/Call;", "Lcom/iqonic/woobox/models/BaseResponse;", "request", "Lcom/iqonic/woobox/models/RequestModel;", "token", "", "id", "addUpdateAddress", "Lokhttp3/ResponseBody;", "Lcom/iqonic/woobox/models/Address;", "type", "addWishList", "changePassword", "", "clearCartItems", "createCustomer", "Lcom/iqonic/woobox/models/LoginData;", "createOrder", "Lcom/iqonic/woobox/models/MyOrderData;", "createProductReview", "Lcom/iqonic/woobox/models/ProductReviewData;", "dashboard", "Lcom/iqonic/woobox/models/DashboardResponse;", "deleteAddress", "deleteProductReview", "Lcom/iqonic/woobox/models/DeletedReviewData;", "filterProduct", "Ljava/util/ArrayList;", "Lcom/iqonic/woobox/models/ProductDataNew;", "Lkotlin/collections/ArrayList;", "contentType", "Lcom/iqonic/woobox/models/FilterProductRequest;", "forgetPassword", "getAddress", "getBlogs", "Lcom/iqonic/woobox/models/Blog;", "page", "getCart", "Lcom/iqonic/woobox/models/CartResponse;", "getCheckoutUrl", "Lcom/iqonic/woobox/models/CheckoutUrlResponse;", "getFeaturedProducts", "getOfferProducts", "getOrderTracking", "Lcom/iqonic/woobox/models/OrderTrack;", "getProductAttributes", "Lcom/iqonic/woobox/models/ProductAttributeResponse;", "getProductCategories", "Lcom/iqonic/woobox/models/CategoryData;", "getSliderImages", "Lcom/iqonic/woobox/models/SliderImagesResponse;", "getSubCategories", "getWishList", "Lcom/iqonic/woobox/models/WishListData;", "listAllOrders", "customer", "listAllProducts", "listFeaturedProducts", "listProductReviews", "listSingleProduct", "Lcom/iqonic/woobox/models/ProductModelNew;", "pro_id", "listSingleProducts", "login", "Lcom/iqonic/woobox/models/LoginResponse;", "paymentGateways", "Lcom/iqonic/woobox/models/Payment;", "processOtherPayment", "Lcom/iqonic/woobox/models/PaymentResponse;", "processPayment", "removeCartItem", "removeWishList", "retrieveCustomer", "saveProfileImage", "Lcom/iqonic/woobox/models/ProfileImage;", "searchProducts", "socialLogin", "updateItemInCart", "Lcom/iqonic/woobox/models/UpdateCartResponse;", "updateOrder", "updateProductReview", "app_debug"})
public abstract interface RestApis {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/woocommerce/get-dashboard")
    public abstract retrofit2.Call<com.iqonic.woobox.models.DashboardResponse> dashboard(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "jwt-auth/v1/token")
    public abstract retrofit2.Call<com.iqonic.woobox.models.LoginResponse> login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/customer/social_login")
    public abstract retrofit2.Call<com.iqonic.woobox.models.LoginResponse> socialLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.HTTP(method = "POST", path = "wc/v3/customers/{id}", hasBody = true)
    public abstract retrofit2.Call<com.iqonic.woobox.models.LoginData> createCustomer(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "wc/v3/customers/{id}")
    public abstract retrofit2.Call<com.iqonic.woobox.models.LoginData> retrieveCustomer(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "woobox-api/api/v1/woocommerce/get-featured-product")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew>> listFeaturedProducts();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/woocommerce/get-product")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew>> listAllProducts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/woocommerce/get-single-product")
    public abstract retrofit2.Call<com.iqonic.woobox.models.ProductDataNew> listSingleProducts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/woocommerce/get-product")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew>> filterProduct(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String contentType, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.FilterProductRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/woocommerce/get-featured-product")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew>> getFeaturedProducts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.FilterProductRequest request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "woobox-api/api/v1/woocommerce/get-product-attribute/")
    public abstract retrofit2.Call<com.iqonic.woobox.models.ProductAttributeResponse> getProductAttributes(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "woobox-api/api/v1/slider/get-slider/")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.SliderImagesResponse>> getSliderImages(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "wc/v1/products/{id}/reviews")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.ProductReviewData>> listProductReviews(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "wc/v3/products/reviews")
    public abstract retrofit2.Call<com.iqonic.woobox.models.ProductReviewData> createProductReview(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.HTTP(method = "DELETE", path = "wc/v3/products/reviews/{id}", hasBody = true)
    public abstract retrofit2.Call<com.iqonic.woobox.models.DeletedReviewData> deleteProductReview(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.HTTP(method = "PUT", path = "wc/v3/products/reviews/{id}", hasBody = true)
    public abstract retrofit2.Call<com.iqonic.woobox.models.ProductReviewData> updateProductReview(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "wc/v3/orders")
    public abstract retrofit2.Call<com.iqonic.woobox.models.MyOrderData> createOrder(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.PUT(value = "wc/v3/orders/{id}")
    public abstract retrofit2.Call<com.iqonic.woobox.models.MyOrderData> updateOrder(@retrofit2.http.Path(value = "id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "wc/v3/orders")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.MyOrderData>> listAllOrders(@retrofit2.http.Query(value = "customer")
    int customer, @retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "wc/v1/orders/{order_id}/shipment-trackings")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.OrderTrack>> getOrderTracking(@retrofit2.http.Path(value = "order_id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "woobox-api/api/v1/payment/get-active-payment-gateway")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.Payment>> paymentGateways();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "wc/v2/process_payment")
    public abstract retrofit2.Call<com.iqonic.woobox.models.PaymentResponse> processPayment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/woocommerce/place-order")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.PaymentResponse>> processOtherPayment(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/woocommerce/get-checkout-url")
    public abstract retrofit2.Call<com.iqonic.woobox.models.CheckoutUrlResponse> getCheckoutUrl(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "wp/v2/users/{id}")
    public abstract retrofit2.Call<okhttp3.ResponseBody> changePassword(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "wp/v2/users/lostpassword")
    public abstract retrofit2.Call<com.iqonic.woobox.models.BaseResponse> forgetPassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/cart/add-cart/")
    public abstract retrofit2.Call<com.iqonic.woobox.models.BaseResponse> addItemToCart(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "woobox-api/api/v1/cart/get-cart/")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.CartResponse>> getCart(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/cart/delete-cart/")
    public abstract retrofit2.Call<com.iqonic.woobox.models.BaseResponse> removeCartItem(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/cart/clear-cart/")
    public abstract retrofit2.Call<com.iqonic.woobox.models.BaseResponse> clearCartItems(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/cart/update-cart/")
    public abstract retrofit2.Call<com.iqonic.woobox.models.UpdateCartResponse> updateItemInCart(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/wishlist/add-wishlist/")
    public abstract retrofit2.Call<com.iqonic.woobox.models.BaseResponse> addWishList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "woobox-api/api/v1/wishlist/get-wishlist/")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.WishListData>> getWishList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/wishlist/delete-wishlist/")
    public abstract retrofit2.Call<com.iqonic.woobox.models.BaseResponse> removeWishList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/woocommerce/get-search-product")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew>> searchProducts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/woocommerce/get-offer-product")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.ProductDataNew>> getOfferProducts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "woobox-api/api/v1/woocommerce/get-category")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.CategoryData>> getProductCategories();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/woocommerce/get-sub-category")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.CategoryData>> getSubCategories(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "woobox-api/api/v1/blog/get-blog")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.Blog>> getBlogs(@retrofit2.http.Query(value = "page")
    int page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "woobox-api/api/v1/customer/get-address")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.Address>> getAddress(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/customer/delete-address")
    public abstract retrofit2.Call<okhttp3.ResponseBody> deleteAddress(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/customer/add-address")
    public abstract retrofit2.Call<okhttp3.ResponseBody> addUpdateAddress(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.Address request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "woobox-api/api/v1/customer/save-profile-image")
    public abstract retrofit2.Call<com.iqonic.woobox.models.ProfileImage> saveProfileImage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.iqonic.woobox.models.RequestModel request, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Content-Type")
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "id")
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "woobox-api/api/v1/woocommerce/get-single-product")
    public abstract retrofit2.Call<java.util.ArrayList<com.iqonic.woobox.models.ProductModelNew>> listSingleProduct(@retrofit2.http.Query(value = "pro_id")
    int pro_id);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}