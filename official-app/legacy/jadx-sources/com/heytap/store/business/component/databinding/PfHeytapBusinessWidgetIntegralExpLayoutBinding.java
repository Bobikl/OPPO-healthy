package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.view.OStoreHeaderView;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetIntegralExpLayoutBinding implements ViewBinding {

    @NonNull
    public final RecyclerView recycler;

    @NonNull
    private final View rootView;

    @NonNull
    public final OStoreHeaderView storeHeader;

    private PfHeytapBusinessWidgetIntegralExpLayoutBinding(@NonNull View view, @NonNull RecyclerView recyclerView, @NonNull OStoreHeaderView oStoreHeaderView) {
        this.rootView = view;
        this.recycler = recyclerView;
        this.storeHeader = oStoreHeaderView;
    }

    @NonNull
    public static PfHeytapBusinessWidgetIntegralExpLayoutBinding bind(@NonNull View view) {
        int i = R.id.recycler;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
        if (recyclerView != null) {
            i = R.id.store_header;
            OStoreHeaderView oStoreHeaderView = (OStoreHeaderView) view.findViewById(i);
            if (oStoreHeaderView != null) {
                return new PfHeytapBusinessWidgetIntegralExpLayoutBinding(view, recyclerView, oStoreHeaderView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfHeytapBusinessWidgetIntegralExpLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.pf_heytap_business_widget_integral_exp_layout, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
