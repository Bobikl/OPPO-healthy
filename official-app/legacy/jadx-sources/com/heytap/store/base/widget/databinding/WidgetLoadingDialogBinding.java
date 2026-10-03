package com.heytap.store.base.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.base.widget.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WidgetLoadingDialogBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout container;

    @NonNull
    public final TextView tvContent;

    public WidgetLoadingDialogBinding(Object obj, View view, int i, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.container = linearLayout;
        this.tvContent = textView;
    }

    public static WidgetLoadingDialogBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static WidgetLoadingDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static WidgetLoadingDialogBinding bind(@NonNull View view, @Nullable Object obj) {
        return (WidgetLoadingDialogBinding) ViewDataBinding.bind(obj, view, R.layout.widget_loading_dialog);
    }

    @NonNull
    @Deprecated
    public static WidgetLoadingDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (WidgetLoadingDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.widget_loading_dialog, viewGroup, z, obj);
    }

    @NonNull
    public static WidgetLoadingDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static WidgetLoadingDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (WidgetLoadingDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.widget_loading_dialog, null, false, obj);
    }
}
