package com.oplus.aiunit.vision;

import com.oplus.os.OplusBuild;

/* JADX INFO: loaded from: classes8.dex */
public class ivk {
    public static synchronized boolean a() {
        try {
        } catch (Throwable th) {
            w7b.b("VersionUtils", "Get OsVersion Exception : " + th.toString(), new Object[0]);
            return false;
        }
        return OplusBuild.getOplusOSVERSION() >= 22;
    }
}
