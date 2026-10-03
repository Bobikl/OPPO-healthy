package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetStorePagingNavigationBinding implements ViewBinding {

    @NonNull
    private final View rootView;

    @NonNull
    public final FrameLayout storePagingNavigation;

    private PfHeytapBusinessWidgetStorePagingNavigationBinding(@NonNull View view, @NonNull FrameLayout frameLayout) {
        this.rootView = view;
        this.storePagingNavigation = frameLayout;
    }

    @NonNull
    public static PfHeytapBusinessWidgetStorePagingNavigationBinding bind(@NonNull View view) {
        int i = R.id.store_paging_navigation;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
        if (frameLayout != null) {
            return new PfHeytapBusinessWidgetStorePagingNavigationBinding(view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfHeytapBusinessWidgetStorePagingNavigationBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.pf_heytap_business_widget_store_paging_navigation, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
