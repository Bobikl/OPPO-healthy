package com.oplus.aiunit.vision;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes6.dex */
public class ab {
    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return b(messageDigest.digest());
        } catch (NoSuchAlgorithmException e2) {
            mb.a("AcIntercept.MD5", "calcMd5 fail, " + e2.getMessage());
            return "";
        }
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < bArr.length; i++) {
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
}
