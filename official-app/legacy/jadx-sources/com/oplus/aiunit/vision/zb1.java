package com.oplus.aiunit.vision;

import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.heytap.health.sport.R$string;
import com.heytap.sports.service.BgConnect;

/* JADX INFO: loaded from: classes17.dex */
public class zb1 implements gt9 {
    public Context a;
    public NotificationCompat.Builder b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotificationManager f19350c = (NotificationManager) b78.a().getSystemService(BgConnect.KEY_NOTIFICATION);

    @Override // com.oplus.aiunit.vision.gt9
    public void b() {
        e();
    }

    public void c() {
    }

    public boolean d() {
        return jee.c().d();
    }

    public void e() {
        throw null;
    }

    public void f() {
        NotificationManager notificationManager = this.f19350c;
        if (notificationManager != null) {
            notificationManager.notify(R$string.sports_app_name, this.b.setWhen(System.currentTimeMillis()).build());
        } else {
            jee.e("showNotificationDevice error mNotificationManager is null");
        }
    }

    public gt9 g(Context context, NotificationCompat.Builder builder) {
        this.a = context;
        this.b = builder;
        c();
        return this;
    }
}
