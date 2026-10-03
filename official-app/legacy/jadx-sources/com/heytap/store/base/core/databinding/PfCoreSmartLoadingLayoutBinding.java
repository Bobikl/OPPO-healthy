package com.heytap.store.base.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.heytap.nearx.uikit.widget.progress.NearCircleProgressBar;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.vm.LoadingPageVModel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PfCoreSmartLoadingLayoutBinding extends ViewDataBinding {

    @NonNull
    public final RelativeLayout baseLoadingLayout;

    @NonNull
    public final NearCircleProgressBar colorLoadingView;

    @NonNull
    public final ImageView colorSkeletonLoadingView;

    @NonNull
    public final LinearLayout lltLoading;

    @Bindable
    protected LoadingPageVModel mData;

    @NonNull
    public final TextView tvLoading;

    public PfCoreSmartLoadingLayoutBinding(Object obj, View view, int i, RelativeLayout relativeLayout, NearCircleProgressBar nearCircleProgressBar, ImageView imageView, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.baseLoadingLayout = relativeLayout;
        this.colorLoadingView = nearCircleProgressBar;
        this.colorSkeletonLoadingView = imageView;
        this.lltLoading = linearLayout;
        this.tvLoading = textView;
    }

    public static PfCoreSmartLoadingLayoutBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static PfCoreSmartLoadingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public LoadingPageVModel getData() {
        return this.mData;
    }

    public abstract void setData(@Nullable LoadingPageVModel loadingPageVModel);

    @Deprecated
    public static PfCoreSmartLoadingLayoutBinding bind(@NonNull View view, @Nullable Object obj) {
        return (PfCoreSmartLoadingLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.pf_core_smart_loading_layout);
    }

    @NonNull
    @Deprecated
    public static PfCoreSmartLoadingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (PfCoreSmartLoadingLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_core_smart_loading_layout, viewGroup, z, obj);
    }

    @NonNull
    public static PfCoreSmartLoadingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static PfCoreSmartLoadingLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (PfCoreSmartLoadingLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_core_smart_loading_layout, null, false, obj);
    }
}
