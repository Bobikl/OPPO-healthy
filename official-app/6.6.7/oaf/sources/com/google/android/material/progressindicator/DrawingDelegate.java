package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {
    protected DrawableWithAnimatedVisibilityChange drawable;
    S spec;

    public DrawingDelegate(S s) {
        this.spec = s;
    }

    public abstract void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f);

    public abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f, @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f2, @ColorInt int i);

    public abstract void fillTrack(@NonNull Canvas canvas, @NonNull Paint paint);

    public abstract int getPreferredHeight();

    public abstract int getPreferredWidth();

    public void registerDrawable(@NonNull DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        this.drawable = drawableWithAnimatedVisibilityChange;
    }

    public void validateSpecAndAdjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f) {
        this.spec.validateSpec();
        adjustCanvas(canvas, rect, f);
    }
}
