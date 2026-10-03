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

/* JADX INFO: loaded from: classes5.dex */
public class nq0 extends vz0 {
    public Handler A;
    public HandlerThread B;
    public a C;
    public volatile int D;
    public volatile int E;
    public final Object z;

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            synchronized (nq0.this.z) {
                if (nq0.this.D != 0) {
                    wil.k(nq0.this.b + "_SocketTimeOut", "mSocketConState is not initialize state, ignore");
                    return;
                }
                nq0.this.D = 2;
                wil.k(nq0.this.b + "_SocketTimeOut", "socket connect timeout, close socket!");
                nq0.this.d();
            }
        }

        public a() {
        }
    }

    public nq0(Context context) {
        super(context);
        this.z = new Object();
        this.E = 10;
        b0();
    }

    @Override // com.oplus.aiunit.vision.vz0
    public void H(BluetoothDevice bluetoothDevice) {
        super.H(bluetoothDevice);
        if (bluetoothDevice == null) {
            return;
        }
        this.E = bluetoothDevice.getBondState();
    }

    public int W() {
        synchronized (this.a) {
            if (this.f18046c != 4 && this.f18046c != 3) {
                int i = this.f18046c;
                this.f18046c = 4;
                if (i != 2 || i() != EnumCloseType.ACTIVE) {
                    O();
                    return this.f18046c;
                }
                wil.a(this.b, "closeConnect: CommandConnection will send the active close flag to remote device");
                d0();
                return this.f18046c;
            }
            wil.k(this.b, "closeConnect: mState = " + this.f18046c + ", ignore");
            return this.f18046c;
        }
    }

    public void X(BluetoothDevice bluetoothDevice) {
        wil.d(this.b, "connect: start to create the connect: " + this.f18046c);
        synchronized (this.a) {
            if (this.f18046c == 3) {
                this.f18046c = 1;
                this.h.clear();
                Message.obtain(this.p, 1, bluetoothDevice).sendToTarget();
            } else {
                wil.k(this.b, "startConnect, mState is : " + this.f18046c + ", return it");
            }
        }
    }

    public final boolean Y(BluetoothDevice bluetoothDevice) {
        if (this.f18048j != null) {
            wil.a(this.b, "createSocket: mSocket != null");
            return true;
        }
        try {
            wil.d(this.b, "createSocket: BEGIN");
            this.f18048j = bluetoothDevice.createRfcommSocketToServiceRecord(l().getUuid());
            wil.d(this.b, "createSocket: END SUCCESS");
            return true;
        } catch (IOException e2) {
            wil.d(this.b, "createSocket: END FAIL:" + e2.getMessage());
            synchronized (this.a) {
                this.f18046c = 3;
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
            wil.d(this.b, "handleSocketConnectException: socket connect timeout");
            synchronized (this.a) {
                this.f18046c = 3;
            }
            B(312, this);
            return;
        }
        wil.a(this.b, "handleSocketConnectException: mSocketConState " + i);
        d();
        synchronized (this.a) {
            this.f18046c = 3;
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
                    wil.d(this.b, "onBondStateChanged: Bond cancel mSocketConState is not initialize state, ignore");
                    this.E = i;
                    return;
                } else {
                    this.D = 3;
                    wil.d(this.b, "onBondStateChanged: Bond cancel close socket!");
                    d();
                }
            }
        }
        this.E = i;
    }

    public final void d0() {
        wil.k(this.b, "sendActiveCloseFlag: ");
        g(pt1.INTERNAL_COMMAND_TYPE, pt1.OVER_FLAG, null);
    }

    public final void e0() {
        int i;
        synchronized (this.a) {
            i = this.f18046c;
        }
        if (i == 2) {
            wil.a(this.b, "prepareSocketConnect: state connected, ignore");
            return;
        }
        if (i == 4) {
            a0(this.D);
            return;
        }
        synchronized (this.z) {
            this.D = 0;
        }
        wil.a(this.b, "startSocketConnect: timeout 30000");
        if (this.E != 11) {
            this.A.postDelayed(this.C, 30000L);
        }
        try {
            BluetoothSocket bluetoothSocket = this.f18048j;
            wil.a(this.b, "startSocketConnect: mSocket.connect()");
            if (bluetoothSocket == null) {
                wil.k(this.b, "startSocketConnect(), mSocket == null");
                this.A.removeCallbacks(this.C);
                a0(this.D);
                return;
            }
            wil.d(this.b, "startSocketConnect: SOCKET-CONNECT");
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!this.w) {
                try {
                    bluetoothSocket.connect();
                } catch (IOException e2) {
                    if (!TextUtils.equals("Connect refused", e2.getMessage())) {
                        throw e2;
                    }
                    wil.k(this.b, "startSocketConnect: SOCKET-CONNECT Connect refused try ipc bt");
                    this.w = true;
                }
            }
            if (this.w) {
                qga.b(this.x, this.g, l());
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            wil.d(this.b, "startSocketConnect: SOCKET-CONNECT COST TIME:" + (jCurrentTimeMillis2 - jCurrentTimeMillis) + "ms");
            this.A.removeCallbacks(this.C);
            synchronized (this.z) {
                if (this.D == 0 && this.f18046c != 4) {
                    this.D = 1;
                }
            }
            if (this.D != 1) {
                a0(this.D);
                return;
            }
            synchronized (this.a) {
                if (this.f18046c == 4) {
                    wil.d(this.b, "startSocketConnect: state=STATE_DISCONNECTING stop connect");
                    a0(this.D);
                    return;
                }
                this.f18046c = 2;
                synchronized (this) {
                    if (this.w || this.f18048j != null) {
                        v(this);
                        s();
                    } else {
                        wil.d(this.b, "startSocketConnect: ");
                        a0(this.D);
                    }
                }
            }
        } catch (Exception e3) {
            wil.d(this.b, "startSocketConnect: SOCKET-CONNECT END FAIL:" + e3.getMessage());
            this.A.removeCallbacks(this.C);
            a0(this.D);
        }
    }

    @Override // com.oplus.aiunit.vision.vz0
    public void m(Message message) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) message.obj;
        H(bluetoothDevice);
        this.v = false;
        if (Y(bluetoothDevice)) {
            e0();
        } else {
            wil.b(this.b, "handleSocketCreate: createSocket fail");
        }
    }

    @Override // com.oplus.aiunit.vision.vz0
    public void q() {
        if (!this.w) {
            synchronized (this) {
                if (this.f18048j == null) {
                    wil.b(this.b, "handleWriteDataInit: mBluetoothSocket is null");
                    return;
                }
                try {
                    this.f18050n = this.f18048j.getOutputStream();
                } catch (IOException e2) {
                    wil.b(this.b, "handleWriteDataInit: outputStream exception: " + e2.getMessage());
                    return;
                }
            }
        }
        N(this);
    }

    @Override // com.oplus.aiunit.vision.vz0
    public void x() {
    }

    @Override // com.oplus.aiunit.vision.vz0
    public void z() {
        super.z();
        HandlerThread handlerThread = this.B;
        if (handlerThread != null) {
            handlerThread.quit();
            this.B = null;
        }
    }
}
