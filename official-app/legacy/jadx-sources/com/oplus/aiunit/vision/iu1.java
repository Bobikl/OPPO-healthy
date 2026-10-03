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

/* JADX INFO: loaded from: classes5.dex */
public class iu1 {
    public static volatile iu1 g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IntentFilter f12655e;
    public boolean f;
    public List<c> b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<b> f12654c = new CopyOnWriteArrayList();
    public Set<d> d = new CopyOnWriteArraySet();
    public final a a = new a();

    public final class a extends OplusBTCloseBroadcastReceiver {
        public final void a(Intent intent) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            wil.d("BluetoothReceiverManager", "blueAclDisconnect: " + gdb.a(bluetoothDevice.getAddress()) + " " + iu1.this.d.size());
            Iterator it = iu1.this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(bluetoothDevice, 0, 0);
            }
        }

        public final void b(Intent intent) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", 0);
            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE", 0);
            wil.d("BluetoothReceiverManager", "bluetoothConnectionChanged: " + gdb.a(bluetoothDevice.getAddress()) + " status=" + intExtra + " preStatus=" + intExtra2 + " " + iu1.this.d.size());
            Iterator it = iu1.this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(bluetoothDevice, intExtra, intExtra2);
            }
        }

        public final void c(Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
            wil.d("BluetoothReceiverManager", "bluetoothStateChange: " + intExtra);
            iu1.this.i(intExtra);
        }

        public final void d(Intent intent) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice == null) {
                wil.b("BluetoothReceiverManager", "BluetoothReceiver [onReceive] device is null");
                return;
            }
            String address = bluetoothDevice.getAddress();
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 10);
            wil.d("BluetoothReceiverManager", "bondStateChanged: " + gdb.a(address) + " " + intExtra);
            iu1.this.j(address, intExtra);
        }

        @Override // com.heytap.health.base.bluetooth.OplusBTCloseBroadcastReceiver
        public void onRealReceive(Context context, Intent intent) {
            if (intent == null) {
                wil.b("BluetoothReceiverManager", "BluetoothReceiver onReceive intent is null");
                return;
            }
            String action = intent.getAction();
            wil.d("BluetoothReceiverManager", "onReceive: action:" + action);
            if (!BluetoothUtil.INSTANCE.g()) {
                wil.k("BluetoothReceiverManager", "onReceive: no permission");
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

    public iu1() {
        IntentFilter intentFilter = new IntentFilter();
        this.f12655e = intentFilter;
        intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
        this.f12655e.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        this.f12655e.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
    }

    public static void g() {
        g.f();
        g = null;
    }

    public static iu1 h() {
        if (g == null) {
            synchronized (iu1.class) {
                if (g == null) {
                    g = new iu1();
                }
            }
        }
        return g;
    }

    public void d(@NonNull b bVar) {
        this.f12654c.add(bVar);
    }

    public void e(@NonNull c cVar) {
        this.b.add(cVar);
    }

    public final void f() {
        this.b.clear();
        this.f12654c.clear();
    }

    public final void i(int i) {
        wil.a("BluetoothReceiverManager", "onBluetoothStateChanged: state:" + i);
        Iterator<b> it = this.f12654c.iterator();
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
        rdf.a(context, this.a, this.f12655e, 2);
        this.f = true;
    }

    public void l(@NonNull b bVar) {
        this.f12654c.remove(bVar);
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
