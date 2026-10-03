package com.oplus.aiunit.vision;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class bi2 extends ScaleAnimation {
    public WeakReference<View> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f9758j;
    public final float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f9759l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9760n;

    public bi2(float f, float f2, float f3, float f4) {
        super(f, f2, f, f2, f3, f4);
        this.f9760n = 0;
        this.f9758j = f;
        this.k = f2;
    }

    public final int a(int i, float f) {
        float[] fArr = new float[3];
        ColorUtils.colorToHSL(i, fArr);
        fArr[2] = fArr[2] * f;
        int iHSLToColor = ColorUtils.HSLToColor(fArr);
        return Color.argb(Color.alpha(i), Math.min(255, Color.red(iHSLToColor)), Math.min(255, Color.green(iHSLToColor)), Math.min(255, Color.blue(iHSLToColor)));
    }

    @Override // android.view.animation.ScaleAnimation, android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        int color;
        super.applyTransformation(f, transformation);
        float f2 = this.f9758j;
        this.f9759l = f2 + ((this.k - f2) * f);
        WeakReference<View> weakReference = this.i;
        if (weakReference != null) {
            View view = weakReference.get();
            ColorStateList backgroundTintList = view.getBackgroundTintList();
            if (backgroundTintList != null) {
                color = backgroundTintList.getDefaultColor();
            } else {
                color = view.getBackground() instanceof ColorDrawable ? ((ColorDrawable) view.getBackground()).getColor() : Integer.MIN_VALUE;
            }
            if (color != Integer.MIN_VALUE) {
                float fB = b(f);
                this.m = fB;
                this.f9760n = a(color, fB);
                view.getBackground().setTint(this.f9760n);
            }
        }
    }

    public final float b(float f) {
        float f2 = this.f9758j;
        float f3 = this.k;
        if (f2 > f3) {
            return 1.0f + (f * (-0.19999999f));
        }
        if (f2 < f3) {
            return (f * 0.19999999f) + 0.8f;
        }
        return 1.0f;
    }

    public void c(@NonNull View view) {
        this.i = new WeakReference<>(view);
    }

    @Override // android.view.animation.Animation
    public int getBackgroundColor() {
        return this.f9760n;
    }
}
