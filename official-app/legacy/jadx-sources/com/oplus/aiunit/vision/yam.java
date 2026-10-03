package com.oplus.aiunit.vision;

import android.app.Activity;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yam {
    public static n06 a;

    public static m06 a(Activity activity) {
        n06 n06Var = a;
        if (n06Var == null || activity == null) {
            return null;
        }
        return new gum(activity, n06Var.a);
    }

    public static boolean b(n06 n06Var) {
        if (n06Var == null || TextUtils.isEmpty(n06Var.a)) {
            return false;
        }
        a = n06Var;
        return true;
    }
}
