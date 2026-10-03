package com.oplus.aiunit.vision;

import com.heytap.connect.cipher.AESUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes6.dex */
public class t2h {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] b(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                gZIPOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] c() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static String d() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(new byte[20]);
        return String.valueOf(secureRandom.nextInt(10000) + 1000);
    }

    public static String e(String str, byte[] bArr, String str2) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] bytes2 = str2.getBytes(StandardCharsets.UTF_8);
        if (bArr == null) {
            bArr = new byte[0];
        }
        return j(a(a(bytes, bArr), bytes2));
    }

    public static byte[] f(byte[] bArr, String str, byte[] bArr2) {
        if (str.isEmpty() || bArr.length == 0) {
            return new byte[0];
        }
        try {
            Cipher cipher = Cipher.getInstance(AESUtil.AES_PADDING);
            byte[] bytes = str.getBytes();
            byte[] bArr3 = new byte[16];
            for (int i = 0; i < bytes.length && i < 16; i++) {
                bArr3[i] = bytes[i];
            }
            cipher.init(1, new SecretKeySpec(bArr3, "AES"), new IvParameterSpec(bArr2));
            return cipher.doFinal(bArr);
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    public static byte[] g(byte[] bArr, String str, byte[] bArr2) {
        return f(bArr, i(str), bArr2);
    }

    public static String h(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = bArr[i];
            if (i2 < 0) {
                i2 += 256;
            }
            if (i2 < 16) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(i2));
        }
        return sb.toString();
    }

    public static String i(String str) {
        if (str.length() <= 16) {
            for (int i = 0; i < 16; i++) {
                str = str + kam.h;
            }
        }
        return str;
    }

    public static String j(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("SHA-256 算法不可用", e2);
        }
    }
}
