package com.heytap.store.splash.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.base.widget.view.AlphaControlConstraintLayout;
import com.heytap.store.sdk.R;
import com.heytap.store.splash.widget.ParentNoScrollRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public class HeytapStoreSdkActionbarBindingImpl extends HeytapStoreSdkActionbarBinding {

    @Nullable
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;

    @Nullable
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.iv_back_view, 2);
        sparseIntArray.put(R.id.home_store_title, 3);
        sparseIntArray.put(R.id.search_view_layout, 4);
        sparseIntArray.put(R.id.main_search_icon_view, 5);
        sparseIntArray.put(R.id.hot_word_rv, 6);
        sparseIntArray.put(R.id.tv_search_hint_text, 7);
        sparseIntArray.put(R.id.hot_word_foreground, 8);
        sparseIntArray.put(R.id.iv_message_view, 9);
        sparseIntArray.put(R.id.iv_message_view_tips, 10);
        sparseIntArray.put(R.id.iv_right_more, 11);
    }

    public HeytapStoreSdkActionbarBindingImpl(@Nullable DataBindingComponent dataBindingComponent, @NonNull View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 12, sIncludes, sViewsWithIds));
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

    private HeytapStoreSdkActionbarBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr, Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (TextView) objArr[3], (ImageView) objArr[0], (View) objArr[8], (ParentNoScrollRecyclerView) objArr[6], (ImageView) objArr[2], (ImageView) objArr[9], (TextView) objArr[10], (ImageView) objArr[11], (ImageView) objArr[5], (AlphaControlConstraintLayout) objArr[1], (ConstraintLayout) objArr[4], (TextView) objArr[7]);
        this.mDirtyFlags = -1L;
        this.homeTopBarBg.setTag(null);
        this.mainSearchLayout.setTag(null);
        setRootTag(viewArr);
        invalidateAll();
    }
}
