package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class s48 implements Handler.Callback {
    public final Context i;
    public final BluetoothDevice j;
    public final w48 k;
    public final long n;
    public volatile long q;
    public BluetoothGatt u;
    public boolean v;
    public wu1.b w;
    public final BluetoothManager z;
    public final Queue<r48> l = new ArrayDeque();
    public boolean o = false;
    public volatile int p = 3;
    public volatile boolean r = false;
    public r48 t = null;
    public boolean x = false;
    public long y = 0;
    public final Runnable A = new a();
    public final Runnable B = new b();
    public final Runnable C = new c();
    public zh1.d D = new d();
    public final BluetoothGattCallback E = new g();
    public final Handler m = new Handler(Looper.getMainLooper(), this);
    public final zh1 s = new zh1();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s48.this.S();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            uml.d("GattConnection", "delay 200ms to do gattConnect");
            s48.this.b0();
            s48.this.K();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s48.this.x = true;
            s48.this.m.removeCallbacks(s48.this.C);
            if (s48.this.k != null) {
                s48.this.k.onConnected();
            }
        }
    }

    public class d implements zh1.d {
        public d() {
        }

        @Override // com.oplus.aiunit.vision.zh1.d
        public void a(BluetoothDevice bluetoothDevice, int i) {
            uml.d("GattConnection", "onScanResult: result " + i);
            if (s48.this.p != 1) {
                uml.a("GattConnection", "onScanResult: connectStateNot connecting");
                return;
            }
            if (i != 0) {
                uml.a("GattConnection", "onScanResult: device not fount ");
                s48.this.D();
                return;
            }
            SystemClock.sleep(500L);
            if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                s48.this.G();
            } else {
                uml.a("GattConnection", "onScanResult: bluetooth not enable");
                s48.this.H(304);
            }
        }
    }

    public class e implements wu1.b {
        public e() {
        }

        @Override // com.oplus.aiunit.vision.wu1.b
        public void a(int i) {
            uml.d("GattConnection", "onBluetoothStateChanged: " + i);
            if (i == 10 || i == 13) {
                s48.this.j0();
                s48.this.k0();
                s48.this.D();
            }
        }
    }

    public class f implements lt2<Void> {
        public f() {
        }

        @Override // com.oplus.aiunit.vision.lt2
        public void a(Throwable th, int i) {
        }

        @Override // com.oplus.aiunit.vision.lt2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r3) {
            if (s48.this.o) {
                uml.d("GattConnection", "discoverServices: force disconnect");
                return;
            }
            s48.this.B(2);
            wjk.a(s48.this);
            s48.this.r = true;
            s48.this.x = false;
            wjk.a(s48.this);
            if (s48.this.c0()) {
                s48.this.m.postDelayed(s48.this.C, 3000L);
            } else {
                s48.this.C.run();
            }
        }
    }

    public class g extends BluetoothGattCallback {

        public class a implements Runnable {
            public final /* synthetic */ byte[] i;
            public final /* synthetic */ int j;

            public a(byte[] bArr, int i) {
                this.i = bArr;
                this.j = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                s48.this.Q(this.i, this.j);
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ int i;

            public b(int i) {
                this.i = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                s48.this.R(this.i);
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ BluetoothGattCharacteristic i;
            public final /* synthetic */ byte[] j;

            public c(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
                this.i = bluetoothGattCharacteristic;
                this.j = bArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                s48.this.P(this.i.getService().getUuid(), this.i.getUuid(), this.j);
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ int i;
            public final /* synthetic */ BluetoothGatt j;
            public final /* synthetic */ int k;

            public d(int i, BluetoothGatt bluetoothGatt, int i2) {
                this.i = i;
                this.j = bluetoothGatt;
                this.k = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i = this.i;
                if (i > 23) {
                    i -= 3;
                }
                BluetoothGatt bluetoothGatt = this.j;
                if (bluetoothGatt == null || bluetoothGatt.getDevice() == null) {
                    uml.k("GattConnection", "onMtuChanged: BluetoothGatt or Device == null");
                } else {
                    rdk.e().a(this.j.getDevice().getAddress(), i);
                }
                if (s48.this.r && !s48.this.x) {
                    s48.this.m.removeCallbacks(s48.this.C);
                    s48.this.C.run();
                }
                s48.this.V(this.i, this.k);
            }
        }

        public class e implements Runnable {
            public final /* synthetic */ int i;

            public e(int i) {
                this.i = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                s48.this.U(this.i);
            }
        }

        public class f implements Runnable {
            public final /* synthetic */ int i;
            public final /* synthetic */ int j;

            public f(int i, int i2) {
                this.i = i;
                this.j = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                s48.this.T(this.i, this.j);
            }
        }

        public class g implements Runnable {
            public final /* synthetic */ BluetoothGatt i;
            public final /* synthetic */ int j;

            public g(BluetoothGatt bluetoothGatt, int i) {
                this.i = bluetoothGatt;
                this.j = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<BluetoothGattService> it = this.i.getServices().iterator();
                while (it.hasNext()) {
                    uml.d("GattConnection", it.next().getUuid().toString());
                }
                s48.this.W(this.j);
            }
        }

        public g() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            if (bluetoothGattCharacteristic != null) {
                uml.a("GattConnection", "onCharacteristicChanged:mProperties " + bluetoothGattCharacteristic.getProperties() + ",value = " + if8.a(bluetoothGattCharacteristic.getValue()));
                s48.this.m.post(new c(bluetoothGattCharacteristic, s48.this.C(bluetoothGattCharacteristic)));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (bluetoothGattCharacteristic != null) {
                uml.a("GattConnection", "onCharacteristicRead:mProperties " + bluetoothGattCharacteristic.getProperties() + ",value = " + bluetoothGattCharacteristic.getValue() + ", status " + i);
            }
            s48.this.m.post(new a(s48.this.C(bluetoothGattCharacteristic), i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (bluetoothGattCharacteristic != null) {
                uml.a("GattConnection", "onCharacteristicWrite:mProperties " + bluetoothGattCharacteristic.getProperties() + ",value = " + bluetoothGattCharacteristic.getValue() + ", status " + i);
            }
            s48.this.m.post(new b(i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = 0;
            if (s48.this.q > 0) {
                j = jCurrentTimeMillis - s48.this.q;
                s48.this.q = -1L;
            }
            uml.d("GattConnection", "onConnectionStateChange:status " + i + ", newState = " + i2 + ",connect time " + j);
            s48.this.j0();
            s48.this.m.post(new f(i2, i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (bluetoothGattDescriptor != null) {
                uml.d("GattConnection", "onDescriptorWrite:value " + bluetoothGattDescriptor.getValue() + ", status = " + i);
            }
            s48.this.m.post(new e(i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            uml.d("GattConnection", "onMtuChanged new mtu: " + i + ", status " + i2);
            s48.this.m.post(new d(i, bluetoothGatt, i2));
            super.onMtuChanged(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            uml.d("GattConnection", "onServicesDiscovered:status = " + i);
            s48.this.m.post(new g(bluetoothGatt, i));
        }
    }

    public s48(Context context, BluetoothDevice bluetoothDevice, w48 w48Var, long j) {
        this.i = context;
        this.j = bluetoothDevice;
        this.k = w48Var;
        this.n = j;
        this.z = (BluetoothManager) context.getSystemService("bluetooth");
        Z();
    }

    public final synchronized void B(int i) {
        this.p = i;
    }

    public final byte[] C(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return (bluetoothGattCharacteristic == null || bluetoothGattCharacteristic.getValue() == null) ? new byte[0] : (byte[]) bluetoothGattCharacteristic.getValue().clone();
    }

    public final void D() {
        E(210);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[Catch: all -> 0x00b5, TRY_LEAVE, TryCatch #1 {, blocks: (B:21:0x0064, B:23:0x0068, B:28:0x009a, B:27:0x007a, B:29:0x009c, B:24:0x006e), top: B:45:0x0064, outer: #2, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final synchronized void E(int i) {
        w48 w48Var;
        uml.d("GattConnection", "gatt Closing..., reason = " + i);
        this.m.removeCallbacks(this.C);
        this.s.g();
        if (this.u != null) {
            j0();
            k0();
            synchronized (this.l) {
                while (!this.l.isEmpty()) {
                    r48 r48VarPoll = this.l.poll();
                    if (r48VarPoll != null) {
                        r48VarPoll.c(new RuntimeException("Got disconnected"));
                    }
                }
            }
            r48 r48Var = this.t;
            if (r48Var != null) {
                r48Var.c(new RuntimeException("Got disconnected"));
                this.t = null;
            }
            synchronized (this) {
                if (this.u != null) {
                    this.y = System.currentTimeMillis();
                    try {
                        this.u.disconnect();
                        this.u.close();
                    } catch (Throwable th) {
                        uml.d("GattConnection", "BluetoothGatt.close() error: " + th);
                        this.u.disconnect();
                        this.u.close();
                    }
                    this.u = null;
                }
            }
        }
        synchronized (this) {
            if (this.u != null) {
                this.y = System.currentTimeMillis();
                this.u.disconnect();
                this.u.close();
                this.u = null;
            }
        }
        throw th;
        uml.d("GattConnection", "clear gatt now...");
        int i2 = this.p;
        B(3);
        if (i2 != 3 && (w48Var = this.k) != null) {
            w48Var.c(i);
        }
    }

    public boolean F() {
        if (this.p == 1 || this.p == 2) {
            return false;
        }
        B(1);
        w48 w48Var = this.k;
        if (w48Var != null) {
            w48Var.e();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.y;
        long j = 2000;
        if (jCurrentTimeMillis < 2000 && jCurrentTimeMillis > 0) {
            j = 2000 - jCurrentTimeMillis;
        } else if (jCurrentTimeMillis > 2000) {
            j = 0;
        }
        uml.d("GattConnection", "connect: delay " + j);
        this.m.postDelayed(this.B, j);
        return true;
    }

    public final void G() {
        h0(this.n);
        this.q = System.currentTimeMillis();
        this.u = this.j.connectGatt(this.i, false, this.E, 2);
    }

    public void H(int i) {
        I(i, false);
    }

    public void I(int i, boolean z) {
        uml.d("GattConnection", "begin disconnect:mExecutingCommand = " + this.t + ", reason = " + i + ",directDisconnect " + z);
        this.o = true;
        b0();
        if (this.t == null || z) {
            L(i);
        } else {
            uml.k("GattConnection", "Waiting for current command to finish");
        }
    }

    public final void J() {
        e0(new v48(new f()));
    }

    public final void K() {
        if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            g0();
        } else {
            uml.b("GattConnection", "Bluetooth is not enabled, just wait for it to be enabled!");
            H(304);
        }
    }

    public final void L(int i) {
        E(i);
    }

    public final BluetoothGattCharacteristic M(UUID uuid, UUID uuid2) {
        BluetoothGatt bluetoothGatt = this.u;
        BluetoothGattService service = bluetoothGatt != null ? bluetoothGatt.getService(uuid) : null;
        if (service != null) {
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
            if (characteristic != null) {
                return characteristic;
            }
            uml.a("GattConnection", "Characteristic not found: " + uuid2);
        } else {
            uml.d("GattConnection", "Service not found: " + uuid);
        }
        return null;
    }

    public boolean N(UUID uuid) {
        BluetoothGatt bluetoothGatt = this.u;
        return (bluetoothGatt == null || bluetoothGatt.getService(uuid) == null) ? false : true;
    }

    public void O(int i) {
        if (i == 11 && this.m.hasMessages(100)) {
            k0();
            i0(30000L);
        }
    }

    public final void P(UUID uuid, UUID uuid2, byte[] bArr) {
        w48 w48Var;
        if (this.u == null || (w48Var = this.k) == null) {
            return;
        }
        w48Var.b(uuid, uuid2, bArr);
    }

    public final void Q(byte[] bArr, int i) {
        if (this.t == null) {
            return;
        }
        uml.d("GattConnection", "Characteristic read (status = " + i + "), " + bArr.length + ", " + if8.a(bArr));
        if (i == 0) {
            this.t.d(bArr);
            X();
        }
    }

    public final void R(int i) {
        if (this.t == null) {
            return;
        }
        uml.d("GattConnection", "Characteristic written (status = " + i + ")");
        if (i == 0) {
            this.t.f();
            X();
        }
    }

    public final void S() {
        uml.d("GattConnection", "Connection too long notify error");
        E(209);
    }

    public final void T(int i, int i2) {
        if (i == 2) {
            uml.d("GattConnection", "STATE_CONNECTED, and gatt status = " + i2);
            if (this.v) {
                uml.a("GattConnection", "onConnectionStateChange: not need discoverService");
                return;
            }
            this.r = false;
            this.v = true;
            this.o = false;
            J();
        } else if (i == 0) {
            uml.d("GattConnection", "STATE_DISCONNECTED, and gatt status = " + i2);
            if (i2 != 0) {
                uml.d("GattConnection", "Disconnected with an error code. (Don't) Remove bond here.");
            }
            k0();
            D();
        } else {
            uml.b("GattConnection", "Unknown connection state!");
        }
        w48 w48Var = this.k;
        if (w48Var != null) {
            w48Var.a(i, i2);
        }
    }

    public final void U(int i) {
        if (this.t == null) {
            return;
        }
        uml.d("GattConnection", "Descriptor written (status = " + i + ")");
        if (i == 0) {
            this.t.b();
            X();
        }
    }

    public final void V(int i, int i2) {
        w48 w48Var = this.k;
        if (w48Var != null) {
            w48Var.d(i, i2);
        }
    }

    public final void W(int i) {
        uml.d("GattConnection", "mExecutingCommand = " + this.t);
        r48 r48Var = this.t;
        if (r48Var != null && i == 0) {
            r48Var.e();
            X();
        }
    }

    public final void X() {
        r48 r48VarPoll;
        uml.d("GattConnection", "Command succeeded, mIsForceDisconnect = " + this.o);
        k0();
        if (this.o) {
            this.o = false;
            this.t = null;
            L(201);
            return;
        }
        synchronized (this.l) {
            r48VarPoll = this.l.poll();
            this.t = r48VarPoll;
        }
        if (r48VarPoll == null) {
            uml.d("GattConnection", "No command in queue");
            return;
        }
        uml.d("GattConnection", "Executing queued command: " + this.t.getClass().getSimpleName());
        i0(30000L);
        this.t.a(this.u);
    }

    public final void Y() {
        uml.d("GattConnection", "Timed out!");
        r48 r48Var = this.t;
        if (r48Var != null) {
            r48Var.c(new RuntimeException("Timeout"));
            this.t = null;
            uml.d("GattConnection", "execute command error, disconnect");
        }
        E(208);
    }

    public final void Z() {
        if (this.w == null) {
            this.w = new e();
            wu1.h().d(this.w);
        }
    }

    public void a0() {
        l0();
    }

    public final void b0() {
        this.m.removeCallbacks(this.B);
    }

    public final boolean c0() {
        if (this.u.requestMtu(512)) {
            uml.a("GattConnection", "Succeed to requestMtu");
            return true;
        }
        uml.b("GattConnection", "Failed to requestMtu");
        return false;
    }

    public final void d0() {
        k0();
        synchronized (this.l) {
            this.l.clear();
        }
        this.t = null;
    }

    public final synchronized void e0(r48 r48Var) {
        uml.d("GattConnection", "runCommand:mIsForceDisconnect = " + this.o);
        if (this.u == null) {
            r48Var.c(new RuntimeException("Disconnected Gatt == null"));
            return;
        }
        if (this.o) {
            uml.d("GattConnection", "Rejecting new command since we're disconnecting");
            r48Var.c(new RuntimeException("Disconnecting"));
        } else if (this.t == null) {
            uml.d("GattConnection", "Starting command directly: " + r48Var.getClass().getSimpleName());
            this.t = r48Var;
            i0(30000L);
            r48Var.a(this.u);
        } else {
            uml.d("GattConnection", "Queuing command");
            synchronized (this.l) {
                this.l.add(r48Var);
            }
        }
    }

    public void f0(UUID uuid, UUID uuid2, boolean z, lt2<Void> lt2Var) {
        uml.a("GattConnection", "Set notification: " + uuid + " / " + uuid2);
        BluetoothGattCharacteristic bluetoothGattCharacteristicM = M(uuid, uuid2);
        if (bluetoothGattCharacteristicM != null) {
            e0(new x48(bluetoothGattCharacteristicM, true, z, lt2Var));
            return;
        }
        uml.b("GattConnection", "Setting notification failed!");
        if (lt2Var != null) {
            lt2Var.a(new RuntimeException("Didn't find characteristic!"), 203);
        }
    }

    public final synchronized void g0() {
        if (this.j == null) {
            uml.b("GattConnection", "startActiveConnect: Device is null");
            return;
        }
        uml.d("GattConnection", "startActiveConnect: Device:" + veb.a(this.j.getAddress()) + " connectState:" + this.p);
        if (this.p != 1) {
            uml.b("GattConnection", "startActiveConnect: connect state not connecting");
            return;
        }
        this.v = false;
        d0();
        G();
    }

    public final void h0(long j) {
        uml.d("GattConnection", "startConnectGattTimeout, timeoutTime: " + j + ", mHandler = " + this.m);
        this.m.removeCallbacks(this.A);
        this.m.postDelayed(this.A, j);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 100) {
            return false;
        }
        Y();
        return false;
    }

    public final void i0(long j) {
        uml.d("GattConnection", "Starting timeout");
        this.m.sendEmptyMessageDelayed(100, j);
    }

    public void j0() {
        this.m.removeCallbacks(this.A);
    }

    public final void k0() {
        uml.d("GattConnection", "Canceling timeout");
        this.m.removeMessages(100);
    }

    public final void l0() {
        if (this.w != null) {
            wu1.h().l(this.w);
            this.w = null;
        }
    }

    public void m0(UUID uuid, UUID uuid2, byte[] bArr, lt2<Void> lt2Var) {
        uml.a("GattConnection", "write: " + uuid + " / " + uuid2);
        BluetoothGattCharacteristic bluetoothGattCharacteristicM = M(uuid, uuid2);
        if (bluetoothGattCharacteristicM != null) {
            e0(new y48(bluetoothGattCharacteristicM, bArr, lt2Var));
            return;
        }
        uml.d("GattConnection", "Write failed!");
        if (lt2Var != null) {
            lt2Var.a(new RuntimeException("Write failed. Didn't find characteristic!"), 203);
        }
    }
}
