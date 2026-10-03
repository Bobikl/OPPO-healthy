package com.omron;

/* JADX INFO: loaded from: classes5.dex */
public class cc extends ca {
    private final int f;
    private transient byte[] g;
    private transient String h;
    private transient String i;

    public cc(int i, int i2, byte[] bArr) {
        super(i, i2, bArr, ca.a.EID);
        this.f = a(bArr);
    }

    private int a(byte[] bArr) {
        if (4 <= bArr.length) {
            return bArr[3];
        }
        return 0;
    }

    public byte[] d() {
        if (this.g == null) {
            this.g = cv.a(a(), 4, 12);
        }
        return this.g;
    }

    public String e() {
        if (this.h == null) {
            this.h = cv.a(d(), true);
        }
        return this.h;
    }

    @Override // com.omron.cq, com.omron.by
    public String toString() {
        if (this.i == null) {
            this.i = String.format("EddyStoneEID(TxPower=%d,EID=%s)", Integer.valueOf(this.f), e());
        }
        return this.i;
    }
}
