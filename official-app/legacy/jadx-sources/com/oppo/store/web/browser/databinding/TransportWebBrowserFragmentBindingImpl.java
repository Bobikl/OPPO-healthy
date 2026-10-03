package com.oppo.store.web.browser.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.oppo.store.web.browser.R;

/* JADX INFO: loaded from: classes9.dex */
public class TransportWebBrowserFragmentBindingImpl extends TransportWebBrowserFragmentBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.content_container, 1);
        sparseIntArray.put(R.id.webTitle, 2);
        sparseIntArray.put(R.id.web_container, 3);
        sparseIntArray.put(R.id.close_btn, 4);
    }

    public TransportWebBrowserFragmentBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, sIncludes, sViewsWithIds));
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

    private TransportWebBrowserFragmentBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ImageView) objArr[4], (ConstraintLayout) objArr[0], (LinearLayout) objArr[1], (FrameLayout) objArr[3], (TextView) objArr[2]);
        this.mDirtyFlags = -1L;
        this.container.setTag(null);
        setRootTag(view);
        invalidateAll();
    }
}
