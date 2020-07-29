package com.iqonic.woobox.databinding;
import com.iqonic.woobox.R;
import com.iqonic.woobox.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentItemreviewBindingImpl extends FragmentItemreviewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvLblRatings, 2);
        sViewsWithIds.put(R.id.btnRateNow, 3);
        sViewsWithIds.put(R.id.rlReviewInfo, 4);
        sViewsWithIds.put(R.id.ivBackground, 5);
        sViewsWithIds.put(R.id.tvReviewRate, 6);
        sViewsWithIds.put(R.id.tvTotalReview, 7);
        sViewsWithIds.put(R.id.tvLbl5, 8);
        sViewsWithIds.put(R.id.sb5Star, 9);
        sViewsWithIds.put(R.id.tv5Count, 10);
        sViewsWithIds.put(R.id.tvLbl4, 11);
        sViewsWithIds.put(R.id.sb4Star, 12);
        sViewsWithIds.put(R.id.tv4Count, 13);
        sViewsWithIds.put(R.id.tvLbl3, 14);
        sViewsWithIds.put(R.id.sb3Star, 15);
        sViewsWithIds.put(R.id.tv3Count, 16);
        sViewsWithIds.put(R.id.tvLbl2, 17);
        sViewsWithIds.put(R.id.sb2Star, 18);
        sViewsWithIds.put(R.id.tv2Count, 19);
        sViewsWithIds.put(R.id.tvLbl1, 20);
        sViewsWithIds.put(R.id.sb1Star, 21);
        sViewsWithIds.put(R.id.tv1Count, 22);
        sViewsWithIds.put(R.id.tvLblReview, 23);
        sViewsWithIds.put(R.id.rvReview, 24);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentItemreviewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 25, sIncludes, sViewsWithIds));
    }
    private FragmentItemreviewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.RelativeLayout) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[24]
            , (android.widget.SeekBar) bindings[21]
            , (android.widget.SeekBar) bindings[18]
            , (android.widget.SeekBar) bindings[15]
            , (android.widget.SeekBar) bindings[12]
            , (android.widget.SeekBar) bindings[9]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}