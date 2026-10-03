package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public final class h5l {
    public final byte[][] a;

    public h5l(g5l g5lVar, byte[][] bArr) {
        if (g5lVar == null) {
            throw new NullPointerException("params == null");
        }
        if (bArr == null) {
            throw new NullPointerException("publicKey == null");
        }
        if (x6m.k(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != g5lVar.c()) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != g5lVar.b()) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.a = x6m.d(bArr);
    }

    public byte[][] a() {
        return x6m.d(this.a);
    }
}
