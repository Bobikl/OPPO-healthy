package com.lifesense.plugin.ble.device.ancs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes5.dex */
class h extends BroadcastReceiver {
    final /* synthetic */ MediaPlayerService a;

    public h(MediaPlayerService mediaPlayerService) {
        this.a = mediaPlayerService;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        StringBuilder sb = new StringBuilder();
        sb.append("Broadcast >> ");
        sb.append(intent);
        MediaPlayerService.logMessage(sb.toString() != null ? intent.getAction() : " null");
        this.a.pauseMedia();
    }
}
