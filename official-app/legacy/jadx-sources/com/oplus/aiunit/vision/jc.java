package com.oplus.aiunit.vision;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.config.AcOpenCoreConfig;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class jc {
    public static final String a = "jc";

    public static String a(Context context, String str) {
        return b(context, str, context.getPackageName());
    }

    public static String b(Context context, String str, String str2) {
        Bundle bundleC = c(context, str2);
        if (bundleC == null) {
            AcLogUtil.e(a, "APP SDK could not found <meta-data>");
            return "";
        }
        Object obj = bundleC.get(str);
        if (obj == null) {
            AcLogUtil.e(a, "APP SDK found an invalid " + str + "== null");
            return "";
        }
        String strValueOf = String.valueOf(obj);
        if (!TextUtils.isEmpty(strValueOf)) {
            return strValueOf;
        }
        AcLogUtil.e(a, "APP SDK found an invalid " + str + ": null.");
        return "";
    }

    public static Bundle c(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 128).metaData;
        } catch (PackageManager.NameNotFoundException e2) {
            AcLogUtil.e("ApkInfoHelper", "getMetaData = " + e2);
            return null;
        }
    }

    public static String d(Context context) {
        return g(context, f(e()));
    }

    public static String e() {
        return Application.getProcessName();
    }

    public static String f(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return (String) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e2) {
            AcLogUtil.e(a, "error" + e2.getMessage());
            return str;
        }
    }

    public static String g(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses == null || runningAppProcesses.isEmpty()) {
                return str;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return str;
        } catch (Exception e2) {
            AcLogUtil.e(a, "error =" + e2.getMessage());
            return str;
        }
    }

    public static boolean h() {
        AcOpenCoreConfig acOpenCoreConfigA = uc.c().a();
        if (acOpenCoreConfigA == null) {
            return false;
        }
        return !"CN".equalsIgnoreCase(acOpenCoreConfigA.getCountry());
    }

    public static boolean i() {
        AcOpenCoreConfig acOpenCoreConfigA = uc.c().a();
        return acOpenCoreConfigA != null && "oneplus".equalsIgnoreCase(acOpenCoreConfigA.getBrand()) && h();
    }
}
