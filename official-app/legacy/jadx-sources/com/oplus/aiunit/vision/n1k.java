package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public class n1k {
    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str3 == null) {
            return false;
        }
        return vb7.l().e(str, "\n\n" + str2 + ":\n" + str3 + "\n\n");
    }
}
