package com.heytap.log.kit;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes19.dex */
public class KitHelper {
    private static final String ACTION_SYNC_HLOG_FLUSH = "com.heytap.log.brd.action.HLOG_FLUSH";
    private static final String ACTION_SYNC_HLOG_STRATEGY = "com.heytap.log.brd.action.HLOG_STRATEGY";
    private static final String ACTION_SYNC_HLOG_TASK = "com.heytap.log.brd.action.SYNC_HLOG_TASK";
    private static final int INVALID_DATA_LEN = 10;
    private static final String KIT_CONFIG_EXTRA = "kitconfig";
    private static final String KIT_FLUSH_BUSINESS_EXTRA = "business";
    private static String KIT_STRATEGY_KEY = "strategy_kit";
    private static final String TAG = "KitHelper";
    private static final String TASK_CONFIG_EXTRA = "taskconfig";
    private static Context context;

    public static void init(Context context2) {
        context = context2;
    }

    public static void synKitStrategyConfig(String str) {
        Log.d(TAG, "kit to sdk synKitStrategyConfig : " + str);
        if (TextUtils.isEmpty(str) || context == null) {
            return;
        }
        Intent intent = new Intent("com.heytap.log.brd.action.HLOG_STRATEGY");
        intent.putExtra("kitconfig", str);
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent);
    }

    public static void synKitTaskConfigs(String str) {
        if (TextUtils.isEmpty(str) || context == null || str.length() < 10) {
            return;
        }
        Log.d(TAG, "kit同步synKitTaskConfigs : " + str);
        Intent intent = new Intent("com.heytap.log.brd.action.SYNC_HLOG_TASK");
        intent.putExtra("taskconfig", str);
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent);
    }

    public static void synKitTaskConfigs(Context context2, String str) {
        if (TextUtils.isEmpty(str) || context2 == null || str.length() < 10) {
            return;
        }
        Log.d(TAG, "++kit同步synKitTaskConfigs : " + str);
        Intent intent = new Intent("com.heytap.log.brd.action.SYNC_HLOG_TASK");
        intent.putExtra("taskconfig", str);
        intent.setPackage(context2.getPackageName());
        context2.sendBroadcast(intent);
    }
}
