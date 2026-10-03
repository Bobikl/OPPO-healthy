package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes8.dex */
public class acb {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static MessageDigest b;

    static {
        b = null;
        try {
            b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    public static void a(byte b2, StringBuffer stringBuffer) {
        char[] cArr = a;
        char c2 = cArr[(b2 & 240) >> 4];
        char c3 = cArr[b2 & 15];
        stringBuffer.append(c2);
        stringBuffer.append(c3);
    }

    public static String b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public static String c(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + i;
        while (i < i3) {
            a(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }

    public static String d(String str) {
        return TextUtils.isEmpty(str) ? "" : e(str.getBytes());
    }

    public static String e(byte[] bArr) {
        b.update(bArr);
        return b(b.digest());
    }
}
