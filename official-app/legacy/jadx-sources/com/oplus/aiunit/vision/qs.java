package com.oplus.aiunit.vision;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.core.app.AlarmManagerCompat;

/* JADX INFO: loaded from: classes15.dex */
public class qs {
    public static boolean a(@NonNull AlarmManager alarmManager, int i, long j2, @NonNull PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT < 31 || !alarmManager.canScheduleExactAlarms()) {
            AlarmManagerCompat.setAndAllowWhileIdle(alarmManager, i, j2, pendingIntent);
            return false;
        }
        AlarmManagerCompat.setExactAndAllowWhileIdle(alarmManager, i, j2, pendingIntent);
        return true;
    }
}
