package com.platform.usercenter.tools.security;

import android.util.Base64;
import com.heytap.connect.cipher.AESUtil;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes9.dex */
public class RsaCoder {
    private static final String ALGORITHM = "RSA/NONE/PKCS1Padding";
    public static final String Key = getKey();
    private static final String RSA_ALGORITHM = "RSA";
    public static final String SIGN_ALGORITHMS = "SHA1WithRSA";
    private static final String TAG = "RsaCoder";

    private static byte[] base64Decode(byte[] bArr) {
        return Base64.decode(bArr, 2);
    }

    public static String bytesToHexString(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length);
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                stringBuffer.append(0);
            }
            stringBuffer.append(hexString.toUpperCase());
        }
        return stringBuffer.toString();
    }

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

    public static String decrypt(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(2, getPrivateKey("RSA", str2));
            return new String(crypt(Base64.decode(str, 2), cipher)).trim();
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return null;
        }
    }

    public static String decryptByPublicKey(String str, String str2) throws Exception {
        PublicKey publicKey = getPublicKey(str2);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(2, publicKey);
        byte[][] bArrSplitBytes = splitBytes(hexString2Bytes(str), ((RSAPublicKey) publicKey).getModulus().bitLength() / 8);
        StringBuffer stringBuffer = new StringBuffer();
        for (byte[] bArr : bArrSplitBytes) {
            stringBuffer.append(new String(cipher.doFinal(bArr)));
        }
        return stringBuffer.toString();
    }

    public static boolean doCheck(String str, String str2, String str3) {
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str3, 2)));
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initVerify(publicKeyGeneratePublic);
            signature.update(str.getBytes(StandardCharsets.UTF_8));
            return signature.verify(Base64.decode(str2, 2));
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return false;
        }
    }

    public static String encrypt(String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(1, getPublicKeyFromX509("RSA", str2));
            return Base64.encodeToString(crypt(str.getBytes(StandardCharsets.UTF_8), cipher), 2);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return null;
        }
    }

    public static String encryptByPublicKey(String str, String str2) throws Exception {
        PublicKey publicKey = getPublicKey(str2);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(1, publicKey);
        byte[][] bArrSplitBytes = splitBytes(str.getBytes(), (((RSAPublicKey) publicKey).getModulus().bitLength() / 8) - 11);
        StringBuffer stringBuffer = new StringBuffer();
        for (byte[] bArr : bArrSplitBytes) {
            stringBuffer.append(bytesToHexString(cipher.doFinal(bArr)));
        }
        return stringBuffer.toString();
    }

    public static String getKey() {
        return "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDpgSW5VkZ6/xvh+wMXezrOokNdiupuvuMj4RVJy44byWDupl4H37z907A26RVdFzMeyLUQB4rsDIaXdxCODlljWW+/K96uF5MsDtOFUBw7VlOclIjcYTv/YDQEul8JoXoOuy1Yf3b5sbTpTuVTcl97tAuLJ8PoGe2K7N3B1eUQqQIDAQAB";
    }

    public static String getKeyString(Key key) throws Exception {
        return Base64.encodeToString(key.getEncoded(), 2);
    }

    public static PrivateKey getPrivateKey(String str, String str2) throws Exception {
        return KeyFactory.getInstance(str).generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2, 2)));
    }

    public static PublicKey getPublicKey(String str) throws Exception {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(base64Decode(str.getBytes())));
    }

    private static PublicKey getPublicKeyFromX509(String str, String str2) throws Exception {
        return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(Base64.decode(str2, 2)));
    }

    public static byte[] hexString2Bytes(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        char[] charArray = str.toUpperCase().toCharArray();
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (toByte(charArray[i2 + 1]) | (toByte(charArray[i2]) << 4));
        }
        return bArr;
    }

    public static String sign(String str, String str2) {
        try {
            PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2, 2)));
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initSign(privateKeyGeneratePrivate);
            signature.update(str.getBytes(StandardCharsets.UTF_8));
            return Base64.encodeToString(signature.sign(), 2);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return null;
        }
    }

    public static byte[][] splitBytes(byte[] bArr, int i) {
        byte[] bArr2;
        int length = bArr.length % i != 0 ? (bArr.length / i) + 1 : bArr.length / i;
        byte[][] bArr3 = new byte[length][];
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != length - 1 || bArr.length % i == 0) {
                bArr2 = new byte[i];
                System.arraycopy(bArr, i2 * i, bArr2, 0, i);
            } else {
                bArr2 = new byte[bArr.length % i];
                System.arraycopy(bArr, i2 * i, bArr2, 0, bArr.length % i);
            }
            bArr3[i2] = bArr2;
        }
        return bArr3;
    }

    private static byte toByte(char c2) {
        return (byte) AESUtil.HEX.indexOf(c2);
    }
}
