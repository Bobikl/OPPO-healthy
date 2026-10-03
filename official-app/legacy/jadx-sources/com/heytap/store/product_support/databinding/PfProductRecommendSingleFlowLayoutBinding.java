package com.heytap.store.product_support.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.base.widget.recyclerview.ChildRecyclerView;
import com.heytap.store.product_support.R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class PfProductRecommendSingleFlowLayoutBinding extends ViewDataBinding {

    @NonNull
    public final ChildRecyclerView pfProductRecommendSingleFlowList;

    @NonNull
    public final TextView pfProductRecommendSingleFlowTitle;

    @NonNull
    public final FrameLayout pfProductRecommendSingleFlowTitleLayout;

    public PfProductRecommendSingleFlowLayoutBinding(Object obj, View view, int i, ChildRecyclerView childRecyclerView, TextView textView, FrameLayout frameLayout) {
        super(obj, view, i);
        this.pfProductRecommendSingleFlowList = childRecyclerView;
        this.pfProductRecommendSingleFlowTitle = textView;
        this.pfProductRecommendSingleFlowTitleLayout = frameLayout;
    }

    public static PfProductRecommendSingleFlowLayoutBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static PfProductRecommendSingleFlowLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PfProductRecommendSingleFlowLayoutBinding bind(@NonNull View view, @Nullable Object obj) {
        return (PfProductRecommendSingleFlowLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.pf_product_recommend_single_flow_layout);
    }

    @NonNull
    @Deprecated
    public static PfProductRecommendSingleFlowLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (PfProductRecommendSingleFlowLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_product_recommend_single_flow_layout, viewGroup, z, obj);
    }

    @NonNull
    public static PfProductRecommendSingleFlowLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static PfProductRecommendSingleFlowLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (PfProductRecommendSingleFlowLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_product_recommend_single_flow_layout, null, false, obj);
    }
}
