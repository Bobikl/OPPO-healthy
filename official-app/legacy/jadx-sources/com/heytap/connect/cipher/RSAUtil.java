package com.heytap.connect.cipher;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes13.dex */
public class RSAUtil {
    private static final String RSA = "RSA";
    private static final String RSA_PADDING = "RSA/ECB/PKCS1Padding";

    public static byte[] decrypt(String str, byte[] bArr) {
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 1)));
            Cipher cipher = Cipher.getInstance(RSA_PADDING);
            cipher.init(2, publicKeyGeneratePublic);
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return new byte[0];
        }
    }

    public static byte[] encrypt(String str, byte[] bArr) {
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 1)));
            Cipher cipher = Cipher.getInstance(RSA_PADDING);
            cipher.init(1, publicKeyGeneratePublic);
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return new byte[0];
        }
    }
}
