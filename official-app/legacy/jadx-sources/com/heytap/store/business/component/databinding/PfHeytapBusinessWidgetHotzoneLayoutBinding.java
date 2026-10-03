package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.view.OStoreHeaderView;
import com.heytap.store.business.component.widget.hotzone.HotZoneLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetHotzoneLayoutBinding implements ViewBinding {

    @NonNull
    public final HotZoneLayout cvHotZone;

    @NonNull
    public final OStoreHeaderView headLayout;

    @NonNull
    private final View rootView;

    private PfHeytapBusinessWidgetHotzoneLayoutBinding(@NonNull View view, @NonNull HotZoneLayout hotZoneLayout, @NonNull OStoreHeaderView oStoreHeaderView) {
        this.rootView = view;
        this.cvHotZone = hotZoneLayout;
        this.headLayout = oStoreHeaderView;
    }

    @NonNull
    public static PfHeytapBusinessWidgetHotzoneLayoutBinding bind(@NonNull View view) {
        int i = R.id.cv_hot_zone;
        HotZoneLayout hotZoneLayout = (HotZoneLayout) view.findViewById(i);
        if (hotZoneLayout != null) {
            i = R.id.head_layout;
            OStoreHeaderView oStoreHeaderView = (OStoreHeaderView) view.findViewById(i);
            if (oStoreHeaderView != null) {
                return new PfHeytapBusinessWidgetHotzoneLayoutBinding(view, hotZoneLayout, oStoreHeaderView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfHeytapBusinessWidgetHotzoneLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.pf_heytap_business_widget_hotzone_layout, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
