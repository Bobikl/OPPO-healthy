package com.heytap.health.base.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.heytap.health.base.task.ThreadUtils;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.rpc;

/* JADX INFO: loaded from: classes15.dex */
public class NetStateChangeLiveData extends LiveData<Integer> {
    public static final int NET_STATE_LAST_AVAILABLE = 10;
    public static final int NET_STATE_LAST_INVALID = 0;
    public static final int NET_STATE_MOBILE = 1;
    public static final int NET_STATE_NONE = 0;
    public static final int NET_STATE_NOT_MOBILE = 2;
    public Boolean b;
    public int a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BroadcastReceiver f3177c = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Boolean boolB = rpc.b(context);
            if (boolB == null) {
                NetStateChangeLiveData.this.b = Boolean.FALSE;
                NetStateChangeLiveData netStateChangeLiveData = NetStateChangeLiveData.this;
                if (10 == netStateChangeLiveData.a) {
                    netStateChangeLiveData.postValue(0);
                }
                NetStateChangeLiveData.this.a = 0;
                return;
            }
            if (boolB.booleanValue()) {
                if (NetStateChangeLiveData.this.b == null || NetStateChangeLiveData.this.b.booleanValue()) {
                    NetStateChangeLiveData netStateChangeLiveData2 = NetStateChangeLiveData.this;
                    netStateChangeLiveData2.postValue(Integer.valueOf(netStateChangeLiveData2.a + 1));
                    NetStateChangeLiveData.this.b = Boolean.FALSE;
                }
            } else if (NetStateChangeLiveData.this.b == null || !NetStateChangeLiveData.this.b.booleanValue()) {
                NetStateChangeLiveData.this.b = Boolean.TRUE;
                NetStateChangeLiveData netStateChangeLiveData3 = NetStateChangeLiveData.this;
                netStateChangeLiveData3.postValue(Integer.valueOf(netStateChangeLiveData3.a + 2));
            }
            NetStateChangeLiveData.this.a = 10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Observer observer) {
        super.observeForever(observer);
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(@NonNull final Observer<? super Integer> observer) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            super.observeForever(observer);
        } else {
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.rnc
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.h(observer);
                }
            });
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        rdf.a(b78.a(), this.f3177c, intentFilter, 2);
    }

    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        b78.a().unregisterReceiver(this.f3177c);
    }
}
