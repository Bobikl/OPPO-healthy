package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes17.dex */
public class xpg {
    public static String a = "";

    public static String a(ContentResolver contentResolver, String str) {
        if (g9f.a().b("Settings.Secure", "getString", "aid should not to use.") || !m3k.h()) {
            return "";
        }
        if (lp3.a() && TextUtils.isEmpty(a)) {
            a = ilj.e();
        }
        return a;
    }
}
