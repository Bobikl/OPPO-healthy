package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public final class rzc {
    public static int a(float f) {
        return Float.floatToIntBits(f);
    }

    public static int b(float f) {
        return Float.floatToRawIntBits(f);
    }

    public static float c(int i) {
        return Float.intBitsToFloat(i & (-16777217));
    }
}
