package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.base.widget.view.LoadImageView;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.widget.paging.LanternBubbleView;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PfHeytapBusinessWidgetLayoutItemUpDynamicLayoutBinding extends ViewDataBinding {

    @NonNull
    public final LanternBubbleView storeNavigationItemBubble;

    @NonNull
    public final LoadImageView storeNavigationItemImage;

    @NonNull
    public final TextView storeNavigationItemTitle;

    public PfHeytapBusinessWidgetLayoutItemUpDynamicLayoutBinding(Object obj, View view, int i, LanternBubbleView lanternBubbleView, LoadImageView loadImageView, TextView textView) {
        super(obj, view, i);
        this.storeNavigationItemBubble = lanternBubbleView;
        this.storeNavigationItemImage = loadImageView;
        this.storeNavigationItemTitle = textView;
    }

    public static PfHeytapBusinessWidgetLayoutItemUpDynamicLayoutBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static PfHeytapBusinessWidgetLayoutItemUpDynamicLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PfHeytapBusinessWidgetLayoutItemUpDynamicLayoutBinding bind(@NonNull View view, @Nullable Object obj) {
        return (PfHeytapBusinessWidgetLayoutItemUpDynamicLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.pf_heytap_business_widget_layout_item_up_dynamic_layout);
    }

    @NonNull
    @Deprecated
    public static PfHeytapBusinessWidgetLayoutItemUpDynamicLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (PfHeytapBusinessWidgetLayoutItemUpDynamicLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_heytap_business_widget_layout_item_up_dynamic_layout, viewGroup, z, obj);
    }

    @NonNull
    public static PfHeytapBusinessWidgetLayoutItemUpDynamicLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static PfHeytapBusinessWidgetLayoutItemUpDynamicLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (PfHeytapBusinessWidgetLayoutItemUpDynamicLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_heytap_business_widget_layout_item_up_dynamic_layout, null, false, obj);
    }
}
