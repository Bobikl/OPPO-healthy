package com.heytap.store.homemodule.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.heytap.store.business.rn.service.RnConstant;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/homemodule/widget/FadePagerTransformer;", "Landroidx/viewpager2/widget/ViewPager2$PageTransformer;", "orientation", "", "(I)V", "getOrientation", "()I", "setOrientation", "transformPage", "", RnConstant.KEY_PAGE, "Landroid/view/View;", "position", "", "Companion", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FadePagerTransformer implements ViewPager2.PageTransformer {
    public static final float MIN_ALPHA = 0.0f;
    private int orientation;

    public FadePagerTransformer() {
        this(0, 1, null);
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final void setOrientation(int i) {
        this.orientation = i;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@NotNull View page, float position) {
        Intrinsics.checkNotNullParameter(page, "page");
        int width = this.orientation == 0 ? page.getWidth() : page.getHeight();
        if (position < -1.0f) {
            page.setAlpha(0.0f);
            return;
        }
        if (position > 1.0f) {
            page.setAlpha(0.0f);
            return;
        }
        if (position < 0.0f) {
            if (this.orientation == 1) {
                page.setTranslationY((-width) * position);
            } else {
                page.setTranslationX((-width) * position);
            }
        } else if (this.orientation == 1) {
            page.setTranslationY((-width) * position);
        } else {
            page.setTranslationX((-width) * position);
        }
        page.setAlpha(RangesKt___RangesKt.coerceAtLeast(0.0f, 1 - Math.abs(position)));
    }

    public FadePagerTransformer(int i) {
        this.orientation = i;
    }

    public /* synthetic */ FadePagerTransformer(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
