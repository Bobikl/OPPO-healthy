package com.heytap.store.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.sdk.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PayInnerCellItemBinding extends ViewDataBinding {

    @NonNull
    public final TextView payItemDateail;

    @NonNull
    public final TextView payItemFreeMark;

    @NonNull
    public final TextView payItemPoundage;

    public PayInnerCellItemBinding(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.payItemDateail = textView;
        this.payItemFreeMark = textView2;
        this.payItemPoundage = textView3;
    }

    public static PayInnerCellItemBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static PayInnerCellItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PayInnerCellItemBinding bind(@NonNull View view, @Nullable Object obj) {
        return (PayInnerCellItemBinding) ViewDataBinding.bind(obj, view, R.layout.pay_inner_cell_item);
    }

    @NonNull
    @Deprecated
    public static PayInnerCellItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (PayInnerCellItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pay_inner_cell_item, viewGroup, z, obj);
    }

    @NonNull
    public static PayInnerCellItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static PayInnerCellItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (PayInnerCellItemBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pay_inner_cell_item, null, false, obj);
    }
}
