package com.platform.usercenter.bizuws.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.oplus.aiunit.vision.en;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes9.dex */
public class UwsInstantUtil {
    private static final String INSTANT_PKG = "com.nearme.instant.platform";
    private static final String TAG = "UwsInstantUtil";

    public static String a() {
        return "1.3.1androidx_c40c8ae_200817";
    }

    public static boolean b(Context context) {
        return en.a(context, "com.nearme.instant.platform");
    }

    private static boolean c(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.nearme.instant.platform", 128);
            return applicationInfo != null && applicationInfo.packageName.equals(str);
        } catch (Exception unused) {
            return false;
        }
    }

    private static int d(Context context) {
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.nearme.instant.platform", 128);
            if (applicationInfo == null || (obj = applicationInfo.metaData.get("platformVersion")) == null || !(obj instanceof Integer)) {
                return -1;
            }
            return ((Integer) obj).intValue();
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return -1;
        }
    }

    private static int e(Context context) {
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.nearme.instant.platform", 128);
            if (applicationInfo == null || (obj = applicationInfo.metaData.get("api_level")) == null || !(obj instanceof Integer)) {
                return -1;
            }
            return ((Integer) obj).intValue();
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return -1;
        }
    }

    private static int f(Context context) {
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.nearme.instant.platform", 128);
            if (applicationInfo == null || (obj = applicationInfo.metaData.get("biz_version")) == null || !(obj instanceof Integer)) {
                return -1;
            }
            return ((Integer) obj).intValue();
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            return -1;
        }
    }

    public static String getInstantVersion(Context context) {
        if (b(context)) {
            int iD = d(context);
            int iE = e(context);
            int iF = f(context);
            if (-1 != iD && -1 != iE && -1 != iF) {
                StringBuilder sb = new StringBuilder();
                sb.append(iE);
                sb.append("/");
                sb.append(iD);
                sb.append("/");
                sb.append(iF);
                try {
                    return URLEncoder.encode(sb.toString(), "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    return sb.toString();
                }
            }
        }
        return "-1";
    }

    private static boolean a(Context context, int i) {
        return d(context) >= i;
    }

    public static boolean b(Context context, String str) {
        if (TextUtils.isEmpty(str) || !str.contains("min")) {
            return true;
        }
        Uri uri = Uri.parse(str);
        return uri != null && (TextUtils.isEmpty(uri.getQueryParameter("min")) || a(context, str));
    }

    public static boolean a(Context context, String str) {
        Uri uri;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null) {
            String queryParameter = uri.getQueryParameter("min");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    int i = Integer.parseInt(queryParameter);
                    return i >= 100 && a(context, i);
                } catch (NumberFormatException e2) {
                    UCLogUtil.e(TAG, e2);
                }
            }
        }
        return false;
    }

    public static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.nearme.instant.platform", 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            UCLogUtil.e(TAG, e2);
            return -1;
        }
    }
}
