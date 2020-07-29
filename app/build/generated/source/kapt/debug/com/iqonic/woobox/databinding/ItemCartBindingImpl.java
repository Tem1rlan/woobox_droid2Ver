package com.iqonic.woobox.databinding;
import com.iqonic.woobox.R;
import com.iqonic.woobox.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCartBindingImpl extends ItemCartBinding implements com.iqonic.woobox.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ivProduct, 7);
        sViewsWithIds.put(R.id.rl_content, 8);
        sViewsWithIds.put(R.id.edtQty, 9);
        sViewsWithIds.put(R.id.tvPrice, 10);
        sViewsWithIds.put(R.id.tvOriginalPrice, 11);
        sViewsWithIds.put(R.id.llButton, 12);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ItemCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[2]
            );
        this.ivDecreaseQuantity.setTag(null);
        this.ivIncreaseQuantity.setTag(null);
        this.llMoveTocart.setTag(null);
        this.llRemove.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.tvProductName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new com.iqonic.woobox.generated.callback.OnClickListener(this, 4);
        mCallback28 = new com.iqonic.woobox.generated.callback.OnClickListener(this, 5);
        mCallback25 = new com.iqonic.woobox.generated.callback.OnClickListener(this, 2);
        mCallback26 = new com.iqonic.woobox.generated.callback.OnClickListener(this, 3);
        mCallback24 = new com.iqonic.woobox.generated.callback.OnClickListener(this, 1);
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
            setModel((com.iqonic.woobox.models.CartResponse) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.iqonic.woobox.base.BaseRecyclerAdapter.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.iqonic.woobox.models.CartResponse Model) {
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
        com.iqonic.woobox.models.CartResponse model = mModel;
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

            this.ivDecreaseQuantity.setOnClickListener(mCallback25);
            this.ivIncreaseQuantity.setOnClickListener(mCallback26);
            this.llMoveTocart.setOnClickListener(mCallback27);
            this.llRemove.setOnClickListener(mCallback28);
            this.mboundView1.setOnClickListener(mCallback24);
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
            case 4: {
                // localize variables for thread safety
                // model
                com.iqonic.woobox.models.CartResponse model = mModel;
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
            case 5: {
                // localize variables for thread safety
                // model
                com.iqonic.woobox.models.CartResponse model = mModel;
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
                com.iqonic.woobox.models.CartResponse model = mModel;
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
            case 3: {
                // localize variables for thread safety
                // model
                com.iqonic.woobox.models.CartResponse model = mModel;
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
            case 1: {
                // localize variables for thread safety
                // model
                com.iqonic.woobox.models.CartResponse model = mModel;
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