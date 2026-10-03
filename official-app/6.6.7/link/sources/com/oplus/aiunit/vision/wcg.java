package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class wcg {
    public static long a() {
        return b(0L);
    }

    public static long b(long j) {
        return c(null, j);
    }

    public static long c(String str, long j) {
        String str2 = "phoneno_inquire_update_lastUpdateTime";
        if (str != null) {
            str2 = "phoneno_inquire_update_lastUpdateTime_" + str;
        }
        return ((Long) p4h.b("heytap_health_call_interception.xml", str2, Long.valueOf(j))).longValue();
    }

    public static void d(long j) {
        e(j, null);
    }

    public static void e(long j, String str) {
        String str2 = "phoneno_inquire_update_lastUpdateTime";
        if (str != null) {
            str2 = "phoneno_inquire_update_lastUpdateTime_" + str;
        }
        p4h.d("heytap_health_call_interception.xml", str2, Long.valueOf(j));
    }
}
