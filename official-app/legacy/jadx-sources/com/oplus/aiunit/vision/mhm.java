package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes19.dex */
public class mhm {
    public static String a = null;
    public static final String b = "Y29tLm5lYXJtZS5tY3M=";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f14071c = "";

    public static String a() {
        if (TextUtils.isEmpty(f14071c)) {
            f14071c = new String(zam.l(b));
        }
        byte[] bArrC = c(b(f14071c));
        return bArrC != null ? new String(bArrC, Charset.forName("UTF-8")) : "";
    }

    public static byte[] b(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }

    public static byte[] c(byte[] bArr) {
        int length = bArr.length % 2 == 0 ? bArr.length : bArr.length - 1;
        for (int i = 0; i < length; i += 2) {
            byte b2 = bArr[i];
            int i2 = i + 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b2;
        }
        return bArr;
    }

    public static String d(String str) {
        boolean z;
        String strA = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            strA = jlm.a(str, a());
            cpm.a("sdkDecrypt desDecrypt des data " + strA);
            z = true;
        } catch (Exception e2) {
            cpm.a("sdkDecrypt DES excepiton " + e2.toString());
            z = false;
        }
        if (TextUtils.isEmpty(strA) ? false : z) {
            return strA;
        }
        try {
            strA = com.heytap.msp.push.encrypt.a.a(com.heytap.msp.push.encrypt.a.SDK_APP_SECRET, str);
            a = "AES";
            trm.d().b(a);
            cpm.a("sdkDecrypt desDecrypt aes data " + strA);
            return strA;
        } catch (Exception e3) {
            cpm.a("sdkDecrypt AES excepiton " + e3.toString());
            return strA;
        }
    }

    public static String e(String str) {
        boolean z;
        String strA = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            strA = com.heytap.msp.push.encrypt.a.a(com.heytap.msp.push.encrypt.a.SDK_APP_SECRET, str);
            cpm.a("sdkDecrypt aesDecrypt aes data " + strA);
            z = true;
        } catch (Exception e2) {
            cpm.a("sdkDecrypt AES excepiton " + e2.toString());
            z = false;
        }
        if (TextUtils.isEmpty(strA) ? false : z) {
            return strA;
        }
        try {
            strA = jlm.a(str, a());
            a = "DES";
            trm.d().b(a);
            cpm.a("sdkDecrypt aesDecrypt des data " + strA);
            return strA;
        } catch (Exception e3) {
            cpm.a("sdkDecrypt DES excepiton " + e3.toString());
            return strA;
        }
    }

    public static String f(String str) {
        cpm.a("sdkDecrypt start data " + str);
        if (TextUtils.isEmpty(a)) {
            a = trm.d().c();
        }
        if ("DES".equals(a)) {
            cpm.a("sdkDecrypt start DES");
            return d(str);
        }
        cpm.a("sdkDecrypt start AES");
        return e(str);
    }
}
