package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.base.widget.banner.Banner;
import com.heytap.store.base.widget.recycler.BannerIndicatorView;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.view.OStoreHeaderView;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetBannerViewpagerLayoutBinding implements ViewBinding {

    @NonNull
    public final OStoreHeaderView headLayout;

    @NonNull
    private final View rootView;

    @NonNull
    public final ImageView storeBannerBackground;

    @NonNull
    public final BannerIndicatorView storeBannerIndicator;

    @NonNull
    public final Banner storeBannerViewpager;

    private PfHeytapBusinessWidgetBannerViewpagerLayoutBinding(@NonNull View view, @NonNull OStoreHeaderView oStoreHeaderView, @NonNull ImageView imageView, @NonNull BannerIndicatorView bannerIndicatorView, @NonNull Banner banner) {
        this.rootView = view;
        this.headLayout = oStoreHeaderView;
        this.storeBannerBackground = imageView;
        this.storeBannerIndicator = bannerIndicatorView;
        this.storeBannerViewpager = banner;
    }

    @NonNull
    public static PfHeytapBusinessWidgetBannerViewpagerLayoutBinding bind(@NonNull View view) {
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
                    Banner banner = (Banner) view.findViewById(i);
                    if (banner != null) {
                        return new PfHeytapBusinessWidgetBannerViewpagerLayoutBinding(view, oStoreHeaderView, imageView, bannerIndicatorView, banner);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfHeytapBusinessWidgetBannerViewpagerLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.pf_heytap_business_widget_banner_viewpager_layout, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
