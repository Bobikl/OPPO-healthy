package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.heytap.wearable.support.watchface.common.Constants;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;

/* JADX INFO: loaded from: classes19.dex */
public class se0 {
    public static volatile String a = "V1.0";
    public static volatile int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Object f16560c = new Object();
    public static Object d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile PackageInfo f16561e;

    public static PackageInfo a(Context context) {
        if (f16561e == null) {
            synchronized (d) {
                if (f16561e == null) {
                    try {
                        f16561e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    } catch (PackageManager.NameNotFoundException e2) {
                        TrackLogger.d("DRS_SDK_COMMON_DrsAppUtils", "getPackageInfo failed", e2, new Object[0]);
                    }
                }
            }
        }
        return f16561e;
    }

    public static int b(Context context) {
        if (b != 0) {
            return b;
        }
        PackageInfo packageInfoA = a(context);
        if (packageInfoA != null) {
            b = packageInfoA.versionCode;
        }
        return b;
    }

    public static String c(Context context) {
        if (!Constants.HeyBuildVersion.V1_0.equals(a)) {
            return a;
        }
        PackageInfo packageInfoA = a(context);
        if (packageInfoA != null) {
            String str = packageInfoA.versionName;
            if (!TextUtils.isEmpty(str)) {
                a = str;
            }
        }
        return a;
    }
}
