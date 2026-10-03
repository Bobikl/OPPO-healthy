package com.oplus.aiunit.vision;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
public final class s8c {
    public static int a(String str) {
        if (str == null) {
            return 0;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        return b(bytes, bytes.length, 0);
    }

    public static int b(byte[] bArr, int i, int i2) {
        int i3 = i2 ^ i;
        int i4 = i >> 2;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i5 << 2;
            int i7 = ((bArr[i6] & 255) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 1] & 255) << 8)) * 1540483477;
            i3 = (i3 * 1540483477) ^ ((i7 ^ (i7 >>> 24)) * 1540483477);
        }
        int i8 = i - (i4 << 2);
        if (i8 != 0) {
            if (i8 >= 3) {
                i3 ^= bArr[i - 3] << 16;
            }
            if (i8 >= 2) {
                i3 ^= bArr[i - 2] << 8;
            }
            if (i8 >= 1) {
                i3 ^= bArr[i - 1];
            }
            i3 *= 1540483477;
        }
        int i9 = ((i3 >>> 13) ^ i3) * 1540483477;
        return i9 ^ (i9 >>> 15);
    }
}
