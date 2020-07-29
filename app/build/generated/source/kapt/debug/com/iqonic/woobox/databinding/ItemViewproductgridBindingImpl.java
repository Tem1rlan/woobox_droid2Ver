package com.iqonic.woobox.databinding;
import com.iqonic.woobox.R;
import com.iqonic.woobox.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemViewproductgridBindingImpl extends ItemViewproductgridBinding implements com.iqonic.woobox.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.r, 3);
        sViewsWithIds.put(R.id.ivProduct, 4);
        sViewsWithIds.put(R.id.llDynamicProductColor, 5);
        sViewsWithIds.put(R.id.ratingBar, 6);
        sViewsWithIds.put(R.id.tvDiscountPrice, 7);
        sViewsWithIds.put(R.id.tvOriginalPrice, 8);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemViewproductgridBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ItemViewproductgridBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.RatingBar) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[1]
            );
        this.gridProduct.setTag(null);
        this.ivFavourite.setTag(null);
        this.tvProductName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.iqonic.woobox.generated.callback.OnClickListener(this, 1);
        mCallback8 = new com.iqonic.woobox.generated.callback.OnClickListener(this, 2);
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
            setModel((com.iqonic.woobox.models.ProductDataNew) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.iqonic.woobox.base.BaseRecyclerAdapter.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.iqonic.woobox.models.ProductDataNew Model) {
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
        com.iqonic.woobox.models.ProductDataNew model = mModel;
        java.lang.String modelName = null;
        com.iqonic.woobox.base.BaseRecyclerAdapter.OnClickListener<?> callback = mCallback;

        if ((dirtyFlags & 0x5L) != 0) {



                if (model != null) {
                    // read model.name
                    modelName = model.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.gridProduct.setOnClickListener(mCallback7);
            this.ivFavourite.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvProductName, modelName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // model
                com.iqonic.woobox.models.ProductDataNew model = mModel;
                // callback
                com.iqonic.woobox.base.BaseRecyclerAdapter.OnClickListener callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {




                    callback.onClick(callbackArg_0, model);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // model
                com.iqonic.woobox.models.ProductDataNew model = mModel;
                // callback
                com.iqonic.woobox.base.BaseRecyclerAdapter.OnClickListener callback = mCallback;
                // callback != null
                boolean callbackJavaLangObjectNull = false;



                callbackJavaLangObjectNull = (callback) != (null);
                if (callbackJavaLangObjectNull) {




                    callback.onClick(callbackArg_0, model);
                }
                break;
            }
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