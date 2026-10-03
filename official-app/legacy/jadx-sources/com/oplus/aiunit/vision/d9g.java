package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class d9g {
    public static long a(String str) {
        return b(str, 0L);
    }

    public static long b(String str, long j2) {
        return c(str, null, j2);
    }

    public static long c(String str, String str2, long j2) {
        String str3 = "heytap_health_calendar_" + x0h.c(str) + ".xml";
        String str4 = "calendarsync_synctime_lastSyncTime";
        if (str2 != null) {
            str4 = "calendarsync_synctime_lastSyncTime_" + str2;
        }
        return ((Long) x0h.b(str3, str4, Long.valueOf(j2))).longValue();
    }

    public static void d(String str, long j2) {
        e(str, j2, null);
    }

    public static void e(String str, long j2, String str2) {
        String str3 = "heytap_health_calendar_" + x0h.c(str) + ".xml";
        String str4 = "calendarsync_synctime_lastSyncTime";
        if (str2 != null) {
            str4 = "calendarsync_synctime_lastSyncTime_" + str2;
        }
        x0h.d(str3, str4, Long.valueOf(j2));
    }
}
