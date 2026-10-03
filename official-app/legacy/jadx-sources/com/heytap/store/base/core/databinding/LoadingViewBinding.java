package com.heytap.store.base.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.heytap.nearx.uikit.widget.progress.NearCircleProgressBar;
import com.heytap.store.base.core.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LoadingViewBinding extends ViewDataBinding {

    @NonNull
    public final Button buttonSettingInternet;

    @NonNull
    public final NearCircleProgressBar colorLoadingView;

    @NonNull
    public final ImageView ivNotNetwork;

    @NonNull
    public final LinearLayout loadedErrorLayout;

    @NonNull
    public final LinearLayout loadingLayout;

    @NonNull
    public final TextView tvLoading;

    @NonNull
    public final TextView txvLoadedErrorTips;

    @NonNull
    public final TextView txvLoadedErrorTips2;

    public LoadingViewBinding(Object obj, View view, int i, Button button, NearCircleProgressBar nearCircleProgressBar, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.buttonSettingInternet = button;
        this.colorLoadingView = nearCircleProgressBar;
        this.ivNotNetwork = imageView;
        this.loadedErrorLayout = linearLayout;
        this.loadingLayout = linearLayout2;
        this.tvLoading = textView;
        this.txvLoadedErrorTips = textView2;
        this.txvLoadedErrorTips2 = textView3;
    }

    public static LoadingViewBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static LoadingViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LoadingViewBinding bind(@NonNull View view, @Nullable Object obj) {
        return (LoadingViewBinding) ViewDataBinding.bind(obj, view, R.layout.loading_view);
    }

    @NonNull
    @Deprecated
    public static LoadingViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (LoadingViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.loading_view, viewGroup, z, obj);
    }

    @NonNull
    public static LoadingViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static LoadingViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (LoadingViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.loading_view, null, false, obj);
    }
}
