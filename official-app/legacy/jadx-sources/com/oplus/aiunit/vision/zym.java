package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* JADX INFO: loaded from: classes16.dex */
public class zym {
    public static volatile String a;
    public static String b = "com." + b() + ".instant.platform";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f19602c = "com." + b() + ".instant.platform.tv";

    public static int a(Context context) {
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(j(context), 128);
            if (applicationInfo != null && (obj = applicationInfo.metaData.get("api_level")) != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
        } catch (Exception e2) {
            epm.d("VersionUtil", e2);
        }
        return -1;
    }

    public static String b() {
        return lbm.a("bmVhcm1l");
    }

    public static boolean c(Context context, int i) {
        return k(context) >= i;
    }

    public static boolean d(Context context, String str) {
        if (TextUtils.isEmpty(str) || !str.contains("min")) {
            return true;
        }
        Uri uri = Uri.parse(str);
        return uri != null && (TextUtils.isEmpty(uri.getQueryParameter("min")) || g(context, str));
    }

    public static int e(Context context) {
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(j(context), 128);
            if (applicationInfo != null && (obj = applicationInfo.metaData.get("biz_version")) != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
        } catch (Exception e2) {
            epm.d("VersionUtil", e2);
        }
        return -1;
    }

    public static String f() {
        return "1.3.7_0c7d097_210818";
    }

    public static boolean g(Context context, String str) {
        Uri uri;
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null) {
            String queryParameter = uri.getQueryParameter("min");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    int i = Integer.parseInt(queryParameter);
                    return i >= 100 && c(context, i);
                } catch (NumberFormatException e2) {
                    epm.d("VersionUtil", e2);
                }
            }
        }
        return false;
    }

    public static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(j(context), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            epm.d("VersionUtil", e2);
            return -1;
        }
    }

    public static boolean i(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 128) != null;
        } catch (Exception e2) {
            epm.d("VersionUtil", e2);
            return false;
        }
    }

    public static String j(Context context) {
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        a = m(context);
        return a;
    }

    public static int k(Context context) {
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(j(context), 128);
            if (applicationInfo != null && (obj = applicationInfo.metaData.get("platformVersion")) != null && (obj instanceof Integer)) {
                return ((Integer) obj).intValue();
            }
        } catch (Exception e2) {
            epm.d("VersionUtil", e2);
        }
        return -1;
    }

    public static String l(Context context) {
        if (n(context)) {
            int iK = k(context);
            int iA = a(context);
            int iE = e(context);
            if (-1 != iK && -1 != iA && -1 != iE) {
                StringBuilder sb = new StringBuilder();
                sb.append(iA);
                sb.append("/");
                sb.append(iK);
                sb.append("/");
                sb.append(iE);
                try {
                    return URLEncoder.encode(sb.toString(), "UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    return sb.toString();
                }
            }
        }
        return "-1";
    }

    public static String m(Context context) {
        if (m82.a()) {
            if (i(context, "com.oplus.instant.platform")) {
                return "com.oplus.instant.platform";
            }
            return i(context, b) ? b : "";
        }
        if (!m82.b()) {
            return "";
        }
        if (i(context, "com.oplus.instant.platform.tv")) {
            return "com.oplus.instant.platform.tv";
        }
        return i(context, f19602c) ? f19602c : "";
    }

    public static boolean n(Context context) {
        return !TextUtils.isEmpty(j(context));
    }
}
