package com.heytap.store.business.component.utils;

import android.content.Context;
import android.graphics.Color;
import androidx.core.graphics.ColorUtils;
import com.heytap.store.base.widget.recycler.BannerIndicatorView;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0007"}, d2 = {"getIndicatorTraceDotColor", "", "color", "", "getPageIndicatorDotsColor", "setOStoreColor", "Lcom/heytap/store/base/widget/recycler/BannerIndicatorView;", "widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class IndicatorColorUtilKt {
    public static final void getIndicatorTraceDotColor(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
    }

    public static final void getPageIndicatorDotsColor(@NotNull String color) {
        Intrinsics.checkNotNullParameter(color, "color");
    }

    public static final void setOStoreColor(@NotNull BannerIndicatorView bannerIndicatorView, @NotNull String color) {
        Intrinsics.checkNotNullParameter(bannerIndicatorView, "<this>");
        Intrinsics.checkNotNullParameter(color, "color");
        if (color.length() == 0) {
            Context context = bannerIndicatorView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            bannerIndicatorView.setDarkColor(context);
            return;
        }
        try {
            int color2 = Color.parseColor(color);
            int alphaComponent = ColorUtils.setAlphaComponent(Color.parseColor(color), 140);
            bannerIndicatorView.setTraceDotColor(color2);
            bannerIndicatorView.setPageIndicatorDotsColor(alphaComponent);
        } catch (Exception unused) {
            Context context2 = bannerIndicatorView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            bannerIndicatorView.setDarkColor(context2);
        }
    }
}
