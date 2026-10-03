package com.oplus.aiunit.vision;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public class g25 {
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
