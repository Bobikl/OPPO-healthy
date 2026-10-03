package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes16.dex */
public class k99 {
    public static final String a(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                a7b.b("HideStrUtils", "getHideStr str == null!!!");
            } else {
                int length = str.length();
                int i = (int) (length / 3.0f);
                str2 = str.substring(0, i) + "*********" + str.substring(i * 2, length);
            }
        } catch (Exception e2) {
            a7b.f("HideStrUtils", "getHideStr exception:" + e2.getMessage());
        }
        return str2;
    }
}
