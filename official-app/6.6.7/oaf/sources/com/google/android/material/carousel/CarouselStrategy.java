package com.google.android.material.carousel;

import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.color.utilities.Contrast;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public abstract class CarouselStrategy {
    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public static float getChildMaskPercentage(float f, float f2, float f3) {
        return 1.0f - ((f - f3) / (f2 - f3));
    }

    public boolean isContained() {
        return true;
    }

    public abstract KeylineState onFirstChildMeasuredWithMargins(@NonNull Carousel carousel, @NonNull View view);
}
