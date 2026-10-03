package com.heytap.store.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.sdk.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ActivityPaySuccessBinding extends ViewDataBinding {

    @NonNull
    public final TextView orderDes;

    @NonNull
    public final ImageView payAdImage;

    @NonNull
    public final TextView payBackHome;

    @NonNull
    public final TextView payFinish;

    @NonNull
    public final TextView payOrderDetails;

    @NonNull
    public final ConstraintLayout paySuccessCl;

    @NonNull
    public final ImageView paySuccessIcon;

    @NonNull
    public final TextView paySuccessText;

    @NonNull
    public final TextView payTotalPrice;

    @NonNull
    public final TextView payTotalPriceMark;

    public ActivityPaySuccessBinding(Object obj, View view, int i, TextView textView, ImageView imageView, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout, ImageView imageView2, TextView textView5, TextView textView6, TextView textView7) {
        super(obj, view, i);
        this.orderDes = textView;
        this.payAdImage = imageView;
        this.payBackHome = textView2;
        this.payFinish = textView3;
        this.payOrderDetails = textView4;
        this.paySuccessCl = constraintLayout;
        this.paySuccessIcon = imageView2;
        this.paySuccessText = textView5;
        this.payTotalPrice = textView6;
        this.payTotalPriceMark = textView7;
    }

    public static ActivityPaySuccessBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static ActivityPaySuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ActivityPaySuccessBinding bind(@NonNull View view, @Nullable Object obj) {
        return (ActivityPaySuccessBinding) ViewDataBinding.bind(obj, view, R.layout.activity_pay_success);
    }

    @NonNull
    @Deprecated
    public static ActivityPaySuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (ActivityPaySuccessBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pay_success, viewGroup, z, obj);
    }

    @NonNull
    public static ActivityPaySuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static ActivityPaySuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (ActivityPaySuccessBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_pay_success, null, false, obj);
    }
}
