package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.base.widget.recycler.BannerIndicatorView;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.view.OStoreHeaderView;
import com.heytap.store.business.component.widget.OStoreGestureSolveRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetBannerLayoutBinding implements ViewBinding {

    @NonNull
    public final OStoreHeaderView headLayout;

    @NonNull
    private final View rootView;

    @NonNull
    public final ImageView storeBannerBackground;

    @NonNull
    public final BannerIndicatorView storeBannerIndicator;

    @NonNull
    public final OStoreGestureSolveRecyclerView storeBannerRv;

    private PfHeytapBusinessWidgetBannerLayoutBinding(@NonNull View view, @NonNull OStoreHeaderView oStoreHeaderView, @NonNull ImageView imageView, @NonNull BannerIndicatorView bannerIndicatorView, @NonNull OStoreGestureSolveRecyclerView oStoreGestureSolveRecyclerView) {
        this.rootView = view;
        this.headLayout = oStoreHeaderView;
        this.storeBannerBackground = imageView;
        this.storeBannerIndicator = bannerIndicatorView;
        this.storeBannerRv = oStoreGestureSolveRecyclerView;
    }

    @NonNull
    public static PfHeytapBusinessWidgetBannerLayoutBinding bind(@NonNull View view) {
        int i = R.id.head_layout;
        OStoreHeaderView oStoreHeaderView = (OStoreHeaderView) view.findViewById(i);
        if (oStoreHeaderView != null) {
            i = R.id.store_banner_background;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R.id.store_banner_indicator;
                BannerIndicatorView bannerIndicatorView = (BannerIndicatorView) view.findViewById(i);
                if (bannerIndicatorView != null) {
                    i = R.id.store_banner_rv;
                    OStoreGestureSolveRecyclerView oStoreGestureSolveRecyclerView = (OStoreGestureSolveRecyclerView) view.findViewById(i);
                    if (oStoreGestureSolveRecyclerView != null) {
                        return new PfHeytapBusinessWidgetBannerLayoutBinding(view, oStoreHeaderView, imageView, bannerIndicatorView, oStoreGestureSolveRecyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfHeytapBusinessWidgetBannerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.pf_heytap_business_widget_banner_layout, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
