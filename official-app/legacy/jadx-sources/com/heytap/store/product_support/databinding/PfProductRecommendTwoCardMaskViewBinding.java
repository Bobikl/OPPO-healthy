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
public abstract class PfProductRecommendTwoCardMaskViewBinding extends ViewDataBinding {

    @NonNull
    public final TextView pfProductRecommendHadBuy;

    @NonNull
    public final TextView pfProductRecommendNoCare;

    @NonNull
    public final TextView pfProductRecommendNoLike;

    public PfProductRecommendTwoCardMaskViewBinding(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.pfProductRecommendHadBuy = textView;
        this.pfProductRecommendNoCare = textView2;
        this.pfProductRecommendNoLike = textView3;
    }

    public static PfProductRecommendTwoCardMaskViewBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static PfProductRecommendTwoCardMaskViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PfProductRecommendTwoCardMaskViewBinding bind(@NonNull View view, @Nullable Object obj) {
        return (PfProductRecommendTwoCardMaskViewBinding) ViewDataBinding.bind(obj, view, R.layout.pf_product_recommend_two_card_mask_view);
    }

    @NonNull
    @Deprecated
    public static PfProductRecommendTwoCardMaskViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (PfProductRecommendTwoCardMaskViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_product_recommend_two_card_mask_view, viewGroup, z, obj);
    }

    @NonNull
    public static PfProductRecommendTwoCardMaskViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static PfProductRecommendTwoCardMaskViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (PfProductRecommendTwoCardMaskViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_product_recommend_two_card_mask_view, null, false, obj);
    }
}
