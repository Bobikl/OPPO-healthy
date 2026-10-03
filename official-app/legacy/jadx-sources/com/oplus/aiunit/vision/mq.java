package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes16.dex */
public class mq {
    public static final String[] a = {"oppo1997", "baed2017", "java7865", "231uiedn", "09e32ji6", "0oiu3jdy", "0pej387l", "2dkliuyt", "20odiuye", "87j3id7w"};

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                int i = b & 255;
                if ((i >> 4) == 0) {
                    sb.append("0");
                    sb.append(Integer.toHexString(i));
                } else {
                    sb.append(Integer.toHexString(i));
                }
            }
            return sb.toString();
        } catch (Exception e2) {
            a7b.b("AesEncryptUtils", e2.getMessage());
            return null;
        }
    }

    public static int b(String str, int i) {
        return TextUtils.isEmpty(str) ? i : Integer.parseInt(str);
    }

    public static String c(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(h(a(str2.getBytes())));
            Cipher cipher = Cipher.getInstance(e7.AES_TRANSFORMATION);
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(wsd.k(str.getBytes())));
        } catch (Exception e2) {
            a7b.b("AesEncryptUtils", e2.getMessage());
            return null;
        }
    }

    public static String d(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(h(a(str2.getBytes())));
            Cipher cipher = Cipher.getInstance(e7.AES_TRANSFORMATION);
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return wsd.o(cipher.doFinal(str.getBytes()));
        } catch (Exception e2) {
            a7b.b("AesEncryptUtils", e2.getMessage());
            return null;
        }
    }

    public static String e(String str) {
        return a[b(str.substring(0, 1), 0)] + str.substring(4, 12);
    }

    public static String f() {
        return new SecureRandom().nextInt(10) + g(14);
    }

    public static String g(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 64; i2 <= 90; i2++) {
            arrayList.add(String.valueOf((char) i2));
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            arrayList.add(String.valueOf((char) i3));
        }
        for (int i4 = 33; i4 <= 43; i4++) {
            if (i4 != 34 && i4 != 39 && i4 != 42) {
                arrayList.add(String.valueOf((char) i4));
            }
        }
        arrayList.add(String.valueOf('_'));
        for (int i5 = 0; i5 < 10; i5++) {
            arrayList.add(i5 + "");
        }
        int size = arrayList.size();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        do {
            sb.append((String) arrayList.get(secureRandom.nextInt(size - 1) + 1));
            i--;
        } while (i > 0);
        return sb.toString();
    }

    public static byte[] h(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }
}
