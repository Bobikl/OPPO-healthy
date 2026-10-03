package com.heytap.store.platform.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.oplus.aiunit.vision.xni;

/* JADX INFO: loaded from: classes6.dex */
public class GotoSettingsUtil {
    private static Intent getAppDetailSettingIntent(Context context) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

    public static void goIntentSetting(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setFlags(268435456);
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        try {
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void goToPermission(Context context) {
        if (context == null) {
            return;
        }
        String str = Build.BRAND;
        if (TextUtils.equals(str.toLowerCase(), "redmi") || TextUtils.equals(str.toLowerCase(), xni.a.ROM_MIUI)) {
            gotoMiuiPermission(context);
            return;
        }
        if (TextUtils.equals(str.toLowerCase(), "meizu")) {
            gotoMeizuPermission(context);
        } else if (KeywordMatchUtils.isHWKeyword(str) || TextUtils.equals(str.toLowerCase(), "honor")) {
            gotoHWPermission(context);
        } else {
            context.startActivity(getAppDetailSettingIntent(context));
        }
    }

    public static void goToSettings(Context context) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
            Intent intent2 = new Intent();
            intent2.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent2.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent2);
        }
    }

    private static void gotoHWPermission(Context context) {
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
            context.startActivity(getAppDetailSettingIntent(context));
        }
    }

    private static void gotoMeizuPermission(Context context) {
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra("packageName", context.getPackageName());
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
            context.startActivity(getAppDetailSettingIntent(context));
        }
    }

    private static void gotoMiuiPermission(Context context) {
        try {
            try {
                Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
                intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
                intent.putExtra("extra_pkgname", context.getPackageName());
                context.startActivity(intent);
            } catch (Exception unused) {
                context.startActivity(getAppDetailSettingIntent(context));
            }
        } catch (Exception unused2) {
            Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent2.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
            intent2.putExtra("extra_pkgname", context.getPackageName());
            context.startActivity(intent2);
        }
    }
}
