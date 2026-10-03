package com.oplus.aiunit.vision;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.core.os.BuildCompat;
import com.heytap.sports.receive.AutomaticPauseReceiver;

/* JADX INFO: loaded from: classes2.dex */
public class v9i {
    public static boolean a = false;

    public static void a(Context context) {
        d(context);
        c(context);
        b(context);
    }

    public static void b(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intent intent = new Intent(context, (Class<?>) AutomaticPauseReceiver.class);
        intent.setAction(AutomaticPauseReceiver.ACTION_DO_AUTO_FINISH);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, BuildCompat.isAtLeastS() ? 167772160 : 134217728);
        if (alarmManager == null || broadcast == null) {
            return;
        }
        alarmManager.cancel(broadcast);
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intent intent = new Intent(context, (Class<?>) AutomaticPauseReceiver.class);
        intent.setAction(AutomaticPauseReceiver.ACTION_DO_AUTO_PAUSE);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, BuildCompat.isAtLeastS() ? 167772160 : 134217728);
        if (alarmManager == null || broadcast == null) {
            return;
        }
        alarmManager.cancel(broadcast);
        a = false;
    }

    public static void d(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intent intent = new Intent(context, (Class<?>) AutomaticPauseReceiver.class);
        intent.setAction(AutomaticPauseReceiver.ACTION_PAUSE_CHECK);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, BuildCompat.isAtLeastS() ? 167772160 : 134217728);
        if (alarmManager == null || broadcast == null) {
            return;
        }
        alarmManager.cancel(broadcast);
    }

    public static void e(Context context) {
        d(context);
        c(context);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intent intent = new Intent(context, (Class<?>) AutomaticPauseReceiver.class);
        intent.setAction(AutomaticPauseReceiver.ACTION_DO_AUTO_FINISH);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, BuildCompat.isAtLeastS() ? 167772160 : 134217728);
        if (alarmManager != null) {
            qs.a(alarmManager, 0, System.currentTimeMillis() + 3600000, broadcast);
        }
    }

    public static void f(Context context) {
        b(context);
        d(context);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intent intent = new Intent(context, (Class<?>) AutomaticPauseReceiver.class);
        intent.setAction(AutomaticPauseReceiver.ACTION_PAUSE_CHECK);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 123544612, intent, BuildCompat.isAtLeastS() ? 167772160 : 134217728);
        if (alarmManager != null) {
            qs.a(alarmManager, 0, System.currentTimeMillis() + 300000, broadcast);
        }
    }

    public static void g(Context context) {
        if (a) {
            return;
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intent intent = new Intent(context, (Class<?>) AutomaticPauseReceiver.class);
        intent.setAction(AutomaticPauseReceiver.ACTION_DO_AUTO_PAUSE);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, BuildCompat.isAtLeastS() ? 167772160 : 134217728);
        if (alarmManager != null) {
            a = true;
            qs.a(alarmManager, 0, System.currentTimeMillis() + 360000, broadcast);
        }
    }
}
