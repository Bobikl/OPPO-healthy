package com.oplus.aiunit.vision;

import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes15.dex */
public final class g7m {
    public static int a(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        return ((i ^ i2) + (iArr[(i4 & 3) ^ i5] ^ i3)) ^ (((i3 >>> 5) ^ (i2 << 2)) + ((i2 >>> 3) ^ (i3 << 4)));
    }

    public static final byte[] b(byte[] bArr, String str) {
        try {
            return c(bArr, str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static final byte[] c(byte[] bArr, byte[] bArr2) {
        return bArr.length == 0 ? bArr : g(d(h(bArr, false), h(f(bArr2), false)), true);
    }

    public static int[] d(int[] iArr, int[] iArr2) {
        int length = iArr.length - 1;
        if (length < 1) {
            return iArr;
        }
        int iA = iArr[0];
        for (int i = ((52 / (length + 1)) + 6) * (-1640531527); i != 0; i -= -1640531527) {
            int i2 = (i >>> 2) & 3;
            int iA2 = iA;
            int i3 = length;
            while (i3 > 0) {
                iA2 = iArr[i3] - a(i, iA2, iArr[i3 - 1], i3, i2, iArr2);
                iArr[i3] = iA2;
                i3--;
            }
            iA = iArr[0] - a(i, iA2, iArr[length], i3, i2, iArr2);
            iArr[0] = iA;
        }
        return iArr;
    }

    public static final String e(String str, String str2) {
        try {
            byte[] bArrB = b(Base64.decode(str, 0), str2);
            if (bArrB == null) {
                return null;
            }
            return new String(bArrB, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static byte[] f(byte[] bArr) {
        if (bArr.length == 16) {
            return bArr;
        }
        byte[] bArr2 = new byte[16];
        if (bArr.length < 16) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, 16);
        }
        return bArr2;
    }

    public static byte[] g(int[] iArr, boolean z) {
        int length = iArr.length << 2;
        if (z) {
            int i = iArr[iArr.length - 1];
            int i2 = length - 4;
            if (i < i2 - 3 || i > i2) {
                return null;
            }
            length = i;
        }
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            bArr[i3] = (byte) (iArr[i3 >>> 2] >>> ((i3 & 3) << 3));
        }
        return bArr;
    }

    public static int[] h(byte[] bArr, boolean z) {
        int[] iArr;
        int length = (bArr.length & 3) == 0 ? bArr.length >>> 2 : (bArr.length >>> 2) + 1;
        if (z) {
            iArr = new int[length + 1];
            iArr[length] = bArr.length;
        } else {
            iArr = new int[length];
        }
        int length2 = bArr.length;
        for (int i = 0; i < length2; i++) {
            int i2 = i >>> 2;
            iArr[i2] = iArr[i2] | ((bArr[i] & 255) << ((i & 3) << 3));
        }
        return iArr;
    }
}
