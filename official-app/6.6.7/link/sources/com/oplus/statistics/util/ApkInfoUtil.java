package com.oplus.statistics.util;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.fsd;
import com.oplus.statistics.util.ApkInfoUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ApkInfoUtil {
    public static final Map<Application, String> a = new HashMap();

    public static /* synthetic */ String c() {
        return "AppCode not set. please read the document of OplusTrack SDK.";
    }

    public static /* synthetic */ String d(PackageInfo packageInfo) {
        return "versionName=" + packageInfo.versionName;
    }

    @Nullable
    public static String getAppCode(Context context) {
        Application application = (Application) context.getApplicationContext();
        Map<Application, String> map = a;
        String str = map.get(application);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String strValueOf = null;
        try {
            strValueOf = String.valueOf(context.getPackageManager().getApplicationInfo(getPackageName(context), 128).metaData.get("AppCode"));
            if (TextUtils.isEmpty(strValueOf)) {
                LogUtil.e("ApkInfoUtil", new Supplier() { // from class: com.oplus.aiunit.vision.m80
                    @Override // com.oplus.statistics.util.Supplier
                    public final Object get() {
                        return ApkInfoUtil.c();
                    }
                });
            } else {
                map.put(application, strValueOf);
            }
        } catch (Exception e) {
            LogUtil.e("ApkInfoUtil", new fsd(e));
            e.printStackTrace();
        }
        return strValueOf;
    }

    public static String getAppName(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getPackageInfo(context.getPackageName(), 0).applicationInfo.loadLabel(packageManager).toString();
        } catch (Exception e) {
            LogUtil.e("ApkInfoUtil", new fsd(e));
            return "0";
        }
    }

    public static String getPackageName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception e) {
            LogUtil.e("ApkInfoUtil", new fsd(e));
            return "0";
        }
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            LogUtil.e("ApkInfoUtil", new fsd(e));
            return 0;
        }
    }

    public static String getVersionName(Context context) {
        String str;
        String str2 = "0";
        try {
            final PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo == null || (str = packageInfo.versionName) == null) {
                return "0";
            }
            try {
                LogUtil.i("ApkInfoUtil", new Supplier() { // from class: com.oplus.aiunit.vision.n80
                    @Override // com.oplus.statistics.util.Supplier
                    public final Object get() {
                        return ApkInfoUtil.d(packageInfo);
                    }
                });
                return str;
            } catch (Exception e) {
                e = e;
                str2 = str;
                LogUtil.e("ApkInfoUtil", new fsd(e));
                return str2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static void putAppCodeToCache(Context context, String str) {
        a.put((Application) context.getApplicationContext(), str);
    }

    public static int getVersionCode(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e) {
            LogUtil.e("ApkInfoUtil", new fsd(e));
            return 0;
        }
    }
}
