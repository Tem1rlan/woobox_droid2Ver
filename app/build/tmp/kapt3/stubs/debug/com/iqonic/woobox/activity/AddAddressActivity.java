package com.iqonic.woobox.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J$\u0010\u0012\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/iqonic/woobox/activity/AddAddressActivity;", "Lcom/iqonic/woobox/AppBaseActivity;", "Lcom/iqonic/woobox/utils/SimpleLocation$Listener;", "()V", "address", "Lcom/iqonic/woobox/models/Address;", "simpleLocation", "Lcom/iqonic/woobox/utils/SimpleLocation;", "assignData", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPositionChanged", "onProviderDisabled", "provider", "", "onProviderEnabled", "onStatusChanged", "status", "", "extras", "validate", "", "app_debug"})
public final class AddAddressActivity extends com.iqonic.woobox.AppBaseActivity implements com.iqonic.woobox.utils.SimpleLocation.Listener {
    private com.iqonic.woobox.models.Address address;
    private com.iqonic.woobox.utils.SimpleLocation simpleLocation;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final boolean validate() {
        return false;
    }
    
    @java.lang.Override()
    public void onPositionChanged() {
    }
    
    @java.lang.Override()
    public void onStatusChanged(@org.jetbrains.annotations.Nullable()
    java.lang.String provider, int status, @org.jetbrains.annotations.Nullable()
    android.os.Bundle extras) {
    }
    
    @java.lang.Override()
    public void onProviderEnabled(@org.jetbrains.annotations.Nullable()
    java.lang.String provider) {
    }
    
    @java.lang.Override()
    public void onProviderDisabled(@org.jetbrains.annotations.Nullable()
    java.lang.String provider) {
    }
    
    private final void assignData() {
    }
    
    public AddAddressActivity() {
        super();
    }
}