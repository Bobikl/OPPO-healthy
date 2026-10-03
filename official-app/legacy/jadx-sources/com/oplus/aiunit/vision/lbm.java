package com.oplus.aiunit.vision;

import android.util.Base64;

/* JADX INFO: loaded from: classes16.dex */
public class lbm {
    public static String a(String str) {
        return new String(Base64.decode(str.getBytes(), 0));
    }
}
