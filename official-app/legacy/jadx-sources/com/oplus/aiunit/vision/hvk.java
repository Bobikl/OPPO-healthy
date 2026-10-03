package com.oplus.aiunit.vision;

import android.os.Build;
import com.oplus.os.OplusBuild;

/* JADX INFO: loaded from: classes8.dex */
public class hvk {
    public static boolean a() {
        try {
            return OplusBuild.getOplusOSVERSION() >= 22;
        } catch (Throwable th) {
            j1e.b("Get OsVersion Exception : " + th.toString());
            return false;
        }
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
