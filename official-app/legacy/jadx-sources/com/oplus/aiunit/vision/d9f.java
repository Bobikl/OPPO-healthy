package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"HealthLint_ExceptionPrintDetector"})
public class d9f {
    public static final String PRIVATE_KEY = "privateKey";
    public static final String PUBLIC_KEY = "publicKey";

    public static byte[] a(PrivateKey privateKey, byte[] bArr) throws Exception {
        try {
            Cipher cipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
            cipher.init(2, privateKey);
            return cipher.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            return a(d(bArr2), bArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Map<String, RSAKey> c(int i) throws Exception {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(i);
            KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
            RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair.getPublic();
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) keyPairGenerateKeyPair.getPrivate();
            HashMap map = new HashMap();
            map.put(PUBLIC_KEY, rSAPublicKey);
            map.put(PRIVATE_KEY, rSAPrivateKey);
            return map;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static PrivateKey d(byte[] bArr) throws Exception {
        try {
            return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
