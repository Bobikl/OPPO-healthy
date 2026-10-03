package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.view.OStoreHeaderView;
import com.heytap.store.business.component.widget.OStoreGestureSolveRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetLayoutTypePicUpNotWhiteBackLargeScreenBinding implements ViewBinding {

    @NonNull
    private final View rootView;

    @NonNull
    public final ImageView storeNavigationBg;

    @NonNull
    public final OStoreHeaderView storeNavigationHeader;

    @NonNull
    public final OStoreGestureSolveRecyclerView storeNavigationRv;

    @NonNull
    public final ConstraintLayout storePagingNavigation;

    private PfHeytapBusinessWidgetLayoutTypePicUpNotWhiteBackLargeScreenBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull OStoreHeaderView oStoreHeaderView, @NonNull OStoreGestureSolveRecyclerView oStoreGestureSolveRecyclerView, @NonNull ConstraintLayout constraintLayout) {
        this.rootView = view;
        this.storeNavigationBg = imageView;
        this.storeNavigationHeader = oStoreHeaderView;
        this.storeNavigationRv = oStoreGestureSolveRecyclerView;
        this.storePagingNavigation = constraintLayout;
    }

    @NonNull
    public static PfHeytapBusinessWidgetLayoutTypePicUpNotWhiteBackLargeScreenBinding bind(@NonNull View view) {
        int i = R.id.store_navigation_bg;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.store_navigation_header;
            OStoreHeaderView oStoreHeaderView = (OStoreHeaderView) view.findViewById(i);
            if (oStoreHeaderView != null) {
                i = R.id.store_navigation_rv;
                OStoreGestureSolveRecyclerView oStoreGestureSolveRecyclerView = (OStoreGestureSolveRecyclerView) view.findViewById(i);
                if (oStoreGestureSolveRecyclerView != null) {
                    i = R.id.store_paging_navigation;
                    ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
                    if (constraintLayout != null) {
                        return new PfHeytapBusinessWidgetLayoutTypePicUpNotWhiteBackLargeScreenBinding(view, imageView, oStoreHeaderView, oStoreGestureSolveRecyclerView, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfHeytapBusinessWidgetLayoutTypePicUpNotWhiteBackLargeScreenBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.pf_heytap_business_widget_layout_type_pic_up_not_white_back_large_screen, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
