package com.iqonic.woobox.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u001a\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/iqonic/woobox/activity/PaymentActivity;", "Lcom/iqonic/woobox/AppBaseActivity;", "Lcom/razorpay/PaymentResultListener;", "()V", "orderData", "Lcom/iqonic/woobox/models/MyOrderData;", "addPaymentDetails", "", "createPaymentRequest", "s", "", "handleRazorPay", "handlerPaymentClick", "item", "Lcom/iqonic/woobox/models/Payment;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPaymentError", "code", "", "response", "onPaymentSuccess", "razorpayPaymentID", "app_debug"})
public final class PaymentActivity extends com.iqonic.woobox.AppBaseActivity implements com.razorpay.PaymentResultListener {
    private com.iqonic.woobox.models.MyOrderData orderData;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void handlerPaymentClick(com.iqonic.woobox.models.Payment item) {
    }
    
    private final void handleRazorPay() {
    }
    
    @java.lang.Override()
    public void onPaymentError(int code, @org.jetbrains.annotations.Nullable()
    java.lang.String response) {
    }
    
    @java.lang.Override()
    public void onPaymentSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.String razorpayPaymentID) {
    }
    
    private final void createPaymentRequest(java.lang.String s) {
    }
    
    private final void addPaymentDetails() {
    }
    
    public PaymentActivity() {
        super();
    }
}