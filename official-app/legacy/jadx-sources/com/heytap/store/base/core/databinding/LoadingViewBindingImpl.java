package com.heytap.store.base.core.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.heytap.nearx.uikit.widget.progress.NearCircleProgressBar;
import com.heytap.store.base.core.R;

/* JADX INFO: loaded from: classes3.dex */
public class LoadingViewBindingImpl extends LoadingViewBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    @NonNull
    private final FrameLayout mboundView0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.loading_layout, 1);
        sparseIntArray.put(R.id.color_loading_view, 2);
        sparseIntArray.put(R.id.tv_loading, 3);
        sparseIntArray.put(R.id.loaded_error_layout, 4);
        sparseIntArray.put(R.id.iv_not_network, 5);
        sparseIntArray.put(R.id.txv_loaded_error_tips, 6);
        sparseIntArray.put(R.id.txv_loaded_error_tips2, 7);
        sparseIntArray.put(R.id.button_setting_internet, 8);
    }

    public LoadingViewBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, sIncludes, sViewsWithIds));
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

    private LoadingViewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (Button) objArr[8], (NearCircleProgressBar) objArr[2], (ImageView) objArr[5], (LinearLayout) objArr[4], (LinearLayout) objArr[1], (TextView) objArr[3], (TextView) objArr[6], (TextView) objArr[7]);
        this.mDirtyFlags = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.mboundView0 = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
