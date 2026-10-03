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
public abstract class PfHeytapBusinessWidgetLayoutItemUpIconBinding extends ViewDataBinding {

    @NonNull
    public final LanternBubbleView storeNavigationItemBubble;

    @NonNull
    public final LoadImageView storeNavigationItemImage;

    @NonNull
    public final TextView storeNavigationItemTitle;

    public PfHeytapBusinessWidgetLayoutItemUpIconBinding(Object obj, View view, int i, LanternBubbleView lanternBubbleView, LoadImageView loadImageView, TextView textView) {
        super(obj, view, i);
        this.storeNavigationItemBubble = lanternBubbleView;
        this.storeNavigationItemImage = loadImageView;
        this.storeNavigationItemTitle = textView;
    }

    public static PfHeytapBusinessWidgetLayoutItemUpIconBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static PfHeytapBusinessWidgetLayoutItemUpIconBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PfHeytapBusinessWidgetLayoutItemUpIconBinding bind(@NonNull View view, @Nullable Object obj) {
        return (PfHeytapBusinessWidgetLayoutItemUpIconBinding) ViewDataBinding.bind(obj, view, R.layout.pf_heytap_business_widget_layout_item_up_icon);
    }

    @NonNull
    @Deprecated
    public static PfHeytapBusinessWidgetLayoutItemUpIconBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (PfHeytapBusinessWidgetLayoutItemUpIconBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_heytap_business_widget_layout_item_up_icon, viewGroup, z, obj);
    }

    @NonNull
    public static PfHeytapBusinessWidgetLayoutItemUpIconBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static PfHeytapBusinessWidgetLayoutItemUpIconBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (PfHeytapBusinessWidgetLayoutItemUpIconBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_heytap_business_widget_layout_item_up_icon, null, false, obj);
    }
}
