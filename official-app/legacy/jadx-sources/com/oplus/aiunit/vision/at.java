package com.oplus.aiunit.vision;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BuildCompat;

/* JADX INFO: loaded from: classes15.dex */
public class at {
    public static final String INTENT_ACTION_WEIGHT = "com.heytap.databaseengineservice.action.WEIGHT_BODY_FAT";
    public static final int TIME_ONE_DAY = 86400000;
    public static final int TIME_ONE_MINUTE = 60000;
    public static final int TIME_THIRTY_MINUTE = 1800000;

    public static void a(Context context, String str) {
        cj4.a("AlarmUtil", "cancelAlarm enter!");
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(PendingIntent.getBroadcast(context, 0, intent, 67108864));
    }

    public static void b(Context context, long j2, String str) {
        cj4.a("AlarmUtil", "controlAlarm enter!");
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        alarmManager.setAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j2, PendingIntent.getBroadcast(context, 0, intent, BuildCompat.isAtLeastS() ? 167772160 : 134217728));
    }
}
