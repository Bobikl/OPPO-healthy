package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes15.dex */
public class t0g {
    public static String a(String str, Key key) {
        byte[] bArrB;
        if (key == null || TextUtils.isEmpty(str) || (bArrB = b(str.getBytes(StandardCharsets.UTF_8), key)) == null) {
            return null;
        }
        return Base64.encodeToString(bArrB, 2);
    }

    public static byte[] b(byte[] bArr, Key key) {
        try {
            Cipher cipher = Cipher.getInstance("RSA/NONE/PKCS1Padding");
            a7b.f("RsaUtil", "encrypt ALGORITHM_CIPHER=RSA/NONE/PKCS1Padding");
            cipher.init(1, key);
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            a7b.c("RsaUtil", "[encrypt]====encrypt error! dataLength={}, key={}" + bArr.length + "  " + key, e2);
            return null;
        }
    }

    public static String c(String str, String str2) {
        return a(str, d(str2));
    }

    public static PublicKey d(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str.getBytes(), 2)));
        } catch (Exception e2) {
            a7b.c("RsaUtil", "[getPublicKey]====getPrivateKey error! base64PrivateKey={}" + str, e2);
            return null;
        }
    }
}
