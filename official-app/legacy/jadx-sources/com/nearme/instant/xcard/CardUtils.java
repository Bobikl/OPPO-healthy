package com.nearme.instant.xcard;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.nearme.instant.androidx.card.AndroidXHapDexClassLoader;
import com.nearme.instant.xcard.utils.PublicPrefUtil;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class CardUtils {
    public static final String HAP_PACKAGE_NAME = "com.nearme.instant.platform";
    private static String TAG = "CardUtils";
    private static ClassLoader classLoader;
    private static Context hapContext;

    public static ClassLoader getClassLoader(Context context) {
        if (classLoader == null) {
            Log.i(TAG, "init classLoader ");
            PackageManager packageManager = context.getPackageManager();
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo("com.nearme.instant.platform", 0);
                PackageInfo packageInfo = packageManager.getPackageInfo("com.nearme.instant.platform", 0);
                PublicPrefUtil.init(context);
                UtilsKt.checkUpToDate(context, applicationInfo.sourceDir, packageInfo);
                Compatible64Bit.init64So(context);
                classLoader = new AndroidXHapDexClassLoader(UtilsKt.getDexPath(applicationInfo.sourceDir), UtilsKt.getOptimizedDir(context), Compatible64Bit.getNativeLibraryDir(context), context.getClassLoader());
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e(TAG, " getClassLoader:" + e2);
                e2.printStackTrace();
                return null;
            }
        }
        return classLoader;
    }

    public static Context getHapContext(Context context) {
        if (hapContext == null) {
            try {
                hapContext = context.createPackageContext("com.nearme.instant.platform", 2);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e(TAG, "getHapContext: " + e2);
                e2.printStackTrace();
            }
            if (hapContext == null) {
                hapContext = context;
            }
        }
        return hapContext;
    }

    public static void restore() {
        hapContext = null;
        Compatible64Bit.sSoLibPath = null;
    }
}
