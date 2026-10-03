package com.oplus.aiunit.vision;

import android.util.Base64;
import com.heytap.connect.cipher.AESUtil;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes16.dex */
public class hbm {
    public static String a(String str, String str2) {
        try {
            return b(c(str.getBytes(), str2.getBytes()));
        } catch (Throwable th) {
            epm.c("AESEncoder", "AES encrypt fail", th);
            return null;
        }
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            stringBuffer.append(AESUtil.HEX.charAt((bArr[i] >> 4) & 15));
            stringBuffer.append(AESUtil.HEX.charAt(bArr[i] & 15));
        }
        return stringBuffer.toString();
    }

    public static byte[] c(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(1, secretKeySpec);
        return cipher.doFinal(bArr2);
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, IvParameterSpec ivParameterSpec) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr2);
    }

    public static String e(String str, String str2) {
        try {
            return b(d(str.getBytes(), str2.getBytes(), new IvParameterSpec(Base64.decode(str, 0), 0, 12)));
        } catch (Throwable th) {
            epm.c("AESEncoder", "AES encrypt fail", th);
            return null;
        }
    }
}
