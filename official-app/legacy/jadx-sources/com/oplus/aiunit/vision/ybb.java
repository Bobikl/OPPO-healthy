package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes19.dex */
public class ybb {
    public static final String MD_5 = "MD5";
    public static final String UTF_8 = "UTF-8";

    public static String a(String str) {
        String strB = b(str);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        return strB.substring(0, 8);
    }

    public static String b(String str) {
        if (str == null) {
            ltl.i("MD5Util", "strToMD5 string == null.");
            return null;
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e2) {
            ltl.a("MD5Util", "UnsupportedEncodingException " + e2.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e3) {
            ltl.a("MD5Util", "NoSuchAlgorithmException " + e3.getMessage());
            return null;
        }
    }
}
