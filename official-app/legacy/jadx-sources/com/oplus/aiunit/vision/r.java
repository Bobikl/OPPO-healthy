package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes15.dex */
public class r {
    public static SecretKeySpec a(String str) {
        return new SecretKeySpec(l9a.b(str.getBytes(StandardCharsets.UTF_8), 32), "AES");
    }

    @SuppressLint({"DeletedProvider", "GetInstance"})
    public static String b(String str, String str2, String str3, int i) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                SecretKeySpec secretKeySpecA = a(str2);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes(StandardCharsets.UTF_8));
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(i, secretKeySpecA, ivParameterSpec);
                return i == 1 ? c(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8))) : new String(cipher.doFinal(d(str)));
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e2) {
                String message = e2.getMessage();
                Objects.requireNonNull(message);
                a7b.b("AESHelper", "Exception e = ".concat(message));
            }
        }
        return null;
    }

    public static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = '0' + hexString;
            }
            sb.append(hexString.toUpperCase());
        }
        return sb.toString();
    }

    public static byte[] d(String str) {
        if (str.length() < 1) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < str.length() / 2; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            bArr[i] = (byte) ((Integer.parseInt(str.substring(i2, i3), 16) * 16) + Integer.parseInt(str.substring(i3, i2 + 2), 16));
        }
        return bArr;
    }
}
