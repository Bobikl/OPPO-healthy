package com.heytap.store.base.core.util.encryption;

import com.oplus.aiunit.vision.eq;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes3.dex */
public class RSAHelper {
    private static final String CHARSET_UTF8 = "UTF-8";
    private static final String ECB_PKCS1_PADDING = "RSA/ECB/PKCS1Padding";
    private static final int KEY_SIZE = 512;
    public static final String RSA_KEY = "RSA_KEY";
    public static final String SENSORS_OFF = "SENSORS_OFF";
    public static final String SENSORS_ON = "SENSORS_ON";
    private static final String SIGN_ALGORITHMS = "SHA1WithRSA";
    public static final String SIGN_TYPE_RSA = "RSA";

    public static String decryptByPrivateKey(byte[] bArr, byte[] bArr2) throws Exception {
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr2));
        Cipher cipher = Cipher.getInstance(ECB_PKCS1_PADDING);
        cipher.init(2, privateKeyGeneratePrivate);
        return new String(cipher.doFinal(bArr), "UTF-8");
    }

    public static String encryptByPublicKey(byte[] bArr, byte[] bArr2) throws Exception {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr2));
        Cipher cipher = Cipher.getInstance(ECB_PKCS1_PADDING);
        cipher.init(1, publicKeyGeneratePublic);
        return android.util.Base64.encodeToString(cipher.doFinal(bArr), 2);
    }

    public static String decryptByPrivateKey(String str, String str2) throws Exception {
        return decryptByPrivateKey(android.util.Base64.decode(str, 2), android.util.Base64.decode(str2, 2));
    }

    public static String encryptByPublicKey(String str, String str2) {
        try {
            return encryptByPublicKey(str.getBytes("UTF-8"), android.util.Base64.decode(str2, 2));
        } catch (Exception e2) {
            e2.printStackTrace();
            return eq.NET_ERROR;
        }
    }
}
