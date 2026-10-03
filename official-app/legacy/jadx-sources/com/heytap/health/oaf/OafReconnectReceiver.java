package com.heytap.health.oaf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.oplus.aiunit.vision.wil;

/* JADX INFO: loaded from: classes17.dex */
public class OafReconnectReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            if (TextUtils.equals("com.oplus.health.accessory.action.DEVICE_ID_RECONNECT", intent.getAction())) {
                OafHost.i().o(intent.getStringExtra("remoteDeviceId"));
            }
        } catch (Exception e2) {
            wil.b("OafReconnectReceiver", "onReceive: hand intent error " + e2);
        }
    }
}
