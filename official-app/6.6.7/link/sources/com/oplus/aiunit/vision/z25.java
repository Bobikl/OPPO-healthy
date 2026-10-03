package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class z25 {
    public static final String COMMON_LOG_TAG = "PhysicsWorld";
    public static final String FRAME_LOG_TAG = "PhysicsWorld-Frame";
    public static boolean sDebug = false;
    public static boolean sDebugFrame = false;

    public static boolean a() {
        return sDebugFrame;
    }

    public static boolean b() {
        return sDebug;
    }

    public static void c(String str) {
        d(COMMON_LOG_TAG, str);
    }

    public static void d(String str, String str2) {
        Log.d(str, str2);
    }
}
