package com.heytap.store.base.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.base.core.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PfCoreBaseToolbarTitleViewBinding extends ViewDataBinding {

    @NonNull
    public final TextView toolbarTitle;

    public PfCoreBaseToolbarTitleViewBinding(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.toolbarTitle = textView;
    }

    public static PfCoreBaseToolbarTitleViewBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static PfCoreBaseToolbarTitleViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PfCoreBaseToolbarTitleViewBinding bind(@NonNull View view, @Nullable Object obj) {
        return (PfCoreBaseToolbarTitleViewBinding) ViewDataBinding.bind(obj, view, R.layout.pf_core_base_toolbar_title_view);
    }

    @NonNull
    @Deprecated
    public static PfCoreBaseToolbarTitleViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (PfCoreBaseToolbarTitleViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_core_base_toolbar_title_view, viewGroup, z, obj);
    }

    @NonNull
    public static PfCoreBaseToolbarTitleViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static PfCoreBaseToolbarTitleViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (PfCoreBaseToolbarTitleViewBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_core_base_toolbar_title_view, null, false, obj);
    }
}
