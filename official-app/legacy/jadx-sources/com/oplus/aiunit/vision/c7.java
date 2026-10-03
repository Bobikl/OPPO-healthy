package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class c7 {
    public static final String a = h();
    public static final String b = g();

    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Base64.decode(str, 2);
    }

    public static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }

    public static String c(String str) throws Exception {
        return d(str, a, b);
    }

    public static String d(String str, String str2, String str3) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(StandardCharsets.US_ASCII), "AES");
        Cipher cipher = Cipher.getInstance("AES/CTR/Nopadding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(str3.getBytes()));
        return new String(cipher.doFinal(a(str)), StandardCharsets.UTF_8);
    }

    public static String e(String str) throws Exception {
        return f(str, a, b);
    }

    public static String f(String str, String str2, String str3) throws Exception {
        if (str2 == null) {
            str2 = a;
        }
        if (str2.length() != 16) {
            return null;
        }
        Cipher cipher = Cipher.getInstance("AES/CTR/Nopadding");
        cipher.init(1, new SecretKeySpec(str2.getBytes(), "AES"), new IvParameterSpec(str3.getBytes()));
        return b(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8))).replaceAll("\r|\n", "");
    }

    public static String g() {
        return "2423521879292468";
    }

    public static String h() {
        return "OzJIAzI4mir9BAFo";
    }
}
