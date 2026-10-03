package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes15.dex */
public class v62 {
    public static final String SPORT_HEALTH_BROADCAST_PERMISSION = "com.heytap.health.DEFAULT_PERMISSION";

    @SuppressLint({"HealthLint_AndroidReceiverDetector"})
    public static final void a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(broadcastReceiver, intentFilter, SPORT_HEALTH_BROADCAST_PERMISSION, null, 4);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, SPORT_HEALTH_BROADCAST_PERMISSION, null);
        }
    }

    public static void b(Context context, Intent intent) {
        context.sendBroadcast(intent, SPORT_HEALTH_BROADCAST_PERMISSION);
    }

    public static final void c(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Exception e2) {
            me8.b("BroadcastManager", "Health_" + e2.getMessage());
        }
    }
}
