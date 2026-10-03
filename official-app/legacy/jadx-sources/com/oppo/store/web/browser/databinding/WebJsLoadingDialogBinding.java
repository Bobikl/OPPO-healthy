package com.oppo.store.web.browser.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.oppo.store.web.browser.R;

/* JADX INFO: loaded from: classes9.dex */
public abstract class WebJsLoadingDialogBinding extends ViewDataBinding {

    @NonNull
    public final LinearLayout container;

    @NonNull
    public final TextView tvContent;

    public WebJsLoadingDialogBinding(Object obj, View view, int i, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.container = linearLayout;
        this.tvContent = textView;
    }

    public static WebJsLoadingDialogBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static WebJsLoadingDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static WebJsLoadingDialogBinding bind(@NonNull View view, @Nullable Object obj) {
        return (WebJsLoadingDialogBinding) ViewDataBinding.bind(obj, view, R.layout.web_js_loading_dialog);
    }

    @NonNull
    @Deprecated
    public static WebJsLoadingDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (WebJsLoadingDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.web_js_loading_dialog, viewGroup, z, obj);
    }

    @NonNull
    public static WebJsLoadingDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static WebJsLoadingDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (WebJsLoadingDialogBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.web_js_loading_dialog, null, false, obj);
    }
}
