package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes15.dex */
public class db3 {
    public static final String CIPHER_AES_128 = "AES128";
    public static final String CIPHER_AES_256 = "AES256";
    public static vn9 a = new o();
    public static vn9 b = new p();

    public static vn9 a(String str) {
        if (TextUtils.isEmpty(str)) {
            xil.c("Cipher", "empty cipher name");
            return null;
        }
        vn9 vn9Var = a;
        str.hashCode();
        if (str.equals(CIPHER_AES_128)) {
            return a;
        }
        return !str.equals(CIPHER_AES_256) ? vn9Var : b;
    }
}
