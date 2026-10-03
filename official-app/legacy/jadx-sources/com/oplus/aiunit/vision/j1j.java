package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes15.dex */
public class j1j {
    public static final String MD_5 = "MD5";
    public static final String UTF_8 = "UTF-8";
    public static final Charset a;
    public static final int b;

    static {
        Charset charset = StandardCharsets.UTF_8;
        a = charset;
        b = "…".getBytes(charset).length;
    }

    public static final int a(String str, String str2) {
        int iIndexOf;
        int i = 0;
        do {
            iIndexOf = str.indexOf(str2);
            if (iIndexOf >= 0) {
                str = str.substring(str2.length() + iIndexOf);
                i++;
            }
        } while (iIndexOf >= 0);
        return i;
    }

    public static String b(String str, int i) {
        return c(str, i, true);
    }

    public static String c(String str, int i, boolean z) {
        boolean z2;
        StringBuilder sb = new StringBuilder();
        sb.append("limitBytes, src: ");
        sb.append(str);
        sb.append(", limit: ");
        sb.append(i);
        if (TextUtils.isEmpty(str) || i <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("limitBytes, step1 fixStr: ");
        sb2.append(str);
        if (str.codePointCount(0, str.length()) > i) {
            str = str.substring(0, str.offsetByCodePoints(0, i));
            StringBuilder sb3 = new StringBuilder();
            sb3.append("limitBytes, step2 fixStr: ");
            sb3.append(str);
            z2 = true;
        } else {
            z2 = false;
        }
        byte[] bytes = str.getBytes(a);
        boolean z3 = bytes.length <= i ? z2 : true;
        if (z3 && z) {
            i -= b;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("limitBytes, fixLimit: ");
        sb4.append(i);
        int iCodePointCount = str.codePointCount(0, str.length());
        while (bytes.length > i) {
            str = str.substring(0, str.offsetByCodePoints(0, iCodePointCount));
            bytes = str.getBytes(a);
            iCodePointCount--;
        }
        if (z3 && z) {
            str = str + "…";
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("limitBytes, fixed str: ");
        sb5.append(str);
        sb5.append(", fixed bytes: ");
        sb5.append(Arrays.toString(bytes));
        return str;
    }

    public static String d(String str, int i) {
        return c(str, i, false);
    }

    public static String e(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b2 : bArrDigest) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("UnsupportedEncodingException ");
            sb2.append(e2.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("NoSuchAlgorithmException ");
            sb3.append(e3.getMessage());
            return null;
        }
    }
}
