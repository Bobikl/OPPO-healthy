package com.heytap.accessory.pair.utils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class ByteUtils {
    public static final byte[] EMPTY_BYTES = new byte[0];

    public static boolean equals(byte[] bArr, byte[] bArr2, int i) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length < i || bArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] get(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        SystemUtils.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }
}
