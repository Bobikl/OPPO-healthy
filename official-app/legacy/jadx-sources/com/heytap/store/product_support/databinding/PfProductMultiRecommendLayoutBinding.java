package com.heytap.store.product_support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.heytap.nearx.uikit.widget.NearTabLayout;
import com.heytap.store.product_support.R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PfProductMultiRecommendLayoutBinding extends ViewDataBinding {

    @NonNull
    public final FrameLayout pfProductMultiTabParent;

    @NonNull
    public final NearTabLayout pfProductRecommendTabLayout;

    public PfProductMultiRecommendLayoutBinding(Object obj, View view, int i, FrameLayout frameLayout, NearTabLayout nearTabLayout) {
        super(obj, view, i);
        this.pfProductMultiTabParent = frameLayout;
        this.pfProductRecommendTabLayout = nearTabLayout;
    }

    public static PfProductMultiRecommendLayoutBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static PfProductMultiRecommendLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PfProductMultiRecommendLayoutBinding bind(@NonNull View view, @Nullable Object obj) {
        return (PfProductMultiRecommendLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.pf_product_multi_recommend_layout);
    }

    @NonNull
    @Deprecated
    public static PfProductMultiRecommendLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (PfProductMultiRecommendLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_product_multi_recommend_layout, viewGroup, z, obj);
    }

    @NonNull
    public static PfProductMultiRecommendLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static PfProductMultiRecommendLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (PfProductMultiRecommendLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_product_multi_recommend_layout, null, false, obj);
    }
}
