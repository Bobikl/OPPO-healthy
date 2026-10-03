package com.heytap.store.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.sdk.R;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityPaySuccessBindingImpl extends ActivityPaySuccessBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.pay_finish, 1);
        sparseIntArray.put(R.id.pay_success_icon, 2);
        sparseIntArray.put(R.id.pay_success_text, 3);
        sparseIntArray.put(R.id.pay_total_price_mark, 4);
        sparseIntArray.put(R.id.pay_total_price, 5);
        sparseIntArray.put(R.id.pay_order_details, 6);
        sparseIntArray.put(R.id.pay_back_home, 7);
        sparseIntArray.put(R.id.pay_ad_image, 8);
        sparseIntArray.put(R.id.order_des, 9);
    }

    public ActivityPaySuccessBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
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

    private ActivityPaySuccessBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (TextView) objArr[9], (ImageView) objArr[8], (TextView) objArr[7], (TextView) objArr[1], (TextView) objArr[6], (ConstraintLayout) objArr[0], (ImageView) objArr[2], (TextView) objArr[3], (TextView) objArr[5], (TextView) objArr[4]);
        this.mDirtyFlags = -1L;
        this.paySuccessCl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
