package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class e9g {
    public static long a(String str) {
        return b(str, 0L);
    }

    public static long b(String str, long j2) {
        return c(str, null, j2);
    }

    public static long c(String str, String str2, long j2) {
        String str3 = "heytap_health_contactsync_" + x0h.c(str) + ".xml";
        String str4 = "contactsync_synctime_lastSyncTime";
        if (str2 != null) {
            str4 = "contactsync_synctime_lastSyncTime_" + str2;
        }
        return ((Long) x0h.b(str3, str4, Long.valueOf(j2))).longValue();
    }

    public static boolean d() {
        return f(false);
    }

    public static boolean e(String str, boolean z) {
        String str2 = "contactsync_synctime_isNoDataDialogShowed";
        if (str != null) {
            str2 = "contactsync_synctime_isNoDataDialogShowed_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_contactsync.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean f(boolean z) {
        return e(null, z);
    }

    public static boolean g() {
        return i(false);
    }

    public static boolean h(String str, boolean z) {
        String str2 = "contactsync_synctime_isShowNoDataTip";
        if (str != null) {
            str2 = "contactsync_synctime_isShowNoDataTip_" + str;
        }
        return ((Boolean) x0h.b("heytap_health_contactsync.xml", str2, Boolean.valueOf(z))).booleanValue();
    }

    public static boolean i(boolean z) {
        return h(null, z);
    }

    public static int j() {
        return k(0);
    }

    public static int k(int i) {
        return l(null, i);
    }

    public static int l(String str, int i) {
        String str2 = "contactsync_synctime_lastSyncContactNum";
        if (str != null) {
            str2 = "contactsync_synctime_lastSyncContactNum_" + str;
        }
        return ((Integer) x0h.b("heytap_health_contactsync.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static void m(String str, long j2) {
        n(str, j2, null);
    }

    public static void n(String str, long j2, String str2) {
        String str3 = "heytap_health_contactsync_" + x0h.c(str) + ".xml";
        String str4 = "contactsync_synctime_lastSyncTime";
        if (str2 != null) {
            str4 = "contactsync_synctime_lastSyncTime_" + str2;
        }
        x0h.d(str3, str4, Long.valueOf(j2));
    }

    public static void o(boolean z) {
        p(z, null);
    }

    public static void p(boolean z, String str) {
        String str2 = "contactsync_synctime_isNoDataDialogShowed";
        if (str != null) {
            str2 = "contactsync_synctime_isNoDataDialogShowed_" + str;
        }
        x0h.d("heytap_health_contactsync.xml", str2, Boolean.valueOf(z));
    }

    public static void q(boolean z) {
        r(z, null);
    }

    public static void r(boolean z, String str) {
        String str2 = "contactsync_synctime_isShowNoDataTip";
        if (str != null) {
            str2 = "contactsync_synctime_isShowNoDataTip_" + str;
        }
        x0h.d("heytap_health_contactsync.xml", str2, Boolean.valueOf(z));
    }

    public static void s(int i) {
        t(i, null);
    }

    public static void t(int i, String str) {
        String str2 = "contactsync_synctime_lastSyncContactNum";
        if (str != null) {
            str2 = "contactsync_synctime_lastSyncContactNum_" + str;
        }
        x0h.d("heytap_health_contactsync.xml", str2, Integer.valueOf(i));
    }
}
