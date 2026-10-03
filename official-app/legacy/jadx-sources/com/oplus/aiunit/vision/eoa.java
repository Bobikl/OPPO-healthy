package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class eoa implements eb3 {
    public byte[] i;

    public eoa(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public byte[] a() {
        return this.i;
    }

    public eoa(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.i = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }
}
