package com.heytap.store.product_support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.product_support.R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PfProductFlexibleTabViewBinding extends ViewDataBinding {

    @NonNull
    public final TextView pfProductRecommendTabSelectTitle;

    @NonNull
    public final TextView pfProductRecommendTabSubtitle;

    @NonNull
    public final TextView pfProductRecommendTabTitle;

    public PfProductFlexibleTabViewBinding(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.pfProductRecommendTabSelectTitle = textView;
        this.pfProductRecommendTabSubtitle = textView2;
        this.pfProductRecommendTabTitle = textView3;
    }

    public static PfProductFlexibleTabViewBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static PfProductFlexibleTabViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PfProductFlexibleTabViewBinding bind(@NonNull View view, @Nullable Object obj) {
        return (PfProductFlexibleTabViewBinding) ViewDataBinding.bind(obj, view, R.layout.pf_product_flexible_tab_view);
    }

    @NonNull
    @Deprecated
    public static PfProductFlexibleTabViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (PfProductFlexibleTabViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_product_flexible_tab_view, viewGroup, z, obj);
    }

    @NonNull
    public static PfProductFlexibleTabViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static PfProductFlexibleTabViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (PfProductFlexibleTabViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_product_flexible_tab_view, null, false, obj);
    }
}
