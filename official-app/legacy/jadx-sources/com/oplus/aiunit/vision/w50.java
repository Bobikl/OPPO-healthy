package com.oplus.aiunit.vision;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0017\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/w50;", "", "", "startValue", "endValue", "", "fraction", "b", "Landroid/view/animation/Interpolator;", "a", "Landroid/view/animation/Interpolator;", "getLINEAR_INTERPOLATOR", "()Landroid/view/animation/Interpolator;", "LINEAR_INTERPOLATOR", "FAST_OUT_SLOW_IN_INTERPOLATOR", "c", "getFAST_OUT_LINEAR_IN_INTERPOLATOR", "FAST_OUT_LINEAR_IN_INTERPOLATOR", "d", "getLINEAR_OUT_SLOW_IN_INTERPOLATOR", "LINEAR_OUT_SLOW_IN_INTERPOLATOR", MapSchema.FIELD_NAME_ENTRY, "getDECELERATE_INTERPOLATOR", "DECELERATE_INTERPOLATOR", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class w50 {

    @NotNull
    public static final w50 INSTANCE = new w50();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Interpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new FastOutSlowInInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Interpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new FastOutLinearInInterpolator();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Interpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new LinearOutSlowInInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Interpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    @NotNull
    public final Interpolator a() {
        return FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public final int b(int startValue, int endValue, float fraction) {
        return startValue + Math.round(fraction * (endValue - startValue));
    }
}
