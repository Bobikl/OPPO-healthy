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
import com.heytap.store.business.component.widget.banner.OStoreBannerView;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetCommunityBannerLayoutBinding implements ViewBinding {

    @NonNull
    public final OStoreHeaderView headLayout;

    @NonNull
    private final View rootView;

    @NonNull
    public final ImageView storeBannerBackground;

    @NonNull
    public final BannerIndicatorView storeBannerIndicator;

    @NonNull
    public final OStoreBannerView storeBannerViewpager;

    private PfHeytapBusinessWidgetCommunityBannerLayoutBinding(@NonNull View view, @NonNull OStoreHeaderView oStoreHeaderView, @NonNull ImageView imageView, @NonNull BannerIndicatorView bannerIndicatorView, @NonNull OStoreBannerView oStoreBannerView) {
        this.rootView = view;
        this.headLayout = oStoreHeaderView;
        this.storeBannerBackground = imageView;
        this.storeBannerIndicator = bannerIndicatorView;
        this.storeBannerViewpager = oStoreBannerView;
    }

    @NonNull
    public static PfHeytapBusinessWidgetCommunityBannerLayoutBinding bind(@NonNull View view) {
        int i = R.id.head_layout;
        OStoreHeaderView oStoreHeaderView = (OStoreHeaderView) view.findViewById(i);
        if (oStoreHeaderView != null) {
            i = R.id.store_banner_background;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R.id.store_banner_indicator;
                BannerIndicatorView bannerIndicatorView = (BannerIndicatorView) view.findViewById(i);
                if (bannerIndicatorView != null) {
                    i = R.id.store_banner_viewpager;
                    OStoreBannerView oStoreBannerView = (OStoreBannerView) view.findViewById(i);
                    if (oStoreBannerView != null) {
                        return new PfHeytapBusinessWidgetCommunityBannerLayoutBinding(view, oStoreHeaderView, imageView, bannerIndicatorView, oStoreBannerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfHeytapBusinessWidgetCommunityBannerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.pf_heytap_business_widget_community_banner_layout, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
