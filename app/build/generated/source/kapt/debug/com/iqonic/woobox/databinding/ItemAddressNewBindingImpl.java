package com.iqonic.woobox.databinding;
import com.iqonic.woobox.R;
import com.iqonic.woobox.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAddressNewBindingImpl extends ItemAddressNewBinding implements com.iqonic.woobox.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(3, 
            new String[] {"item_address"},
            new int[] {4},
            new int[] {com.iqonic.woobox.R.layout.item_address});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.delete_layout, 5);
        sViewsWithIds.put(R.id.front_layout, 6);
        sViewsWithIds.put(R.id.rbDefaultAddress, 7);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAddressNewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemAddressNewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.FrameLayout) bindings[5]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[2]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1]
            , (android.widget.FrameLayout) bindings[6]
            , (com.iqonic.woobox.databinding.ItemAddressBinding) bindings[4]
            , (android.widget.RadioButton) bindings[7]
            , (com.iqonic.woobox.utils.swipereveallayout.SwipeRevealLayout) bindings[0]
            );
        this.addressLayout.setTag(null);
        this.fabDelete.setTag(null);
        this.fabEdit.setTag(null);
        this.swipeLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.iqonic.woobox.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.iqonic.woobox.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.iqonic.woobox.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        included.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (included.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.model == variableId) {
            setModel((com.iqonic.woobox.models.Address) variable);
        }
        else if (BR.callback == variableId) {
            setCallback((com.iqonic.woobox.base.BaseRecyclerAdapter.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable com.iqonic.woobox.models.Address Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setCallback(@Nullable com.iqonic.woobox.base.BaseRecyclerAdapter.OnClickListener Callback) {
        this.mCallback = Callback;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.callback);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        included.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncluded((com.iqonic.woobox.databinding.ItemAddressBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncluded(com.iqonic.woobox.databinding.ItemAddressBinding Included, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        com.iqonic.woobox.models.Address model = mModel;
        com.iqonic.woobox.base.BaseRecyclerAdapter.OnClickListener<?> callback = mCallback;
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.addressLayout.setOnClickListener(mCallback3);
            this.fabDelete.setOnClickListener(mCallback2);
            this.fabEdit.setOnClickListener(mCallback1);
        }
        executeBindingsOn(included);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // model
                com.iqonic.woobox.models.Address model = mModel;
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
                com.iqonic.woobox.models.Address model = mModel;
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
                com.iqonic.woobox.models.Address model = mModel;
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
        flag 0 (0x1L): included
        flag 1 (0x2L): model
        flag 2 (0x3L): callback
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}