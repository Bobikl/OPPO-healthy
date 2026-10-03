package com.heytap.accessory.pair.utils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class SystemUtils {
    public static void arraycopy(Object obj, int i, Object obj2, int i2, int i3) {
        System.arraycopy(obj, i, obj2, i2, i3);
    }

    public static byte[] combineByteArrays(byte[]... bArr) {
        if (bArr == null) {
            return null;
        }
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (bArr2 != null) {
                length += bArr2.length;
            }
        }
        if (length == 0) {
            return new byte[0];
        }
        byte[] bArr3 = new byte[length];
        int i = 0;
        for (byte[] bArr4 : bArr) {
            if (bArr4 != null && bArr4.length != 0) {
                int length2 = bArr4.length;
                arraycopy(bArr4, 0, bArr3, i, length2);
                i += length2;
            }
        }
        return bArr3;
    }
}
