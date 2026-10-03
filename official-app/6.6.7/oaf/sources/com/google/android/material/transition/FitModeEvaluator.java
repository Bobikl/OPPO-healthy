package com.google.android.material.transition;

import android.graphics.RectF;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
interface FitModeEvaluator {
    void applyMask(RectF rectF, float f, FitModeResult fitModeResult);

    FitModeResult evaluate(float f, float f2, float f3, float f4, float f5, float f6, float f7);

    boolean shouldMaskStartBounds(FitModeResult fitModeResult);
}
