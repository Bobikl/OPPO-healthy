package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class f6g extends yma implements m7m {
    public f6g(int i) {
        super(y(i));
    }

    public static int y(int i) {
        if (i == 128 || i == 256) {
            return i;
        }
        throw new IllegalArgumentException("'bitLength' " + i + " not supported for SHAKE");
    }

    @Override // com.oplus.aiunit.vision.ns5
    public int a(byte[] bArr, int i) {
        return e(bArr, i, f());
    }

    @Override // com.oplus.aiunit.vision.ns5
    public String c() {
        return "SHAKE" + this.f19067e;
    }

    @Override // com.oplus.aiunit.vision.m7m
    public int e(byte[] bArr, int i, int i2) {
        int iZ = z(bArr, i, i2);
        reset();
        return iZ;
    }

    public int z(byte[] bArr, int i, int i2) {
        if (!this.f) {
            l(15, 4);
        }
        w(bArr, i, ((long) i2) * 8);
        return i2;
    }
}
