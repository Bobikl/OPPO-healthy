package com.oplus.aiunit.vision;

import android.os.Trace;

/* JADX INFO: loaded from: classes9.dex */
public final class s72 {
    public static final boolean a = !qe0.z();

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
