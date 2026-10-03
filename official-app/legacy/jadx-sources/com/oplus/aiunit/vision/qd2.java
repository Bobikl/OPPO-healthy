package com.oplus.aiunit.vision;

import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public class qd2 {
    public static int a(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i += (bArr[i2] & 255) << ((3 - i2) * 8);
        }
        return i;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static byte[] c(byte[] bArr, int i, int i2) {
        byte[] bArr2 = null;
        if (bArr == null) {
            return null;
        }
        if (i >= 0 && i < bArr.length && i2 >= 0 && i2 < bArr.length) {
            if (i > i2) {
                return null;
            }
            bArr2 = new byte[(i2 - i) + 1];
            int i3 = (i2 + 1) - i;
            if (i3 >= 0) {
                System.arraycopy(bArr, i, bArr2, 0, i3);
            }
        }
        return bArr2;
    }

    public static byte[] d(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static boolean e(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static boolean f(byte[] bArr, byte[] bArr2) {
        if (bArr == null && bArr2 == null) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] g(byte[] bArr) {
        int length = bArr.length - 1;
        while (length >= 0 && bArr[length] == 0) {
            length--;
        }
        return Arrays.copyOfRange(bArr, 0, length + 1);
    }

    public static int h(byte b) {
        return b & 255;
    }

    public static int i(byte b, byte b2) {
        return h(b) + (h(b2) << 8);
    }

    public static int j(byte b, byte b2, byte b3, byte b4) {
        return h(b) + (h(b2) << 8) + (h(b3) << 16) + (h(b4) << 24);
    }

    public static int k(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        return (i & i3) != 0 ? (i3 - (i & (i3 - 1))) * (-1) : i;
    }
}
