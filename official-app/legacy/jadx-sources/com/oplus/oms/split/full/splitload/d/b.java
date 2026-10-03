package com.oplus.oms.split.full.splitload.d;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes8.dex */
public class b extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    @SuppressLint({"UnsafeBroadcastReceiverActionDetector"})
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
    }
}
