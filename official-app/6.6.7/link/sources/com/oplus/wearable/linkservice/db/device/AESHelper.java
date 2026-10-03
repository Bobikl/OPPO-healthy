package com.oplus.wearable.linkservice.db.device;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.i90;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.taa;
import com.oplus.aiunit.vision.vp6;
import java.nio.charset.StandardCharsets;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class AESHelper {

    public static final class CryptoProvider extends Provider {
        public CryptoProvider() {
            super("Crypto", 1.0d, "HARMONY (SHA1 digest; SecureRandom; SHA1withDSA signature)");
            put("SecureRandom.SHA1PRNG", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl");
            put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
        }
    }

    public static String a(@NonNull String str) {
        String strB = vp6.b(e88.a(), i90.HW_KEY);
        return d(str, strB, (TextUtils.isEmpty(strB) || strB.length() <= 16) ? strB : strB.substring(0, 16), 2);
    }

    public static SecretKeySpec b(String str) {
        return new SecretKeySpec(taa.b(str.getBytes(StandardCharsets.UTF_8), 32), "AES");
    }

    public static String c(@NonNull String str) {
        String strB = vp6.b(e88.a(), i90.HW_KEY);
        return d(str, strB, (TextUtils.isEmpty(strB) || strB.length() <= 16) ? strB : strB.substring(0, 16), 1);
    }

    @SuppressLint({"DeletedProvider", "GetInstance"})
    public static String d(String str, String str2, String str3, int i) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                SecretKeySpec secretKeySpecB = b(str2);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(str3.getBytes(StandardCharsets.UTF_8));
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(i, secretKeySpecB, ivParameterSpec);
                return i == 1 ? e(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8))) : new String(cipher.doFinal(f(str)));
            } catch (Exception e) {
                m8b.b("AESHelper", "Exception:" + e.getMessage());
            }
        }
        return null;
    }

    public static String e(byte[] bArr) {
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

    public static byte[] f(String str) {
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
