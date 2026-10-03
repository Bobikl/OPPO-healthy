package com.oplus.aiunit.vision;

import android.os.Build;

/* JADX INFO: loaded from: classes18.dex */
public class lkj {
    public static String a() {
        try {
            String str = Build.VERSION.RELEASE;
            return !e1j.l(str) ? str : "0";
        } catch (Exception e2) {
            t6b.d("SystemInfoHelper", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            return "0";
        }
    }

    public static String b() {
        return "OPPO Wearable";
    }
}
