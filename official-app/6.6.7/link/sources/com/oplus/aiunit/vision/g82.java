package com.oplus.aiunit.vision;

import android.os.Trace;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class g82 {
    public static final boolean a = !if0.z();

    public static void a(String str) {
        if (!a || str == null || str.length() <= 0 || str.length() > 127) {
            return;
        }
        Trace.beginSection(str);
    }

    public static void b() {
        if (a) {
            Trace.endSection();
        }
    }

    public static boolean c() {
        return a;
    }
}
