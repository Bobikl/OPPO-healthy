package com.heytap.store.base.core.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.base.core.util.thread.AppThreadExecutor;
import com.heytap.store.base.core.util.thread.MainLooper;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkMonitor extends BroadcastReceiver {
    private static NetworkMonitor instance;
    private ConnectivityManagerProxy.SimpleNetworkInfo networkInfo;
    public NetworkObservable observable;

    private NetworkMonitor() {
        ContextGetterUtils contextGetterUtils = ContextGetterUtils.INSTANCE;
        init(contextGetterUtils.getApp());
        this.networkInfo = ConnectivityManagerProxy.simplizeNetworkInfo(contextGetterUtils.getApp(), ConnectivityManagerProxy.getCurrentActiveNetworkInfo(contextGetterUtils.getApp()));
    }

    public static NetworkMonitor getInstance() {
        if (instance == null) {
            synchronized (NetworkMonitor.class) {
                if (instance == null) {
                    instance = new NetworkMonitor();
                }
            }
        }
        return instance;
    }

    private void init(Context context) {
        if (context == null) {
            return;
        }
        this.observable = new NetworkObservable(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(this, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyNetState$0(ConnectivityManagerProxy.SimpleNetworkInfo simpleNetworkInfo) {
        NetworkObservable networkObservable = this.observable;
        if (networkObservable != null) {
            networkObservable.notifyObservers(simpleNetworkInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyNetState$1(Context context) {
        try {
            final ConnectivityManagerProxy.SimpleNetworkInfo simpleNetworkInfoSimplizeNetworkInfo = ConnectivityManagerProxy.simplizeNetworkInfo(context, ConnectivityManagerProxy.getCurrentActiveNetworkInfo(context));
            MainLooper.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.bpc
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$notifyNetState$0(simpleNetworkInfoSimplizeNetworkInfo);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void notifyNetState(final Context context) {
        if (UrlConfig.DEBUG) {
            Log.d("NetworkMonitor", "notifyNetState");
        }
        AppThreadExecutor.getInstance().executeNormalTask(new Runnable() { // from class: com.oplus.aiunit.vision.cpc
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$notifyNetState$1(context);
            }
        });
    }

    public void addObserver(NetworkObserver networkObserver) {
        NetworkObservable networkObservable = this.observable;
        if (networkObservable != null) {
            networkObservable.addObserver(networkObserver);
        }
    }

    public void clearAllObservers() {
        NetworkObservable networkObservable = this.observable;
        if (networkObservable != null) {
            networkObservable.deleteObservers();
        }
    }

    public void delObserver(NetworkObserver networkObserver) {
        NetworkObservable networkObservable = this.observable;
        if (networkObservable != null) {
            networkObservable.deleteObserver(networkObserver);
        }
    }

    public ConnectivityManagerProxy.SimpleNetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        notifyNetState(context);
    }
}
