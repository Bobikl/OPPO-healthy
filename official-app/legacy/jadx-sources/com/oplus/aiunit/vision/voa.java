package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public final class voa {
    public final ns5 a;
    public final int b;

    public voa(ns5 ns5Var, int i) {
        if (ns5Var == null) {
            throw new NullPointerException("digest == null");
        }
        this.a = ns5Var;
        this.b = i;
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.b;
        if (length != i) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == i) {
            return d(0, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.b;
        if (length != i) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == i * 2) {
            return d(1, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    public byte[] c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.b) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == 32) {
            return d(3, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong address length");
    }

    public final byte[] d(int i, byte[] bArr, byte[] bArr2) {
        byte[] bArrP = x6m.p(i, this.b);
        this.a.update(bArrP, 0, bArrP.length);
        this.a.update(bArr, 0, bArr.length);
        this.a.update(bArr2, 0, bArr2.length);
        int i2 = this.b;
        byte[] bArr3 = new byte[i2];
        ns5 ns5Var = this.a;
        if (ns5Var instanceof m7m) {
            ((m7m) ns5Var).e(bArr3, 0, i2);
        } else {
            ns5Var.a(bArr3, 0);
        }
        return bArr3;
    }
}
