package com.platform.usercenter.tools.algorithm;

import com.platform.usercenter.tools.datastructure.StringUtil;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class HmacHelper {
    private static final String DEFAULT_ENCODING = "UTF-8";

    public static String hmacSign(String str, String str2) {
        return signMD5(str, str2, "UTF-8");
    }

    public static String signMD5(String str, String str2) {
        return signMD5(str, str2, "UTF-8");
    }

    public static String signSHA1(String str, String str2) {
        return signSHA1(str, str2, "UTF-8");
    }

    public static String toHex(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append("0");
            }
            sb.append(Integer.toString(i, 16));
        }
        return sb.toString();
    }

    public static String signMD5(String str, String str2, String str3) {
        byte[] bytes;
        byte[] bytes2;
        if (StringUtil.isEmpty(str3)) {
            str3 = "UTF-8";
        }
        byte[] bArr = new byte[64];
        byte[] bArr2 = new byte[64];
        try {
            bytes = str2.getBytes(str3);
            bytes2 = str.getBytes(str3);
        } catch (UnsupportedEncodingException unused) {
            bytes = str2.getBytes();
            bytes2 = str.getBytes();
        }
        Arrays.fill(bArr, bytes.length, 64, (byte) 54);
        Arrays.fill(bArr2, bytes.length, 64, (byte) 92);
        for (int i = 0; i < bytes.length; i++) {
            bArr[i] = (byte) (bytes[i] ^ 54);
            bArr2[i] = (byte) (bytes[i] ^ 92);
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            messageDigest.update(bytes2);
            byte[] bArrDigest = messageDigest.digest();
            messageDigest.reset();
            messageDigest.update(bArr2);
            messageDigest.update(bArrDigest, 0, 16);
            return toHex(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused2) {
            return null;
        }
    }

    public static String signSHA1(String str, String str2, String str3) {
        byte[] bytes;
        byte[] bytes2;
        if (StringUtil.isEmpty(str3)) {
            str3 = "UTF-8";
        }
        try {
            bytes = str.getBytes(str3);
            bytes2 = str2.getBytes(str3);
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
            bytes2 = str2.getBytes();
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes2, "HmacSHA1");
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            return toHex(mac.doFinal(bytes));
        } catch (Exception unused2) {
            return null;
        }
    }
}
