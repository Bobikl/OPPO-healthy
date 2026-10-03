package com.oplus.aiunit.vision;

import android.graphics.Path;

/* JADX INFO: loaded from: classes16.dex */
public class w9e {
    public static Path a(float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, boolean z3, boolean z4) {
        Path path = new Path();
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        float f7 = (f3 - f) - (f5 * 2.0f);
        float f8 = (f4 - f2) - (2.0f * f6);
        path.moveTo(f3, f2 + f6);
        if (z2) {
            float f9 = -f6;
            path.rQuadTo(0.0f, f9, -f5, f9);
        } else {
            path.rLineTo(0.0f, -f6);
            path.rLineTo(-f5, 0.0f);
        }
        path.rLineTo(-f7, 0.0f);
        if (z) {
            float f10 = -f5;
            path.rQuadTo(f10, 0.0f, f10, f6);
        } else {
            path.rLineTo(-f5, 0.0f);
            path.rLineTo(0.0f, f6);
        }
        path.rLineTo(0.0f, f8);
        if (z4) {
            path.rQuadTo(0.0f, f6, f5, f6);
        } else {
            path.rLineTo(0.0f, f6);
            path.rLineTo(f5, 0.0f);
        }
        path.rLineTo(f7, 0.0f);
        if (z3) {
            path.rQuadTo(f5, 0.0f, f5, -f6);
        } else {
            path.rLineTo(f5, 0.0f);
            path.rLineTo(0.0f, -f6);
        }
        path.rLineTo(0.0f, -f8);
        path.close();
        return path;
    }
}
