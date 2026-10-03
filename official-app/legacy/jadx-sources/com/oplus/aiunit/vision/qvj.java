package com.oplus.aiunit.vision;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.core.app.NotificationCompat;
import com.heytap.health.watch.thirdparty.R$string;
import com.heytap.sports.service.BgConnect;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public class qvj {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static NotificationManager b;

    public static NotificationCompat.Builder a() {
        if (b == null) {
            b = (NotificationManager) df0.f(BgConnect.KEY_NOTIFICATION);
            b.createNotificationChannel(new NotificationChannel("ThirdPartyHandler", b78.a().getString(R$string.watch_third_party_notification_channel_name), 4));
        }
        return new NotificationCompat.Builder(df0.b(), "ThirdPartyHandler");
    }

    public static void b(String str, int i, String str2, Intent intent) {
        NotificationCompat.Builder builderA = a();
        builderA.setContentTitle(str2);
        try {
            builderA.setSmallIcon(df0.b().getPackageManager().getPackageInfo(df0.b().getPackageName(), 0).applicationInfo.icon);
        } catch (PackageManager.NameNotFoundException e2) {
            nvj.b("ThirdPartyHandler", "notify " + e2.getMessage(), new Object[0]);
        }
        builderA.setContentIntent(PendingIntent.getActivity(df0.b(), a.incrementAndGet(), intent, 201326592));
        builderA.setAutoCancel(true);
        builderA.setDefaults(-1);
        b.notify(str, i, builderA.build());
    }
}
