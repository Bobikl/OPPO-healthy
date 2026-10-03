package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class rb3 {
    public static final String CIPHER_AES_128 = "AES128";
    public static final String CIPHER_AES_256 = "AES256";
    public static bp9 a = new o();
    public static bp9 b = new p();

    public static bp9 a(String str) {
        if (TextUtils.isEmpty(str)) {
            vml.c("Cipher", "empty cipher name");
            return null;
        }
        bp9 bp9Var = a;
        str.hashCode();
        if (str.equals(CIPHER_AES_128)) {
            return a;
        }
        return !str.equals(CIPHER_AES_256) ? bp9Var : b;
    }
}
