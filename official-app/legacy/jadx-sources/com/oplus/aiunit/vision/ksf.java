package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes15.dex */
public class ksf {
    public static int a(int i) {
        return b(null, i);
    }

    public static int b(String str, int i) {
        String str2 = "blood_pressure_lifeCardClickCount";
        if (str != null) {
            str2 = "blood_pressure_lifeCardClickCount_" + str;
        }
        return ((Integer) x0h.b("heytap_health_blood_pressure.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static int c(int i) {
        return d(null, i);
    }

    public static int d(String str, int i) {
        String str2 = "blood_pressure_researchCardClickCount";
        if (str != null) {
            str2 = "blood_pressure_researchCardClickCount_" + str;
        }
        return ((Integer) x0h.b("heytap_health_blood_pressure.xml", str2, Integer.valueOf(i))).intValue();
    }

    public static void e(int i) {
        f(i, null);
    }

    public static void f(int i, String str) {
        String str2 = "blood_pressure_researchCardClickCount";
        if (str != null) {
            str2 = "blood_pressure_researchCardClickCount_" + str;
        }
        x0h.d("heytap_health_blood_pressure.xml", str2, Integer.valueOf(i));
    }
}
