package com.oplus.aiunit.vision;

import com.oplus.os.OplusBuild;

/* JADX INFO: loaded from: classes2.dex */
public class gvk {
    public static boolean a() {
        try {
            return OplusBuild.getOplusOSVERSION() >= 22;
        } catch (Throwable unused) {
            return false;
        }
    }
}
