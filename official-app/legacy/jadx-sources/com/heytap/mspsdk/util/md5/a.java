package com.heytap.mspsdk.util.md5;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    public static MessageDigest a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2.getMessage());
        }
    }

    public static String b(byte[] bArr) {
        return String.format("%032x", new BigInteger(1, bArr));
    }

    public static String c(String str) throws IOException {
        MessageDigest messageDigestA = a("MD5");
        messageDigestA.update(str.getBytes());
        return b(messageDigestA.digest());
    }
}
