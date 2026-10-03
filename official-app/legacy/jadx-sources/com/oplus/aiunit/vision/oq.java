package com.oplus.aiunit.vision;

import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class oq {
    public static String a(String str) throws Exception {
        String strF = sy0.b().f(d(256));
        return b(str, strF) + "%AESK1%" + strF;
    }

    public static String b(String str, String str2) throws Exception {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(sy0.a().a(str2), "AES");
            Cipher cipher = Cipher.getInstance(e7.AES_TRANSFORMATION);
            cipher.init(1, secretKeySpec);
            String strF = sy0.b().f(cipher.getIV());
            return sy0.b().f(cipher.doFinal(str.getBytes(Charset.defaultCharset()))) + "%IV1%" + strF;
        } catch (Exception e2) {
            throw new Exception(e2);
        }
    }

    public static String c(String str, String str2, String str3) throws Exception {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(sy0.a().a(str2), "AES");
            Cipher cipher = Cipher.getInstance(e7.AES_TRANSFORMATION);
            cipher.init(1, secretKeySpec, new IvParameterSpec(sy0.a().a(str3)));
            return sy0.b().f(cipher.doFinal(str.getBytes(Charset.defaultCharset())));
        } catch (Exception e2) {
            throw new Exception(e2);
        }
    }

    public static byte[] d(int i) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(i);
        return keyGenerator.generateKey().getEncoded();
    }

    public static String e(int i) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(i);
        return sy0.b().f(keyGenerator.generateKey().getEncoded());
    }
}
