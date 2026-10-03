package com.oplus.aiunit.vision;

import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes6.dex */
public class s {
    public static byte[] a(byte[] bArr, SecretKey secretKey) {
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(2, secretKey, new IvParameterSpec(bArrCopyOfRange));
            return cipher.doFinal(bArrCopyOfRange2);
        } catch (Exception e2) {
            AcLogUtil.e("AESUtil", "error = " + e2.getMessage());
            return null;
        }
    }

    public static byte[] b(byte[] bArr, SecretKey secretKey) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(1, secretKey);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            byte[] iv = cipher.getIV();
            byte[] bArr2 = new byte[iv.length + bArrDoFinal.length];
            System.arraycopy(iv, 0, bArr2, 0, iv.length);
            System.arraycopy(bArrDoFinal, 0, bArr2, iv.length, bArrDoFinal.length);
            return bArr2;
        } catch (Exception e2) {
            AcLogUtil.e("AESUtil", "error = " + e2.getMessage());
            return null;
        }
    }
}
