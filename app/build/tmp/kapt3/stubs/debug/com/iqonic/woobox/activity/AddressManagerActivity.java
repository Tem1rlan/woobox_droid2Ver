package com.iqonic.woobox.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\"\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\bH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/iqonic/woobox/activity/AddressManagerActivity;", "Lcom/iqonic/woobox/AppBaseActivity;", "()V", "addressAdapter", "Lcom/iqonic/woobox/base/BaseRecyclerAdapter;", "Lcom/iqonic/woobox/models/Address;", "Lcom/iqonic/woobox/databinding/ItemAddressNewBinding;", "selected", "", "getSelected", "()I", "setSelected", "(I)V", "loadAddressList", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "removeAddress", "id", "position", "setDefaultAddress", "app_debug"})
public final class AddressManagerActivity extends com.iqonic.woobox.AppBaseActivity {
    private int selected;
    private com.iqonic.woobox.base.BaseRecyclerAdapter<com.iqonic.woobox.models.Address, com.iqonic.woobox.databinding.ItemAddressNewBinding> addressAdapter;
    private java.util.HashMap _$_findViewCache;
    
    public final int getSelected() {
        return 0;
    }
    
    public final void setSelected(int p0) {
    }
    
    private final void removeAddress(int id, int position) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadAddressList() {
    }
    
    private final void setDefaultAddress(int position) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public AddressManagerActivity() {
        super();
    }
}