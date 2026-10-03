package com.platform.usercenter.tools.security;

import android.text.TextUtils;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes9.dex */
public class AESUtilTest {
    private static final String AES_ALGORITHM = "AES";
    private static final String AES_ENCRYPT_MODE = "AES/CTR/Nopadding";

    public static class SecretKeyNullPointException extends RuntimeException {
        public SecretKeyNullPointException() {
        }

        public SecretKeyNullPointException(String str) {
            super(str);
        }
    }

    public static String aesDecrypt(String str, String str2, String str3) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return aesDecryptByBytes(base64Decode(str), str2, str3);
    }

    public static String aesDecryptByBytes(byte[] bArr, String str, String str2) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(str.getBytes(StandardCharsets.UTF_8));
        keyGenerator.init(128, secureRandom);
        Cipher cipher = Cipher.getInstance(AES_ENCRYPT_MODE);
        cipher.init(2, new SecretKeySpec(keyGenerator.generateKey().getEncoded(), "AES"), new IvParameterSpec(str2.getBytes(StandardCharsets.UTF_8)));
        return new String(cipher.doFinal(bArr));
    }

    private static String aesDecryptByBytesWithPassKey(byte[] bArr, String str, byte[] bArr2) throws Exception {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            throw new SecretKeyNullPointException("Secret Key is null");
        }
        Cipher cipher = Cipher.getInstance(AES_ENCRYPT_MODE);
        cipher.init(2, new SecretKeySpec(str.getBytes(), "AES"), new IvParameterSpec(bArr2));
        return new String(cipher.doFinal(bArr));
    }

    public static String aesDecryptWithPassKey(String str, String str2, byte[] bArr) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return aesDecryptByBytesWithPassKey(base64Decode(str), str2, bArr);
    }

    public static String aesEncrypt(String str, String str2, String str3) throws Exception {
        return base64Encode(aesEncryptToBytes(str, str2, str3));
    }

    public static byte[] aesEncryptToBytes(String str, String str2, String str3) throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(str2.getBytes(StandardCharsets.UTF_8));
        keyGenerator.init(128, secureRandom);
        Cipher cipher = Cipher.getInstance(AES_ENCRYPT_MODE);
        cipher.init(1, new SecretKeySpec(keyGenerator.generateKey().getEncoded(), "AES"), new IvParameterSpec(str3.getBytes(StandardCharsets.UTF_8)));
        return cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
    }

    private static byte[] aesEncryptToBytesWithPassKey(String str, String str2, byte[] bArr) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            throw new SecretKeyNullPointException("Secret Key is null");
        }
        Cipher cipher = Cipher.getInstance(AES_ENCRYPT_MODE);
        cipher.init(1, new SecretKeySpec(str2.getBytes(), "AES"), new IvParameterSpec(bArr));
        return cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
    }

    public static String aesEncryptWithPassKey(String str, String str2, byte[] bArr) throws Exception {
        return base64Encode(aesEncryptToBytesWithPassKey(str, str2, bArr));
    }

    public static byte[] base64Decode(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Base64.decode(str, 2);
    }

    public static byte[] base64DecodeSafe(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    public static String base64Encode(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static String base64EncodeSafe(byte[] bArr) {
        return Base64.encodeToString(bArr, 10);
    }
}
