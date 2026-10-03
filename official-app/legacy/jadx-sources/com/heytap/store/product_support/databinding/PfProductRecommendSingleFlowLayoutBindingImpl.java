package com.heytap.store.product_support.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.base.widget.recyclerview.ChildRecyclerView;
import com.heytap.store.product_support.R;

/* JADX INFO: loaded from: classes7.dex */
public class PfProductRecommendSingleFlowLayoutBindingImpl extends PfProductRecommendSingleFlowLayoutBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.pf_product_recommend_single_flow_title, 2);
    }

    public PfProductRecommendSingleFlowLayoutBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 3, sIncludes, sViewsWithIds));
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.mDirtyFlags != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @Nullable Object obj) {
        return true;
    }

    private PfProductRecommendSingleFlowLayoutBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (ChildRecyclerView) objArr[1], (TextView) objArr[2], (FrameLayout) objArr[0]);
        this.mDirtyFlags = -1L;
        this.pfProductRecommendSingleFlowList.setTag(null);
        this.pfProductRecommendSingleFlowTitleLayout.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }
}
