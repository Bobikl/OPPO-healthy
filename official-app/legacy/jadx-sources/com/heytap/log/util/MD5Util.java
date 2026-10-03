package com.heytap.log.util;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes19.dex */
public class MD5Util {
    private static final String TAG = "MD5Util";

    public static MessageDigest getDigest(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2.getMessage());
        }
    }

    private static String getHashString(MessageDigest messageDigest) {
        StringBuilder sb = new StringBuilder();
        for (byte b : messageDigest.digest()) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString(b & 15));
        }
        return sb.toString();
    }

    public static String getHexString(byte[] bArr) {
        return String.format("%032x", new BigInteger(1, bArr));
    }

    public static String md5Digest(String str) throws IOException {
        MessageDigest digest = getDigest("MD5");
        digest.update(str.getBytes());
        return getHexString(digest.digest());
    }
}
