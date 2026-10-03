package com.heytap.store.base.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.vm.StatePageVModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PfCoreViewStubErrorLayoutBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout baseErrorLayout;

    @NonNull
    public final ImageView ivNotNetwork;

    @Bindable
    protected StatePageVModel mData;

    @NonNull
    public final TextView tvErrorSubTip;

    @NonNull
    public final TextView tvErrorTip;

    public PfCoreViewStubErrorLayoutBinding(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.baseErrorLayout = linearLayout;
        this.ivNotNetwork = imageView;
        this.tvErrorSubTip = textView;
        this.tvErrorTip = textView2;
    }

    public static PfCoreViewStubErrorLayoutBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static PfCoreViewStubErrorLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public StatePageVModel getData() {
        return this.mData;
    }

    public abstract void setData(@Nullable StatePageVModel statePageVModel);

    @Deprecated
    public static PfCoreViewStubErrorLayoutBinding bind(@NonNull View view, @Nullable Object obj) {
        return (PfCoreViewStubErrorLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.pf_core_view_stub_error_layout);
    }

    @NonNull
    @Deprecated
    public static PfCoreViewStubErrorLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (PfCoreViewStubErrorLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_core_view_stub_error_layout, viewGroup, z, obj);
    }

    @NonNull
    public static PfCoreViewStubErrorLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static PfCoreViewStubErrorLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (PfCoreViewStubErrorLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_core_view_stub_error_layout, null, false, obj);
    }
}
