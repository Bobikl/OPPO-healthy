package com.omron;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes5.dex */
public class ck extends by {
    private String d;

    public ck() {
        this(1, 9, null);
    }

    private void a(byte[] bArr) {
        if (bArr == null || bArr.length < 1) {
            return;
        }
        try {
            this.d = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
    }

    public String d() {
        return this.d;
    }

    public boolean e() {
        return c() == 8;
    }

    @Override // com.omron.by
    public String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = e() ? "SHORTENED" : "COMPLETE";
        objArr[1] = this.d;
        return String.format("LocalName(%s,%s)", objArr);
    }

    public ck(int i, int i2, byte[] bArr) {
        super(i, i2, bArr);
        a(bArr);
    }
}
