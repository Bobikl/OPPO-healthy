package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public class xvi {
    public static final String a;

    static {
        a = rg7.j() ? "模拟数据" : "";
    }

    public static String a(Object obj) {
        if (obj != null && !TextUtils.isEmpty(obj.toString())) {
            return obj.toString();
        }
        return a;
    }
}
