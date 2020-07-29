package com.iqonic.woobox.databinding;
import com.iqonic.woobox.R;
import com.iqonic.woobox.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemOrderlistBindingImpl extends ItemOrderlistBinding implements com.iqonic.woobox.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivProduct, 1);
        sViewsWithIds.put(R.id.rl_content, 2);
        sViewsWithIds.put(R.id.tvProductName, 3);
        sViewsWithIds.put(R.id.llDeliveryDate, 4);
        sViewsWithIds.put(R.id.tvProductDeliveryDate, 5);
        sViewsWithIds.put(R.id.llPrice, 6);
        sViewsWithIds.put(R.id.tvPrice, 7);
        sViewsWithIds.put(R.id.tvOriginalPrice, 8);
        sViewsWithIds.put(R.id.llDeliveryInfo, 9);
        sViewsWithIds.put(R.id.ratingBar, 10);
        sViewsWithIds.put(R.id.rlStatus, 11);
        sViewsWithIds.put(R.id.ivCircle, 12);
        sViewsWithIds.put(R.id.ivLine, 13);
        sViewsWithIds.put(R.id.ivCircle1, 14);
        sViewsWithIds.put(R.id.tvTrack1, 15);
        sViewsWithIds.put(R.id.tvTrack2, 16);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemOrderlistBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ItemOrderlistBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.iqonic.woobox.utils.CircleView) bindings[12]
            , (com.iqonic.woobox.utils.CircleView) bindings[14]
            , (com.iqonic.woobox.utils.LineView) bindings[13]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.RatingBar) bindings[10]
            , (android.widget.RelativeLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.RelativeLayout) bindings[11]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[16]
            );
        this.rlMainOrder.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new com.iqonic.woobox.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.model == variableId) {
            setModel((com.iqonic.woobox.models.MyOrderData) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.iqonic.woobox.base.BaseRecyclerAdapter.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.iqonic.woobox.models.MyOrderData Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.iqonic.woobox.base.BaseRecyclerAdapter.OnClickListener Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.iqonic.woobox.models.MyOrderData model = mModel;
        com.iqonic.woobox.base.BaseRecyclerAdapter.OnClickListener<?> callback = mCallback;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.rlMainOrder.setOnClickListener(mCallback15);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // model
        com.iqonic.woobox.models.MyOrderData model = mModel;
        // callback
        com.iqonic.woobox.base.BaseRecyclerAdapter.OnClickListener callback = mCallback;
        // callback != null
        boolean callbackJavaLangObjectNull = false;



        callbackJavaLangObjectNull = (callback) != (null);
        if (callbackJavaLangObjectNull) {




            callback.onClick(callbackArg_0, model);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): callback
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}