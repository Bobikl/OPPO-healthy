package com.oplus.aiunit.vision;

import android.app.Application;

/* JADX INFO: loaded from: classes15.dex */
public class srf {
    public static void a(Application application) {
        boolean z = application.getResources() == null || application.getResources().getAssets() == null;
        a7b.f("ResChecker", "checkRes | app is " + application + " isNull is " + z);
        if (z) {
            gxe.o("ResChecker, checkRes | killProcess");
        }
    }
}
