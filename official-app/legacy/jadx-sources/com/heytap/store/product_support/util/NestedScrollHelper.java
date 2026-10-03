package com.heytap.store.product_support.util;

import android.animation.ValueAnimator;
import android.view.View;
import com.heytap.nearx.uikit.widget.NearTabLayout;
import com.heytap.store.product_support.util.NestedScrollHelper;
import com.heytap.store.product_support.widget.FlexibleTabView;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0006H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/product_support/util/NestedScrollHelper;", "", "tabLayout", "Lcom/heytap/nearx/uikit/widget/NearTabLayout;", "(Lcom/heytap/nearx/uikit/widget/NearTabLayout;)V", "isTabExpanded", "", "()Z", "setTabExpanded", "(Z)V", "tabFoldEnable", "getTabFoldEnable", "setTabFoldEnable", "getTabLayout", "()Lcom/heytap/nearx/uikit/widget/NearTabLayout;", "setTabLayout", "dealWithChildScrollEvents", "", "scrollTop", ClickApiEntity.SET_PROGRESS, "progress", "", CardAction.LIFE_CIRCLE_VALUE_SHOW, "setTabDesVisible", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NestedScrollHelper {
    private boolean isTabExpanded = true;
    private boolean tabFoldEnable = true;

    @Nullable
    private NearTabLayout tabLayout;

    public NestedScrollHelper(@Nullable NearTabLayout nearTabLayout) {
        this.tabLayout = nearTabLayout;
    }

    private final void setProgress(float progress, boolean show) {
        NearTabLayout.Tab tabAt;
        NearTabLayout nearTabLayout = this.tabLayout;
        int i = 0;
        int tabCount = nearTabLayout == null ? 0 : nearTabLayout.getTabCount();
        if (tabCount < 0) {
            return;
        }
        while (true) {
            int i2 = i + 1;
            NearTabLayout nearTabLayout2 = this.tabLayout;
            View customView = null;
            if (nearTabLayout2 != null && (tabAt = nearTabLayout2.getTabAt(i)) != null) {
                customView = tabAt.getCustomView();
            }
            if (customView instanceof FlexibleTabView) {
                ((FlexibleTabView) customView).changeProgress(progress, show);
            }
            if (i == tabCount) {
                return;
            } else {
                i = i2;
            }
        }
    }

    private final void setTabDesVisible(final boolean show) {
        float f = 1.0f;
        float f2 = 0.0f;
        if (show) {
            f2 = 1.0f;
            f = 0.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f, f2).setDuration(300L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.rmc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NestedScrollHelper.m5080setTabDesVisible$lambda0(this.i, show, valueAnimator);
            }
        });
        duration.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setTabDesVisible$lambda-0, reason: not valid java name */
    public static final void m5080setTabDesVisible$lambda0(NestedScrollHelper this$0, boolean z, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        this$0.setProgress(((Float) animatedValue).floatValue(), z);
    }

    public final void dealWithChildScrollEvents(boolean scrollTop) {
        if (!this.tabFoldEnable) {
            setProgress(1.0f, true);
            return;
        }
        boolean z = this.isTabExpanded;
        if (!z && scrollTop) {
            setTabDesVisible(true);
        } else if (z && !scrollTop) {
            setTabDesVisible(false);
        }
        this.isTabExpanded = scrollTop;
    }

    public final boolean getTabFoldEnable() {
        return this.tabFoldEnable;
    }

    @Nullable
    public final NearTabLayout getTabLayout() {
        return this.tabLayout;
    }

    /* JADX INFO: renamed from: isTabExpanded, reason: from getter */
    public final boolean getIsTabExpanded() {
        return this.isTabExpanded;
    }

    public final void setTabExpanded(boolean z) {
        this.isTabExpanded = z;
    }

    public final void setTabFoldEnable(boolean z) {
        this.tabFoldEnable = z;
    }

    public final void setTabLayout(@Nullable NearTabLayout nearTabLayout) {
        this.tabLayout = nearTabLayout;
    }
}
