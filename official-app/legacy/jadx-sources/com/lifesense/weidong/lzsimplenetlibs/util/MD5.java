package com.lifesense.weidong.lzsimplenetlibs.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class MD5 {
    public static String getMD5Str(String str) {
        byte b;
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        } catch (NoSuchAlgorithmException unused) {
            System.out.println("NoSuchAlgorithmException caught!");
            System.exit(-1);
        }
        byte[] bArrDigest = messageDigest.digest();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArrDigest.length; i++) {
            if (Integer.toHexString(bArrDigest[i] & 255).length() == 1) {
                stringBuffer.append("0");
                b = bArrDigest[i];
            } else {
                b = bArrDigest[i];
            }
            stringBuffer.append(Integer.toHexString(b & 255));
        }
        return stringBuffer.toString();
    }

    public static String makeMD5(String str) {
        return makeMD5(str, false);
    }

    public static String makeMD5(String str, boolean z) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                bArr[i] = (byte) charArray[i];
            }
            byte[] bArrDigest = messageDigest.digest(bArr);
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                int i2 = b & 255;
                if (i2 < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i2));
            }
            String string = sb.toString();
            return z ? string.toUpperCase(Locale.getDefault()) : string;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
