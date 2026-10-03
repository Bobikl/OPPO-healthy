package com.heytap.upgrade.install;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes19.dex */
public class InstallEventReceiver extends BroadcastReceiver {
    public static final Object a = new Object();
    public static EventResultDispatcher b;

    public static void a(@NonNull Context context, String str, @NonNull EventResultDispatcher.c cVar) {
        b().a(str, cVar);
    }

    @NonNull
    public static EventResultDispatcher b() {
        synchronized (a) {
            if (b == null) {
                b = new EventResultDispatcher();
            }
        }
        return b;
    }

    public static String c(String str) {
        b();
        return EventResultDispatcher.b(str);
    }

    public static int d() throws EventResultDispatcher.OutOfIdsException {
        return b().c();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        b().d(context, intent);
    }
}
