package com.oplus.aiunit.vision;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes19.dex */
public class r0g {
    public static final String KEY_ALGORITHM = "RSA";
    public static RSAPublicKey a;
    public static RSAPrivateKey b;

    public static byte[] a(String str) {
        return Base64.decode(str, 0);
    }

    public static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 0);
    }

    public static String c(String str, String str2) {
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(a(str2));
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(x509EncodedKeySpec);
            Cipher cipher = Cipher.getInstance(keyFactory.getAlgorithm());
            cipher.init(1, publicKeyGeneratePublic);
            return b(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e2) {
            a7b.b("RsaEncryptUtils", "decrypt error:" + e2);
            return null;
        }
    }

    public static void d() {
        KeyPairGenerator keyPairGenerator;
        if (a == null || b == null) {
            try {
                keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            } catch (NoSuchAlgorithmException e2) {
                a7b.f("RsaEncryptUtils", " initKey Exception " + e2.getMessage());
                keyPairGenerator = null;
            }
            if (keyPairGenerator == null) {
                a7b.b("RsaEncryptUtils", "initKey keyPairGen == null, return");
                return;
            }
            keyPairGenerator.initialize(2048);
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            a = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
            b = (RSAPrivateKey) keyPairGenerateKeyPair.getPrivate();
        }
    }
}
