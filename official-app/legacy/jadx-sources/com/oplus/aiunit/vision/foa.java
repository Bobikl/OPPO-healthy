package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes12.dex */
public class foa implements fb3 {
    public byte[] a;

    public foa(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.a;
    }

    public foa(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.a = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
