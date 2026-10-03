package com.heytap.connect.cipher;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes13.dex */
public class AESUtil {
    public static final String AES = "AES";
    public static final String AES_PADDING = "AES/CBC/PKCS5Padding";
    public static final String HEX = "0123456789ABCDEF";
    private static final int HEX_0F = 15;
    private static final int OLD_KEY_SIZE = 16;
    public static final String SEED_DEFAULT = "com.coloros.crypto.seed.defalut";
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public static void appendHex(StringBuffer stringBuffer, byte b) {
        stringBuffer.append(HEX.charAt((b >> 4) & 15));
        stringBuffer.append(HEX.charAt(b & 15));
    }

    public static String decrypt(String str) {
        return decrypt(CryptoUtil.PASSWORD.getBytes(), str);
    }

    public static byte[] deriveInsecureKey() {
        return InsecureSHA1PRNGKeyDerivator.deriveInsecureKey(SEED_DEFAULT.getBytes(Charset.defaultCharset()), 16);
    }

    public static String encrypt(String str) {
        return encrypt(CryptoUtil.PASSWORD.getBytes(), str);
    }

    public static String fromHex(String str) {
        return new String(toByte(str), Charset.defaultCharset());
    }

    public static byte[] toByte(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static String toHex(String str) {
        return toHex(str.getBytes(Charset.defaultCharset()));
    }

    public static String decrypt(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new String(decrypt(bArr, toByte(str)), UTF_8);
    }

    public static String encrypt(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return toHex(encrypt(bArr, str.getBytes(Charset.defaultCharset())));
    }

    public static String toHex(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            appendHex(stringBuffer, b);
        }
        return stringBuffer.toString();
    }

    public static byte[] decrypt(byte[] bArr) throws UnsupportedEncodingException {
        byte[] bytes = CryptoUtil.PASSWORD.getBytes("UTF-8");
        return decrypt(bytes, bytes, bArr);
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance(AES_PADDING);
        cipher.init(1, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
        return cipher.doFinal(bArr2);
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance(AES_PADDING);
        cipher.init(2, secretKeySpec, new IvParameterSpec(new byte[cipher.getBlockSize()]));
        return cipher.doFinal(bArr2);
    }

    public static byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance(AES_PADDING);
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            return cipher.doFinal(bArr3);
        } catch (Exception e2) {
            e2.printStackTrace();
            return new byte[0];
        }
    }

    public static byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance(AES_PADDING);
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr2));
            return cipher.doFinal(bArr3);
        } catch (Exception e2) {
            e2.printStackTrace();
            return new byte[0];
        }
    }
}
