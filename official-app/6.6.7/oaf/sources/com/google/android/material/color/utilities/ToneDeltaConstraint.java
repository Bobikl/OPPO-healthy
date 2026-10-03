package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ToneDeltaConstraint {
    public final double delta;
    public final DynamicColor keepAway;
    public final TonePolarity keepAwayPolarity;

    public ToneDeltaConstraint(double d, DynamicColor dynamicColor, TonePolarity tonePolarity) {
        this.delta = d;
        this.keepAway = dynamicColor;
        this.keepAwayPolarity = tonePolarity;
    }
}
