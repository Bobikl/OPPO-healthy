package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes15.dex */
public class rke {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (char c2 : str.toCharArray()) {
            if (Character.isLowerCase(c2) || Character.isUpperCase(c2)) {
                sb.append(Character.toUpperCase(c2));
            } else if (Character.isDigit(c2)) {
                sb.append(c2);
            } else if (c2 > 128) {
                sb.append(kke.f(c2));
            } else {
                sb.append(c2);
            }
        }
        return sb.toString();
    }
}
