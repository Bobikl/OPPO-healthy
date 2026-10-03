package com.heytap.health.account.impl.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes15.dex */
public class SafeOplusAccountLogoutReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        SafeAccountLogoutReceiver.a(context, intent);
    }
}
