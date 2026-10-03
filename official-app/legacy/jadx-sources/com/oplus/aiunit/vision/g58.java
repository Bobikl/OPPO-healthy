package com.oplus.aiunit.vision;

import com.badlogic.gdx.math.Vector2;

/* JADX INFO: loaded from: classes13.dex */
public final class g58 {
    public static final Vector2 a = new Vector2();
    public static final Vector2 b = new Vector2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Vector2 f11637c = new Vector2();

    public static boolean a(float[] fArr, int i, int i2) {
        if (i2 <= 2) {
            return false;
        }
        int i3 = (i2 + i) - 2;
        float f = fArr[i3];
        float f2 = fArr[i3 + 1];
        float f3 = 0.0f;
        while (i <= i3) {
            float f4 = fArr[i];
            float f5 = fArr[i + 1];
            f3 += (f * f5) - (f2 * f4);
            i += 2;
            f = f4;
            f2 = f5;
        }
        return f3 < 0.0f;
    }
}
