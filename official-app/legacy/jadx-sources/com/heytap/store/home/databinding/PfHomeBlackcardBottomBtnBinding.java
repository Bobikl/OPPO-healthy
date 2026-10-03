package com.heytap.store.home.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.home.R;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PfHomeBlackcardBottomBtnBinding extends ViewDataBinding {

    @NonNull
    public final ConstraintLayout clBlackCardBottomBtn;

    @NonNull
    public final LinearLayout llBlackCardBtnRoot;

    @NonNull
    public final TextView tvBlackcardOpend;

    @NonNull
    public final TextView tvBlackcardPrice;

    @NonNull
    public final TextView tvBlackcardUnderPrice;

    @NonNull
    public final TextView tvBlackcardUnderPriceTag;

    public PfHomeBlackcardBottomBtnBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.clBlackCardBottomBtn = constraintLayout;
        this.llBlackCardBtnRoot = linearLayout;
        this.tvBlackcardOpend = textView;
        this.tvBlackcardPrice = textView2;
        this.tvBlackcardUnderPrice = textView3;
        this.tvBlackcardUnderPriceTag = textView4;
    }

    public static PfHomeBlackcardBottomBtnBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static PfHomeBlackcardBottomBtnBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PfHomeBlackcardBottomBtnBinding bind(@NonNull View view, @Nullable Object obj) {
        return (PfHomeBlackcardBottomBtnBinding) ViewDataBinding.bind(obj, view, R.layout.pf_home_blackcard_bottom_btn);
    }

    @NonNull
    @Deprecated
    public static PfHomeBlackcardBottomBtnBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (PfHomeBlackcardBottomBtnBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_home_blackcard_bottom_btn, viewGroup, z, obj);
    }

    @NonNull
    public static PfHomeBlackcardBottomBtnBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static PfHomeBlackcardBottomBtnBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (PfHomeBlackcardBottomBtnBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_home_blackcard_bottom_btn, null, false, obj);
    }
}
