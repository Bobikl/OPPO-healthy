package com.oplus.accountsdk.service.account.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.aiunit.vision.ml;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes19.dex */
public abstract class AcBaseReceiver extends BroadcastReceiver {
    public abstract String a();

    public abstract void b(Context context, Intent intent, String str);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (intent == null) {
            AcLogUtil.i(a(), "intent == null RECEIVER PKG = " + context.getPackageName());
            return;
        }
        String action = intent.getAction();
        AcLogUtil.i(a(), "onReceive action = " + ml.b(action, 8) + ",RECEIVER PKG = " + context.getPackageName());
        if (TextUtils.isEmpty(action)) {
            AcLogUtil.e(a(), "onReceive action = null");
        } else {
            b(context, intent, action);
        }
    }
}
