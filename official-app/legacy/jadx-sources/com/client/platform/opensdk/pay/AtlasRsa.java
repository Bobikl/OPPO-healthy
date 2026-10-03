package com.client.platform.opensdk.pay;

import android.util.Base64;
import com.oplus.aiunit.vision.qam;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes13.dex */
public class AtlasRsa {
    private static final String ALGORITHM = "RSA";
    public static final String SIGN_ALGORITHMS = "SHA1WithRSA";

    private static byte[] crypt(byte[] bArr, Cipher cipher) throws GeneralSecurityException, IOException {
        int blockSize = cipher.getBlockSize();
        int outputSize = cipher.getOutputSize(blockSize);
        int length = bArr.length;
        byte[] bArr2 = new byte[(length % blockSize == 0 ? length / blockSize : (length / blockSize) + 1) * outputSize];
        int i = length;
        int i2 = 0;
        while (i >= blockSize) {
            cipher.doFinal(bArr, i2 * blockSize, blockSize, bArr2, i2 * outputSize);
            i -= blockSize;
            i2++;
        }
        if (i > 0) {
            cipher.doFinal(bArr, i2 * blockSize, i, bArr2, i2 * outputSize);
        }
        return bArr2;
    }

    public static String decodeString(String str) {
        return new String(Base64.decode(str, 0));
    }

    public static boolean doCheck(String str, String str2, String str3) {
        try {
            PublicKey publicKeyFromX509 = getPublicKeyFromX509("RSA", str3);
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initVerify(publicKeyFromX509);
            signature.update(str.getBytes("utf-8"));
            return signature.verify(Base64.decode(str2, 0));
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static String encodeToString(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }

    public static String getKeyString(Key key) throws Exception {
        return Base64.encodeToString(key.getEncoded(), 0);
    }

    private static PrivateKey getPrivateKey(String str, String str2) throws Exception {
        return KeyFactory.getInstance(str, "BC").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2, 0)));
    }

    private static PublicKey getPublicKeyFromX509(String str, String str2) throws Exception {
        return KeyFactory.getInstance(str, "BC").generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 0)));
    }

    private static String getSignContent(String str, String str2, String str3, String str4, String str5, double d, int i) {
        int iYuanToFen = Utils.yuanToFen(d);
        String str6 = "OFFLINE_" + System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append("token=\"" + str6 + qam.m);
        sb.append("appPackage=\"" + str + qam.m);
        sb.append("partnerId=\"" + str2 + qam.m);
        sb.append("partnerOrder=\"" + str3 + qam.m);
        sb.append("productName=\"" + str4 + qam.m);
        sb.append("productDesc=\"" + str5 + qam.m);
        sb.append("price=\"" + iYuanToFen + qam.m);
        sb.append("count=\"" + i + "\"");
        return sb.toString();
    }

    public static String sign(String str, String str2) {
        try {
            PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2, 0)));
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initSign(privateKeyGeneratePrivate);
            signature.update(str.getBytes("utf-8"));
            return Base64.encodeToString(signature.sign(), 0);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String getSignContent(String str, String str2, String str3, String str4, String str5, String str6, double d, int i) {
        int iYuanToFen = Utils.yuanToFen(d);
        StringBuilder sb = new StringBuilder();
        sb.append("token=\"" + str + qam.m);
        sb.append("appPackage=\"" + str2 + qam.m);
        sb.append("partnerId=\"" + str3 + qam.m);
        sb.append("partnerOrder=\"" + str4 + qam.m);
        sb.append("productName=\"" + str5 + qam.m);
        sb.append("productDesc=\"" + str6 + qam.m);
        sb.append("price=\"" + iYuanToFen + qam.m);
        sb.append("count=\"" + i + "\"");
        return sb.toString();
    }
}
