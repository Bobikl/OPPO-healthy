package com.heytap.store.base.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.base.core.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PfCoreViewCartCountBinding extends ViewDataBinding {

    @NonNull
    public final ImageView ivCartView;

    @NonNull
    public final Button ivCartViewTips;

    @NonNull
    public final ConstraintLayout rootLayout;

    public PfCoreViewCartCountBinding(Object obj, View view, int i, ImageView imageView, Button button, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.ivCartView = imageView;
        this.ivCartViewTips = button;
        this.rootLayout = constraintLayout;
    }

    public static PfCoreViewCartCountBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static PfCoreViewCartCountBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PfCoreViewCartCountBinding bind(@NonNull View view, @Nullable Object obj) {
        return (PfCoreViewCartCountBinding) ViewDataBinding.bind(obj, view, R.layout.pf_core_view_cart_count);
    }

    @NonNull
    @Deprecated
    public static PfCoreViewCartCountBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (PfCoreViewCartCountBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_core_view_cart_count, viewGroup, z, obj);
    }

    @NonNull
    public static PfCoreViewCartCountBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static PfCoreViewCartCountBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (PfCoreViewCartCountBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_core_view_cart_count, null, false, obj);
    }
}
