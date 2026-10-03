package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.system.Os;
import android.system.StructStat;
import android.text.TextUtils;
import androidx.core.content.pm.PackageInfoCompat;
import com.heytap.store.base.core.util.OSUtils;
import com.squareup.moshi.Json;
import com.utils.UidUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes15.dex */
public class ilj {
    public static final String DEFAULT_ANDROID_ID = "0000000000000000";
    public static final int OplusOS_11_0 = 19;
    public static final int OplusOS_11_1 = 20;
    public static final int OplusOS_11_2 = 21;
    public static final int OplusOS_11_3 = 22;
    public static final int OplusOS_12_0 = 23;
    public static final int OplusOS_12_1 = 24;
    public static final int OplusOS_12_2 = 25;
    public static final int OplusOS_13_0 = 26;
    public static final int OplusOS_13_1 = 27;
    public static final int OplusOS_14_0 = 30;
    public static final int OplusOS_15_0 = 34;
    public static final int OplusOS_16_0 = 37;
    public static final int OplusOS_16_1 = 38;
    public static final int OplusOS_17_0 = 39;
    public static final int OplusOS_7_0 = 16;
    public static String a = null;
    public static String b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f12580c = null;
    public static String d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f12581e = -1;

    public static synchronized boolean A() {
        return a("OPPO") && !v3d.g();
    }

    public static boolean B() {
        return v3d.k() || v3d.i() || A();
    }

    public static boolean C() {
        return Build.MANUFACTURER.toLowerCase().contains("samsung");
    }

    public static boolean D() {
        return l() >= 19 || v3d.k() || A();
    }

    public static synchronized boolean E() {
        return a(qqk.b.ROM_VIVO);
    }

    public static boolean a(String str) {
        String str2 = a;
        if (str2 != null) {
            return str2.equals(str);
        }
        String strA = ukj.a("ro.miui.ui.version.name");
        b = strA;
        if (TextUtils.isEmpty(strA)) {
            String strA2 = ukj.a(pcm.a);
            b = strA2;
            if (TextUtils.isEmpty(strA2)) {
                String strA3 = ukj.a("ro.build.version.opporom");
                b = strA3;
                if (TextUtils.isEmpty(strA3)) {
                    String strA4 = ukj.a("ro.vivo.os.version");
                    b = strA4;
                    if (TextUtils.isEmpty(strA4)) {
                        String strA5 = ukj.a("ro.smartisan.version");
                        b = strA5;
                        if (TextUtils.isEmpty(strA5)) {
                            String str3 = Build.DISPLAY;
                            b = str3;
                            if (str3.toUpperCase().contains(qqk.b.ROM_FLYME)) {
                                a = qqk.b.ROM_FLYME;
                            } else {
                                b = "unknown";
                                a = Build.MANUFACTURER.toUpperCase();
                            }
                        } else {
                            a = qqk.b.ROM_SMARTISAN;
                        }
                    } else {
                        a = qqk.b.ROM_VIVO;
                    }
                } else {
                    a = "OPPO";
                }
            } else {
                a = qqk.b.ROM_EMUI;
            }
        } else {
            a = qqk.b.ROM_MIUI;
        }
        return a.equals(str);
    }

    public static boolean b() {
        boolean zA = Build.VERSION.SDK_INT >= 33 ? dge.a(b78.a(), "android.permission.POST_NOTIFICATIONS") : true;
        a7b.f("SystemUtils", "post notification permission is " + zA);
        return zA;
    }

    @SuppressLint({"HardwareIds"})
    public static String c() {
        if (TextUtils.isEmpty(d)) {
            d = d(e());
        }
        return d;
    }

    public static String d(String str) {
        if (str == null || str.isEmpty()) {
            return new String(new char[64]).replace(Json.UNSET_NAME, "0");
        }
        return str + new String(new char[64 - str.length()]).replace(Json.UNSET_NAME, "0");
    }

    @SuppressLint({"HardwareIds"})
    public static String e() {
        int i = 0;
        if (!(m3k.g() || m3k.h())) {
            a7b.m("SystemUtils", "not agree protocol");
            return "";
        }
        if (TextUtils.isEmpty(f12580c)) {
            String strD = v9g.x("SP_NAME_LIB_BASE_ANDROID_ID").D("SP_KEY_LIB_BASE_ANDROID_ID");
            if (!TextUtils.isEmpty(strD)) {
                f12580c = strD;
            } else if (ax7.j().l()) {
                while (TextUtils.isEmpty(f12580c) && i < 2) {
                    f12580c = Settings.Secure.getString(b78.a().getContentResolver(), "android_id");
                    i++;
                    n7a.Companion aVar = n7a.INSTANCE;
                    String str = f12580c;
                    n7a.a(78, 4, aVar.f(str, 6, str.length() - 2));
                }
                if (TextUtils.isEmpty(f12580c)) {
                    a7b.f("SystemUtils", "read aid is empty，value=" + f12580c + ", use default aid");
                    f12580c = DEFAULT_ANDROID_ID;
                }
                v9g.x("SP_NAME_LIB_BASE_ANDROID_ID").U("SP_KEY_LIB_BASE_ANDROID_ID", f12580c);
            } else {
                a7b.m("SystemUtils", "App in background, AndroidId is empty");
            }
        }
        return f12580c;
    }

    public static String f() {
        return ukj.a("ro.build.version.opporom");
    }

