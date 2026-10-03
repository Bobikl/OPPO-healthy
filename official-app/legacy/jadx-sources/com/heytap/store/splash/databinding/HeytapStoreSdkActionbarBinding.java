package com.heytap.store.splash.databinding;

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
import com.heytap.store.base.widget.view.AlphaControlConstraintLayout;
import com.heytap.store.sdk.R;
import com.heytap.store.splash.widget.ParentNoScrollRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public abstract class HeytapStoreSdkActionbarBinding extends ViewDataBinding {

    @NonNull
    public final TextView homeStoreTitle;

    @NonNull
    public final ImageView homeTopBarBg;

    @NonNull
    public final View hotWordForeground;

    @NonNull
    public final ParentNoScrollRecyclerView hotWordRv;

    @NonNull
    public final ImageView ivBackView;

    @NonNull
    public final ImageView ivMessageView;

    @NonNull
    public final TextView ivMessageViewTips;

    @NonNull
    public final ImageView ivRightMore;

    @NonNull
    public final ImageView mainSearchIconView;

    @NonNull
    public final AlphaControlConstraintLayout mainSearchLayout;

    @NonNull
    public final ConstraintLayout searchViewLayout;

    @NonNull
    public final TextView tvSearchHintText;

    public HeytapStoreSdkActionbarBinding(Object obj, View view, int i, TextView textView, ImageView imageView, View view2, ParentNoScrollRecyclerView parentNoScrollRecyclerView, ImageView imageView2, ImageView imageView3, TextView textView2, ImageView imageView4, ImageView imageView5, AlphaControlConstraintLayout alphaControlConstraintLayout, ConstraintLayout constraintLayout, TextView textView3) {
        super(obj, view, i);
        this.homeStoreTitle = textView;
        this.homeTopBarBg = imageView;
        this.hotWordForeground = view2;
        this.hotWordRv = parentNoScrollRecyclerView;
        this.ivBackView = imageView2;
        this.ivMessageView = imageView3;
        this.ivMessageViewTips = textView2;
        this.ivRightMore = imageView4;
        this.mainSearchIconView = imageView5;
        this.mainSearchLayout = alphaControlConstraintLayout;
        this.searchViewLayout = constraintLayout;
        this.tvSearchHintText = textView3;
    }

    public static HeytapStoreSdkActionbarBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static HeytapStoreSdkActionbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static HeytapStoreSdkActionbarBinding bind(@NonNull View view, @Nullable Object obj) {
        return (HeytapStoreSdkActionbarBinding) ViewDataBinding.bind(obj, view, R.layout.heytap_store_sdk_actionbar);
    }

    @NonNull
    @Deprecated
    public static HeytapStoreSdkActionbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (HeytapStoreSdkActionbarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.heytap_store_sdk_actionbar, viewGroup, z, obj);
    }

    @NonNull
    public static HeytapStoreSdkActionbarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static HeytapStoreSdkActionbarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (HeytapStoreSdkActionbarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.heytap_store_sdk_actionbar, null, false, obj);
    }
}
