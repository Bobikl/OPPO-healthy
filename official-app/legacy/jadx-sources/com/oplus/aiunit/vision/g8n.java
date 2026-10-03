package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g8n {

    /* JADX INFO: renamed from: s_a, reason: collision with root package name */
    public static boolean f11675s_a = false;
    public static boolean s_b = false;
    public static boolean s_c = false;
    public static Context s_d;

    public static HashMap a(int i) {
        ThreadPoolExecutor threadPoolExecutor = o7n.f14829s_a;
        int i2 = (i > h8n.f12057s_a || i <= 0) ? 10001 : 10000;
        if (i2 != 10000) {
            throw new RuntimeException(i2 + "");
        }
        ArrayList<String> arrayListE = o7n.e(i);
        if (b()) {
            return v7n.f17744s_a.e(s_d, arrayListE);
        }
        HashMap map = new HashMap();
        for (String str : arrayListE) {
            map.put(str, str == "OUID_STATUS" ? "FALSE" : "");
        }
        return map;
    }

    public static boolean b() {
        if (!f11675s_a) {
            Log.e("IDHelper", "1001");
            return false;
        }
        if (!s_b && !s_c) {
            Log.e("IDHelper", "1002");
            return false;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return true;
        }
        Log.e("IDHelper", "1003");
        return false;
    }
}
