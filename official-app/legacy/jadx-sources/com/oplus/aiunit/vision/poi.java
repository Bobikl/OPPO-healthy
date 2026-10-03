package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Log;
import com.platform.usercenter.tools.device.OpenIDHelper;
import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes8.dex */
public class poi {
    @Deprecated
    public static void a(Context context) {
    }

    @Deprecated
    public static String b(Context context) {
        k8n.a("2006");
        return e8n.a(1, OpenIDHelper.APID);
    }

    @Deprecated
    public static String c(Context context) {
        k8n.a("2005");
        return e8n.a(2, OpenIDHelper.AUID);
    }

    public static Context d(Context context) {
        return (context == null || context.getApplicationContext() == null) ? context : context.getApplicationContext();
    }

    @Deprecated
    public static String e(Context context) {
        k8n.a("2004");
        return e8n.a(4, OpenIDHelper.DUID);
    }

    @Deprecated
    public static String f(Context context) {
        k8n.a("2001");
        return e8n.a(16, OpenIDHelper.GUID);
    }

    @Deprecated
    public static String g(Context context) {
        k8n.a("2003");
        return e8n.a(8, OpenIDHelper.OUID);
    }

    @Deprecated
    public static boolean h(Context context) {
        k8n.a("2002");
        if (!e8n.f10821s_a) {
            Log.e("IDHelper", "1001");
        } else if (!e8n.s_c) {
            HashMap mapA = g8n.a(32);
            return "TRUE".equalsIgnoreCase(mapA.get("OUID_STATUS") == null ? "FALSE" : (String) mapA.get("OUID_STATUS"));
        }
        return false;
    }

    public static ooi i(Context context, int i) {
        HashMap mapA;
        k8n.a("2022");
        if (!e8n.f10821s_a) {
            Log.e("IDHelper", "1001");
            return new ooi("", "", false, "", "", "");
        }
        if (e8n.s_c) {
            if (!e8n.s_b) {
                Log.e("IDHelper", "1002");
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                Log.e("IDHelper", "1003");
            } else {
                ThreadPoolExecutor threadPoolExecutor = o7n.f14829s_a;
                int i2 = (i > h8n.f12057s_a || i <= 0) ? 10001 : 10000;
                if (i2 != 10000) {
                    throw new RuntimeException(i2 + "");
                }
                mapA = p7n.f15250s_a.e(e8n.s_d, o7n.e(i));
            }
            return new ooi("", "", false, "", "", "");
        }
        mapA = g8n.a(i);
        return new ooi(mapA.get(OpenIDHelper.GUID) == null ? "" : (String) mapA.get(OpenIDHelper.GUID), mapA.get(OpenIDHelper.OUID) == null ? "" : (String) mapA.get(OpenIDHelper.OUID), "TRUE".equalsIgnoreCase(mapA.get("OUID_STATUS") == null ? "FALSE" : (String) mapA.get("OUID_STATUS")), mapA.get(OpenIDHelper.DUID) != null ? (String) mapA.get(OpenIDHelper.DUID) : "", mapA.get(OpenIDHelper.APID) == null ? "" : (String) mapA.get(OpenIDHelper.APID), mapA.get(OpenIDHelper.AUID) == null ? "" : (String) mapA.get(OpenIDHelper.AUID));
    }

    public static void j(Context context) {
        boolean z;
        Context contextD = d(context);
        e8n.s_d = contextD;
        o7n.l(contextD);
        c8n c8nVar = z7n.f19313s_a;
        c8nVar.h = e8n.s_d;
        k8n.a("2008");
        try {
            PackageInfo packageInfo = c8nVar.h.getPackageManager().getPackageInfo("com.oplus.stdid", 8);
            z = packageInfo != null && packageInfo.versionCode >= 1 && o7n.h(c8nVar.h);
        } catch (PackageManager.NameNotFoundException e2) {
            k8n.b("1078", e2);
        } catch (Exception e3) {
            k8n.b("1079", e3);
        }
        e8n.s_b = z;
        if (z) {
            e8n.s_c = true;
        } else {
            e8n.s_c = false;
            g8n.s_d = e8n.s_d;
            boolean zK = d8n.f10435s_a.k(g8n.s_d);
            g8n.s_b = zK;
            if (zK) {
                v7n.f17744s_a.b = "OP_APP";
            } else {
                g8n.s_c = m8n.f13986s_a.k(g8n.s_d);
                v7n.f17744s_a.b = "MCS_APP";
            }
            g8n.f11675s_a = true;
        }
        e8n.f10821s_a = true;
    }

    public static boolean k() {
        if (!e8n.f10821s_a) {
            Log.e("IDHelper", "1001");
        } else {
            if (e8n.s_c) {
                return e8n.s_b;
            }
            if (!g8n.f11675s_a) {
                Log.e("IDHelper", "1001");
            }
            if (g8n.s_b || g8n.s_c) {
                return true;
            }
        }
        return false;
    }
}
