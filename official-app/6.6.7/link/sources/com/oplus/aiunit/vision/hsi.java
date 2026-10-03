package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.util.Log;
import com.oplus.utrace.utils.DcsCommon;
import java.util.HashMap;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class hsi {
    @Deprecated
    public static void a(Context context) {
    }

    @Deprecated
    public static String b(Context context) {
        mdn.a("2006");
        return gdn.a(1, "APID");
    }

    @Deprecated
    public static String c(Context context) {
        mdn.a("2005");
        return gdn.a(2, "AUID");
    }

    public static Context d(Context context) {
        return (context == null || context.getApplicationContext() == null) ? context : context.getApplicationContext();
    }

    @Deprecated
    public static String e(Context context) {
        mdn.a("2004");
        return gdn.a(4, "DUID");
    }

    @Deprecated
    public static String f(Context context) {
        mdn.a("2001");
        return gdn.a(16, "GUID");
    }

    @Deprecated
    public static String g(Context context) {
        mdn.a("2003");
        return gdn.a(8, "OUID");
    }

    @Deprecated
    public static boolean h(Context context) {
        mdn.a("2002");
        if (!gdn.s_a) {
            Log.e("IDHelper", DcsCommon.EVENT_ID_CAUGHT_EXCEPTION);
        } else if (!gdn.s_c) {
            HashMap mapA = idn.a(32);
            return "TRUE".equalsIgnoreCase(mapA.get("OUID_STATUS") == null ? "FALSE" : (String) mapA.get("OUID_STATUS"));
        }
        return false;
    }

    public static gsi i(Context context, int i) {
        HashMap mapA;
        mdn.a("2022");
        if (!gdn.s_a) {
            Log.e("IDHelper", DcsCommon.EVENT_ID_CAUGHT_EXCEPTION);
            return new gsi("", "", false, "", "", "");
        }
        if (gdn.s_c) {
            if (!gdn.s_b) {
                Log.e("IDHelper", "1002");
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                Log.e("IDHelper", "1003");
            } else {
                ThreadPoolExecutor threadPoolExecutor = qcn.s_a;
                int i2 = (i > jdn.s_a || i <= 0) ? 10001 : 10000;
                if (i2 != 10000) {
                    throw new RuntimeException(i2 + "");
                }
                mapA = rcn.s_a.e(gdn.s_d, qcn.e(i));
            }
            return new gsi("", "", false, "", "", "");
        }
        mapA = idn.a(i);
        return new gsi(mapA.get("GUID") == null ? "" : (String) mapA.get("GUID"), mapA.get("OUID") == null ? "" : (String) mapA.get("OUID"), "TRUE".equalsIgnoreCase(mapA.get("OUID_STATUS") == null ? "FALSE" : (String) mapA.get("OUID_STATUS")), mapA.get("DUID") != null ? (String) mapA.get("DUID") : "", mapA.get("APID") == null ? "" : (String) mapA.get("APID"), mapA.get("AUID") == null ? "" : (String) mapA.get("AUID"));
    }

    public static void j(Context context) {
        boolean z;
        Context contextD = d(context);
        gdn.s_d = contextD;
        qcn.l(contextD);
        edn ednVar = bdn.s_a;
        ((cdn) ednVar).h = gdn.s_d;
        mdn.a("2008");
        try {
            PackageInfo packageInfo = ((cdn) ednVar).h.getPackageManager().getPackageInfo("com.oplus.stdid", 8);
            z = packageInfo != null && packageInfo.versionCode >= 1 && qcn.h(((cdn) ednVar).h);
        } catch (PackageManager.NameNotFoundException e) {
            mdn.b("1078", e);
        } catch (Exception e2) {
            mdn.b("1079", e2);
        }
        gdn.s_b = z;
        if (z) {
            gdn.s_c = true;
        } else {
            gdn.s_c = false;
            idn.s_d = gdn.s_d;
            boolean zK = fdn.s_a.k(idn.s_d);
            idn.s_b = zK;
            if (zK) {
                ((scn) xcn.s_a).b = "OP_APP";
            } else {
                idn.s_c = odn.s_a.k(idn.s_d);
                ((scn) xcn.s_a).b = "MCS_APP";
            }
            idn.s_a = true;
        }
        gdn.s_a = true;
    }

    public static boolean k() {
        if (!gdn.s_a) {
            Log.e("IDHelper", DcsCommon.EVENT_ID_CAUGHT_EXCEPTION);
        } else {
            if (gdn.s_c) {
                return gdn.s_b;
            }
            if (!idn.s_a) {
                Log.e("IDHelper", DcsCommon.EVENT_ID_CAUGHT_EXCEPTION);
            }
            if (idn.s_b || idn.s_c) {
                return true;
            }
        }
        return false;
    }
}
