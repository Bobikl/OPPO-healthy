package com.oplus.aiunit.vision;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import com.heytap.health.sleep.R$drawable;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class c3e {
    public static Drawable a(String str) {
        try {
            return b78.a().getPackageManager().getApplicationIcon(str);
        } catch (Exception e2) {
            lw5.b("PackageUtil", e2.toString());
            return b78.a().getDrawable(R$drawable.health_sleep_bg_app_icon);
        }
    }

    public static String b(String str) {
        try {
            PackageManager packageManager = b78.a().getPackageManager();
            return packageManager.getPackageInfo(str, 0).applicationInfo.loadLabel(packageManager).toString();
        } catch (Exception e2) {
            lw5.b("PackageUtil", e2.toString());
            return "";
        }
    }

    public static long c() {
        long jA = v9g.x("health_share_preference_disturb").A("disturb_authorize_time");
        if (jA == -1) {
            jA = v9g.w().A("disturb_authorize_time");
            if (jA != -1) {
                v9g.x("health_share_preference_disturb").T("disturb_authorize_time", jA);
            }
        }
        return jA;
    }

    public static int d() {
        try {
            int iStartOpNoThrow = ((AppOpsManager) b78.a().getSystemService("appops")).startOpNoThrow("android:get_usage_stats", Process.myUid(), b78.a().getPackageName());
            lw5.c("PackageUtil", "getUsageStatsPermissionMode mode = " + iStartOpNoThrow);
            return iStartOpNoThrow;
        } catch (Exception e2) {
            lw5.b("PackageUtil", e2.toString());
            return 3;
        }
    }

    public static void e(Context context) {
        try {
            Intent intent = new Intent("coloros.intent.action.APP_USAGE_MAIN");
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e2) {
            lw5.b("PackageUtil", e2.toString());
            f(context);
        }
    }

    public static void f(Context context) {
        try {
            Intent intent = new Intent("oplus.intent.action.APP_USAGE_MAIN");
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e2) {
            lw5.b("PackageUtil", e2.toString());
        }
    }

    public static void g(Context context) {
        try {
            Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
            intent.setFlags(268435456);
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent);
        } catch (Exception e2) {
            lw5.b("PackageUtil", e2.toString());
            h(context);
        }
    }

    public static void h(Context context) {
        try {
            Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e2) {
            lw5.b("PackageUtil", e2.toString());
        }
    }

    public static void i(Context context) {
        try {
            Intent intent = new Intent("coloros.intent.action.VIEW_FOCUS_MODE");
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e2) {
            lw5.b("PackageUtil", e2.toString());
        }
    }

    public static boolean j() {
        boolean z = d() == 0;
        if (z && c() == -1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            lw5.c("PackageUtil", "authorize time = " + jCurrentTimeMillis);
            v9g.x("health_share_preference_disturb").T("disturb_authorize_time", jCurrentTimeMillis);
        }
        return z;
    }

    public static boolean k() {
        return l("coloros.intent.action.VIEW_FOCUS_MODE");
    }

    public static boolean l(String str) {
        List<ResolveInfo> listQueryIntentActivities = b78.a().getPackageManager().queryIntentActivities(new Intent(str), 65536);
        lw5.c("PackageUtil", "isSystemAppEnable action : " + str + ", size = " + listQueryIntentActivities.size());
        return !listQueryIntentActivities.isEmpty();
    }

    public static boolean m() {
        return l("oplus.intent.action.APP_USAGE_MAIN") || l("coloros.intent.action.APP_USAGE_MAIN");
    }

    public static boolean n() {
        return l("android.settings.USAGE_ACCESS_SETTINGS");
    }
}
