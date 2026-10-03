package com.heytap.usercenter.accountsdk.utils.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes19.dex */
public class UserCenterSupportLoginReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
    }
}
