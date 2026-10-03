package com.oplus.aiunit.vision;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.MainThread;

/* JADX INFO: loaded from: classes13.dex */
@MainThread
public class sk2 {
    public Path a;

    public static final class b {
        public static final sk2 a = new sk2();
    }

    public static sk2 a() {
        return b.a;
    }

    public Path b(float f, float f2, float f3, float f4, float f5) {
        return d(new RectF(f, f2, f3, f4), f5);
    }

    public Path c(Rect rect, float f) {
        return d(new RectF(rect), f);
    }

    public Path d(RectF rectF, float f) {
        return xl2.a(this.a, rectF, f);
    }

    public sk2() {
        this.a = new Path();
    }
}
