package com.oplus.aiunit.vision;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class e7 {
    public static final int AES_KEY_SIZE = 256;
    public static final String KEY_ALGORITHM = "AES";
    public static final Charset a = Charset.forName("UTF-8");
    public static final byte[] NET_REQ_AES_SECRET_KEY = d(256);
    public static final String AES_TRANSFORMATION = "AES/CTR/NoPadding";
    public static final byte[] NET_REQ_AES_IV = c(AES_TRANSFORMATION);

    public static String a(String str, String str2, byte[] bArr, byte[] bArr2) {
        try {
            byte[] bArrDecode = Base64.decode(str2, 2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return new String(cipher.doFinal(bArrDecode), a);
        } catch (Exception e2) {
            mb.a("AcIntercept.Aes", "decrypt base64Data:" + str2);
            mb.a("AcIntercept.Aes", "decrypt Exception:" + e2.getMessage());
            e2.printStackTrace();
            return "";
        }
    }

    public static String b(String str, String str2, byte[] bArr, byte[] bArr2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            return Base64.encodeToString(cipher.doFinal(str2.getBytes(a)), 2);
        } catch (Exception e2) {
            mb.a("AcIntercept.Aes", "decrypt encrypt:" + e2.getMessage());
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] c(String str) {
        try {
            byte[] bArr = new byte[Cipher.getInstance(str).getBlockSize()];
            new SecureRandom().nextBytes(bArr);
            return bArr;
        } catch (NoSuchAlgorithmException e2) {
            mb.a("AcIntercept.Aes", "generateAesIv Exception:" + e2.getMessage());
            throw new RuntimeException(e2);
        } catch (NoSuchPaddingException e3) {
            mb.a("AcIntercept.Aes", "generateAesIv Exception:" + e3.getMessage());
            throw new RuntimeException(e3);
        }
    }

    public static byte[] d(int i) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(i);
            return keyGenerator.generateKey().getEncoded();
        } catch (NoSuchAlgorithmException e2) {
            mb.a("AcIntercept.Aes", "generateAesSecretKey Exception:" + e2.getMessage());
            e2.printStackTrace();
            return null;
        }
    }
}
