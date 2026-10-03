package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.heytap.health.devicemanager.util.BluetoothUtil;

/* JADX INFO: loaded from: classes17.dex */
public class d9a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d9a f10440e = new d9a();
    public b b;
    public final IntentFilter a = new IntentFilter();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f10441c = new Handler(Looper.getMainLooper());
    public final BroadcastReceiver d = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            if (d9a.this.b != null) {
                d9a.this.b.a(str, "acl connected");
            } else {
                wil.d("InnerRetry", "acl no cb");
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if (!BluetoothUtil.INSTANCE.g()) {
                wil.b("InnerRetry", "not BLUETOOTH_SCAN permission!!!");
                return;
            }
            String action = intent.getAction();
            BluetoothDevice bluetoothDevice = null;
            if (TextUtils.equals(action, "android.bluetooth.device.action.ACL_CONNECTED")) {
                try {
                    bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                } catch (Exception unused) {
                }
                if (bluetoothDevice != null) {
                    final String address = bluetoothDevice.getAddress();
                    ot1.INSTANCE.d(address);
                    wil.d("InnerRetry", "onReceive: acl connect " + gdb.a(address));
                    d9a.this.f10441c.removeMessages(address.hashCode());
                    d9a.this.f10441c.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.c9a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.i.b(address);
                        }
                    }, Integer.valueOf(address.hashCode()), 2000L);
                    return;
                }
                return;
            }
            if (TextUtils.equals(action, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED")) {
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                try {
                    bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                } catch (Exception unused2) {
                }
                if (bluetoothDevice != null && intExtra == 2) {
                    String address2 = bluetoothDevice.getAddress();
                    wil.d("InnerRetry", "onReceive: hfp connect " + gdb.a(address2));
                    if (d9a.this.b != null) {
                        d9a.this.f10441c.removeMessages(address2.hashCode());
                        d9a.this.b.a(address2, "hfp connected");
                    } else {
                        wil.d("InnerRetry", "hfp no cb");
                    }
                }
                if (bluetoothDevice == null || intExtra != 0) {
                    return;
                }
                ot1.INSTANCE.e(bluetoothDevice.getAddress());
                return;
            }
            if (TextUtils.equals(action, "android.intent.action.SCREEN_ON")) {
                if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                    d9a.this.b.b(com.heytap.health.oaf.event.a.SCREEN_ON);
                    return;
                }
                return;
            }
            if (TextUtils.equals(action, "android.bluetooth.device.action.ACL_DISCONNECTED")) {
                try {
                    bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                } catch (Exception unused3) {
                }
                if (bluetoothDevice != null) {
                    String address3 = bluetoothDevice.getAddress();
                    ot1.INSTANCE.e(address3);
                    wil.d("InnerRetry", "onReceive: acl disconnect " + gdb.a(address3));
                    if (d9a.this.b != null) {
                        d9a.this.b.c(address3, "acl dis");
                    } else {
                        wil.d("InnerRetry", "acl dis no cb");
                    }
                }
            }
        }
    }

    public interface b {
        void a(String str, String str2);

        void b(String str);

        void c(String str, String str2);
    }

    public static d9a c() {
        return f10440e;
    }

    public d9a d() {
        wil.d("InnerRetry", "monitorAclDisconnect: ");
        this.a.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        return this;
    }

    public d9a e() {
        wil.d("InnerRetry", "monitorAclReconnect: ");
        this.a.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        return this;
    }

    public d9a f() {
        wil.d("InnerRetry", "monitorHfpReconnect: ");
        this.a.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        return this;
    }

    public d9a g() {
        wil.d("InnerRetry", "monitorScreenOn: ");
        this.a.addAction("android.intent.action.SCREEN_ON");
        return this;
    }

    public void h(Context context, b bVar) {
        this.b = bVar;
        rdf.a(context, this.d, this.a, 2);
    }

    public void i(Context context) {
        context.getApplicationContext().unregisterReceiver(this.d);
    }
}
