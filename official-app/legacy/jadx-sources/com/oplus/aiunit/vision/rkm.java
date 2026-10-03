package com.oplus.aiunit.vision;

import android.util.Base64;
import com.heytap.connect.cipher.AESUtil;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class rkm {
    public static volatile SecureRandom a;
    public static final char[] b = AESUtil.HEX.toCharArray();

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 3);
    }

    public static SecureRandom b() {
        if (a != null) {
            return a;
        }
        synchronized (rkm.class) {
            if (a == null) {
                a = new SecureRandom();
            }
        }
        return a;
    }

    public static byte[] c(byte b2) {
        return new byte[]{b2};
    }

    public static byte[] d(char c2, char c3) {
        return new byte[]{(byte) (c2 & 255), (byte) (c3 & 255)};
    }

    public static byte[] e(long j2) {
        return new byte[]{(byte) j2, (byte) (j2 >> 8), (byte) (j2 >> 16), (byte) (j2 >> 24), (byte) (j2 >> 32), (byte) (j2 >> 40), (byte) (j2 >> 48), (byte) (j2 >> 56)};
    }

    public static byte[] f(short s) {
        return new byte[]{(byte) s, (byte) (s >> 8)};
    }

    public static byte[] g(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArrCopyOf = null;
        int length2 = 0;
        for (byte[] bArr3 : bArr) {
            if (bArrCopyOf == null) {
                bArrCopyOf = Arrays.copyOf(bArr3, length);
                length2 = bArr3.length;
            } else {
                System.arraycopy(bArr3, 0, bArrCopyOf, length2, bArr3.length);
                length2 += bArr3.length;
            }
        }
        return bArrCopyOf;
    }

    public static byte[] h() {
        byte[] bArr = new byte[2];
        b().nextBytes(bArr);
        return bArr;
    }

    public static byte[] i() {
        byte[] bArr = new byte[4];
        b().nextBytes(bArr);
        return bArr;
    }
}
