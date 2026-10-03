package com.omron;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes5.dex */
public final class j {
    public static String a(String str) {
        return (str == null || str.length() == 0) ? "" : b(str.getBytes());
    }

    public static String b(byte[] bArr) {
        return h.a(a(bArr));
    }

    public static byte[] a(byte[] bArr) {
        return a(bArr, "MD5");
    }

    public static byte[] a(byte[] bArr, String str) {
        if (bArr != null && bArr.length > 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}
