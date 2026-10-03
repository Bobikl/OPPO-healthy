package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.oplus.utrace.utils.DcsCommon;
import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class gdn {
    public static boolean s_a = false;
    public static boolean s_b = false;
    public static boolean s_c = false;
    public static Context s_d;

    public static String a(int i, String str) {
        HashMap mapA;
        if (!s_a) {
            Log.e("IDHelper", DcsCommon.EVENT_ID_CAUGHT_EXCEPTION);
            return "";
        }
        if (s_c) {
            if (!s_b) {
                Log.e("IDHelper", "1002");
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                Log.e("IDHelper", "1003");
            } else {
                ThreadPoolExecutor threadPoolExecutor = qcn.s_a;
                int i2 = (i > jdn.s_a || i <= 0) ? 10001 : 10000;
                if (i2 != 10000) {
                    throw new RuntimeException(i2 + "");
                }
                mapA = rcn.s_a.e(s_d, qcn.e(i));
            }
            return "";
        }
        mapA = idn.a(i);
        return mapA.get(str) == null ? "" : (String) mapA.get(str);
    }
}
