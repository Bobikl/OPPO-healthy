package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes16.dex */
public class wq7 {
    public DisplayMetrics a;
    public final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f18365c;
    public float d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18366e;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 1.0f;

    public wq7(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.a = displayMetrics;
        float f = (float) (((double) displayMetrics.xdpi) / 25.4d);
        this.b = f;
        float f2 = (float) (((double) displayMetrics.ydpi) / 25.4d);
        this.f18365c = f2;
        this.d = f;
        this.f18366e = f2;
    }

    public float a(float f, float f2, boolean z) {
        float fAbs;
        float fC;
        if (z) {
            fAbs = Math.abs(f2 - f);
            fC = b();
        } else {
            fAbs = Math.abs(f2 - f);
            fC = c();
        }
        return fAbs * fC;
    }

    public float b() {
        return this.d;
    }

    public float c() {
        return this.f18366e;
    }

    public void d(float f, float f2, float[] fArr, float[] fArr2) {
        for (int i = 1; i < fArr.length; i += 2) {
            fArr[i] = f - ((fArr[i] - f2) * this.f18366e);
        }
        for (int i2 = 0; i2 < fArr2.length; i2 += 2) {
            float f3 = fArr2[i2];
            if (f3 == 0.0f) {
                return;
            }
            fArr[i2] = f3;
        }
    }
}
