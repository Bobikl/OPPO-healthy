package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.view.OStoreHeaderView;
import com.heytap.store.business.component.widget.OStoreGestureSolveRecyclerView;
import com.heytap.store.business.component.widget.OStoreScrollIndicatorView;

/* JADX INFO: loaded from: classes4.dex */
public final class PfBusinessWidgetLanternScrollstyleLayoutBinding implements ViewBinding {

    @NonNull
    public final OStoreScrollIndicatorView cvOstoreView;

    @NonNull
    public final FrameLayout flScrollRecycler;

    @NonNull
    public final OStoreGestureSolveRecyclerView recycler;

    @NonNull
    private final View rootView;

    @NonNull
    public final ImageView storeNavigationBg;

    @NonNull
    public final OStoreHeaderView storeNavigationHeader;

    @NonNull
    public final ConstraintLayout storePagingNavigation;

    private PfBusinessWidgetLanternScrollstyleLayoutBinding(@NonNull View view, @NonNull OStoreScrollIndicatorView oStoreScrollIndicatorView, @NonNull FrameLayout frameLayout, @NonNull OStoreGestureSolveRecyclerView oStoreGestureSolveRecyclerView, @NonNull ImageView imageView, @NonNull OStoreHeaderView oStoreHeaderView, @NonNull ConstraintLayout constraintLayout) {
        this.rootView = view;
        this.cvOstoreView = oStoreScrollIndicatorView;
        this.flScrollRecycler = frameLayout;
        this.recycler = oStoreGestureSolveRecyclerView;
        this.storeNavigationBg = imageView;
        this.storeNavigationHeader = oStoreHeaderView;
        this.storePagingNavigation = constraintLayout;
    }

    @NonNull
    public static PfBusinessWidgetLanternScrollstyleLayoutBinding bind(@NonNull View view) {
        int i = R.id.cv_ostoreView;
        OStoreScrollIndicatorView oStoreScrollIndicatorView = (OStoreScrollIndicatorView) view.findViewById(i);
        if (oStoreScrollIndicatorView != null) {
            i = R.id.fl_scroll_recycler;
            FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
            if (frameLayout != null) {
                i = R.id.recycler;
                OStoreGestureSolveRecyclerView oStoreGestureSolveRecyclerView = (OStoreGestureSolveRecyclerView) view.findViewById(i);
                if (oStoreGestureSolveRecyclerView != null) {
                    i = R.id.store_navigation_bg;
                    ImageView imageView = (ImageView) view.findViewById(i);
                    if (imageView != null) {
                        i = R.id.store_navigation_header;
                        OStoreHeaderView oStoreHeaderView = (OStoreHeaderView) view.findViewById(i);
                        if (oStoreHeaderView != null) {
                            i = R.id.store_paging_navigation;
                            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
                            if (constraintLayout != null) {
                                return new PfBusinessWidgetLanternScrollstyleLayoutBinding(view, oStoreScrollIndicatorView, frameLayout, oStoreGestureSolveRecyclerView, imageView, oStoreHeaderView, constraintLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfBusinessWidgetLanternScrollstyleLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.pf_business_widget_lantern_scrollstyle_layout, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
