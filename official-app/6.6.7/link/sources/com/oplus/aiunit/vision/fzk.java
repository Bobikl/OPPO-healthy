package com.oplus.aiunit.vision;

import android.os.Build;
import com.oplus.os.OplusBuild;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class fzk {
    public static boolean a() {
        try {
            return OplusBuild.getOplusOSVERSION() >= 22;
        } catch (Throwable th) {
            e3e.b("Get OsVersion Exception : " + th.toString());
            return false;
        }
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
