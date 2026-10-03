package com.heytap.accessory.connectivity.core;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.util.ArrayMap;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.oplus.aiunit.vision.pca;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class a {
    public static final String f = "a";
    public static a g;
    public final Handler a;
    public final Map<String, d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BluetoothAdapter f2514c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f2515e;

    /* JADX INFO: renamed from: com.heytap.accessory.connectivity.core.a$a, reason: collision with other inner class name */
    public class C0237a implements d {
        public C0237a() {
        }

        @Override // com.heytap.accessory.connectivity.core.a.d
        public void a(Intent intent) {
            try {
                a.this.d = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                if (a.this.d == 10) {
                    com.heytap.accessory.base.logging.a.c(a.f, "BT is off");
                    Message messageObtainMessage = a.this.a.obtainMessage();
                    messageObtainMessage.what = 109;
                    messageObtainMessage.arg1 = 1;
                    messageObtainMessage.arg2 = 6;
                    a.this.a.sendMessage(messageObtainMessage);
                } else if (a.this.d == 12) {
                    com.heytap.accessory.base.logging.a.c(a.f, "BT is on");
                    Message messageObtainMessage2 = a.this.a.obtainMessage();
                    messageObtainMessage2.what = 109;
                    messageObtainMessage2.arg1 = 2;
                    messageObtainMessage2.arg2 = 6;
                    a.this.a.sendMessage(messageObtainMessage2);
                } else {
                    com.heytap.accessory.base.logging.a.d(a.f, "ignore this state:" + a.this.d);
                }
            } catch (Exception e2) {
                com.heytap.accessory.base.logging.a.b(a.f, "BluetoothStateReceiver Exception," + e2);
            }
        }
    }

    public class b implements d {
        public b() {
        }

        @Override // com.heytap.accessory.connectivity.core.a.d
        public void a(Intent intent) {
            com.heytap.accessory.base.logging.a.a(a.f, "BluetoothAdapter.ACTION_BOND_STATE_CHANGED");
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice == null) {
                com.heytap.accessory.base.logging.a.b(a.f, "BluetoothDevice is null");
                return;
            }
            String address = bluetoothDevice.getAddress();
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10);
            if (intExtra == 12) {
                com.heytap.accessory.base.logging.a.a(a.f, "BluetoothDevice state- BOND_BONDED " + address);
                return;
            }
            if (intExtra == 10) {
                com.heytap.accessory.base.logging.a.a(a.f, "BluetoothDevice state- BOND_NONE " + address);
                Message messageObtainMessage = a.this.a.obtainMessage();
                messageObtainMessage.what = 130;
                messageObtainMessage.arg1 = 6;
                messageObtainMessage.obj = address;
                a.this.a.sendMessage(messageObtainMessage);
            }
        }
    }

    public class c extends BroadcastReceiver {
        public /* synthetic */ c(a aVar, C0237a c0237a) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
            String action = intent.getAction();
            d dVar = (d) a.this.b.get(action);
            if (dVar != null) {
                dVar.a(intent);
                return;
            }
            com.heytap.accessory.base.logging.a.e(a.f, "unknown event received in BtEventReceiver: " + action);
        }

        public c() {
        }
    }

    public interface d {
        void a(Intent intent);
    }

    public a(Handler handler) {
        ArrayMap arrayMap = new ArrayMap();
        this.b = arrayMap;
        arrayMap.put("android.bluetooth.adapter.action.STATE_CHANGED", new C0237a());
        arrayMap.put("android.bluetooth.device.action.BOND_STATE_CHANGED", new b());
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.f2514c = defaultAdapter;
        if (defaultAdapter == null) {
            com.heytap.accessory.base.logging.a.b(f, "Init Failed mBtAdapter is null!");
            this.a = null;
        } else {
            this.d = defaultAdapter.getState();
            this.a = handler;
            b();
        }
    }

    public final void b() {
        IntentFilter intentFilter = new IntentFilter();
        pca.a(intentFilter, "android.bluetooth.device.action.BOND_STATE_CHANGED");
        pca.a(intentFilter, "android.bluetooth.adapter.action.STATE_CHANGED");
        this.f2515e = new c(this, null);
        if (PlatformUtils.getContext() == null) {
            com.heytap.accessory.base.logging.a.b(f, "Application context is null");
        } else {
            PlatformUtils.getContext().registerReceiver(this.f2515e, intentFilter);
        }
    }

    public static synchronized a a(Handler handler) {
        a aVar;
        synchronized (a.class) {
            if (g == null) {
                g = new a(handler);
            }
            aVar = g;
        }
        return aVar;
        return aVar;
    }
}
