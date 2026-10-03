package com.heytap.log.collect.auto;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.heytap.log.IBaseLog;
import com.heytap.log.collect.LoggingEvent;
import com.heytap.log.config.DynConfigManager;
import com.heytap.log.log.ICollectLog;
import com.heytap.log.log.SimpleLog;
import com.heytap.log.util.BaseInfoUtil;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes19.dex */
public class NetworkChangeCollect extends BroadcastReceiver implements IDataCollect, IBaseLog {
    public static final String NETWORK_TAG = "Network_Info";
    public DynConfigManager dynConfigManager;
    private boolean filterFirst = false;
    private ICollectLog mAppender;
    private SimpleLog mSimpleLog;

    public NetworkChangeCollect(ICollectLog iCollectLog) {
        this.mAppender = iCollectLog;
    }

    private static boolean isNetworkConnected(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    @Override // com.heytap.log.collect.auto.IDataCollect
    public void destroy(Context context) {
    }

    @Override // com.heytap.log.IBaseLog
    public int getLogType() {
        return 103;
    }

    @Override // com.heytap.log.collect.auto.IDataCollect
    public void init(Context context) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        DynConfigManager dynConfigManager;
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (this.mSimpleLog != null) {
            this.mSimpleLog.append(new LoggingEvent(NETWORK_TAG, BaseInfoUtil.getNetWorkInfo(), (byte) 4, null, null, null), getLogType());
        } else {
            new Thread(new Runnable() { // from class: com.heytap.log.collect.auto.NetworkChangeCollect.1
                @Override // java.lang.Runnable
                public void run() {
                    if (NetworkChangeCollect.this.mAppender != null) {
                        NetworkChangeCollect.this.mAppender.append(new LoggingEvent(NetworkChangeCollect.NETWORK_TAG, BaseInfoUtil.getNetWorkInfo(), (byte) 4, null, null, null), NetworkChangeCollect.this.getLogType());
                    }
                }
            }).start();
        }
        if (isNetworkConnected(context) && (dynConfigManager = this.dynConfigManager) != null && this.filterFirst) {
            dynConfigManager.isCheckConfig();
        }
        this.filterFirst = true;
    }

    public NetworkChangeCollect(ICollectLog iCollectLog, DynConfigManager dynConfigManager) {
        this.mAppender = iCollectLog;
        this.dynConfigManager = dynConfigManager;
    }

    public NetworkChangeCollect(ICollectLog iCollectLog, DynConfigManager dynConfigManager, SimpleLog simpleLog) {
        this.mAppender = iCollectLog;
        this.dynConfigManager = dynConfigManager;
        this.mSimpleLog = simpleLog;
    }
}
