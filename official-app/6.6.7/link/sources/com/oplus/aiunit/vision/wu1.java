package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.health.base.bluetooth.OplusBTCloseBroadcastReceiver;
import com.heytap.health.devicemanager.util.BluetoothUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class wu1 {
    public static volatile wu1 g;
    public IntentFilter e;
    public boolean f;
    public List<c> b = new ArrayList();
    public List<b> c = new CopyOnWriteArrayList();
    public Set<d> d = new CopyOnWriteArraySet();
    public final a a = new a();

    public final class a extends OplusBTCloseBroadcastReceiver {
        public final void a(Intent intent) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            uml.d("BluetoothReceiverManager", "blueAclDisconnect: " + veb.a(bluetoothDevice.getAddress()) + " " + wu1.this.d.size());
            Iterator it = wu1.this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(bluetoothDevice, 0, 0);
            }
        }

        public final void b(Intent intent) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0);
            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE", 0);
            uml.d("BluetoothReceiverManager", "bluetoothConnectionChanged: " + veb.a(bluetoothDevice.getAddress()) + " status=" + intExtra + " preStatus=" + intExtra2 + " " + wu1.this.d.size());
            Iterator it = wu1.this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(bluetoothDevice, intExtra, intExtra2);
            }
        }

        public final void c(Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
            uml.d("BluetoothReceiverManager", "bluetoothStateChange: " + intExtra);
            wu1.this.i(intExtra);
        }

        public final void d(Intent intent) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice == null) {
                uml.b("BluetoothReceiverManager", "BluetoothReceiver [onReceive] device is null");
                return;
            }
            String address = bluetoothDevice.getAddress();
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10);
            uml.d("BluetoothReceiverManager", "bondStateChanged: " + veb.a(address) + " " + intExtra);
            wu1.this.j(address, intExtra);
        }

        public void onRealReceive(Context context, Intent intent) {
            if (intent == null) {
                uml.b("BluetoothReceiverManager", "BluetoothReceiver onReceive intent is null");
                return;
            }
            String action = intent.getAction();
            uml.d("BluetoothReceiverManager", "onReceive: action:" + action);
            if (!BluetoothUtil.INSTANCE.g()) {
                uml.k("BluetoothReceiverManager", "onReceive: no permission");
                return;
            }
            if (TextUtils.equals(action, "android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                d(intent);
                return;
            }
            if (TextUtils.equals(action, "android.bluetooth.adapter.action.STATE_CHANGED")) {
                c(intent);
            } else if (TextUtils.equals("android.bluetooth.device.action.ACL_DISCONNECTED", action)) {
                a(intent);
            } else if (TextUtils.equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED", action)) {
                b(intent);
            }
        }

        public a() {
        }
    }

    public interface b {
        void a(int i);
    }

    public interface c {
        void a(String str, int i);
    }

    public interface d {
        void a(BluetoothDevice bluetoothDevice, int i, int i2);
    }

    public wu1() {
        IntentFilter intentFilter = new IntentFilter();
        this.e = intentFilter;
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        this.e.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.e.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
    }

    public static void g() {
        g.f();
        g = null;
    }

    public static wu1 h() {
        if (g == null) {
            synchronized (wu1.class) {
                if (g == null) {
                    g = new wu1();
                }
            }
        }
        return g;
    }

    public void d(@NonNull b bVar) {
        this.c.add(bVar);
    }

    public void e(@NonNull c cVar) {
        this.b.add(cVar);
    }

    public final void f() {
        this.b.clear();
        this.c.clear();
    }

    public final void i(int i) {
        uml.a("BluetoothReceiverManager", "onBluetoothStateChanged: state:" + i);
        Iterator<b> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().a(i);
        }
    }

    public final void j(String str, int i) {
        Iterator<c> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(str, i);
        }
    }

    public void k(@NonNull Context context) {
        if (this.f) {
            return;
        }
        vgf.a(context, this.a, this.e, 2);
        this.f = true;
    }

    public void l(@NonNull b bVar) {
        this.c.remove(bVar);
    }

    public void m(@NonNull c cVar) {
        this.b.remove(cVar);
    }

    public void n(@NonNull Context context) {
        if (this.f) {
            context.unregisterReceiver(this.a);
        }
        this.f = false;
    }
}
