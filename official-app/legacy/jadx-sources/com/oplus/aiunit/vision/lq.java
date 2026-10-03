package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes19.dex */
public class lq {
    @SuppressLint({"GetInstance"})
    public static String a(String str, String str2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            cipher.init(1, secretKeySpec);
            return new String(Base64.encode(cipher.doFinal(bytes), 2), StandardCharsets.UTF_8);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            a7b.b("AesUtil", "encrypt error:" + e2);
            return "";
        }
    }

    public static String b() {
        KeyGenerator keyGenerator = null;
        try {
            keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
        } catch (NoSuchAlgorithmException e2) {
            a7b.b("AesUtil", "initKey error:" + e2);
        }
        return new String(Base64.encode(keyGenerator.generateKey().getEncoded(), 2), StandardCharsets.UTF_8);
    }
}
