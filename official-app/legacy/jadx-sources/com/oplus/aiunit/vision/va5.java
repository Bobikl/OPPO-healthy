package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class va5 {
    public static final String TAG = "DeviceBiReportUtil";
    public static final String TAG_DEVICE_MAC = "device_mac";
    public static final String TAG_DEVICE_MODEL = "device_model";
    public static final String TAG_DEVICE_SN = "device_sn";
    public static final String TAG_DEVICE_VERSION = "device_version";
    public static ua5 a;

    public static void a(Map<String, Object> map, ua5 ua5Var) {
        if (ua5Var == null || map == null) {
            return;
        }
        if (!TextUtils.isEmpty(ua5Var.d())) {
            map.put(TAG_DEVICE_VERSION, ua5Var.d());
        }
        if (!TextUtils.isEmpty(ua5Var.a())) {
            map.put(TAG_DEVICE_MODEL, ua5Var.a());
        }
        if (TextUtils.isEmpty(ua5Var.c())) {
            return;
        }
        map.put(TAG_DEVICE_SN, ua5Var.c());
    }

    public static void b(ua5 ua5Var, Map<String, Object> map) {
        if (ua5Var != null) {
            a = ua5Var;
        }
        a(map, a);
        a = null;
    }

    public static void c(String str, String str2, Map<String, Object> map) {
        try {
            com.heytap.health.base.track.a.F(str, str2, map);
        } catch (Exception e2) {
            a7b.m(TAG, "exception e " + e2);
        }
    }

    public static void d(ua5 ua5Var, Map<String, Object> map) {
        try {
            b(ua5Var, map);
            f(map);
        } catch (Exception e2) {
            a7b.m(TAG, "exception e " + e2);
        }
    }

    public static void e(String str, Map<String, Object> map) {
        try {
            com.heytap.health.base.track.a.G(str, map);
        } catch (Exception e2) {
            a7b.m(TAG, "exception e " + e2);
        }
    }

    public static void f(Map<String, Object> map) {
        try {
            com.heytap.health.base.track.a.c(map);
            com.heytap.health.base.track.a.G(2002, map);
        } catch (Exception e2) {
            a7b.m(TAG, "exception e " + e2);
        }
    }

    public static void g(ua5 ua5Var, Map<String, Object> map) {
        try {
            b(ua5Var, map);
            h(map);
        } catch (Exception e2) {
            a7b.m(TAG, "exception e " + e2);
        }
    }

    public static void h(Map<String, Object> map) {
        try {
            com.heytap.health.base.track.a.c(map);
            com.heytap.health.base.track.a.G(2000, map);
        } catch (Exception e2) {
            a7b.m(TAG, "exception e " + e2);
        }
    }
}
