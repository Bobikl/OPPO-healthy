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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public abstract class sa5 implements tx9 {
    public final Context i;
    public ModuleInfo k;
    public BluetoothDevice p;
    public final Object j = new Object();
    public int l = 3;
    public boolean m = false;
    public boolean n = false;
    public CopyOnWriteArraySet<qk5> o = new CopyOnWriteArraySet<>();
    public volatile boolean q = true;
    public Handler r = new a(uy3.a());

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 124:
                    sa5.this.q();
                    break;
                case 125:
                    sa5.this.n(message);
                    break;
                case 126:
                    sa5.this.p(message);
                    break;
                case 127:
                    sa5.this.o(message);
                    break;
                case 128:
                    sa5.this.m(message);
                    break;
            }
        }
    }

    public sa5(Context context, ModuleInfo moduleInfo) {
        this.i = context.getApplicationContext();
        if (moduleInfo != null) {
            this.k = moduleInfo;
            if (BluetoothAdapter.checkBluetoothAddress(moduleInfo.getMacAddress())) {
                this.p = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(moduleInfo.getMacAddress());
                return;
            }
            uml.b("Device", "Device: error mac = " + moduleInfo.getMacAddress());
        }
    }

    public synchronized void A(boolean z) {
        this.q = z;
    }

    @Override // com.oplus.aiunit.vision.tx9
    public boolean a() {
        return true;
    }

    @Override // com.oplus.aiunit.vision.tx9
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
        return this.p.getAddress().equals(((sa5) obj).j());
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
        synchronized (this.j) {
            i = this.l;
        }
        return i;
    }

    public abstract ModuleInfo l();

    public final void m(Message message) {
    }

    public final void n(Message message) {
        Iterator<qk5> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    public final void o(Message message) {
        Iterator<qk5> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().c(this);
        }
    }

    public final void p(Message message) {
        Iterator<qk5> it = this.o.iterator();
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

    @Override // com.oplus.aiunit.vision.tx9
    public void retry() {
        this.r.removeMessages(124);
        Message messageObtain = Message.obtain();
        messageObtain.what = 124;
        this.r.sendMessage(messageObtain);
    }

    public void s(BluetoothDevice bluetoothDevice) {
        uml.a("Device", "onDeviceConnected device " + veb.a(bluetoothDevice.getAddress()));
        synchronized (this.j) {
            this.l = 2;
        }
        if (l() == null) {
            uml.b("Device", "onDeviceConnected deviceInfo == null ");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 125;
        this.r.sendMessage(messageObtain);
    }

    public void t(int i) {
        synchronized (this.j) {
            uml.k("Device", "onDeviceDisconnect reason " + i);
            this.l = 3;
        }
        if (l() == null) {
            uml.b("Device", "onDeviceDisconnect deviceInfo == null ");
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
            return veb.a(this.p.getAddress());
        }
        return veb.a(this.p.getAddress()) + " (" + veb.a(this.p.getName()) + ")";
    }

    public abstract void u();

    public void v(qk5 qk5Var) {
        this.o.add(qk5Var);
    }

    public void w() {
        uml.a("Device", "release");
        this.o.clear();
        u();
    }

    public void x() {
        if (l() != null) {
            this.r.sendEmptyMessage(127);
        } else {
            uml.a("Device", "sendConnectionConnecting deviceInfo == null ");
        }
    }

    public int y(byte[] bArr, lt2<Void> lt2Var) {
        return 306;
    }

    public int z(byte[] bArr, lt2<Void> lt2Var) {
        return 306;
    }
}
