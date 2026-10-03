package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.oplus.wearable.linkservice.transport.connect.br.EnumCloseType;
import java.io.IOException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class er0 extends j01 {
    public Handler A;
    public HandlerThread B;
    public a C;
    public volatile int D;
    public volatile int E;
    public final Object z;

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            synchronized (er0.this.z) {
                if (er0.this.D != 0) {
                    uml.k(er0.this.b + "_SocketTimeOut", "mSocketConState is not initialize state, ignore");
                    return;
                }
                er0.this.D = 2;
                uml.k(er0.this.b + "_SocketTimeOut", "socket connect timeout, close socket!");
                er0.this.d();
            }
        }

        public a() {
        }
    }

    public er0(Context context) {
        super(context);
        this.z = new Object();
        this.E = 10;
        b0();
    }

    @Override // com.oplus.aiunit.vision.j01
    public void H(BluetoothDevice bluetoothDevice) {
        super.H(bluetoothDevice);
        if (bluetoothDevice == null) {
            return;
        }
        this.E = bluetoothDevice.getBondState();
    }

    public int W() {
        synchronized (this.a) {
            if (this.c != 4 && this.c != 3) {
                int i = this.c;
                this.c = 4;
                if (i != 2 || i() != EnumCloseType.ACTIVE) {
                    O();
                    return this.c;
                }
                uml.a(this.b, "closeConnect: CommandConnection will send the active close flag to remote device");
                d0();
                return this.c;
            }
            uml.k(this.b, "closeConnect: mState = " + this.c + ", ignore");
            return this.c;
        }
    }

    public void X(BluetoothDevice bluetoothDevice) {
        uml.d(this.b, "connect: start to create the connect: " + this.c);
        synchronized (this.a) {
            if (this.c == 3) {
                this.c = 1;
                this.h.clear();
                Message.obtain(this.p, 1, bluetoothDevice).sendToTarget();
            } else {
                uml.k(this.b, "startConnect, mState is : " + this.c + ", return it");
            }
        }
    }

    public final boolean Y(BluetoothDevice bluetoothDevice) {
        if (this.j != null) {
            uml.a(this.b, "createSocket: mSocket != null");
            return true;
        }
        try {
            uml.d(this.b, "createSocket: BEGIN");
            this.j = bluetoothDevice.createRfcommSocketToServiceRecord(l().getUuid());
            uml.d(this.b, "createSocket: END SUCCESS");
            return true;
        } catch (IOException e) {
            uml.d(this.b, "createSocket: END FAIL:" + e.getMessage());
            synchronized (this.a) {
                this.c = 3;
                B(309, this);
                return false;
            }
        }
    }

    public void Z(int i) {
        W();
    }

    public final void a0(int i) {
        this.A.removeCallbacks(this.C);
        if (i == 2) {
            uml.d(this.b, "handleSocketConnectException: socket connect timeout");
            synchronized (this.a) {
                this.c = 3;
            }
            B(312, this);
            return;
        }
        uml.a(this.b, "handleSocketConnectException: mSocketConState " + i);
        d();
        synchronized (this.a) {
            this.c = 3;
        }
        B(308, this);
    }

    public final void b0() {
        HandlerThread handlerThread = new HandlerThread("Connection_Timeout_handler");
        this.B = handlerThread;
        handlerThread.start();
        this.A = new Handler(this.B.getLooper());
        this.C = new a();
    }

    public void c0(int i) {
        if (i == 11) {
            this.A.removeCallbacks(this.C);
        }
        if (i == 10 && this.E == 11) {
            synchronized (this.z) {
                if (this.D != 0) {
                    uml.d(this.b, "onBondStateChanged: Bond cancel mSocketConState is not initialize state, ignore");
                    this.E = i;
                    return;
                } else {
                    this.D = 3;
                    uml.d(this.b, "onBondStateChanged: Bond cancel close socket!");
                    d();
                }
            }
        }
        this.E = i;
    }

    public final void d0() {
        uml.k(this.b, "sendActiveCloseFlag: ");
        g(du1.INTERNAL_COMMAND_TYPE, du1.OVER_FLAG, null);
    }

    public final void e0() {
        int i;
        synchronized (this.a) {
            i = this.c;
        }
        if (i == 2) {
            uml.a(this.b, "prepareSocketConnect: state connected, ignore");
            return;
        }
        if (i == 4) {
            a0(this.D);
            return;
        }
        synchronized (this.z) {
            this.D = 0;
        }
        uml.a(this.b, "startSocketConnect: timeout 30000");
        if (this.E != 11) {
            this.A.postDelayed(this.C, 30000L);
        }
        try {
            BluetoothSocket bluetoothSocket = this.j;
            uml.a(this.b, "startSocketConnect: mSocket.connect()");
            if (bluetoothSocket == null) {
                uml.k(this.b, "startSocketConnect(), mSocket == null");
                this.A.removeCallbacks(this.C);
                a0(this.D);
                return;
            }
            uml.d(this.b, "startSocketConnect: SOCKET-CONNECT");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!this.w) {
                try {
                    bluetoothSocket.connect();
                } catch (IOException e) {
                    if (!TextUtils.equals("Connect refused", e.getMessage())) {
                        throw e;
                    }
                    uml.k(this.b, "startSocketConnect: SOCKET-CONNECT Connect refused try ipc bt");
                    this.w = true;
                }
            }
            if (this.w) {
                yha.b(this.x, this.g, l());
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            uml.d(this.b, "startSocketConnect: SOCKET-CONNECT COST TIME:" + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms");
            this.A.removeCallbacks(this.C);
            synchronized (this.z) {
                if (this.D == 0 && this.c != 4) {
                    this.D = 1;
                }
            }
            if (this.D != 1) {
                a0(this.D);
                return;
            }
            synchronized (this.a) {
                if (this.c == 4) {
                    uml.d(this.b, "startSocketConnect: state=STATE_DISCONNECTING stop connect");
                    a0(this.D);
                    return;
                }
                this.c = 2;
                synchronized (this) {
                    if (this.w || this.j != null) {
                        v(this);
                        s();
                    } else {
                        uml.d(this.b, "startSocketConnect: ");
                        a0(this.D);
                    }
                }
            }
        } catch (Exception e2) {
            uml.d(this.b, "startSocketConnect: SOCKET-CONNECT END FAIL:" + e2.getMessage());
            this.A.removeCallbacks(this.C);
            a0(this.D);
        }
    }

    @Override // com.oplus.aiunit.vision.j01
    public void m(Message message) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) message.obj;
        H(bluetoothDevice);
        this.v = false;
        if (Y(bluetoothDevice)) {
            e0();
        } else {
            uml.b(this.b, "handleSocketCreate: createSocket fail");
        }
    }

    @Override // com.oplus.aiunit.vision.j01
    public void q() {
        if (!this.w) {
            synchronized (this) {
                if (this.j == null) {
                    uml.b(this.b, "handleWriteDataInit: mBluetoothSocket is null");
                    return;
                }
                try {
                    this.n = this.j.getOutputStream();
                } catch (IOException e) {
                    uml.b(this.b, "handleWriteDataInit: outputStream exception: " + e.getMessage());
                    return;
                }
            }
        }
        N(this);
    }

    @Override // com.oplus.aiunit.vision.j01
    public void x() {
    }

    @Override // com.oplus.aiunit.vision.j01
    public void z() {
        super.z();
        HandlerThread handlerThread = this.B;
        if (handlerThread != null) {
            handlerThread.quit();
            this.B = null;
        }
    }
}
