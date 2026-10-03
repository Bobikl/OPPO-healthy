package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class y4n {
    public static boolean a = false;

    public static void a(String str, String str2) {
        if (a) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2) {
        Log.e(str, str2);
    }

    public static void c(String str, String str2) {
        if (a) {
            Log.i(str, str2);
        }
    }
}
