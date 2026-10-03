package com.oppo.store.web.browser.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.oppo.store.web.browser.R;

/* JADX INFO: loaded from: classes9.dex */
public abstract class StoreSdkActivityWebBrowserBinding extends ViewDataBinding {

    @NonNull
    public final CoordinatorLayout flFragmentContainer;

    @NonNull
    public final FrameLayout tabContainer;

    public StoreSdkActivityWebBrowserBinding(Object obj, View view, int i, CoordinatorLayout coordinatorLayout, FrameLayout frameLayout) {
        super(obj, view, i);
        this.flFragmentContainer = coordinatorLayout;
        this.tabContainer = frameLayout;
    }

    public static StoreSdkActivityWebBrowserBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static StoreSdkActivityWebBrowserBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static StoreSdkActivityWebBrowserBinding bind(@NonNull View view, @Nullable Object obj) {
        return (StoreSdkActivityWebBrowserBinding) ViewDataBinding.bind(obj, view, R.layout.store_sdk_activity_web_browser);
    }

    @NonNull
    @Deprecated
    public static StoreSdkActivityWebBrowserBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (StoreSdkActivityWebBrowserBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.store_sdk_activity_web_browser, viewGroup, z, obj);
    }

    @NonNull
    public static StoreSdkActivityWebBrowserBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static StoreSdkActivityWebBrowserBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (StoreSdkActivityWebBrowserBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.store_sdk_activity_web_browser, null, false, obj);
    }
}
