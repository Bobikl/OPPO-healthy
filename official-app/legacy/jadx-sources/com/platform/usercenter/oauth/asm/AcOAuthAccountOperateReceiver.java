package com.platform.usercenter.oauth.asm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes9.dex */
public class AcOAuthAccountOperateReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
    }
}
