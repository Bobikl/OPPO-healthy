package com.heytap.msp.sdk.base.common.util;

import android.text.TextUtils;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes19.dex */
public class Md5Util {
    public static String byteToHexString(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(((char) b) & 255);
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(hexString.toUpperCase());
        }
        return stringBuffer.toString();
    }

    public static MessageDigest getDigest(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2.getMessage());
        }
    }

    public static String getHexString(byte[] bArr) {
        return String.format("%032x", new BigInteger(1, bArr));
    }

    public static String md5Digest(String str) throws IOException {
        MessageDigest digest = getDigest("MD5");
        digest.update(str.getBytes());
        return getHexString(digest.digest());
    }

    public static String xor8(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            bytes[i] = (byte) (bytes[i] ^ 8);
        }
        return new String(bytes);
    }
}
