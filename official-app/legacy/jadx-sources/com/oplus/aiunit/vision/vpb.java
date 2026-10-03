package com.oplus.aiunit.vision;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BuildCompat;
import com.heytap.health.operation.medalv2.MedalNotificationReceiver;
import com.heytap.health.operations.bean.MedalListBean;
import java.util.Calendar;

/* JADX INFO: loaded from: classes17.dex */
public class vpb {
    public static final String TAG = "MedalAlarmManager";

    public static void a(MedalListBean medalListBean) {
        StringBuilder sb = new StringBuilder();
        sb.append("Medal is ");
        sb.append(medalListBean.toString());
        Intent intent = new Intent(b78.a(), (Class<?>) MedalNotificationReceiver.class);
        intent.putExtra("typeCode", medalListBean.getTypeCode());
        intent.putExtra("code", medalListBean.getCode());
        intent.setAction(MedalNotificationReceiver.ACTION);
        PendingIntent broadcast = PendingIntent.getBroadcast(b78.a(), 0, intent, BuildCompat.isAtLeastS() ? 167772160 : 134217728);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(2, 1);
        calendar.set(5, 1);
        calendar.set(11, 8);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        b(calendar.getTimeInMillis() + ((long) (Math.random() * 13.0d * 60.0d * 60.0d * 1000.0d)), broadcast);
    }

    public static void b(long j2, PendingIntent pendingIntent) {
        AlarmManager alarmManager = (AlarmManager) b78.a().getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager == null) {
            a7b.b(TAG, "alarmManager is null");
            return;
        }
        try {
            a7b.f(TAG, "setAlarmTask!!");
            qs.a(alarmManager, 0, j2, pendingIntent);
        } catch (IllegalStateException unused) {
            a7b.b(TAG, "setAlarmTask occur IllegalStateException");
            pendingIntent.cancel();
        }
    }
}
