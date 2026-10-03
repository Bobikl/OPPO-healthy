package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class co2 {
    public static int a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        if (i2 > bArr.length) {
            i2 = bArr.length;
        }
        if (i >= i2) {
            return 0;
        }
        int i3 = 0;
        while (i < i2) {
            i3 ^= bArr[i] << 8;
            for (int i4 = 0; i4 < 8; i4++) {
                i3 = (32768 & i3) > 0 ? (i3 << 1) ^ 4129 : i3 << 1;
            }
            i++;
        }
        return 65535 & i3;
    }
}
