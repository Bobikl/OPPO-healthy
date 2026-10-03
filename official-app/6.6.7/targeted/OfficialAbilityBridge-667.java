package com.oplus.aiunit.vision;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.content.pm.PackageInfoCompat;
import com.heytap.health.base.R$color;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes15.dex */
public class if0 {
    public static String CHANNEL = null;
    public static final String FILE_PROVIDER_AUTH = "com.heytap.health.fileprovider";
    public static final String HEALTH_OVERSEAS = "com.heytap.health.international";
    public static Boolean debuggable;

    static {
        try {
            CHANNEL = b83.b(e88.a());
        } catch (Exception unused) {
            CHANNEL = "unknown";
        }
    }

    public static boolean A() {
        return i90.BUILD_TYPE.equals("releaseT");
    }

    public static boolean B() {
        PowerManager powerManager = (PowerManager) e88.a().getSystemService("power");
        if (powerManager != null) {
            return powerManager.isPowerSaveMode();
        }
        return false;
    }

    public static boolean C() {
        return i90.BUILD_TYPE.equals("releaseT") && "preproduction".equals(CHANNEL);
    }

    public static boolean D() {
        if (Build.VERSION.SDK_INT >= 31) {
            return e88.a().getApplicationInfo().isProfileable();
        }
        return false;
    }

    public static boolean E() {
        String str = i90.BUILD_TYPE;
        return str.equals("release") || str.equals("releaseT");
    }

    public static boolean F() {
        return i90.BUILD_TYPE.equals("prerelease");
    }

    public static void G(View view, boolean z) {
        if (view != null) {
            view.setForceDarkAllowed(z);
        }
    }

    public static boolean H() {
        boolean z = false;
        try {
            StatFs statFs = new StatFs(e88.a().getExternalFilesDir(null).getPath());
            long availableBytes = statFs.getAvailableBytes();
            z = availableBytes < 1073741824;
            if (z) {
                m8b.f("AppUtil", "total space:" + statFs.getTotalBytes() + ", available space:" + availableBytes);
            }
        } catch (Exception e) {
            m8b.b("AppUtil", "e:" + e.getMessage());
        }
        return z;
    }

    public static void a(Context context, Button button, boolean z) {
        if (z) {
            button.setEnabled(true);
            button.setTextColor(ContextCompat.getColor(context, R$color.lib_base_colorBlack));
            return;
        }
        button.setEnabled(false);
        if (y(context)) {
            button.setTextColor(ContextCompat.getColor(context, R$color.lib_base_grey));
        } else {
            button.setTextColor(ContextCompat.getColor(context, R$color.lib_base_color_text_disable));
        }
    }

    public static boolean b(String str) {
        PackageInfo packageInfo;
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            packageInfo = e88.a().getPackageManager().getPackageInfo(str, 0);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static Drawable c(String str) {
        try {
            PackageManager packageManager = e88.a().getPackageManager();
            return packageManager.getApplicationIcon(packageManager.getApplicationInfo(str, 128));
        } catch (PackageManager.NameNotFoundException e) {
            m8b.b("AppUtil", "[getAppIcon] e: " + e.getMessage());
            return null;
        }
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            m8b.m("AppUtil", "[getAppName]--> packageName is null or empty");
        } else {
            try {
                PackageManager packageManager = e88.a().getPackageManager();
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
            } catch (Exception e) {
                m8b.b("AppUtil", "[getAppName] e: " + e.getMessage());
            }
        }
        return kq5.NOT_SET;
    }

    public static String e(int i) {
        String[] packagesForUid = e88.a().getPackageManager().getPackagesForUid(i);
        return (packagesForUid == null || packagesForUid.length <= 0) ? kq5.NOT_SET : packagesForUid[0];
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            m8b.m("AppUtil", "[getAppVersionName]--> packageName is null or empty");
        } else {
            try {
                return e88.a().getPackageManager().getPackageInfo(str, 0).versionName;
            } catch (Exception e) {
                m8b.b("AppUtil", "[getAppVersionName] e: " + e.getMessage());
            }
        }
        return kq5.NOT_SET;
    }

    public static Integer g() {
        float f = Settings.Global.getFloat(e88.a().getContentResolver(), "DarkMode_BackgroundMaxL", -1.0f);
        StringBuilder sb = new StringBuilder();
        sb.append("getDarkModeConfig() value = ");
        sb.append(f);
        if (f == 0.0f) {
            return 0;
        }
        if (f == 8.0f) {
            return 1;
        }
        return f == 20.0f ? 2 : null;
    }

    public static Intent h(Context context, File file) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri uriForFile = FileProvider.getUriForFile(context, FILE_PROVIDER_AUTH, file);
        intent.addFlags(1);
        intent.addFlags(268435456);
        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        return intent;
    }

    public static int i(Context context, String str) {
        try {
            return (int) PackageInfoCompat.getLongVersionCode(context.getPackageManager().getPackageInfo(str, 0));
        } catch (PackageManager.NameNotFoundException e) {
            m8b.b("AppUtil", "getPackageCode e: " + e.getMessage());
            return 0;
        }
    }

    public static long j(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (Exception e) {
            m8b.b("AppUtil", "get first install time e=" + e.getMessage());
            return 0L;
        }
    }

    public static long k(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (Exception e) {
            m8b.b("AppUtil", "get last update time e=" + e.getMessage());
            return 0L;
        }
    }

    public static String l(Context context) {
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1);
            return (runningTasks == null || runningTasks.get(0) == null || runningTasks.get(0).topActivity == null) ? kq5.NOT_SET : runningTasks.get(0).topActivity.getClassName();
        } catch (Exception e) {
            m8b.b("AppUtil", "getRunningActivityName, exception: " + e.getMessage());
            return kq5.NOT_SET;
        }
    }

    public static int m() {
        return i90.VERSION_CODE;
    }

    public static String n() {
        return i90.VERSION_NAME;
    }

    public static String o() {
        return v() ? "gray" : kq5.NOT_SET;
    }

    public static boolean p(@NonNull Activity activity) {
        try {
            return (activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0).configChanges & 512) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            m8b.b("AppUtil", "handlesUiModeConfigChange e: " + e.getMessage());
            return false;
        }
    }

    public static void q(Context context, File file) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri uriForFile = FileProvider.getUriForFile(context, FILE_PROVIDER_AUTH, file);
        intent.addFlags(1);
        intent.addFlags(268435456);
        intent.setDataAndType(uriForFile, "application/vnd.android.package-archive");
        context.startActivity(intent);
    }

    public static boolean r() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) e88.a().getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(rze.i()) && runningAppProcessInfo.importance == 100) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean s() {
        return i90.BUILD_TYPE.contains("debug");
    }

    public static boolean t() {
        if (debuggable == null) {
            debuggable = Boolean.valueOf((e88.a().getApplicationInfo().flags & 2) != 0);
        }
        return debuggable.booleanValue();
    }

    public static boolean u(Context context) {
        return j(context) == k(context);
    }

    public static boolean v() {
        return i90.BUILD_TYPE.equals("releaseT") && "gray".equals(CHANNEL);
    }

    public static boolean w() {
        return !i90.BUILD_TYPE.equals("release");
    }

    public static boolean x() {
        return i90.BUILD_TYPE.equals("monkey");
    }

    public static boolean y(Context context) {
        Activity activityP;
        if ((context instanceof Application) && (activityP = wp.n().p()) != null) {
            context = activityP;
        }
        return context != null && 32 == (context.getResources().getConfiguration().uiMode & 48);
    }

    public static boolean z() {
        return i90.BUILD_TYPE.equals("release");
    }
}
