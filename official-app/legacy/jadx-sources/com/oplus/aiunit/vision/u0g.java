package com.oplus.aiunit.vision;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes16.dex */
public class u0g {
    public static String a = "RSA/ECB/PKCS1Padding";

    public static String a(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                stringBuffer.append(String.format("%02x", Byte.valueOf(b)));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static String b(String str, Key key) {
        byte[] bArrC = c(str.getBytes(StandardCharsets.UTF_8), key);
        if (bArrC == null) {
            return null;
        }
        return Base64.getEncoder().encodeToString(bArrC);
    }

    public static byte[] c(byte[] bArr, Key key) {
        try {
            Cipher cipher = Cipher.getInstance(a);
            cipher.init(1, key);
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            a7b.c("RsaUtils", "encryptByNone error", e2);
            return null;
        }
    }

    public static String d(String str, String str2) {
        return b(str, e(str2));
    }

    public static PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.getDecoder().decode(str.getBytes())));
        } catch (Exception e2) {
            a7b.c("RsaUtils", "getPublicKey error", e2);
            return null;
        }
    }

    public static String f(String str, String str2) {
        try {
            byte[] bArrDecode = Base64.getDecoder().decode(str);
            Signature signature = Signature.getInstance("MD5withRSA");
            signature.initSign(KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArrDecode)));
            signature.update(str2.getBytes());
            return Base64.getEncoder().encodeToString(signature.sign());
        } catch (Exception e2) {
            a7b.c("RsaUtils", "signMD5withRSA error", e2);
            return null;
        }
    }
}
