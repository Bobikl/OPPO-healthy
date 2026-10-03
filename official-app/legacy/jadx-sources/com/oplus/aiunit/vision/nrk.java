package com.oplus.aiunit.vision;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes3.dex */
public class nrk {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static char[] a(byte[] bArr) {
        return b(bArr, true);
    }

    public static char[] b(byte[] bArr, boolean z) {
        return c(bArr, z ? a : b);
    }

    public static char[] c(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b2 & 240) >>> 4];
            i = i2 + 1;
            cArr2[i2] = cArr[b2 & 15];
        }
        return cArr2;
    }

    public static String d(byte[] bArr) {
        return new String(a(bArr));
    }

    public static byte[] e(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    public static byte[] f(String str) {
        return e(str, Charset.forName("UTF-8"));
    }

    public static MessageDigest g(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static MessageDigest h() {
        return g(MessageDigestAlgorithms.SHA_256);
    }

    public static byte[] i(String str) {
        return j(f(str));
    }

    public static byte[] j(byte[] bArr) {
        return h().digest(bArr);
    }

    public static String k(String str) {
        return d(i(str));
    }
}
