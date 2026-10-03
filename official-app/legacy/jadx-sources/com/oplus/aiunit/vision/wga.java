package com.oplus.aiunit.vision;

import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: classes8.dex */
public class wga {
    public static boolean a() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public static boolean b() {
        try {
            return new File("/system/app/Superuser.apk").exists();
        } catch (Exception e2) {
            v6b.b(e2.toString());
            return false;
        }
    }

    public static boolean c() {
        String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
        for (int i = 0; i < 8; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean d() {
        if (a() || b()) {
            return true;
        }
        return c();
    }
}
