package com.oplus.aiunit.vision;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.WindowManager;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.mydevices.sdk.compat.DeviceInfoCompat;
import com.oplus.smartenginehelper.ParserTag;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class l8 {
    public static int a;
    public static int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f13565c;
    public static String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f13566e;
    public static int f;
    public static String g;
    public static String h;
    public static String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f13567j;
    public static String k;

    public static String A() {
        String str;
        try {
            str = (String) ri.b("android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class, String.class}, new Object[]{xj.a(true), ""});
        } catch (Exception e2) {
            mb.a("AcDeviceInfoUtil", "getRegionUserSet error:" + e2.getMessage());
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            try {
                str = (String) ri.b("android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class, String.class}, new Object[]{xj.a(false), ""});
            } catch (Exception e3) {
                mb.a("AcDeviceInfoUtil", "getRegionUserSet error2:" + e3.getMessage());
            }
        }
        return "OC".equalsIgnoreCase(str) ? "CN" : str;
    }

    public static String B() {
        return Calendar.getInstance().getTimeZone().getID();
    }

    public static boolean C(Context context) {
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        return context.getPackageManager().hasSystemFeature("oplus.feature.largescreen") || q("oplus.hardware.type.tablet") || q("oplus.hardware.type.fold");
    }

    public static String a(Context context) {
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.usercenter.authorities.provider.open", 0);
        if (providerInfoResolveContentProvider != null) {
            return providerInfoResolveContentProvider.packageName;
        }
        return null;
    }

    public static int b(Context context) {
        String strA = a(context);
        if (TextUtils.isEmpty(strA)) {
            Log.e("AcDeviceInfoUtil", "accountAppPkgName is empty");
            return 0;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(strA, 0);
            if (packageInfo != null) {
                return packageInfo.versionCode;
            }
        } catch (Exception e2) {
            Log.e("AcDeviceInfoUtil", e2.getMessage());
        }
        return 0;
    }

    public static String c() {
        return Build.VERSION.RELEASE;
    }

    public static String d() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static String e(Context context, String str) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(str, 0).versionCode);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("AcDeviceInfoUtil", e2.getMessage());
            return "";
        }
    }

    public static String f() {
        return Build.BRAND;
    }

    public static String g(Context context) {
        String str;
        if (!TextUtils.isEmpty(f13565c)) {
            return f13565c;
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            f13565c = op5.WATCH;
            return op5.WATCH;
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.pc")) {
            f13565c = "pc";
            return "pc";
        }
        try {
            str = (String) ri.b("android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class}, new Object[]{"ro.build.characteristics"});
        } catch (Exception e2) {
            mb.a("AcDeviceInfoUtil", "getDeviceCategory padTag null error:" + e2.getMessage());
            str = null;
        }
        if (!TextUtils.isEmpty(str) && str.contains("tablet")) {
            f13565c = DeviceInfoCompat.DeviceType.PAD;
            return DeviceInfoCompat.DeviceType.PAD;
        }
        if (4 == ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType()) {
            f13565c = DeviceInfoCompat.DeviceType.TV;
            return DeviceInfoCompat.DeviceType.TV;
        }
        if (q("oplus.hardware.type.fold")) {
            f13565c = "foldPhone";
            return "foldPhone";
        }
        f13565c = "Mobile";
        return "Mobile";
    }

    public static String h(Context context) {
        String strO = "";
        if (s() >= 24) {
            try {
                int identifier = context.getResources().getIdentifier("language_values_exam", TypedValues.Custom.S_STRING, "oplus");
                if (-1 != identifier) {
                    strO = context.getResources().getString(identifier);
                }
            } catch (Exception e2) {
                mb.a("AcDeviceInfoUtil", "getResource Error:" + e2.getMessage());
                strO = o();
            }
        }
        return TextUtils.isEmpty(strO) ? o() : strO;
    }

    public static String i() {
        return Locale.getDefault().toLanguageTag();
    }

    public static String j() {
        return Build.MODEL;
    }

    public static String k(Context context) {
        try {
            String str = (String) ri.b(xj.e(true), "getDeviceName", new Class[]{Context.class}, new Object[]{context});
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        } catch (Exception e2) {
            mb.a("AcDeviceInfoUtil", "getDeviceName error1:" + e2.getMessage());
        }
        try {
            String str2 = (String) ri.b(xj.e(false), "getDeviceName", new Class[]{Context.class}, new Object[]{context});
            return !TextUtils.isEmpty(str2) ? str2 : "";
        } catch (Exception e3) {
            mb.a("AcDeviceInfoUtil", "getDeviceName error2:" + e3.getMessage());
            return "";
        }
    }

    public static String l(Context context) {
        String string;
        try {
            string = Settings.Global.getString(context.getContentResolver(), "oplus_system_folding_mode");
        } catch (Exception e2) {
            Log.e("AcDeviceInfoUtil", e2.getMessage());
            string = null;
        }
        return string == null ? "" : string;
    }

    public static String m(Context context) {
        if (!TextUtils.isEmpty(i)) {
            return i;
        }
        String str = context.getApplicationContext().getApplicationInfo().packageName;
        i = str;
        return str;
    }

    public static String n(Context context) {
        if (!TextUtils.isEmpty(f13567j)) {
            return f13567j;
        }
        String strE = e(context, context.getPackageName());
        f13567j = strE;
        return strE;
    }

    public static String o() {
        String languageTag = Locale.getDefault().toLanguageTag();
        if ("id-ID".equalsIgnoreCase(languageTag)) {
            return "in-ID";
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(languageTag);
        return localeForLanguageTag.getLanguage() + "-" + localeForLanguageTag.getCountry();
    }

    public static String p() {
        return Locale.getDefault().toString();
    }

    public static boolean q(String str) {
        try {
            return ((Boolean) ri.a(ri.b("com.oplus.content.OplusFeatureConfigManager", "getInstance", null, null), "hasFeature", new Class[]{String.class}, new Object[]{str})).booleanValue();
        } catch (Exception e2) {
            mb.a("AcDeviceInfoUtil", "getOplusFeature error:" + e2.getMessage());
            return false;
        }
    }

    public static String r() {
        if (!TextUtils.isEmpty(f13566e)) {
            return f13566e;
        }
        if (TextUtils.isEmpty(f13566e)) {
            try {
                f13566e = (String) ri.b("android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class}, new Object[]{xj.h(true)});
            } catch (Exception e2) {
                mb.a("AcDeviceInfoUtil", "getOplusOsRomVersion error1:" + e2.getMessage());
            }
        }
        if (TextUtils.isEmpty(f13566e)) {
            try {
                f13566e = (String) ri.b("android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class}, new Object[]{xj.h(false)});
            } catch (Exception e3) {
                mb.a("AcDeviceInfoUtil", "getOplusOsRomVersion error2:" + e3.getMessage());
            }
        }
        return f13566e;
    }

    public static int s() {
        int iIntValue;
        int i2 = f;
        if (i2 > 0) {
            return i2;
        }
        try {
            iIntValue = ((Integer) ri.b(xj.e(true), xj.f(true), new Class[0], null)).intValue();
        } catch (Exception e2) {
            mb.a("AcDeviceInfoUtil", "getOplusOsRomVersionCode error1:" + e2.getMessage());
            iIntValue = 0;
        }
        if (iIntValue <= 0) {
            try {
                iIntValue = ((Integer) ri.b(xj.e(false), xj.f(false), new Class[0], null)).intValue();
            } catch (Exception e3) {
                mb.a("AcDeviceInfoUtil", "getOplusOsRomVersionCode error2:" + e3.getMessage());
            }
        }
        f = iIntValue;
        return iIntValue;
    }

    public static long t() {
        return Build.TIME;
    }

    public static String u() {
        if (!TextUtils.isEmpty(h)) {
            return h;
        }
        try {
            h = (String) ri.b("android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class}, new Object[]{"ro.build.version.ota"});
        } catch (Exception e2) {
            mb.a("AcDeviceInfoUtil", "getOsOtaVersion error:" + e2.getMessage());
        }
        return h;
    }

    public static String v() {
        if (!TextUtils.isEmpty(g)) {
            return g;
        }
        try {
            g = (String) ri.b("android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class}, new Object[]{"ro.product.name"});
        } catch (Exception e2) {
            mb.a("AcDeviceInfoUtil", "getOsProductName error:" + e2.getMessage());
        }
        return g;
    }

    public static String w() {
        if (!TextUtils.isEmpty(k)) {
            return k;
        }
        if (TextUtils.isEmpty(k)) {
            try {
                k = (String) ri.b("android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class}, new Object[]{xj.c(true)});
            } catch (Exception e2) {
                mb.a("AcDeviceInfoUtil", "getPhoneMarketName error1:" + e2.getMessage());
            }
        }
        if (TextUtils.isEmpty(k)) {
            try {
                k = (String) ri.b("android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class}, new Object[]{xj.c(false)});
            } catch (Exception e3) {
                mb.a("AcDeviceInfoUtil", "getPhoneMarketName error2:" + e3.getMessage());
            }
        }
        return k;
    }

    public static int x(Context context) {
        int i2 = a;
        if (i2 > 0) {
            return i2;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            int iHeight = windowManager.getMaximumWindowMetrics().getBounds().height();
            a = iHeight;
            return iHeight;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        int i3 = point.y;
        a = i3;
        return i3;
    }

    public static int y(Context context) {
        int i2 = b;
        if (i2 > 0) {
            return i2;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            int iWidth = windowManager.getMaximumWindowMetrics().getBounds().width();
            b = iWidth;
            return iWidth;
        }
        Point point = new Point();
        windowManager.getDefaultDisplay().getRealSize(point);
        int i3 = point.x;
        b = i3;
        return i3;
    }

    public static String z() {
        String str;
        if (!TextUtils.isEmpty(d)) {
            return d;
        }
        if (TextUtils.isEmpty("")) {
            try {
                str = (String) ri.b("android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class, String.class}, new Object[]{xj.d(), ""});
            } catch (Exception e2) {
                mb.a("AcDeviceInfoUtil", "getRegionMark error1:" + e2.getMessage());
                str = "";
            }
            Log.i("AcDeviceInfoUtil", "getDeviceRegionMark in 12.1:" + str);
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            try {
                str = (String) ri.b("android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class, String.class}, new Object[]{xj.g(true), ""});
            } catch (Exception e3) {
                mb.a("AcDeviceInfoUtil", "getRegionMark error2:" + e3.getMessage());
            }
            Log.i("AcDeviceInfoUtil", "getDeviceRegionMark in pure:" + str);
        }
        if (TextUtils.isEmpty(str)) {
            try {
                str = (String) ri.b("android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class, String.class}, new Object[]{xj.g(false), ""});
            } catch (Exception e4) {
                mb.a("AcDeviceInfoUtil", "getRegionMark error3:" + e4.getMessage());
            }
            Log.i("AcDeviceInfoUtil", "getDeviceRegionMark in notpure:" + str);
        }
        if (TextUtils.isEmpty(str)) {
            try {
                str = (String) ri.b("android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class, String.class}, new Object[]{xj.b(true), ""});
            } catch (Exception e5) {
                mb.a("AcDeviceInfoUtil", "getRegionMark error4:" + e5.getMessage());
            }
            Log.i("AcDeviceInfoUtil", "getDeviceRegionMark in aftersalePure:" + str);
        }
        if (TextUtils.isEmpty(str)) {
            try {
                str = (String) ri.b("android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class, String.class}, new Object[]{xj.b(false), ""});
            } catch (Exception e6) {
                mb.a("AcDeviceInfoUtil", "getRegionMark error5:" + e6.getMessage());
            }
            Log.i("AcDeviceInfoUtil", "getDeviceRegionMark in aftersaleNotPure:" + str);
        }
        if ("OC".equalsIgnoreCase(str)) {
            str = "CN";
        }
        d = str;
        return str;
    }
}
