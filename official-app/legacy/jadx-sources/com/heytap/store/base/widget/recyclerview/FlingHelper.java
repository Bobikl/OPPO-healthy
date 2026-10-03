package com.heytap.store.base.widget.recyclerview;

import android.content.Context;
import android.view.ViewConfiguration;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/heytap/store/base/widget/recyclerview/FlingHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mPhysicalCoeff", "", "getSplineDeceleration", "", "i", "", "getSplineDecelerationByDistance", "d", "getSplineFlingDistance", "getVelocityByDistance", "Companion", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FlingHelper {
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final float mFlingFriction = ViewConfiguration.getScrollFriction();
    private float mPhysicalCoeff;

    public FlingHelper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mPhysicalCoeff = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
    }

    private final double getSplineDeceleration(int i) {
        return Math.log((Math.abs(i) * 0.35f) / (mFlingFriction * this.mPhysicalCoeff));
    }

    private final double getSplineDecelerationByDistance(double d) {
        float f = DECELERATION_RATE;
        return ((((double) f) - 1.0d) * Math.log(d / ((double) (mFlingFriction * this.mPhysicalCoeff)))) / ((double) f);
    }

    public final double getSplineFlingDistance(int i) {
        double splineDeceleration = getSplineDeceleration(i);
        float f = DECELERATION_RATE;
        return Math.exp(splineDeceleration * (((double) f) / (((double) f) - 1.0d))) * ((double) (mFlingFriction * this.mPhysicalCoeff));
    }

    public final int getVelocityByDistance(double d) {
        return Math.abs((int) (((Math.exp(getSplineDecelerationByDistance(d)) * ((double) mFlingFriction)) * ((double) this.mPhysicalCoeff)) / 0.3499999940395355d));
    }
}
