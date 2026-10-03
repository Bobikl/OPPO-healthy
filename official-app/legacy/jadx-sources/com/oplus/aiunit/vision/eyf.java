package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes13.dex */
public class eyf extends Drawable {
    public static final double a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - a) * ((double) f2))) : f;
    }

    public static float b(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - a) * ((double) f2))) : f * 1.5f;
    }
}
