package com.oplus.aiunit.vision;

import okio.Utf8;

/* JADX INFO: loaded from: classes12.dex */
public class qy0 {
    public static byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static byte[] b = new byte[255];

    static {
        int i = 0;
        for (int i2 = 0; i2 < 255; i2++) {
            b[i2] = -1;
        }
        while (true) {
            byte[] bArr = a;
            if (i >= bArr.length) {
                byte[] bArr2 = b;
                bArr2[9] = -2;
                bArr2[10] = -2;
                bArr2[13] = -2;
                bArr2[32] = -2;
                bArr2[61] = -3;
                return;
            }
            b[bArr[i]] = (byte) i;
            i++;
        }
    }

    public static final byte[] a(byte[] bArr) throws IllegalArgumentException {
        int i = 0;
        int i2 = 0;
        for (byte b2 : bArr) {
            byte b3 = b[b2];
            if (b3 >= 0) {
                bArr[i2] = b3;
                i2++;
            } else if (b3 == -1) {
                throw new IllegalArgumentException("Invalid base 64 string");
            }
        }
        while (i2 > 0 && bArr[i2 - 1] == -3) {
            i2--;
        }
        int i3 = (i2 * 3) / 4;
        byte[] bArr2 = new byte[i3];
        int i4 = 0;
        while (i < i3 - 2) {
            int i5 = i4 + 1;
            bArr2[i] = (byte) (((bArr[i4] << 2) & 255) | ((bArr[i5] >>> 4) & 3));
            int i6 = i4 + 2;
            bArr2[i + 1] = (byte) (((bArr[i5] << 4) & 255) | ((bArr[i6] >>> 2) & 15));
            bArr2[i + 2] = (byte) (((bArr[i6] << 6) & 255) | (bArr[i4 + 3] & Utf8.REPLACEMENT_BYTE));
            i4 += 4;
            i += 3;
        }
        if (i < i3) {
            bArr2[i] = (byte) (((bArr[i4] << 2) & 255) | ((bArr[i4 + 1] >>> 4) & 3));
        }
        int i7 = i + 1;
        if (i7 < i3) {
            bArr2[i7] = (byte) (((bArr[i4 + 2] >>> 2) & 15) | ((bArr[i4 + 1] << 4) & 255));
        }
        return bArr2;
    }
}
