package com.oplus.aiunit.vision;

import android.util.Base64;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes6.dex */
public class b7 {
    public static String a(String str, Key key) {
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            byte[] bArr = new byte[12];
            System.arraycopy(bArrDecode, 0, bArr, 0, 12);
            int length = bArrDecode.length - 12;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArrDecode, 12, bArr2, 0, length);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, key, new GCMParameterSpec(128, bArr));
            return new String(cipher.doFinal(bArr2), StandardCharsets.UTF_8);
        } catch (Throwable th) {
            AcLogUtil.e("AcAesUtils", "decrypt fail", th);
            return "";
        }
    }

    public static String b(String str, Key key) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, key);
            byte[] iv = cipher.getIV();
            byte[] bArrDoFinal = cipher.doFinal(str.getBytes(StandardCharsets.UTF_8));
            byte[] bArr = new byte[iv.length + bArrDoFinal.length];
            System.arraycopy(iv, 0, bArr, 0, iv.length);
            System.arraycopy(bArrDoFinal, 0, bArr, iv.length, bArrDoFinal.length);
            return Base64.encodeToString(bArr, 2);
        } catch (Throwable th) {
            AcLogUtil.e("AcAesUtils", "encrypt fail", th);
            return "";
        }
    }
}
