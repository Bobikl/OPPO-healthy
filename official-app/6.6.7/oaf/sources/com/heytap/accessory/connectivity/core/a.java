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
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.oplus.aiunit.vision.xda;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static final String f = "a";
    public static a g;
    public final Handler a;
    public final Map<String, d> b;
    public BluetoothAdapter c;
    public int d;
    public c e;

    public class a implements d {
        public a() {
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
            } catch (Exception e) {
                com.heytap.accessory.base.logging.a.b(a.f, "BluetoothStateReceiver Exception," + e);
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
                messageObtainMessage.what = ConnectConstant.DEVICE_BOND_STATE_NONE;
                messageObtainMessage.arg1 = 6;
                messageObtainMessage.obj = address;
                a.this.a.sendMessage(messageObtainMessage);
            }
        }
    }

    public class c extends BroadcastReceiver {
        public /* synthetic */ c(a aVar, a aVar2) {
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
        arrayMap.put("android.bluetooth.adapter.action.STATE_CHANGED", new a());
        arrayMap.put("android.bluetooth.device.action.BOND_STATE_CHANGED", new b());
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.c = defaultAdapter;
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
        xda.a(intentFilter, "android.bluetooth.device.action.BOND_STATE_CHANGED");
        xda.a(intentFilter, "android.bluetooth.adapter.action.STATE_CHANGED");
        this.e = new c(this, null);
        if (PlatformUtils.getContext() == null) {
            com.heytap.accessory.base.logging.a.b(f, "Application context is null");
        } else {
            PlatformUtils.getContext().registerReceiver(this.e, intentFilter);
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
