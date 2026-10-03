package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public class vik {
    public static final int NO_VALUE_INT = -1;
    public static final String TAG_ELEMENT = "element";
    public static final String TAG_MODULE_ID = "moduleid";
    public static final String TAG_POSTION1 = "position1";
    public static final String TAG_POSTION2 = "position2";
    public static final String TAG_STATUS = "status";

    public interface a {
        void intercept(Map<String, Object> map);
    }

    public static void a(int i) {
        d(i, null, -1, -1);
    }

    public static void b(int i, int i2) {
        d(i, null, i2, -1);
    }

    public static void c(int i, String str) {
        d(i, str, -1, -1);
    }

    public static void d(int i, String str, int i2, int i3) {
        e(null, i, str, i2, i3);
    }

    public static void e(ua5 ua5Var, int i, String str, int i2, int i3) {
        g(ua5Var, i, str, i2, i3, -1, null);
    }

    public static void f(ua5 ua5Var, int i, String str, int i2, int i3, int i4) {
        g(ua5Var, i, str, i2, i3, i4, null);
    }

    public static void g(ua5 ua5Var, int i, String str, int i2, int i3, int i4, a aVar) {
        Map<String, Object> mapJ = j(i, str, i2, i3, i4);
        if (aVar != null) {
            aVar.intercept(mapJ);
        }
        h(ua5Var, mapJ);
    }

    public static void h(ua5 ua5Var, Map<String, Object> map) {
        va5.d(ua5Var, map);
    }

    public static void i(Map<String, Object> map) {
        va5.f(map);
    }

    @NotNull
    public static Map<String, Object> j(int i, String str, int i2, int i3, int i4) {
        HashMap map = new HashMap();
        if (i != -1) {
            map.put(TAG_MODULE_ID, Integer.valueOf(i));
        }
        if (i2 != -1) {
            map.put(TAG_POSTION1, Integer.valueOf(i2));
        }
        if (i3 != -1) {
            map.put(TAG_POSTION2, Integer.valueOf(i3));
        }
        if (!TextUtils.isEmpty(str)) {
            map.put("element", str);
        }
        if (i4 != -1) {
            map.put("status", Integer.valueOf(i4));
        }
        return map;
    }

    public static void k(String str, String str2, Map<String, Object> map) {
        va5.c(str, str2, map);
    }

    public static void l(String str, Map<String, Object> map) {
        va5.e(str, map);
    }

    public static void m(int i, String str) {
        n(i, str, -1, -1);
    }

    public static void n(int i, String str, int i2, int i3) {
        q(null, i, str, i2, i3, null);
    }

    public static void o(int i, Map<String, Object> map) {
        Map<String, Object> mapJ = j(i, null, -1, -1, -1);
        mapJ.putAll(map);
        r(null, mapJ);
    }

    public static void p(ua5 ua5Var, int i, String str, int i2, int i3) {
        q(ua5Var, i, str, i2, i3, null);
    }

    public static void q(ua5 ua5Var, int i, String str, int i2, int i3, a aVar) {
        Map<String, Object> mapJ = j(i, str, i2, i3, -1);
        if (aVar != null) {
            aVar.intercept(mapJ);
        }
        r(ua5Var, mapJ);
    }

    public static void r(ua5 ua5Var, Map<String, Object> map) {
        va5.g(ua5Var, map);
    }
}
