package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class DislikeAnalyzer {
    private DislikeAnalyzer() {
        throw new UnsupportedOperationException();
    }

    public static Hct fixIfDisliked(Hct hct) {
        return isDisliked(hct) ? Hct.from(hct.getHue(), hct.getChroma(), 70.0d) : hct;
    }

    public static boolean isDisliked(Hct hct) {
        return ((((double) Math.round(hct.getHue())) > 90.0d ? 1 : (((double) Math.round(hct.getHue())) == 90.0d ? 0 : -1)) >= 0 && (((double) Math.round(hct.getHue())) > 111.0d ? 1 : (((double) Math.round(hct.getHue())) == 111.0d ? 0 : -1)) <= 0) && ((((double) Math.round(hct.getChroma())) > 16.0d ? 1 : (((double) Math.round(hct.getChroma())) == 16.0d ? 0 : -1)) > 0) && ((((double) Math.round(hct.getTone())) > 65.0d ? 1 : (((double) Math.round(hct.getTone())) == 65.0d ? 0 : -1)) < 0);
    }
}
