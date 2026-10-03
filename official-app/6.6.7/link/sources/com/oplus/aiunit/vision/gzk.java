package com.oplus.aiunit.vision;

import com.oplus.os.OplusBuild;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class gzk {
    public static synchronized boolean a() {
        try {
        } catch (Throwable th) {
            i9b.b("VersionUtils", "Get OsVersion Exception : " + th.toString(), new Object[0]);
            return false;
        }
        return OplusBuild.getOplusOSVERSION() >= 22;
    }
}
