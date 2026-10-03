package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.CallSuper;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes5.dex */
public abstract class x95 implements mw9 {
    public final Context i;
    public ModuleInfo k;
    public BluetoothDevice p;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f18540j = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18541l = 3;
    public boolean m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18542n = false;
    public CopyOnWriteArraySet<uj5> o = new CopyOnWriteArraySet<>();
    public volatile boolean q = true;
    public Handler r = new a(gy3.a());

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 124:
                    x95.this.q();
                    break;
                case 125:
                    x95.this.n(message);
                    break;
                case 126:
                    x95.this.p(message);
                    break;
                case 127:
                    x95.this.o(message);
                    break;
                case 128:
                    x95.this.m(message);
                    break;
            }
        }
    }

    public x95(Context context, ModuleInfo moduleInfo) {
        this.i = context.getApplicationContext();
        if (moduleInfo != null) {
            this.k = moduleInfo;
            if (BluetoothAdapter.checkBluetoothAddress(moduleInfo.getMacAddress())) {
                this.p = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(moduleInfo.getMacAddress());
                return;
            }
            wil.b("Device", "Device: error mac = " + moduleInfo.getMacAddress());
        }
    }

    public synchronized void A(boolean z) {
        this.q = z;
    }

    @Override // com.oplus.aiunit.vision.mw9
    public boolean a() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.mw9
    public boolean b() {
        return BluetoothAdapter.getDefaultAdapter().isEnabled();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.p.getAddress().equals(((x95) obj).j());
    }

    public boolean g() {
        return false;
    }

    public void h() {
        i(201);
    }

    public int hashCode() {
        BluetoothDevice bluetoothDevice = this.p;
        return bluetoothDevice == null ? super.hashCode() : bluetoothDevice.getAddress().hashCode();
    }

    public abstract void i(int i);

    public String j() {
        BluetoothDevice bluetoothDevice = this.p;
        return bluetoothDevice == null ? "" : bluetoothDevice.getAddress();
    }

    public int k() {
        int i;
        synchronized (this.f18540j) {
            i = this.f18541l;
        }
        return i;
    }

    public abstract ModuleInfo l();

    public final void m(Message message) {
    }

    public final void n(Message message) {
        Iterator<uj5> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public final void o(Message message) {
        Iterator<uj5> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
    }

    public final void p(Message message) {
        Iterator<uj5> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().a(this, message.arg1);
        }
    }

    @CallSuper
    public void q() {
    }

    public boolean r() {
        return this.q;
    }

    @Override // com.oplus.aiunit.vision.mw9
    public void retry() {
        this.r.removeMessages(124);
        Message messageObtain = Message.obtain();
        messageObtain.what = 124;
        this.r.sendMessage(messageObtain);
    }

    public void s(BluetoothDevice bluetoothDevice) {
        wil.a("Device", "onDeviceConnected device " + gdb.a(bluetoothDevice.getAddress()));
        synchronized (this.f18540j) {
            this.f18541l = 2;
        }
        if (l() == null) {
            wil.b("Device", "onDeviceConnected deviceInfo == null ");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 125;
        this.r.sendMessage(messageObtain);
    }

    public void t(int i) {
        synchronized (this.f18540j) {
            wil.k("Device", "onDeviceDisconnect reason " + i);
            this.f18541l = 3;
        }
        if (l() == null) {
            wil.b("Device", "onDeviceDisconnect deviceInfo == null ");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 126;
        messageObtain.arg1 = i;
        this.r.sendMessage(messageObtain);
    }

    public String toString() {
        BluetoothDevice bluetoothDevice = this.p;
        if (bluetoothDevice == null) {
            return super.toString();
        }
        if (bluetoothDevice.getName() == null) {
            return gdb.a(this.p.getAddress());
        }
        return gdb.a(this.p.getAddress()) + " (" + gdb.a(this.p.getName()) + ")";
    }

    public abstract void u();

    public void v(uj5 uj5Var) {
        this.o.add(uj5Var);
    }

    public void w() {
        wil.a("Device", "release");
        this.o.clear();
        u();
    }

    public void x() {
        if (l() != null) {
            this.r.sendEmptyMessage(127);
        } else {
            wil.a("Device", "sendConnectionConnecting deviceInfo == null ");
        }
    }

    public int y(byte[] bArr, xs2<Void> xs2Var) {
        return 306;
    }

    public int z(byte[] bArr, xs2<Void> xs2Var) {
        return 306;
    }
}
