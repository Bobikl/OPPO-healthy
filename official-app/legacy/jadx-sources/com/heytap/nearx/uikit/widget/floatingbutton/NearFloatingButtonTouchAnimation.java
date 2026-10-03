package com.heytap.nearx.uikit.widget.floatingbutton;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public class NearFloatingButtonTouchAnimation extends ScaleAnimation {
    private static final int COLOR_HSL_ARRAY_SIZE = 3;
    private static final int COLOR_RGB_MAX_VALUE = 255;
    private static final float DEFAULT_PRESS_FEEDBACK_BRIGHTNESS_MAX_VALUE = 1.0f;
    private static final float DEFAULT_PRESS_FEEDBACK_BRIGHTNESS_MIN_VALUE = 0.8f;
    private int mBackgroundColor;
    private float mBrightnessValue;
    private final float mEndValue;
    private float mScaleValue;
    private final float mStartValue;
    private WeakReference<View> mTargetView;

    public NearFloatingButtonTouchAnimation(float f, float f2, float f3, float f4) {
        super(f, f2, f, f2, f3, f4);
        this.mBackgroundColor = 0;
        this.mStartValue = f;
        this.mEndValue = f2;
    }

    private int getBrightnessColor(int i, float f) {
        float[] fArr = new float[3];
        ColorUtils.colorToHSL(i, fArr);
        fArr[2] = fArr[2] * f;
        int iHSLToColor = ColorUtils.HSLToColor(fArr);
        return Color.argb(Color.alpha(iHSLToColor), Math.min(255, Color.red(iHSLToColor)), Math.min(255, Color.green(iHSLToColor)), Math.min(255, Color.blue(iHSLToColor)));
    }

    private float getBrightnessValue(float f) {
        float f2 = this.mStartValue;
        float f3 = this.mEndValue;
        if (f2 > f3) {
            return 1.0f + (f * (-0.19999999f));
        }
        if (f2 < f3) {
            return (f * 0.19999999f) + 0.8f;
        }
        return 1.0f;
    }

    @Override // android.view.animation.ScaleAnimation, android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        int color;
        super.applyTransformation(f, transformation);
        float f2 = this.mStartValue;
        this.mScaleValue = f2 + ((this.mEndValue - f2) * f);
        WeakReference<View> weakReference = this.mTargetView;
        if (weakReference != null) {
            View view = weakReference.get();
            ColorStateList backgroundTintList = view.getBackgroundTintList();
            if (backgroundTintList != null) {
                color = backgroundTintList.getDefaultColor();
            } else {
                color = view.getBackground() instanceof ColorDrawable ? ((ColorDrawable) view.getBackground()).getColor() : Integer.MIN_VALUE;
            }
            if (color != Integer.MIN_VALUE) {
                float brightnessValue = getBrightnessValue(f);
                this.mBrightnessValue = brightnessValue;
                this.mBackgroundColor = getBrightnessColor(color, brightnessValue);
                view.getBackground().setTint(this.mBackgroundColor);
            }
        }
    }

    @Override // android.view.animation.Animation
    public int getBackgroundColor() {
        return this.mBackgroundColor;
    }

    public float getScaleValue() {
        return this.mScaleValue;
    }

    public void setTargetView(@NonNull View view) {
        this.mTargetView = new WeakReference<>(view);
    }

    public float getBrightnessValue() {
        return this.mBrightnessValue;
    }
}
