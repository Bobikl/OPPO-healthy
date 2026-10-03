package com.oplus.aiunit.vision;

import android.content.Intent;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes18.dex */
public class n6e {
    public static String a(Intent intent) {
        String stringExtra = intent.getStringExtra("device_pair_type");
        return TextUtils.isEmpty(stringExtra) ? "type_self" : stringExtra;
    }

    public static boolean b(String str) {
        return TextUtils.equals(str, "type_family");
    }
}
