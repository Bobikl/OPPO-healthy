package com.oplus.aiunit.vision;

import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes13.dex */
public class mn2 implements Checksum {
    public static final int[] b = {0, 52225, 55297, k18.GL_BYTE, 61441, 15360, 10240, 58369, 40961, 27648, 30720, 46081, 20480, 39937, k18.GL_STENCIL_BACK_FAIL, 17408};
    public int a;

    public mn2() {
        reset();
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        return this.a;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        this.a = 0;
    }

    @Override // java.util.zip.Checksum
    public void update(int i) {
        int[] iArr = b;
        int i2 = this.a;
        int i3 = (((i2 >> 4) & 4095) ^ iArr[i2 & 15]) ^ iArr[i & 15];
        int i4 = iArr[i3 & 15];
        this.a = iArr[(i >> 4) & 15] ^ (((i3 >> 4) & 4095) ^ i4);
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        while (i < i2) {
            update(bArr[i]);
            i++;
        }
    }
}
