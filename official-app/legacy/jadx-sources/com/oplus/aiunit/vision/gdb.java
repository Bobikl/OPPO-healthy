package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes15.dex */
public class gdb {
    public static String a(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 8) {
            return str;
        }
        return str.substring(0, 2) + ":*:" + str.substring(str.length() - 5);
    }
}
