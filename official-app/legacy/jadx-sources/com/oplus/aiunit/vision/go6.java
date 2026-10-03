package com.oplus.aiunit.vision;

import android.app.Activity;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes18.dex */
public class go6 {
    public static final String PACKAGE_PATH = "heytaphealth://com.heytap.health/main/cardPackageList";
    public static final go6 b = new go6();
    public String a;

    public static go6 b() {
        return b;
    }

    public void a(Activity activity) {
        c().b(activity, this.a);
        this.a = null;
    }

    public final gx7 c() {
        return TextUtils.isEmpty(this.a) ? ruc.d() : o5i.d();
    }

    public void d(Activity activity) {
        c().a(activity);
        this.a = null;
    }

    public void e(String str) {
        this.a = str;
    }

    public void f(Activity activity) {
        c().c(activity, this.a);
        this.a = null;
    }
}
