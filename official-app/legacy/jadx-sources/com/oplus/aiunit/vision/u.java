package com.oplus.aiunit.vision;

import com.heytap.connect.cipher.AESUtil;
import com.heytap.health.wallet.utils.ByteString;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes18.dex */
public class u {
    public static String a(String str, byte[] bArr, byte[] bArr2) {
        t6b.b("AES_CBC_PKCS5Padding", "key: " + Arrays.toString(bArr) + "  iv: " + Arrays.toString(bArr2));
        if (str == null) {
            return null;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance(AESUtil.AES_PADDING);
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
            return ByteString.of(cipher.doFinal(str.getBytes())).hex();
        } catch (Exception e2) {
            t6b.b("AES_CBC_PKCS5Padding", "encrypt failed" + e2.getMessage());
            return null;
        }
    }
}
