package com.heytap.msp.sdk.common.crash;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.heytap.msp.sdk.base.common.CrashConstant;
import com.heytap.msp.sdk.base.common.log.MspLog;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes19.dex */
public class AppCrashReceiver extends BroadcastReceiver {
    private static final String TAG = "AppCrashReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        MspLog.d(TAG, "AppCrashReceiver onReceive");
        if (TextUtils.isEmpty(intent.getAction())) {
            MspLog.d(TAG, "AppCrashReceiver onReceive action is null");
            return;
        }
        MspLog.d(TAG, "AppCrashReceiver onReceive action:" + intent.getAction());
        if (intent.getAction().equals(CrashConstant.SUB_PROCESS_CRASH_ACTION)) {
            String stringExtra = intent.getStringExtra(CrashConstant.KEY_MSP_APP_CRASH_PROCESS_NAME);
            int intExtra = intent.getIntExtra(CrashConstant.KEY_MSP_APP_CRASH_COUNT, 0);
            int intExtra2 = intent.getIntExtra(CrashConstant.KEY_MSP_APP_LAUNCH_COUNT, 0);
            int intExtra3 = intent.getIntExtra(CrashConstant.KEY_MSP_APP_VERSION_CODE, 0);
            String stringExtra2 = intent.getStringExtra(CrashConstant.KEY_MSP_APP_VERSION_NAME);
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            AppCrashManager.getInstance().handleCrashMsg(stringExtra, intExtra, intExtra2, intExtra3, stringExtra2);
        }
    }
}
