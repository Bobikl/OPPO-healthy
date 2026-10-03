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

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class gr0 extends m01 implements Handler.Callback {
    public volatile boolean A;
    public final Object B;
    public final ogf C;
    public final wu1.c D;
    public final wu1.b E;
    public er0 v;
    public er0 w;
    public HandlerThread x;
    public Handler y;
    public volatile int z;

    public class a implements ogf {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.ogf
        public void a(j01 j01Var, byte[] bArr) {
            if (j01Var == gr0.this.v) {
                Iterator it = gr0.this.o.iterator();
                while (it.hasNext()) {
                    ((qk5) it.next()).e(gr0.this, bArr);
                }
            } else if (j01Var == gr0.this.w) {
                Iterator it2 = gr0.this.o.iterator();
                while (it2.hasNext()) {
                    ((qk5) it2.next()).d(gr0.this, bArr);
                }
            }
        }
    }

    public class b implements wu1.c {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.wu1.c
        public void a(String str, int i) {
            if (gr0.this.p == null) {
                uml.b("BRClientDevice", "onBondStateChanged: mBluetoothDevice == null ");
                return;
            }
            String address = gr0.this.p.getAddress();
            uml.a("BRClientDevice", "onBondStateChanged MAC:" + veb.a(str) + " state:" + i);
            synchronized (gr0.this.B) {
                if (BluetoothUtil.INSTANCE.l(str, address)) {
                    if (gr0.this.z == 11 && i == 10) {
                        gr0.this.A = true;
                    }
                    gr0.this.z = i;
                    gr0.this.v.c0(i);
                }
            }
        }
    }

    public gr0(Context context, ModuleInfo moduleInfo) {
        super(context, moduleInfo);
        this.z = 10;
        this.A = false;
        this.B = new Object();
        this.C = new a();
        this.D = new b();
        this.E = new wu1.b() { // from class: com.oplus.aiunit.vision.fr0
            @Override // com.oplus.aiunit.vision.wu1.b
            public final void a(int i) {
                this.a.b0(i);
            }
        };
        a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(int i) {
        if (i == 12) {
            uml.d("BRClientDevice", "onBluetoothStateChanged: state " + i);
            d0();
        }
    }

    @Override // com.oplus.aiunit.vision.m01
    public void B(j01 j01Var, BluetoothDevice bluetoothDevice) {
        if (j01Var == this.v) {
            uml.d("BRClientDevice", "command connection connected, delay to connect data connection");
            S(bluetoothDevice);
            return;
        }
        uml.d("BRClientDevice", "data connection connected");
        if (this.v.k() == 2) {
            uml.d("BRClientDevice", "device connected");
            s(bluetoothDevice);
        }
    }

    @Override // com.oplus.aiunit.vision.m01
    public void C(j01 j01Var, int i) {
        synchronized (this.j) {
            if (this.l == 3) {
                uml.a("BRClientDevice", "onConnectLost, mConnectionState is state none, ignore");
            } else {
                T(j01Var, i);
            }
        }
    }

    public final void O() {
        if (this.y != null) {
            uml.a("BRClientDevice", "asyncCloseCommandClientConnection: delay 1s ");
            this.y.sendEmptyMessageDelayed(4, 1000L);
        }
    }

    public void P() {
        uml.d("BRClientDevice", "close the connection....");
        A(true);
        synchronized (this.j) {
            int i = this.l;
            if (i == 2 || i == 1) {
                uml.d("BRClientDevice", "start to close the connection : " + this.l);
                this.l = 4;
            }
        }
        Handler handler = this.y;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    public final void Q() {
        if (this.y != null) {
            uml.a("BRClientDevice", "asyncCloseDataClientConnection: delay 1s ");
            this.y.sendEmptyMessageDelayed(5, 1000L);
        }
    }

    public final boolean R(boolean z) {
        synchronized (this.j) {
            int i = this.l;
            if (i == 3) {
                uml.d("BRClientDevice", "connect: mConnectionState is : " + this.l + " try connect ");
                this.l = 1;
            } else {
                if (i != 4) {
                    uml.k("BRClientDevice", "connect: mConnectionState is : " + this.l + ", return it");
                    return false;
                }
                Handler handler = this.y;
                if (handler != null && (handler.hasMessages(5) || this.y.hasMessages(4))) {
                    uml.k("BRClientDevice", "connect: device is disconnecting , return it");
                    return false;
                }
                uml.k("BRClientDevice", "connect: state is disconnecting, but messageQueue is empty, continue connect");
                this.l = 1;
            }
            A(false);
            x();
            er0 er0Var = this.v;
            EnumCloseType enumCloseType = EnumCloseType.INACTIVE;
            er0Var.I(enumCloseType);
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
            uml.a("BRClientDevice", "delayToConnectClientData: delay 1s");
            this.y.sendMessageDelayed(Message.obtain(this.y, 2, bluetoothDevice), 1000L);
        }
    }

    public final synchronized void T(j01 j01Var, int i) {
        er0 er0Var = this.v;
        boolean z = j01Var == er0Var;
        int iK = z ? this.w.k() : er0Var.k();
        StringBuilder sb = new StringBuilder();
        sb.append("onConnectionLost: ");
        sb.append(z ? "data connection state = " : "command connection state = ");
        sb.append(iK);
        sb.append("; reason=");
        sb.append(i);
        uml.d("BRClientDevice", sb.toString());
        if (iK == 3) {
            c0();
            synchronized (this.B) {
                if (this.p != null) {
                    uml.a("BRClientDevice", "doWhichConnectionLost: mBondState " + this.z + ", getBondState " + this.p.getBondState());
                    if (this.p.getBondState() != 12 && this.z == 11) {
                        this.A = true;
                        this.z = 10;
                    }
                }
            }
            t(i);
        } else if (iK == 2 || iK == 1) {
            synchronized (this.j) {
                this.l = 4;
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
        uml.d("BRClientDevice", "handleCloseAll client command");
        er0 er0Var = this.v;
        EnumCloseType enumCloseType = EnumCloseType.ACTIVE;
        er0Var.I(enumCloseType);
        this.v.Z(201);
        this.w.I(enumCloseType);
        this.w.Z(201);
    }

    public final void V() {
        uml.d("BRClientDevice", "handleCloseCommandClientConnection, commandConnectionState is : " + this.v.W());
        synchronized (this.j) {
            if (this.l == 4) {
                this.l = 3;
            }
        }
    }

    public final void W() {
        uml.d("BRClientDevice", "handleCloseDataClientConnection, dataConnectionState is : " + this.w.W());
        synchronized (this.j) {
            if (this.l == 4) {
                this.l = 3;
            }
        }
    }

    public final void X(BluetoothDevice bluetoothDevice) {
        synchronized (this.j) {
            if (this.l == 4) {
                uml.k("BRClientDevice", "handleCommandConnectionConnect: disconnecting stop connect");
                t(201);
            } else {
                uml.d("BRClientDevice", "handleCommandConnectionConnect: connect to commandBR");
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

    @Override // com.oplus.aiunit.vision.sa5, com.oplus.aiunit.vision.tx9
    public boolean a() {
        if (this.z != 12) {
            d0();
        }
        return this.z == 12;
    }

    public final void a0() {
        er0 er0Var = new er0(this.i);
        this.v = er0Var;
        er0Var.J(true);
        this.v.K(this.s);
        this.v.y(this.C);
        this.v.L(m01.t);
        er0 er0Var2 = new er0(this.i);
        this.w = er0Var2;
        er0Var2.J(false);
        this.w.K(this.s);
        this.w.y(this.C);
        this.w.L(m01.u);
        HandlerThread handlerThread = new HandlerThread("BRClientDevice");
        this.x = handlerThread;
        handlerThread.start();
        this.y = new Handler(this.x.getLooper(), this);
        wu1.h().e(this.D);
        wu1.h().d(this.E);
        d0();
    }

    @Override // com.oplus.aiunit.vision.sa5, com.oplus.aiunit.vision.tx9
    public boolean b() {
        return (!BluetoothAdapter.getDefaultAdapter().isEnabled() || k() != 3 || this.p == null || r() || this.A) ? false : true;
    }

    public final void c0() {
        if (this.y != null) {
            uml.a("BRClientDevice", "removeAsyncMessage: ");
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

    @Override // com.oplus.aiunit.vision.sa5
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

    @Override // com.oplus.aiunit.vision.sa5
    public void i(int i) {
        P();
    }

    @Override // com.oplus.aiunit.vision.sa5
    public ModuleInfo l() {
        return this.k;
    }

    @Override // com.oplus.aiunit.vision.sa5
    public void q() {
        super.q();
        R(true);
    }

    @Override // com.oplus.aiunit.vision.sa5
    public void u() {
        P();
        wu1.h().m(this.D);
        wu1.h().l(this.E);
        this.v.P(this.C);
        this.w.P(this.C);
        Z();
        this.v.z();
        this.w.z();
    }

    @Override // com.oplus.aiunit.vision.sa5
    public int y(byte[] bArr, lt2<Void> lt2Var) {
        er0 er0Var = this.w;
        if (er0Var != null) {
            return er0Var.Q(bArr, jxg.b().a(), lt2Var);
        }
        return 306;
    }

    @Override // com.oplus.aiunit.vision.sa5
    public int z(byte[] bArr, lt2<Void> lt2Var) {
        er0 er0Var = this.v;
        if (er0Var != null) {
            return er0Var.Q(bArr, jxg.b().a(), lt2Var);
        }
        uml.b("BRClientDevice", "sendMessage: mCommandBRClientConnection is null");
        return super.z(bArr, lt2Var);
    }
}
