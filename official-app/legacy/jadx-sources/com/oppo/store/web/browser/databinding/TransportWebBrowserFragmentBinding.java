package com.oppo.store.web.browser.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.oppo.store.web.browser.R;

/* JADX INFO: loaded from: classes9.dex */
public abstract class TransportWebBrowserFragmentBinding extends ViewDataBinding {

    @NonNull
    public final ImageView closeBtn;

    @NonNull
    public final ConstraintLayout container;

    @NonNull
    public final LinearLayout contentContainer;

    @NonNull
    public final FrameLayout webContainer;

    @NonNull
    public final TextView webTitle;

    public TransportWebBrowserFragmentBinding(Object obj, View view, int i, ImageView imageView, ConstraintLayout constraintLayout, LinearLayout linearLayout, FrameLayout frameLayout, TextView textView) {
        super(obj, view, i);
        this.closeBtn = imageView;
        this.container = constraintLayout;
        this.contentContainer = linearLayout;
        this.webContainer = frameLayout;
        this.webTitle = textView;
    }

    public static TransportWebBrowserFragmentBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static TransportWebBrowserFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static TransportWebBrowserFragmentBinding bind(@NonNull View view, @Nullable Object obj) {
        return (TransportWebBrowserFragmentBinding) ViewDataBinding.bind(obj, view, R.layout.transport_web_browser_fragment);
    }

    @NonNull
    @Deprecated
    public static TransportWebBrowserFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (TransportWebBrowserFragmentBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.transport_web_browser_fragment, viewGroup, z, obj);
    }

    @NonNull
    public static TransportWebBrowserFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static TransportWebBrowserFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (TransportWebBrowserFragmentBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.transport_web_browser_fragment, null, false, obj);
    }
}
