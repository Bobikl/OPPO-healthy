package com.heytap.store.base.core.util.encryption;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class AESHelper {
    protected static Map<String, Key> KEY = new HashMap();
    protected static final String KEY_ALGORITHM = "AES/CBC/PKCS5Padding";

    private static String decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String str = new String(bArr2);
        Key secretKeySpec = KEY.get(str);
        if (secretKeySpec == null) {
            secretKeySpec = new SecretKeySpec(bArr2, "AES");
            KEY.put(str, secretKeySpec);
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return BaseUtils.nvl(new String(cipher.doFinal(bArr), "UTF-8"), new String(bArr, "UTF-8"));
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String decryptValue(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = GetKeyUtil.key;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    return decrypt(str, str2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return str;
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String str = new String(bArr2);
        Key secretKeySpec = KEY.get(str);
        if (secretKeySpec == null) {
            secretKeySpec = new SecretKeySpec(bArr2, "AES");
            KEY.put(str, secretKeySpec);
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void main(String[] strArr) throws Exception {
        String str = EncryptMode.AES256.getKeyStr().get(0);
        System.out.println(str);
        String strEncrypt = encrypt("你好，加密123213", str);
        System.out.println(strEncrypt);
        String strDecrypt = decrypt(strEncrypt, str);
        System.out.println(strDecrypt + "---");
    }

    public static String decrypt(String str, String str2) {
        return decrypt(str, str2, str2.substring(0, 16));
    }

    public static String encrypt(String str, String str2, String str3) {
        try {
            return android.util.Base64.encodeToString(encrypt(BaseUtils.nvl(str).getBytes("UTF-8"), android.util.Base64.decode(str2, 2), str3.getBytes("UTF-8")), 2);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String decrypt(String str, String str2, String str3) {
        try {
            return BaseUtils.nvl(decrypt(android.util.Base64.decode(str, 2), android.util.Base64.decode(str2, 2), str3.getBytes("UTF-8")), str);
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String encrypt(String str, String str2) {
        return encrypt(str, str2, str2.substring(0, 16));
    }
}
