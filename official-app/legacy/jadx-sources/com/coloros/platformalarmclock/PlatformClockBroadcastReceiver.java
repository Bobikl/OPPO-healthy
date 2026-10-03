package com.coloros.platformalarmclock;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes13.dex */
public class PlatformClockBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    @SuppressLint({"LongLogTag"})
    public void onReceive(Context context, Intent intent) {
        String str;
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        Log.i("PlatformClockBroadcastReceiver", "onReceive");
        if (intent != null) {
            String action = intent.getAction();
            Log.i("PlatformClockBroadcastReceiver", "onReceive action = " + action);
            if (TextUtils.isEmpty(action)) {
                str = "onReceive action is null ";
            } else {
                if (!action.equals("com.coloros.platformalarmclock.platform.awaken_clock_action") || context == null) {
                    return;
                }
                try {
                    PlatformClockManager.e().g(context.getApplicationContext());
                    PlatformClockManager.e().f(context.getApplicationContext());
                    return;
                } catch (Exception e2) {
                    str = "action : " + e2.getMessage();
                }
            }
        } else {
            str = "onReceive intent is null ";
        }
        Log.e("PlatformClockBroadcastReceiver", str);
    }
}
