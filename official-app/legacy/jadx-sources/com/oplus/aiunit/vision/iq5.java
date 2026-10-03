package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.customer.feedback.sdk.util.HeaderInfoHelper;
import com.oplus.drs.base.util.SystemProperty;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class iq5 {
    public static final Context a;
    public static final String androidVersion;
    public static final String appName;
    public static final Pattern b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f12607c;
    public static String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f12608e;
    public static final PackageInfo f;
    public static final String hardware;
    public static final String model;
    public static final String multiDeviceSn;
    public static final int platForm;
    public static final String regionCode;
    public static final String regionMark;
    public static final String romVersion;
    public static final int versionCode;
    public static final String versionName;

    static {
        PackageInfo packageInfo;
        Context contextB = w56.b();
        a = contextB;
        Pattern patternCompile = Pattern.compile("^[MT]{2}[a-zA-Z0-9]{0,10}$");
        b = patternCompile;
        androidVersion = Build.VERSION.RELEASE;
        String str = Build.MODEL;
        model = !TextUtils.isEmpty(str) ? str.toUpperCase() : "0";
        if (TextUtils.isEmpty(str)) {
            z6b.u("PhoneMsgUtil", "No MODEL.");
        }
        String str2 = Build.HARDWARE;
        String upperCase = TextUtils.isEmpty(str2) ? "0" : str2.toUpperCase();
        hardware = upperCase;
        if (TextUtils.isEmpty(str2)) {
            z6b.u("PhoneMsgUtil", "No HARDWARE INFO.");
        }
        if ("QCOM".equals(upperCase)) {
            platForm = 2;
        } else if (patternCompile.matcher(upperCase).find()) {
            platForm = 1;
        } else {
            platForm = 0;
        }
        String strValueOf = "";
        romVersion = SystemProperty.get(HeaderInfoHelper.RO_BUILD_ID, "");
        regionMark = alf.d();
        regionCode = alf.c();
        try {
            packageInfo = contextB.getPackageManager().getPackageInfo(contextB.getPackageName(), 0);
        } catch (Exception e2) {
            z6b.o("PhoneMsgUtil", e2.getMessage());
            packageInfo = null;
        }
        f = packageInfo;
        versionCode = packageInfo != null ? (int) packageInfo.getLongVersionCode() : 0;
        versionName = packageInfo != null ? packageInfo.versionName : "";
        appName = packageInfo != null ? packageInfo.applicationInfo.loadLabel(a.getPackageManager()).toString() : "";
        try {
            UserManager userManager = (UserManager) a.getSystemService("user");
            if (userManager != null) {
                strValueOf = String.valueOf(userManager.getSerialNumberForUser(Process.myUserHandle()));
            }
        } catch (Exception e3) {
            z6b.o("PhoneMsgUtil", e3.getMessage());
        }
        multiDeviceSn = strValueOf;
    }

    public static String a() {
        if (d == null) {
            g();
        }
        String str = d;
        return str != null ? str : "";
    }

    public static int b() {
        String lowerCase = a().toLowerCase();
        lowerCase.hashCode();
        int i = 2;
        switch (lowerCase) {
            case "chn-ct":
            case "china net":
            case "中国电信":
            case "chinanet":
                break;
            case "cmcc":
            case "chinamobile":
            case "china mobile":
            case "中国移动":
                i = 0;
                break;
            case "chinaunicom":
            case "中国联通":
            case "china unicom":
                i = 1;
                break;
            default:
                i = 99;
                break;
        }
        return i == 99 ? c(f()) : i;
    }

    public static int c(String str) {
        str.hashCode();
        switch (str) {
            case "46000":
            case "46002":
            case "46004":
            case "46007":
            case "46008":
                return 0;
            case "46001":
            case "46006":
            case "46009":
                return 1;
            case "46003":
            case "46005":
            case "46011":
                return 2;
            default:
                return 99;
        }
    }

    public static String d() {
        String str = SystemProperty.get(l04.ROM_VERSION_OPLUS);
        if (TextUtils.isEmpty(str)) {
            str = SystemProperty.get(l04.ROM_VERSION);
        }
        if (!TextUtils.isEmpty(str) && !"0".equalsIgnoreCase(str)) {
            return str;
        }
        String str2 = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str2)) {
            return str2.toUpperCase();
        }
        z6b.u("PhoneMsgUtil", "No OS VERSION.");
        return "0";
    }

    public static String e() {
        int iA = o52.a();
        if (iA == 1) {
            return l04.BRAND_O;
        }
        if (iA != 2) {
            return iA != 3 ? Build.BRAND : l04.BRAND_ONE;
        }
        return l04.BRAND_R;
    }

    public static String f() {
        if (f12607c == null) {
            g();
        }
        String str = f12607c;
        return str != null ? str : "";
    }

    public static void g() {
        TelephonyManager telephonyManager;
        f12607c = "";
        d = "";
        f12608e = "";
        try {
            Context context = a;
            if (!(context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0) || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                return;
            }
            f12607c = telephonyManager.getSimOperator() != null ? telephonyManager.getSimOperator() : "";
            d = telephonyManager.getNetworkOperatorName() != null ? telephonyManager.getNetworkOperatorName() : "";
            f12608e = telephonyManager.getNetworkOperator() != null ? telephonyManager.getNetworkOperator() : "";
        } catch (Exception e2) {
            z6b.o("PhoneMsgUtil", e2.getMessage());
        }
    }
}
