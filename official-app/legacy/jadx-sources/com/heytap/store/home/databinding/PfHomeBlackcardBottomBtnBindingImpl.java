package com.heytap.store.home.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.home.R;

/* JADX INFO: loaded from: classes5.dex */
public class PfHomeBlackcardBottomBtnBindingImpl extends PfHomeBlackcardBottomBtnBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.ll_black_card_btn_root, 1);
        sparseIntArray.put(R.id.tv_blackcard_price, 2);
        sparseIntArray.put(R.id.tv_blackcard_under_price_tag, 3);
        sparseIntArray.put(R.id.tv_blackcard_under_price, 4);
        sparseIntArray.put(R.id.tv_blackcard_opend, 5);
    }

    public PfHomeBlackcardBottomBtnBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
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

    private PfHomeBlackcardBottomBtnBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[0], (LinearLayout) objArr[1], (TextView) objArr[5], (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[3]);
        this.mDirtyFlags = -1L;
        this.clBlackCardBottomBtn.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
