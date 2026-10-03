package com.heytap.health.watch.commonsync.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.heytap.health.watch.commonsync.service.CommonSyncTransportApi;
import com.oplus.aiunit.vision.l25;

/* JADX INFO: loaded from: classes19.dex */
public class TransportTimeChangedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        l25.a("TimeChangedReceiver", "onReceive() action = " + action);
        if ("android.intent.action.TIME_SET".equals(action)) {
            CommonSyncTransportApi.h();
        } else if ("android.intent.action.TIMEZONE_CHANGED".equals(action)) {
            CommonSyncTransportApi.i();
        } else if ("android.intent.action.LOCALE_CHANGED".equals(action)) {
            CommonSyncTransportApi.j();
        }
    }
}
