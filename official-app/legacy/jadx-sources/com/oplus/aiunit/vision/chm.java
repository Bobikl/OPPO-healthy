package com.oplus.aiunit.vision;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public class chm {
    public static chm b;
    public Context a;

    public static chm e() {
        if (b == null) {
            b = new chm();
        }
        return b;
    }

    public static boolean f() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i = 0; i < 10; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    public ugm a() {
        return ugm.d();
    }

    public void b(Context context) {
        ugm.d();
        this.a = context.getApplicationContext();
    }

    public Context c() {
        return this.a;
    }

    public String d() {
        return fgm.d(null, this.a);
    }
}
