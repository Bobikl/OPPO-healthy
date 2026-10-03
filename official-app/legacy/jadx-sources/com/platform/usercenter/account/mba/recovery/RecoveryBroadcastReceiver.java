package com.platform.usercenter.account.mba.recovery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class RecoveryBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "RecoveryBroadcastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        int intExtra = intent.getIntExtra("resultCode", -1);
        String stringExtra = intent.getStringExtra("msg");
        UCLogUtil.e(TAG, "code = " + intExtra + ", msg = " + stringExtra);
        RecoveryManager.getInstance().notify(intExtra, stringExtra);
    }
}
