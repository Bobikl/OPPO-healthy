package com.heytap.mspsdk.util;

import com.heytap.mspsdk.log.MspLog;
import com.oplus.os.OplusBuild;

/* JADX INFO: loaded from: classes19.dex */
public class b {
    public static volatile int a = -1;

    public static int a() {
        if (a != -1) {
            return a;
        }
        a = OplusBuild.getOplusOSVERSION();
        MspLog.e("ColorOSVersionUtils", "oplus ver:" + a);
        return a;
    }

    public static boolean b() {
        try {
            return a() >= 34;
        } catch (Throwable unused) {
            return false;
        }
    }
}
