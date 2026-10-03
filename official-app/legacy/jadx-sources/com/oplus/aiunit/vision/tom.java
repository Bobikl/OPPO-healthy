package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes12.dex */
public class tom {
    public static final String a = "RSA";

    /* JADX WARN: Code duplicated, block: B:36:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0052: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:29:0x0052 */
    public static byte[] a(String str, String str2) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        byte[] byteArray = null;
        byteArray = null;
        byteArray = null;
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            try {
                try {
                    PublicKey publicKeyB = b("RSA", str2);
                    Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                    cipher.init(1, publicKeyB);
                    byte[] bytes = str.getBytes("UTF-8");
                    int blockSize = cipher.getBlockSize();
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    for (int i = 0; i < bytes.length; i += blockSize) {
                        try {
                            byteArrayOutputStream.write(cipher.doFinal(bytes, i, bytes.length - i < blockSize ? bytes.length - i : blockSize));
                        } catch (Exception e2) {
                            e = e2;
                            qrm.d(e);
                            if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            return byteArray;
                        }
                    }
                    byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream3 = byteArrayOutputStream2;
                    if (byteArrayOutputStream3 != null) {
                        try {
                            byteArrayOutputStream3.close();
                        } catch (IOException e3) {
                            qrm.d(e3);
                        }
                    }
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                if (byteArrayOutputStream3 != null) {
                    byteArrayOutputStream3.close();
                }
                throw th;
            }
        } catch (IOException e5) {
            qrm.d(e5);
        }
        return byteArray;
    }

    public static PublicKey b(String str, String str2) throws Exception {
        return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(kam.d(str2)));
    }
}
