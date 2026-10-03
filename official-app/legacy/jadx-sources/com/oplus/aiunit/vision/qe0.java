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
import com.heytap.webview.extension.activity.FragmentStyle;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class qe0 {
    public static String CHANNEL = null;
    public static final String FILE_PROVIDER_AUTH = "com.heytap.health.fileprovider";
    public static final String HEALTH_OVERSEAS = "com.heytap.health.international";
    public static Boolean debuggable;

    static {
        try {
            CHANNEL = n73.b(b78.a());
        } catch (Exception unused) {
            CHANNEL = "unknown";
        }
    }

    public static boolean A() {
        return y80.BUILD_TYPE.equals("releaseT");
    }

    public static boolean B() {
        PowerManager powerManager = (PowerManager) b78.a().getSystemService("power");
        if (powerManager != null) {
            return powerManager.isPowerSaveMode();
        }
        return false;
    }

    public static boolean C() {
        return y80.BUILD_TYPE.equals("releaseT") && "preproduction".equals(CHANNEL);
    }

    public static boolean D() {
        if (Build.VERSION.SDK_INT >= 31) {
            return b78.a().getApplicationInfo().isProfileable();
        }
        return false;
    }

    public static boolean E() {
        String str = y80.BUILD_TYPE;
        return str.equals("release") || str.equals("releaseT");
    }

    public static boolean F() {
        return y80.BUILD_TYPE.equals("prerelease");
    }

    public static void G(View view, boolean z) {
        if (view != null) {
            view.setForceDarkAllowed(z);
        }
    }

    public static boolean H() {
        boolean z = false;
        try {
            StatFs statFs = new StatFs(b78.a().getExternalFilesDir(null).getPath());
            long availableBytes = statFs.getAvailableBytes();
            z = availableBytes < 1073741824;
            if (z) {
                a7b.f("AppUtil", "total space:" + statFs.getTotalBytes() + ", available space:" + availableBytes);
            }
        } catch (Exception e2) {
            a7b.b("AppUtil", "e:" + e2.getMessage());
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
            packageInfo = b78.a().getPackageManager().getPackageInfo(str, 0);
        } catch (Exception unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static Drawable c(String str) {
        try {
            PackageManager packageManager = b78.a().getPackageManager();
            return packageManager.getApplicationIcon(packageManager.getApplicationInfo(str, 128));
        } catch (PackageManager.NameNotFoundException e2) {
            a7b.b("AppUtil", "[getAppIcon] e: " + e2.getMessage());
            return null;
        }
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            a7b.m("AppUtil", "[getAppName]--> packageName is null or empty");
        } else {
            try {
                PackageManager packageManager = b78.a().getPackageManager();
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 128)).toString();
            } catch (Exception e2) {
                a7b.b("AppUtil", "[getAppName] e: " + e2.getMessage());
            }
        }
        return "";
    }

    public static String e(int i) {
        String[] packagesForUid = b78.a().getPackageManager().getPackagesForUid(i);
        return (packagesForUid == null || packagesForUid.length <= 0) ? "" : packagesForUid[0];
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            a7b.m("AppUtil", "[getAppVersionName]--> packageName is null or empty");
        } else {
            try {
                return b78.a().getPackageManager().getPackageInfo(str, 0).versionName;
            } catch (Exception e2) {
                a7b.b("AppUtil", "[getAppVersionName] e: " + e2.getMessage());
            }
        }
        return "";
    }

    public static Integer g() {
        float f = Settings.Global.getFloat(b78.a().getContentResolver(), "DarkMode_BackgroundMaxL", -1.0f);
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
        } catch (PackageManager.NameNotFoundException e2) {
            a7b.b("AppUtil", "getPackageCode e: " + e2.getMessage());
            return 0;
        }
    }

    public static long j(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (Exception e2) {
            a7b.b("AppUtil", "get first install time e=" + e2.getMessage());
            return 0L;
        }
    }

    public static long k(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
        } catch (Exception e2) {
            a7b.b("AppUtil", "get last update time e=" + e2.getMessage());
            return 0L;
        }
    }

    public static String l(Context context) {
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(1);
            return (runningTasks == null || runningTasks.get(0) == null || runningTasks.get(0).topActivity == null) ? "" : runningTasks.get(0).topActivity.getClassName();
        } catch (Exception e2) {
            a7b.b("AppUtil", "getRunningActivityName, exception: " + e2.getMessage());
            return "";
        }
    }

    public static int m() {
        return y80.VERSION_CODE;
    }

    public static String n() {
        return y80.VERSION_NAME;
    }

    public static String o() {
        return v() ? "gray" : "";
    }

    public static boolean p(@NonNull Activity activity) {
        try {
            return (activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0).configChanges & 512) != 0;
        } catch (PackageManager.NameNotFoundException e2) {
            a7b.b("AppUtil", "handlesUiModeConfigChange e: " + e2.getMessage());
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
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) b78.a().getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(gxe.c()) && runningAppProcessInfo.importance == 100) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean s() {
        return y80.BUILD_TYPE.contains(FragmentStyle.DEBUG);
    }

    public static boolean t() {
        if (debuggable == null) {
            debuggable = Boolean.valueOf((b78.a().getApplicationInfo().flags & 2) != 0);
        }
        return debuggable.booleanValue();
    }

    public static boolean u(Context context) {
        return j(context) == k(context);
    }

    public static boolean v() {
        return y80.BUILD_TYPE.equals("releaseT") && "gray".equals(CHANNEL);
    }

    public static boolean w() {
        return !y80.BUILD_TYPE.equals("release");
    }

    public static boolean x() {
        return y80.BUILD_TYPE.equals("monkey");
    }

    public static boolean y(Context context) {
        Activity activityP;
        if ((context instanceof Application) && (activityP = op.n().p()) != null) {
            context = activityP;
        }
        return context != null && 32 == (context.getResources().getConfiguration().uiMode & 48);
    }

    public static boolean z() {
        return y80.BUILD_TYPE.equals("release");
    }
}
