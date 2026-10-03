package com.oplus.aiunit.vision;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

/* JADX INFO: loaded from: classes13.dex */
public class af2 {
    public static final Interpolator LINEAR_INTERPOLATOR = new vi2();
    public static final Interpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new FastOutSlowInInterpolator();
    public static final Interpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new FastOutLinearInInterpolator();
    public static final Interpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new LinearOutSlowInInterpolator();
    public static final Interpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static int a(int i, int i2, float f) {
        return i + Math.round(f * (i2 - i));
    }
}
