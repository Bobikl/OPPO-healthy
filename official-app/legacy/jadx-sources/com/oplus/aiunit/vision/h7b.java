package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes13.dex */
public class h7b {
    public static boolean sDebuggable = false;

    public static void a(String str, String str2) {
        Log.w("DOS:" + str, str2);
    }

    public static void b(String str, String str2, Throwable th) {
        Log.w("DOS:" + str, str2, th);
    }
}
