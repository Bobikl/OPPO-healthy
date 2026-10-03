package com.oplus.aiunit.vision;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/uj8;", "", "Landroid/content/Context;", "context", "", "intervalTime", "", "action", "", "b", "a", "<init>", "()V", "health_base_release"}, k = 1, mv = {1, 8, 0})
public final class uj8 {
    public static final int $stable = 0;

    @NotNull
    public static final uj8 INSTANCE = new uj8();

    public final void a(@NotNull Context context, @NotNull String action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        a7b.f("HealthAlarmUtils", "cancelAlarm");
        Intent intent = new Intent(action);
        intent.setPackage(context.getPackageName());
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 1, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        try {
            Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
            ((AlarmManager) systemService).cancel(broadcast);
        } catch (Exception e2) {
            a7b.f("HealthAlarmUtils", "cancelAlarm error:" + e2.getMessage());
        }
    }

    public final void b(@NotNull Context context, long intervalTime, @NotNull String action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        a7b.f("HealthAlarmUtils", "createAlarm time:" + intervalTime);
        Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        Intent intent = new Intent(action);
        intent.setPackage(context.getPackageName());
        qs.a(alarmManager, 2, SystemClock.elapsedRealtime() + intervalTime, PendingIntent.getBroadcast(context, 1, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728));
    }
}
