package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e8n {

    /* JADX INFO: renamed from: s_a, reason: collision with root package name */
    public static boolean f10821s_a = false;
    public static boolean s_b = false;
    public static boolean s_c = false;
    public static Context s_d;

    public static String a(int i, String str) {
        HashMap mapA;
        if (!f10821s_a) {
            Log.e("IDHelper", "1001");
            return "";
        }
        if (s_c) {
            if (!s_b) {
                Log.e("IDHelper", "1002");
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                Log.e("IDHelper", "1003");
            } else {
                ThreadPoolExecutor threadPoolExecutor = o7n.f14829s_a;
                int i2 = (i > h8n.f12057s_a || i <= 0) ? 10001 : 10000;
                if (i2 != 10000) {
                    throw new RuntimeException(i2 + "");
                }
                mapA = p7n.f15250s_a.e(s_d, o7n.e(i));
            }
            return "";
        }
        mapA = g8n.a(i);
        return mapA.get(str) == null ? "" : (String) mapA.get(str);
    }
}
