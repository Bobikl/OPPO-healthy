package com.heytap.accessory.connectivity.core.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pGroup;
import android.os.Handler;
import android.os.Message;
import android.util.ArrayMap;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.logging.SensitiveLogUtils;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.oplus.aiunit.vision.pca;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static final String d = "b";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile b f2522e;
    public final Handler a;
    public final Map<String, c> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0240b f2523c;

    /* JADX INFO: renamed from: com.heytap.accessory.connectivity.core.util.b$b, reason: collision with other inner class name */
    public class C0240b extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            String action = intent.getAction();
            c cVar = (c) b.this.b.get(action);
            if (cVar != null) {
                cVar.a(intent);
                return;
            }
            com.heytap.accessory.base.logging.a.e(b.d, "unknown event received in BtEventReceiver: " + action);
        }

        public C0240b() {
        }
    }

    public interface c {
        void a(Intent intent);
    }

    public b(Handler handler) {
        ArrayMap arrayMap = new ArrayMap();
        this.b = arrayMap;
        this.a = handler;
        arrayMap.put("android.net.wifi.p2p.CONNECTION_STATE_CHANGE", new c() { // from class: com.oplus.aiunit.vision.bfm
            @Override // com.heytap.accessory.connectivity.core.util.b.c
            public final void a(Intent intent) {
                this.a.a(intent);
            }
        });
    }

    public void b() {
        IntentFilter intentFilter = new IntentFilter();
        pca.a(intentFilter, "android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
        this.f2523c = new C0240b();
        if (PlatformUtils.getContext() == null) {
            com.heytap.accessory.base.logging.a.b(d, "Application context is null");
        } else {
            PlatformUtils.getContext().registerReceiver(this.f2523c, intentFilter);
            com.heytap.accessory.base.logging.a.c(d, "registerWifiStateEvents");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent) {
        boolean z;
        String str = d;
        com.heytap.accessory.base.logging.a.d(str, "receive broadcast:android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
        try {
            WifiP2pGroup wifiP2pGroup = (WifiP2pGroup) intent.getParcelableExtra("p2pGroupInfo");
            if (wifiP2pGroup == null) {
                com.heytap.accessory.base.logging.a.e(str, "wifiP2pGroup is NULL ");
                return;
            }
            if (!wifiP2pGroup.isGroupOwner()) {
                com.heytap.accessory.base.logging.a.e(str, "wifiP2pGroup is GC");
                return;
            }
            Collection<WifiP2pDevice> clientList = wifiP2pGroup.getClientList();
            for (com.heytap.accessory.base.bean.b bVar : AccessoryManager.h().b(1)) {
                String strN = bVar.n();
                if (ConnectConstant.DEFAULT_WIFI_LOCAL_ADDRESS.equals(strN)) {
                    com.heytap.accessory.base.logging.a.a(d, "connected p2p mac is a default value, ignore...");
                } else {
                    Iterator<WifiP2pDevice> it = clientList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        WifiP2pDevice next = it.next();
                        com.heytap.accessory.base.logging.a.a(d, "WifiP2pDevice clientList:  " + SensitiveLogUtils.toHiddenIfNeed(next.deviceAddress));
                        if (next.deviceAddress.equals(strN)) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        Message messageObtainMessage = this.a.obtainMessage();
                        messageObtainMessage.what = 109;
                        messageObtainMessage.arg1 = 1;
                        messageObtainMessage.arg2 = 1;
                        messageObtainMessage.obj = Long.valueOf(bVar.l());
                        this.a.sendMessage(messageObtainMessage);
                    }
                }
            }
            for (WifiP2pDevice wifiP2pDevice : clientList) {
                com.heytap.accessory.base.logging.a.a(d, "client address:" + SensitiveLogUtils.toHiddenIfNeed(wifiP2pDevice.deviceAddress) + " client name:" + wifiP2pDevice.deviceName + " client status:" + wifiP2pDevice.status + "  primaryDeviceType:" + wifiP2pDevice.primaryDeviceType);
            }
        } catch (Exception unused) {
            com.heytap.accessory.base.logging.a.e(d, "WifiStateReceiver error");
        }
    }

    public static b a(Handler handler) {
        if (f2522e == null) {
            synchronized (b.class) {
                if (f2522e == null) {
                    f2522e = new b(handler);
                }
            }
        }
        return f2522e;
    }
}
