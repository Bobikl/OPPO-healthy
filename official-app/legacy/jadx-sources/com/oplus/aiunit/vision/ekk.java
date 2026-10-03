package com.oplus.aiunit.vision;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationManagerCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.heytap.health.settings.me.upgrade.UpgradeMonitorService;
import com.heytap.sports.service.BgConnect;
import com.heytap.upgrade.model.UpgradeInfo;
import java.io.File;

/* JADX INFO: loaded from: classes17.dex */
public class ekk {
    public static final String ACTION_DOWNLOAD_STATE_CHANGE = "action.upgrade.download.state.change";
    public static final String ACTION_UPGRADE_CHECKED = "action.upgrade.checked";
    public static final String EXTRA_STATE = "extra_state";
    public static final String EXTRA_UPGRADEINFO = "extra_upgradeInfo";
    public static final String EXTRA_UPGRADE_ERROR = "extra_upgrade_ERROR";
    public static final String EXTRA_UPGRADE_TYPE = "extra_upgrade_type";
    public static final String UPGRADE_DIR = "/SportHealth/upgrade";
    public static long a;

    public static void a(Context context, String str) {
        if (System.currentTimeMillis() - a < 300000) {
            a7b.f("UpgradeHelper", "within 5 min , do not check upgrade auto");
            return;
        }
        a = System.currentTimeMillis();
        if (xcg.d().f(context)) {
            xcg.d().a(context, str);
        } else {
            tnc.b(str);
        }
    }

    public static void b(Context context, int i) {
        c(context, g().getAbsolutePath(), i);
    }

    public static void c(Context context, String str, int i) {
        if (xcg.d().f(context)) {
            xcg.d().g(context, str, i);
        } else {
            tnc.c(str, i);
        }
    }

    public static boolean d(Context context) {
        return xcg.d().b() || tnc.d(context);
    }

    public static void e() {
        a = 0L;
    }

    public static void f() {
        a7b.f("UpgradeHelper", "destroy");
        xcg.d().c();
    }

    public static File g() {
        File externalFilesDir = b78.a().getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = b78.a().getFilesDir();
        }
        return new File(externalFilesDir + UPGRADE_DIR);
    }

    public static boolean h() {
        return xcg.d().e() || tnc.f();
    }

    public static boolean i(Context context, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(BgConnect.KEY_NOTIFICATION)).getNotificationChannel(str);
        if (notificationChannel == null) {
            return NotificationManagerCompat.from(context).areNotificationsEnabled();
        }
        return notificationChannel.getImportance() != 0 && NotificationManagerCompat.from(context).areNotificationsEnabled();
    }

    public static boolean j(Context context) {
        return i(context, UpgradeMonitorService.CHANNEL_ID);
    }

    public static void k(int i, int i2, UpgradeInfo upgradeInfo) {
        Intent intent = new Intent("action.upgrade.checked");
        intent.putExtra("extra_state", i);
        intent.putExtra(EXTRA_UPGRADE_TYPE, i2);
        intent.putExtra(EXTRA_UPGRADEINFO, upgradeInfo);
        LocalBroadcastManager.getInstance(b78.a()).sendBroadcast(intent);
    }

    public static void l(Context context) {
        tnc.g();
    }
}
