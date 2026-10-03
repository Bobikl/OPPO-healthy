package com.oplus.aiunit.vision;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class x3k {
    public static Map<Integer, String> a = new HashMap();

    public static void a(String str, Activity activity) {
        if (activity == null) {
            bn.c("TraceIdManager", "attachTraceId, webViewActivity is null");
            return;
        }
        int iIdentityHashCode = System.identityHashCode(activity);
        bn.f("TraceIdManager", "attachTraceId, traceId = " + str + ", hashCode = " + iIdentityHashCode);
        if (a.containsKey(Integer.valueOf(iIdentityHashCode))) {
            bn.f("TraceIdManager", "attachTraceId, webViewActivity already has traceId");
        } else {
            a.put(Integer.valueOf(iIdentityHashCode), str);
        }
    }

    public static String b(Activity activity) {
        String str = activity != null ? a.get(Integer.valueOf(System.identityHashCode(activity))) : null;
        bn.f("TraceIdManager", "getTraceId, traceId = " + str + ", hashCode = " + System.identityHashCode(activity));
        return str == null ? "" : str;
    }
}
