package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public class nn2 {
    public static final int[] a = {0, 52225, 55297, k18.GL_BYTE, 61441, 15360, 10240, 58369, 40961, 27648, 30720, 46081, 20480, 39937, k18.GL_STENCIL_BACK_FAIL, 17408};

    public static final int a(int i, byte b) {
        int[] iArr = a;
        int i2 = (((i >> 4) & 4095) ^ iArr[i & 15]) ^ iArr[b & 15];
        return (((i2 >> 4) & 4095) ^ iArr[i2 & 15]) ^ iArr[(b >> 4) & 15];
    }
}
