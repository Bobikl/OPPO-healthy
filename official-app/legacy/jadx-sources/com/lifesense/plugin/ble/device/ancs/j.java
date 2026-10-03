package com.lifesense.plugin.ble.device.ancs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes5.dex */
class j extends BroadcastReceiver {
    final /* synthetic */ MediaPlayerService a;

    public j(MediaPlayerService mediaPlayerService) {
        this.a = mediaPlayerService;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
    }
}
