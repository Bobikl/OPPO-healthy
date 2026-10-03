package com.omron;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class ci extends bs {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private UUID f8866e;
    private int f;
    private int g;
    private int h;

    public ci(int i, int i2, byte[] bArr, int i3) {
        super(i, i2, bArr, i3);
        e(bArr);
    }

    private int a(byte[] bArr) {
        return cv.b(bArr, 20);
    }

    private int b(byte[] bArr) {
        return cv.b(bArr, 22);
    }

    private int c(byte[] bArr) {
        return bArr[24];
    }

    private UUID d(byte[] bArr) {
        return cw.a(bArr, 4, false);
    }

    private void e(byte[] bArr) {
        if (bArr == null || bArr.length < 25) {
            throw new IllegalArgumentException("The byte sequence cannot be parsed as an iBeacon.");
        }
        this.f8866e = d(bArr);
        this.f = a(bArr);
        this.g = b(bArr);
        this.h = c(bArr);
    }

    @Override // com.omron.bs, com.omron.by
    public String toString() {
        return String.format("iBeacon(UUID=%s,Major=%d,Minor=%d,Power=%d)", this.f8866e, Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h));
    }

    public static ci a(int i, int i2, byte[] bArr, int i3) {
        if (bArr == null || bArr.length < 25) {
            return null;
        }
        return new ci(i, i2, bArr, i3);
    }
}
