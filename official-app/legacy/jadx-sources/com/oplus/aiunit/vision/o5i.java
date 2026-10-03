package com.oplus.aiunit.vision;

import android.app.Activity;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes18.dex */
public class o5i implements gx7 {
    public static final o5i a = new o5i();

    public static o5i d() {
        return a;
    }

    @Override // com.oplus.aiunit.vision.gx7
    public void a(Activity activity) {
        lfg.i(activity);
        x81.c(activity, go6.PACKAGE_PATH);
    }

    @Override // com.oplus.aiunit.vision.gx7
    public void b(Activity activity, String str) {
        lfg.a(activity);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        x81.c(activity, str);
    }

    @Override // com.oplus.aiunit.vision.gx7
    public void c(Activity activity, String str) {
        lfg.i(activity);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        x81.c(activity, str);
    }
}
