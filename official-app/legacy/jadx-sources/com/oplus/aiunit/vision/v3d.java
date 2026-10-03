package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.heytap.store.base.core.util.DeviceInfoUtil;
import com.oplus.os.OplusBuild;

/* JADX INFO: loaded from: classes15.dex */
public class v3d {
    public static String a = "";
    public static String b;

    public static String a() {
        return Build.BRAND;
    }

    public static String b() {
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String strB = ukj.b("ro.build.version.opporom", "0");
        a = strB;
        return strB;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    public static String c() {
        String strD;
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        String strA = a();
        if ("OPPO".equalsIgnoreCase(strA)) {
            strD = d();
            if (!"Realme".equalsIgnoreCase(strD)) {
                strD = strA;
            }
        } else if ("Realme".equalsIgnoreCase(strA)) {
            strD = strA;
        } else {
            strD = DeviceInfoUtil.BRAND_ONEPLUES;
            if (DeviceInfoUtil.BRAND_ONEPLUES.equalsIgnoreCase(strA)) {
                strD = strA;
            } else {
                try {
                    if (!b78.a().getPackageManager().hasSystemFeature(qbm.f15739e)) {
                        strD = null;
                    }
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getPhoneBrand e:");
                    sb.append(th.getMessage());
                }
            }
        }
        if (!TextUtils.isEmpty(strD)) {
            strA = strD;
        }
        b = strA;
        return strA;
    }

    public static String d() {
        return ukj.b("ro.product.brand.sub", "");
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 33 && ilj.B() && OplusBuild.VERSION.SDK_VERSION >= 34;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 35 && ilj.B() && OplusBuild.VERSION.SDK_VERSION >= 37;
    }

    public static boolean g() {
        if (Build.VERSION.SDK_INT < 35) {
            return false;
        }
        return TextUtils.isEmpty(ukj.b("ro.build.version.oplusrom", ""));
    }

    public static boolean h(Context context) {
        if (!ilj.B() || Settings.Secure.getInt(context.getContentResolver(), "changeover_status", 0) <= 0) {
            return false;
        }
        Boolean boolE = gxe.e(context, "com.coloros.backuprestore");
        Boolean bool = Boolean.TRUE;
        if (bool.equals(boolE)) {
            return true;
        }
        Boolean boolE2 = gxe.e(context, "com.oneplus.backuprestore");
        if (bool.equals(boolE2)) {
            return true;
        }
        return boolE == null || boolE2 == null;
    }

    public static boolean i() {
        return DeviceInfoUtil.BRAND_ONEPLUES.equalsIgnoreCase(TextUtils.isEmpty(b) ? c() : b);
    }

    public static boolean j() {
        return "OPPO".equalsIgnoreCase(TextUtils.isEmpty(b) ? c() : b) && !g();
    }

    public static boolean k() {
        return "Realme".equalsIgnoreCase(TextUtils.isEmpty(b) ? c() : b) && !l();
    }

    public static boolean l() {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        return TextUtils.isEmpty(ukj.b("ro.build.version.oplusrom", "")) && TextUtils.isEmpty(ukj.b("ro.build.version.opporom", ""));
    }
}