    public static String g() {
        String strReplace = new UUID(Build.DISPLAY.hashCode(), Build.MANUFACTURER.hashCode()).toString().replace("-", "");
        StringBuilder sb = new StringBuilder();
        sb.append("client:");
        sb.append(strReplace);
        return strReplace;
    }

    public static String h() {
        return ukj.a("ro.build.version.ota");
    }

    public static int i() {
        return o(b78.b().getPackageName());
    }

    public static int j(String str) {
        int iIntValue;
        a7b.f("SystemUtils", "getPathUid() called with: path = [" + str + "]");
        try {
            StructStat structStatLstat = Os.lstat(str);
            a7b.f("SystemUtils", "getPathUid Os | stat is " + structStatLstat);
            iIntValue = structStatLstat.st_uid;
        } catch (Exception e2) {
            a7b.c("SystemUtils", "getPathUid Os e is " + e2.getMessage(), e2);
            iIntValue = -1;
        }
        if (iIntValue == -1) {
            try {
                Object objJ = ikf.p("libcore.io.Linux").d().c("lstat", str).j();
                a7b.f("SystemUtils", "getPathUid stat " + objJ);
                iIntValue = ((Integer) ikf.o(objJ).k("st_uid")).intValue();
                a7b.f("SystemUtils", "getPathUid | uid is " + iIntValue + " gid is " + ((Integer) ikf.o(objJ).k("st_gid")).intValue());
            } catch (Exception e3) {
                a7b.c("SystemUtils", "getPathUid e is " + e3.getMessage(), e3);
            }
        }
        if (iIntValue != -1) {
            return iIntValue;
        }
        try {
            iIntValue = (int) UidUtils.pathUid(str);
            a7b.f("SystemUtils", "getPathUid | UidUtils uid is " + iIntValue);
            return iIntValue;
        } catch (Exception unused) {
            return iIntValue;
        }
    }

    public static String k() {
        String strA = ukj.a("ro.build.version.oplusrom");
        if (TextUtils.isEmpty(strA)) {
            strA = ukj.a("ro.build.version.opporom");
            if (TextUtils.isEmpty(strA)) {
                strA = "V3.0.0";
            }
        }
        a7b.f("SystemUtils", "getRomVersion=" + strA);
        return strA;
    }

    @Deprecated
    public static int l() {
        int i = f12581e;
        if (i > -1) {
            return i;
        }
        int iM = m("com.oplus.os.OplusBuild", "getOplusOSVERSION");
        if (iM == 0) {
            iM = m("com.color.os.ColorBuild", "getColorOSVERSION");
        }
        a7b.f("SystemUtils", "[getRomVersionCode] --> romVersion=" + iM);
        f12581e = iM;
        return iM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int m(String str, String str2) {
        int i = 0;
        i = 0;
        try {
            Class<?> cls = Class.forName(str);
            Object objInvoke = cls.getDeclaredMethod(str2, new Class[0]).invoke(cls, new Object[0]);
            if (objInvoke != null) {
                int iIntValue = ((Integer) objInvoke).intValue();
                i = iIntValue;
                str = iIntValue;
            } else {
                a7b.m("SystemUtils", "[getRomVersionForClazz] --> method.invoke()=null");
                str = str;
            }
        } catch (Exception e2) {
            a7b.b("SystemUtils", "[getRomVersionForClazz] --> clazzStr=" + str + "error=" + e2.getMessage());
        }
        return i;
    }

    public static int n(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).uid;
        } catch (PackageManager.NameNotFoundException e2) {
            a7b.c("SystemUtils", "getUid: " + e2.getMessage(), e2);
            return -1;
        }
    }

    public static int o(String str) {
        try {
            return (int) PackageInfoCompat.getLongVersionCode(b78.b().getPackageManager().getPackageInfo(str, 0));
        } catch (PackageManager.NameNotFoundException e2) {
            a7b.b("SystemUtils", "getVersionCode() exception = " + e2.getMessage());
            return 0;
        }
    }

    public static String p(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            a7b.b("SystemUtils", "getVersionName() exception = " + e2.getMessage());
            return "";
        }
    }

    public static synchronized boolean q() {
        return a(qqk.b.ROM_EMUI);
    }

    public static boolean r(Context context) {
        return context.getPackageManager().hasSystemFeature("oppo.version.exp");
    }

    public static synchronized boolean s() {
        return a(qqk.b.ROM_FLYME);
    }

    public static boolean t() {
        return z() && "CN".equalsIgnoreCase(ukj.a("ro.build.region")) && ukj.a(OSUtils.KEY_ONEPLUS_OS_VERSION).startsWith("Hydrogen OS");
    }

    public static boolean u() {
        try {
            Class<?> cls = Class.forName("com.huawei.system.BuildEx");
            Object objInvoke = cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
            if (objInvoke == null) {
                return false;
            }
            return "harmony".equalsIgnoreCase(objInvoke.toString());
        } catch (Throwable th) {
            a7b.f("SystemUtils", "isHarmonyOs error " + th.getMessage());
            return false;
        }
    }

    public static boolean v() {
        return Build.BRAND.toLowerCase().contains("honor");
    }

    public static boolean w() {
        return Build.BRAND.toLowerCase().contains("huawei");
    }

    public static boolean x() {
        return l() >= 17;
    }

    public static synchronized boolean y() {
        return a(qqk.b.ROM_MIUI);
    }

    public static boolean z() {
        return v3d.i();
    }
}
