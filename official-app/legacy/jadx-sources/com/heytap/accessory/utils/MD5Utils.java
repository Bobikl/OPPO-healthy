package com.heytap.accessory.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class MD5Utils {
    public static byte[] md5(byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        if (ByteUtils.isEmpty(bArr)) {
            return ByteUtils.EMPTY_BYTES;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr, 0, bArr.length);
            byte[] bArrDigest = messageDigest.digest();
            if (ByteUtils.isEmpty(bArrDigest)) {
                return ByteUtils.EMPTY_BYTES;
            }
            return bArrDigest.length > i ? Arrays.copyOfRange(bArrDigest, 0, i) : bArrDigest;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static byte[] md512(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(), 0, str.length());
            byte[] bArrDigest = messageDigest.digest();
            int length = bArrDigest.length;
            if (length < 12) {
                return ByteUtils.EMPTY_BYTES;
            }
            int i = length / 2;
            return Arrays.copyOfRange(bArrDigest, i - 6, i + 6);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
