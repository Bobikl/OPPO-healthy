package com.oplus.aiunit.vision;

import android.app.Notification;
import android.app.NotificationManager;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes17.dex */
public class lcg {
    public static void a(NotificationManager notificationManager, int i, Notification notification, String str) throws Exception {
        try {
            notificationManager.notify(i, notification);
        } catch (Exception e2) {
            a7b.b("SafeNotificationUtil", "showNotificationFail" + str + ": " + e2);
            if (TextUtils.isEmpty(e2.getMessage()) || !e2.getMessage().contains("bad array lengths")) {
                throw e2;
            }
        }
    }
}
