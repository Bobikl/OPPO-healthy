package com.heytap.store.base.core.util.file;

import android.text.TextUtils;
import com.heytap.connect.cipher.AESUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class MD5Sign {
    private static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final String HEX = "0123456789ABCDEF";

    private static void appendHex(StringBuffer stringBuffer, byte b) {
        stringBuffer.append("0123456789ABCDEF".charAt((b >> 4) & 15));
        stringBuffer.append("0123456789ABCDEF".charAt(b & 15));
    }

    public static String decrypt(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            return new String(decrypt(getRawKey(str.getBytes()), toByte(str2)));
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static char[] encodeHex(byte[] bArr) {
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = DIGITS;
            cArr[i] = cArr2[(b & 240) >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return cArr;
    }

    public static String encrypt(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            return toHex(encrypt(getRawKey(str.getBytes()), str2.getBytes()));
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String getMD5(InputStream inputStream) throws NoSuchAlgorithmException, IOException {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bArr = new byte[1024];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                break;
            }
            messageDigest.update(bArr, 0, i2);
        }
        for (byte b : messageDigest.digest()) {
            stringBuffer.append(Integer.toString((b & 255) + 256, 16).substring(1));
        }
        return stringBuffer.toString();
    }

    private static byte[] getRawKey(byte[] bArr) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG", "Crypto");
        secureRandom.setSeed(bArr);
        keyGenerator.init(128, secureRandom);
        return keyGenerator.generateKey().getEncoded();
    }

    public static String hexDigest(String str) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            messageDigest = null;
        }
        StringBuffer stringBuffer = new StringBuffer("");
        if (messageDigest != null) {
            try {
                messageDigest.update(str.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e3) {
                e3.printStackTrace();
            }
            byte[] bArrDigest = messageDigest.digest();
            for (int i = 0; i < bArrDigest.length; i++) {
                int i2 = bArrDigest[i];
                if (i2 < 0) {
                    i2 += 256;
                }
                if (i2 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i2));
            }
        }
        return stringBuffer.toString();
    }

    public static byte[] md5(String str) {
        return md5(str.getBytes());
    }

    public static boolean md5CheckSum(InputStream inputStream, String str) throws NoSuchAlgorithmException, IOException {
        return getMD5(inputStream).equals(str);
    }

    public static String md5Hex(byte[] bArr) {
        return new String(encodeHex(md5(bArr)));
    }

    public static byte[] toByte(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    private static String toHex(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            appendHex(stringBuffer, b);
        }
        return stringBuffer.toString();
    }

    public static byte[] md5(byte[] bArr) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            messageDigest = null;
        }
        return messageDigest.digest(bArr);
    }

    public static boolean md5CheckSum(File file, String str) throws NoSuchAlgorithmException, IOException {
        return getMD5(file).equals(str);
    }

    public static String md5Hex(String str) {
        return new String(encodeHex(md5(str)));
    }

    public static boolean md5CheckSum(String str, String str2) throws NoSuchAlgorithmException, IOException {
        return getMD5(str).equals(str2);
    }

    private static byte[] encrypt(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance(AESUtil.AES_PADDING);
        cipher.init(1, secretKeySpec);
        return cipher.doFinal(bArr2);
    }

    private static byte[] decrypt(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance(AESUtil.AES_PADDING);
        cipher.init(2, secretKeySpec);
        return cipher.doFinal(bArr2);
    }

    public static String getMD5(File file) throws NoSuchAlgorithmException, IOException {
        return getMD5(new FileInputStream(file));
    }

    public static String getMD5(String str) throws NoSuchAlgorithmException, IOException {
        return getMD5(new FileInputStream(str));
    }
}
