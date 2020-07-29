package com.iqonic.woobox.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/iqonic/woobox/activity/BlogActivity;", "Lcom/iqonic/woobox/AppBaseActivity;", "()V", "countLoadMore", "", "isLoading", "", "()Z", "setLoading", "(Z)V", "mBlogAdapter", "Lcom/iqonic/woobox/base/BaseRecyclerAdapter;", "Lcom/iqonic/woobox/models/Blog;", "Lcom/iqonic/woobox/databinding/ItemBlogBinding;", "mOrderData", "Ljava/util/ArrayList;", "loadOrder", "", "page", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class BlogActivity extends com.iqonic.woobox.AppBaseActivity {
    private int countLoadMore;
    private com.iqonic.woobox.base.BaseRecyclerAdapter<com.iqonic.woobox.models.Blog, com.iqonic.woobox.databinding.ItemBlogBinding> mBlogAdapter;
    private java.util.ArrayList<com.iqonic.woobox.models.Blog> mOrderData;
    private boolean isLoading;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadOrder(int page) {
    }
    
    public BlogActivity() {
        super();
    }
}