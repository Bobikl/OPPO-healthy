package com.heytap.msp.sdk.common.net;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.NonNull;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class NetStateChangeReceiver extends BroadcastReceiver {
    private List<NetStateChangeObserver> mObservers = new ArrayList();

    public static class InstanceHolder {
        private static final NetStateChangeReceiver INSTANCE = new NetStateChangeReceiver();

        private InstanceHolder() {
        }
    }

    private void notifyObservers(NetworkType networkType) {
        NetworkType networkType2 = NetworkType.NETWORK_NO;
        Iterator<NetStateChangeObserver> it = this.mObservers.iterator();
        if (networkType == networkType2) {
            while (it.hasNext()) {
                it.next().onNetDisconnected();
            }
        } else {
            while (it.hasNext()) {
                it.next().onNetConnected(networkType);
            }
        }
    }

    public static void registerObserver(NetStateChangeObserver netStateChangeObserver) {
        if (netStateChangeObserver == null || InstanceHolder.INSTANCE.mObservers.contains(netStateChangeObserver)) {
            return;
        }
        InstanceHolder.INSTANCE.mObservers.add(netStateChangeObserver);
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(33)
    public static void registerReceiver(@NonNull Context context) {
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        int i = Build.VERSION.SDK_INT;
        Context applicationContext = context.getApplicationContext();
        if (i >= 33) {
            applicationContext.registerReceiver(InstanceHolder.INSTANCE, intentFilter, 2);
        } else {
            applicationContext.registerReceiver(InstanceHolder.INSTANCE, intentFilter);
        }
    }

    public static void unregisterObserver(NetStateChangeObserver netStateChangeObserver) {
        if (netStateChangeObserver == null || InstanceHolder.INSTANCE.mObservers == null) {
            return;
        }
        InstanceHolder.INSTANCE.mObservers.remove(netStateChangeObserver);
    }

    public static void unregisterReceiver(@NonNull Context context) {
        context.getApplicationContext().unregisterReceiver(InstanceHolder.INSTANCE);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            notifyObservers(NetworkUtils.getNetworkType(context));
        }
    }
}
