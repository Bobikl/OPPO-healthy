package com.heytap.log.brd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.log.Logger;
import com.heytap.log.consts.LogConstants;
import com.heytap.log.flush.KitFlush;
import com.heytap.log.strategy.KitConfigHelper;
import com.heytap.log.util.ThreadUtil;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes19.dex */
public class KitBrdcast extends BroadcastReceiver {
    private static final String TAG = "HLog_KitBrdcast";

    public KitBrdcast() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkKitClass() {
        return true;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        Log.d(TAG, "KitBrdcast onReceive ... ");
        ThreadUtil.executeInThreadPool(new Runnable() { // from class: com.heytap.log.brd.KitBrdcast.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Intent intent2 = intent;
                    if (intent2 != null) {
                        String action = intent2.getAction();
                        if (TextUtils.isEmpty(action)) {
                            return;
                        }
                        if (!KitBrdcast.this.checkKitClass()) {
                            Log.d(KitBrdcast.TAG, "Kitcast onReceive can not deal this action : " + action);
                            return;
                        }
                        Log.d(KitBrdcast.TAG, "Kitcast can deal this action : " + action + " pkg : " + context.getPackageName());
                        if (action.equals(LogConstants.ACTION_SYNC_HLOG_TASK)) {
                            String stringExtra = intent.getStringExtra(LogConstants.TASK_CONFIG_EXTRA);
                            if (TextUtils.isEmpty(stringExtra)) {
                                return;
                            }
                            KitConfigHelper.doSynKitTaskConfigs(stringExtra);
                            return;
                        }
                        if (action.equalsIgnoreCase(LogConstants.ACTION_SYNC_HLOG_FLUSH)) {
                            String stringExtra2 = intent.getStringExtra("business");
                            if (TextUtils.isEmpty(stringExtra2)) {
                                return;
                            }
                            Logger logger = KitConfigHelper.getInstance().getLogger(stringExtra2);
                            if (logger != null) {
                                logger.flush(false);
                            }
                            KitFlush.flush(stringExtra2);
                            return;
                        }
                        if (action.equalsIgnoreCase(LogConstants.ACTION_SYNC_HLOG_STRATEGY)) {
                            String stringExtra3 = intent.getStringExtra("kitconfig");
                            if (TextUtils.isEmpty(stringExtra3)) {
                                return;
                            }
                            KitConfigHelper.doSynKitStrategyConfig(stringExtra3);
                            KitConfigHelper.getInstance().flushStrategyConfig();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    public KitBrdcast(Logger logger) {
    }
}
