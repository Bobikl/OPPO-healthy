package com.omron;

import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class cw {
    private static UUID a(int i, int i2, int i3, int i4) {
        return UUID.fromString(String.format("%02x%02x%02x%02x-0000-1000-8000-00805f9b34fb", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    public static UUID b(byte[] bArr) {
        return b(bArr, 0);
    }

    public static UUID c(byte[] bArr) {
        return c(bArr, 0);
    }

    public static UUID a(byte[] bArr) {
        return a(bArr, 0);
    }

    public static UUID b(byte[] bArr, int i) {
        return b(bArr, i, true);
    }

    public static UUID c(byte[] bArr, int i) {
        return c(bArr, i, true);
    }

    public static UUID a(byte[] bArr, int i) {
        return a(bArr, i, true);
    }

    public static UUID b(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        byte b;
        if (bArr == null || i < 0 || bArr.length <= (i2 = i + 1) || Integer.MAX_VALUE == i) {
            return null;
        }
        if (z) {
            i3 = bArr[i2] & 255;
            b = bArr[i + 0];
        } else {
            i3 = bArr[i + 0] & 255;
            b = bArr[i2];
        }
        return a(0, 0, i3, b & 255);
    }

    public static UUID c(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (bArr == null || i < 0 || bArr.length <= (i2 = i + 3) || 2147483644 < i) {
            return null;
        }
        if (z) {
            i3 = bArr[i2] & 255;
            i4 = bArr[i + 2] & 255;
            i6 = bArr[i + 1] & 255;
            i5 = bArr[i + 0] & 255;
        } else {
            i3 = bArr[i + 0] & 255;
            i4 = bArr[i + 1] & 255;
            int i7 = bArr[i + 2] & 255;
            i5 = bArr[i2] & 255;
            i6 = i7;
        }
        return a(i3, i4, i6, i5);
    }

    public static UUID a(byte[] bArr, int i, boolean z) {
        int i2;
        if (bArr == null || i < 0 || bArr.length <= (i2 = i + 15) || 2147483632 < i) {
            return null;
        }
        return UUID.fromString(z ? String.format("%02x%02x%02x%02x-%02x%02x-%02x%02x-%02x%02x-%02x%02x%02x%02x%02x%02x", Integer.valueOf(bArr[i2] & 255), Integer.valueOf(bArr[i + 14] & 255), Integer.valueOf(bArr[i + 13] & 255), Integer.valueOf(bArr[i + 12] & 255), Integer.valueOf(bArr[i + 11] & 255), Integer.valueOf(bArr[i + 10] & 255), Integer.valueOf(bArr[i + 9] & 255), Integer.valueOf(bArr[i + 8] & 255), Integer.valueOf(bArr[i + 7] & 255), Integer.valueOf(bArr[i + 6] & 255), Integer.valueOf(bArr[i + 5] & 255), Integer.valueOf(bArr[i + 4] & 255), Integer.valueOf(bArr[i + 3] & 255), Integer.valueOf(bArr[i + 2] & 255), Integer.valueOf(bArr[i + 1] & 255), Integer.valueOf(bArr[i + 0] & 255)) : String.format("%02x%02x%02x%02x-%02x%02x-%02x%02x-%02x%02x-%02x%02x%02x%02x%02x%02x", Integer.valueOf(bArr[i + 0] & 255), Integer.valueOf(bArr[i + 1] & 255), Integer.valueOf(bArr[i + 2] & 255), Integer.valueOf(bArr[i + 3] & 255), Integer.valueOf(bArr[i + 4] & 255), Integer.valueOf(bArr[i + 5] & 255), Integer.valueOf(bArr[i + 6] & 255), Integer.valueOf(bArr[i + 7] & 255), Integer.valueOf(bArr[i + 8] & 255), Integer.valueOf(bArr[i + 9] & 255), Integer.valueOf(bArr[i + 10] & 255), Integer.valueOf(bArr[i + 11] & 255), Integer.valueOf(bArr[i + 12] & 255), Integer.valueOf(bArr[i + 13] & 255), Integer.valueOf(bArr[i + 14] & 255), Integer.valueOf(bArr[i2] & 255)));
    }
}
