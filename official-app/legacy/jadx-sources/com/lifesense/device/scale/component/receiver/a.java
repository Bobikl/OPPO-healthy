package com.lifesense.device.scale.component.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.lifesense.device.scale.context.LDAppHolder;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes4.dex */
public class a extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", -1);
        if (intExtra == 10) {
            com.lifesense.device.scale.utils.a.a("test msg >> state broadcast...,state off");
            return;
        }
        if (intExtra != 12) {
            return;
        }
        com.lifesense.device.scale.utils.a.a("test msg >> state broadcast...,state on");
        if (LDAppHolder.getUserId() != 0) {
            com.lifesense.device.scale.utils.a.a("test msg >> state broadcast...,start device manager");
            BluetoothStatusChangeTrigger.getInstance().startBluetoothBroadcastReceiver();
        }
    }
}
