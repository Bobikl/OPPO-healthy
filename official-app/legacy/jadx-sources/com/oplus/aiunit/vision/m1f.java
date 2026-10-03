package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
public class m1f {
    public static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        if (qe0.s()) {
            a7b.c("ProtoUtils", "Proto String Empty", new Exception("Proto String Empty"));
        }
        return "";
    }
}
