package com.oplus.aiunit.vision;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.os.BuildCompat;
import com.heytap.health.base.R$mipmap;
import com.heytap.health.main.MainActivity;
import com.heytap.health.operation.R$string;
import com.heytap.health.operations.router.providers.INotifyService;
import com.heytap.sports.service.BgConnect;

/* JADX INFO: loaded from: classes17.dex */
public class pqb {
    public final String a;
    public NotificationCompat.Builder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NotificationManager f15446c;
    public Notification d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f15447e;

    public pqb(Context context, String str) {
        this.f15447e = context;
        this.a = context.getString(R$string.operation_medal_notification_channel_name);
        if (((INotifyService) x0.d().b("/operation/NotifyService").navigation()).L8()) {
            c(str);
        }
    }

    public static void a(Context context) {
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(BgConnect.KEY_NOTIFICATION);
            if (notificationManager != null) {
                notificationManager.cancel(R$string.operation_medal_notify_name);
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean b(NotificationManager notificationManager) {
        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
        if (activeNotifications != null && activeNotifications.length > 0) {
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification.getId() == R$string.operation_medal_notify_name) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void c(String str) {
        Intent launchIntentForPackage;
        if (this.f15447e == null) {
            a7b.b("MedalNotificationHelper", "initNotification: mContext == null");
            return;
        }
        NotificationChannel notificationChannel = new NotificationChannel("com.heytap.medalplugin", this.a, 4);
        notificationChannel.enableLights(false);
        notificationChannel.setLightColor(SupportMenu.CATEGORY_MASK);
        notificationChannel.setShowBadge(true);
        notificationChannel.enableVibration(false);
        notificationChannel.setVibrationPattern(new long[]{0});
        notificationChannel.setSound(null, null);
        notificationChannel.setLockscreenVisibility(1);
        ((NotificationManager) this.f15447e.getSystemService(BgConnect.KEY_NOTIFICATION)).createNotificationChannel(notificationChannel);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this.f15447e);
        this.b = builder;
        builder.setPriority(-2);
        int i = BuildCompat.isAtLeastS() ? 301989888 : 268435456;
        this.f15447e.getPackageManager().getLaunchIntentForPackage(this.f15447e.getPackageName());
        try {
            Context context = this.f15447e;
            String str2 = MainActivity.EXTRA_FROM_SHORT;
            launchIntentForPackage = new Intent(context, (Class<?>) MainActivity.class);
        } catch (ClassNotFoundException e2) {
            a7b.b("MedalNotificationHelper", "homeIntent > " + e2.getMessage());
            launchIntentForPackage = this.f15447e.getPackageManager().getLaunchIntentForPackage(this.f15447e.getPackageName());
        }
        this.b.setContentIntent(PendingIntent.getActivity(this.f15447e, 100, launchIntentForPackage, i));
        this.b.setSmallIcon(R$mipmap.lib_base_ic_launcher);
        NotificationCompat.Builder builder2 = this.b;
        Context context2 = this.f15447e;
        int i2 = R$string.operation_medal_notify_name;
        builder2.setTicker(context2.getString(i2));
        this.b.setContentTitle(this.f15447e.getResources().getString(R$string.operation_medal_get_notify_title));
        this.b.setContentText(this.f15447e.getResources().getString(R$string.operation_medal_get_notify_content));
        this.b.setAutoCancel(true);
        this.b.setChannelId("com.heytap.medalplugin");
        Notification notificationBuild = this.b.build();
        this.d = notificationBuild;
        notificationBuild.flags = 16;
        NotificationManager notificationManager = (NotificationManager) this.f15447e.getSystemService(BgConnect.KEY_NOTIFICATION);
        this.f15446c = notificationManager;
        if (b(notificationManager)) {
            return;
        }
        this.f15446c.notify(i2, this.d);
    }
}
