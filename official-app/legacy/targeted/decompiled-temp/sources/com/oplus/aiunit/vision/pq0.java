package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.heytap.health.devicemanager.util.BluetoothUtil;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import com.oplus.wearable.linkservice.transport.connect.br.EnumCloseType;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class pq0 extends yz0 implements Handler.Callback {
    public volatile boolean A;
    public final Object B;
    public final kdf C;
    public final iu1.c D;
    public final iu1.b E;
    public nq0 v;
    public nq0 w;
    public HandlerThread x;
    public Handler y;
    public volatile int z;

    public class a implements kdf {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.kdf
        public void a(vz0 vz0Var, byte[] bArr) {
            if (vz0Var == pq0.this.v) {
                Iterator it = pq0.this.o.iterator();
                while (it.hasNext()) {
                    ((uj5) it.next()).e(pq0.this, bArr);
                }
            } else if (vz0Var == pq0.this.w) {
                Iterator it2 = pq0.this.o.iterator();
                while (it2.hasNext()) {
                    ((uj5) it2.next()).d(pq0.this, bArr);
                }
            }
        }
    }

    public class b implements iu1.c {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.iu1.c
        public void a(String str, int i) {
            if (pq0.this.p == null) {
                wil.b("BRClientDevice", "onBondStateChanged: mBluetoothDevice == null ");
                return;
            }
            String address = pq0.this.p.getAddress();
            wil.a("BRClientDevice", "onBondStateChanged MAC:" + gdb.a(str) + " state:" + i);
            synchronized (pq0.this.B) {
                if (BluetoothUtil.INSTANCE.l(str, address)) {
                    if (pq0.this.z == 11 && i == 10) {
                        pq0.this.A = true;
                    }
                    pq0.this.z = i;
                    pq0.this.v.c0(i);
                }
            }
        }
    }

    public pq0(Context context, ModuleInfo moduleInfo) {
        super(context, moduleInfo);
        this.z = 10;
        this.A = false;
        this.B = new Object();
        this.C = new a();
        this.D = new b();
        this.E = new iu1.b() { // from class: com.oplus.aiunit.vision.oq0
            @Override // com.oplus.aiunit.vision.iu1.b
            public final void a(int i) {
                this.a.b0(i);
            }
        };
        a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(int i) {
        if (i == 12) {
            wil.d("BRClientDevice", "onBluetoothStateChanged: state " + i);
            d0();
        }
    }

    @Override // com.oplus.aiunit.vision.yz0
    public void B(vz0 vz0Var, BluetoothDevice bluetoothDevice) {
        if (vz0Var == this.v) {
            wil.d("BRClientDevice", "command connection connected, delay to connect data connection");
            S(bluetoothDevice);
            return;
        }
        wil.d("BRClientDevice", "data connection connected");
        if (this.v.k() == 2) {
            wil.d("BRClientDevice", "device connected");
            s(bluetoothDevice);
        }
    }

    @Override // com.oplus.aiunit.vision.yz0
    public void C(vz0 vz0Var, int i) {
        synchronized (this.f18540j) {
            if (this.f18541l == 3) {
                wil.a("BRClientDevice", "onConnectLost, mConnectionState is state none, ignore");
            } else {
                T(vz0Var, i);
            }
        }
    }

    public final void O() {
        if (this.y != null) {
            wil.a("BRClientDevice", "asyncCloseCommandClientConnection: delay 1s ");
            this.y.sendEmptyMessageDelayed(4, 1000L);
        }
    }

    public void P() {
        wil.d("BRClientDevice", "close the connection....");
        A(true);
        synchronized (this.f18540j) {
            int i = this.f18541l;
            if (i == 2 || i == 1) {
                wil.d("BRClientDevice", "start to close the connection : " + this.f18541l);
                this.f18541l = 4;
            }
        }
        Handler handler = this.y;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    public final void Q() {
        if (this.y != null) {
            wil.a("BRClientDevice", "asyncCloseDataClientConnection: delay 1s ");
            this.y.sendEmptyMessageDelayed(5, 1000L);
        }
    }

    public final boolean R(boolean z) {
        synchronized (this.f18540j) {
            int i = this.f18541l;
            if (i == 3) {
                wil.d("BRClientDevice", "connect: mConnectionState is : " + this.f18541l + " try connect ");
                this.f18541l = 1;
            } else {
                if (i != 4) {
                    wil.k("BRClientDevice", "connect: mConnectionState is : " + this.f18541l + ", return it");
                    return false;
                }
                Handler handler = this.y;
                if (handler != null && (handler.hasMessages(5) || this.y.hasMessages(4))) {
                    wil.k("BRClientDevice", "connect: device is disconnecting , return it");
                    return false;
                }
                wil.k("BRClientDevice", "connect: state is disconnecting, but messageQueue is empty, continue connect");
                this.f18541l = 1;
            }
            A(false);
            x();
            nq0 nq0Var = this.v;
            EnumCloseType enumCloseType = EnumCloseType.INACTIVE;
            nq0Var.I(enumCloseType);
            this.w.I(enumCloseType);
            Handler handler2 = this.y;
            if (handler2 != null) {
                Message messageObtain = Message.obtain(handler2, 1, this.p);
                this.y.removeMessages(1);
                this.y.sendMessageDelayed(messageObtain, 500L);
            }
            return true;
        }
    }

    public final void S(BluetoothDevice bluetoothDevice) {
        if (this.y != null) {
            wil.a("BRClientDevice", "delayToConnectClientData: delay 1s");
            this.y.sendMessageDelayed(Message.obtain(this.y, 2, bluetoothDevice), 1000L);
        }
    }

    public final synchronized void T(vz0 vz0Var, int i) {
        nq0 nq0Var = this.v;
        boolean z = vz0Var == nq0Var;
        int iK = z ? this.w.k() : nq0Var.k();
        StringBuilder sb = new StringBuilder();
        sb.append("onConnectionLost: ");
        sb.append(z ? "data connection state = " : "command connection state = ");
        sb.append(iK);
        sb.append("; reason=");
        sb.append(i);
        wil.d("BRClientDevice", sb.toString());
        if (iK == 3) {
            c0();
            synchronized (this.B) {
                if (this.p != null) {
                    wil.a("BRClientDevice", "doWhichConnectionLost: mBondState " + this.z + ", getBondState " + this.p.getBondState());
                    if (this.p.getBondState() != 12 && this.z == 11) {
                        this.A = true;
                        this.z = 10;
                    }
                }
            }
            t(i);
        } else if (iK == 2 || iK == 1) {
            synchronized (this.f18540j) {
                this.f18541l = 4;
            }
            if (z) {
                Q();
            } else {
                O();
            }
        }
    }

    public final void U() {
        A(true);
        wil.d("BRClientDevice", "handleCloseAll client command");
        nq0 nq0Var = this.v;
        EnumCloseType enumCloseType = EnumCloseType.ACTIVE;
        nq0Var.I(enumCloseType);
        this.v.Z(201);
        this.w.I(enumCloseType);
        this.w.Z(201);
    }

    public final void V() {
        wil.d("BRClientDevice", "handleCloseCommandClientConnection, commandConnectionState is : " + this.v.W());
        synchronized (this.f18540j) {
            if (this.f18541l == 4) {
                this.f18541l = 3;
            }
        }
    }

    public final void W() {
        wil.d("BRClientDevice", "handleCloseDataClientConnection, dataConnectionState is : " + this.w.W());
        synchronized (this.f18540j) {
            if (this.f18541l == 4) {
                this.f18541l = 3;
            }
        }
    }

    public final void X(BluetoothDevice bluetoothDevice) {
        synchronized (this.f18540j) {
            if (this.f18541l == 4) {
                wil.k("BRClientDevice", "handleCommandConnectionConnect: disconnecting stop connect");
                t(201);
            } else {
                wil.d("BRClientDevice", "handleCommandConnectionConnect: connect to commandBR");
                this.v.X(bluetoothDevice);
            }
        }
    }

    public final void Y(BluetoothDevice bluetoothDevice) {
        this.w.X(bluetoothDevice);
    }

    public final void Z() {
        HandlerThread handlerThread = this.x;
        if (handlerThread != null) {
            handlerThread.quit();
            this.x = null;
        }
        Handler handler = this.y;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.y = null;
        }
    }

    @Override // com.oplus.aiunit.vision.x95, com.oplus.aiunit.vision.mw9
    public boolean a() {
        if (this.z != 12) {
            d0();
        }
        return this.z == 12;
    }

    public final void a0() {
        nq0 nq0Var = new nq0(this.i);
        this.v = nq0Var;
        nq0Var.J(true);
        this.v.K(this.s);
        this.v.y(this.C);
        this.v.L(yz0.t);
        nq0 nq0Var2 = new nq0(this.i);
        this.w = nq0Var2;
        nq0Var2.J(false);
        this.w.K(this.s);
        this.w.y(this.C);
        this.w.L(yz0.u);
        HandlerThread handlerThread = new HandlerThread("BRClientDevice");
        this.x = handlerThread;
        handlerThread.start();
        this.y = new Handler(this.x.getLooper(), this);
        iu1.h().e(this.D);
        iu1.h().d(this.E);
        d0();
    }

    @Override // com.oplus.aiunit.vision.x95, com.oplus.aiunit.vision.mw9
    public boolean b() {
        return (!BluetoothAdapter.getDefaultAdapter().isEnabled() || k() != 3 || this.p == null || r() || this.A) ? false : true;
    }

    public final void c0() {
        if (this.y != null) {
            wil.a("BRClientDevice", "removeAsyncMessage: ");
            this.y.removeMessages(2);
            this.y.removeMessages(4);
            this.y.removeMessages(5);
        }
    }

    public final void d0() {
        synchronized (this.B) {
            BluetoothDevice bluetoothDevice = this.p;
            if (bluetoothDevice != null) {
                this.z = bluetoothDevice.getBondState();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.x95
    public boolean g() {
        this.A = false;
        return R(false);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                X((BluetoothDevice) message.obj);
                break;
            case 2:
                Y((BluetoothDevice) message.obj);
                break;
            case 3:
                U();
                break;
            case 4:
                V();
                break;
            case 5:
                W();
                break;
            case 6:
                Z();
                break;
        }
        return false;
    }

    @Override // com.oplus.aiunit.vision.x95
    public void i(int i) {
        P();
    }

    @Override // com.oplus.aiunit.vision.x95
    public ModuleInfo l() {
        return this.k;
    }

    @Override // com.oplus.aiunit.vision.x95
    public void q() {
        super.q();
        R(true);
    }

    @Override // com.oplus.aiunit.vision.x95
    public void u() {
        P();
        iu1.h().m(this.D);
        iu1.h().l(this.E);
        this.v.P(this.C);
        this.w.P(this.C);
        Z();
        this.v.z();
        this.w.z();
    }

    @Override // com.oplus.aiunit.vision.x95
    public int y(byte[] bArr, xs2<Void> xs2Var) {
        nq0 nq0Var = this.w;
        if (nq0Var != null) {
            return nq0Var.Q(bArr, ttg.b().a(), xs2Var);
        }
        return 306;
    }

    @Override // com.oplus.aiunit.vision.x95
    public int z(byte[] bArr, xs2<Void> xs2Var) {
        nq0 nq0Var = this.v;
        if (nq0Var != null) {
            return nq0Var.Q(bArr, ttg.b().a(), xs2Var);
        }
        wil.b("BRClientDevice", "sendMessage: mCommandBRClientConnection is null");
        return super.z(bArr, xs2Var);
    }
}
