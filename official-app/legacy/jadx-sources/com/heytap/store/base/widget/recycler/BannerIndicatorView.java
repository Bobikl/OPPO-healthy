package com.heytap.store.base.widget.recycler;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import androidx.viewpager2.widget.ViewPager2;
import com.heytap.nearx.uikit.widget.indicator.NearPageIndicatorKit;
import com.heytap.store.base.widget.R;
import com.heytap.store.base.widget.banner.Banner;
import com.heytap.store.base.widget.banner.listener.OnPageChangeListener;
import com.oplus.aiunit.vision.vhc;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0015"}, d2 = {"Lcom/heytap/store/base/widget/recycler/BannerIndicatorView;", "Lcom/heytap/nearx/uikit/widget/indicator/NearPageIndicatorKit;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bindBanner", "", "banner", "Lcom/heytap/store/base/widget/banner/Banner;", "bindRecyclerView", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "realCount", "", "bindViewPager2", "viewpager", "Landroidx/viewpager2/widget/ViewPager2;", "setDarkColor", "setLightColor", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class BannerIndicatorView extends NearPageIndicatorKit {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerIndicatorView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
    }

    public final void bindBanner(@NotNull Banner<?, ?> banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        if (banner.getRealCount() < 2) {
            return;
        }
        setDotsCount(banner.getRealCount());
        banner.addOnPageChangeListener(new OnPageChangeListener() { // from class: com.heytap.store.base.widget.recycler.BannerIndicatorView.bindBanner.1
            @Override // com.heytap.store.base.widget.banner.listener.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
                BannerIndicatorView.this.onPageScrollStateChanged(state);
            }

            @Override // com.heytap.store.base.widget.banner.listener.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                BannerIndicatorView.this.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override // com.heytap.store.base.widget.banner.listener.OnPageChangeListener
            public void onPageSelected(int position) {
                BannerIndicatorView.this.onPageSelected(position);
            }
        });
    }

    public final void bindRecyclerView(@NotNull RecyclerView rv) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        RecyclerView.LayoutManager layoutManager = rv.getLayoutManager();
        final BannerLayoutManager bannerLayoutManager = layoutManager instanceof BannerLayoutManager ? (BannerLayoutManager) layoutManager : null;
        if (bannerLayoutManager != null && bannerLayoutManager.getRealCount() >= 2) {
            setDotsCount(bannerLayoutManager.getRealCount());
            SnapHelper snapHelper = bannerLayoutManager.getSnapHelper();
            Intrinsics.checkNotNull(snapHelper);
            rv.addOnScrollListener(new SnapOnScrollListener(snapHelper, SnapOnScrollListener.Behavior.NOTIFY_ON_SCROLL, new OnSnapPositionChangeListener() { // from class: com.heytap.store.base.widget.recycler.BannerIndicatorView$bindRecyclerView$1$1
                @Override // com.heytap.store.base.widget.recycler.OnSnapPositionChangeListener
                public void onSnapPositionChange(int position) {
                    if (bannerLayoutManager.getRealCount() != 0) {
                        position %= bannerLayoutManager.getRealCount();
                    }
                    this.setCurrentPosition(position);
                }
            }));
        }
    }

    public final void bindViewPager2(@NotNull ViewPager2 viewpager) {
        Intrinsics.checkNotNullParameter(viewpager, "viewpager");
        RecyclerView.Adapter adapter = viewpager.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (itemCount < 2) {
                return;
            } else {
                setDotsCount(itemCount);
            }
        }
        viewpager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.heytap.store.base.widget.recycler.BannerIndicatorView.bindViewPager2.2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrollStateChanged(int state) {
                BannerIndicatorView.this.onPageScrollStateChanged(state);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                BannerIndicatorView.this.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                BannerIndicatorView.this.onPageSelected(position);
            }
        });
    }

    public final void setDarkColor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (vhc.a(context)) {
            setLightColor(context);
        } else {
            setTraceDotColor(ContextCompat.getColor(context, R.color.widget_base_indicator_default_select_color));
            setPageIndicatorDotsColor(ContextCompat.getColor(context, R.color.widget_base_indicator_default_unselect_color));
        }
    }

    public final void setLightColor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        setTraceDotColor(ContextCompat.getColor(context, R.color.widget_base_indicator_default_night_select_color));
        setPageIndicatorDotsColor(ContextCompat.getColor(context, R.color.widget_base_indicator_default_night_unselect_color));
    }

    public final void bindRecyclerView(@NotNull RecyclerView rv, final int realCount) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        RecyclerView.LayoutManager layoutManager = rv.getLayoutManager();
        BannerLayoutManager bannerLayoutManager = layoutManager instanceof BannerLayoutManager ? (BannerLayoutManager) layoutManager : null;
        if (bannerLayoutManager != null && realCount >= 2) {
            setDotsCount(realCount);
            SnapHelper snapHelper = bannerLayoutManager.getSnapHelper();
            Intrinsics.checkNotNull(snapHelper);
            rv.addOnScrollListener(new SnapOnScrollListener(snapHelper, SnapOnScrollListener.Behavior.NOTIFY_ON_SCROLL, new OnSnapPositionChangeListener() { // from class: com.heytap.store.base.widget.recycler.BannerIndicatorView$bindRecyclerView$2$1
                @Override // com.heytap.store.base.widget.recycler.OnSnapPositionChangeListener
                public void onSnapPositionChange(int position) {
                    int i = realCount;
                    if (i != 0) {
                        position %= i;
                    }
                    this.setCurrentPosition(position);
                }
            }));
        }
    }
}
