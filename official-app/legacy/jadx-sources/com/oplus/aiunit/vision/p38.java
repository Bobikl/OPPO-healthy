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

/* JADX INFO: loaded from: classes5.dex */
public class p38 implements Handler.Callback {
    public final Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BluetoothDevice f15172j;
    public final t38 k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f15174n;
    public volatile long q;
    public BluetoothGatt u;
    public boolean v;
    public iu1.b w;
    public final BluetoothManager z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Queue<o38> f15173l = new ArrayDeque();
    public boolean o = false;
    public volatile int p = 3;
    public volatile boolean r = false;
    public o38 t = null;
    public boolean x = false;
    public long y = 0;
    public final Runnable A = new a();
    public final Runnable B = new b();
    public final Runnable C = new c();
    public jh1.d D = new d();
    public final BluetoothGattCallback E = new g();
    public final Handler m = new Handler(Looper.getMainLooper(), this);
    public final jh1 s = new jh1();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p38.this.S();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            wil.d("GattConnection", "delay 200ms to do gattConnect");
            p38.this.b0();
            p38.this.K();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p38.this.x = true;
            p38.this.m.removeCallbacks(p38.this.C);
            if (p38.this.k != null) {
                p38.this.k.onConnected();
            }
        }
    }

    public class d implements jh1.d {
        public d() {
        }

        @Override // com.oplus.aiunit.vision.jh1.d
        public void a(BluetoothDevice bluetoothDevice, int i) {
            wil.d("GattConnection", "onScanResult: result " + i);
            if (p38.this.p != 1) {
                wil.a("GattConnection", "onScanResult: connectStateNot connecting");
                return;
            }
            if (i != 0) {
                wil.a("GattConnection", "onScanResult: device not fount ");
                p38.this.D();
                return;
            }
            SystemClock.sleep(500L);
            if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                p38.this.G();
            } else {
                wil.a("GattConnection", "onScanResult: bluetooth not enable");
                p38.this.H(304);
            }
        }
    }

    public class e implements iu1.b {
        public e() {
        }

        @Override // com.oplus.aiunit.vision.iu1.b
        public void a(int i) {
            wil.d("GattConnection", "onBluetoothStateChanged: " + i);
            if (i == 10 || i == 13) {
                p38.this.j0();
                p38.this.k0();
                p38.this.D();
            }
        }
    }

    public class f implements xs2<Void> {
        public f() {
        }

        @Override // com.oplus.aiunit.vision.xs2
        public void a(Throwable th, int i) {
        }

        @Override // com.oplus.aiunit.vision.xs2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r3) {
            if (p38.this.o) {
                wil.d("GattConnection", "discoverServices: force disconnect");
                return;
            }
            p38.this.B(2);
            ufk.a(p38.this);
            p38.this.r = true;
            p38.this.x = false;
            ufk.a(p38.this);
            if (p38.this.c0()) {
                p38.this.m.postDelayed(p38.this.C, 3000L);
            } else {
                p38.this.C.run();
            }
        }
    }

    public class g extends BluetoothGattCallback {

        public class a implements Runnable {
            public final /* synthetic */ byte[] i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f15175j;

            public a(byte[] bArr, int i) {
                this.i = bArr;
                this.f15175j = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                p38.this.Q(this.i, this.f15175j);
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ int i;

            public b(int i) {
                this.i = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                p38.this.R(this.i);
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ BluetoothGattCharacteristic i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ byte[] f15177j;

            public c(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
                this.i = bluetoothGattCharacteristic;
                this.f15177j = bArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                p38.this.P(this.i.getService().getUuid(), this.i.getUuid(), this.f15177j);
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ int i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ BluetoothGatt f15178j;
            public final /* synthetic */ int k;

            public d(int i, BluetoothGatt bluetoothGatt, int i2) {
                this.i = i;
                this.f15178j = bluetoothGatt;
                this.k = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                int i = this.i;
                if (i > 23) {
                    i -= 3;
                }
                BluetoothGatt bluetoothGatt = this.f15178j;
                if (bluetoothGatt == null || bluetoothGatt.getDevice() == null) {
                    wil.k("GattConnection", "onMtuChanged: BluetoothGatt or Device == null");
                } else {
                    p9k.e().a(this.f15178j.getDevice().getAddress(), i);
                }
                if (p38.this.r && !p38.this.x) {
                    p38.this.m.removeCallbacks(p38.this.C);
                    p38.this.C.run();
                }
                p38.this.V(this.i, this.k);
            }
        }

        public class e implements Runnable {
            public final /* synthetic */ int i;

            public e(int i) {
                this.i = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                p38.this.U(this.i);
            }
        }

        public class f implements Runnable {
            public final /* synthetic */ int i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f15181j;

            public f(int i, int i2) {
                this.i = i;
                this.f15181j = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                p38.this.T(this.i, this.f15181j);
            }
        }

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.p38$g$g, reason: collision with other inner class name */
        public class RunnableC0913g implements Runnable {
            public final /* synthetic */ BluetoothGatt i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ int f15182j;

            public RunnableC0913g(BluetoothGatt bluetoothGatt, int i) {
                this.i = bluetoothGatt;
                this.f15182j = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<BluetoothGattService> it = this.i.getServices().iterator();
                while (it.hasNext()) {
                    wil.d("GattConnection", it.next().getUuid().toString());
                }
                p38.this.W(this.f15182j);
            }
        }

        public g() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            if (bluetoothGattCharacteristic != null) {
                wil.a("GattConnection", "onCharacteristicChanged:mProperties " + bluetoothGattCharacteristic.getProperties() + ",value = " + fe8.a(bluetoothGattCharacteristic.getValue()));
                p38.this.m.post(new c(bluetoothGattCharacteristic, p38.this.C(bluetoothGattCharacteristic)));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (bluetoothGattCharacteristic != null) {
                wil.a("GattConnection", "onCharacteristicRead:mProperties " + bluetoothGattCharacteristic.getProperties() + ",value = " + bluetoothGattCharacteristic.getValue() + ", status " + i);
            }
            p38.this.m.post(new a(p38.this.C(bluetoothGattCharacteristic), i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (bluetoothGattCharacteristic != null) {
                wil.a("GattConnection", "onCharacteristicWrite:mProperties " + bluetoothGattCharacteristic.getProperties() + ",value = " + bluetoothGattCharacteristic.getValue() + ", status " + i);
            }
            p38.this.m.post(new b(i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = 0;
            if (p38.this.q > 0) {
                j2 = jCurrentTimeMillis - p38.this.q;
                p38.this.q = -1L;
            }
            wil.d("GattConnection", "onConnectionStateChange:status " + i + ", newState = " + i2 + ",connect time " + j2);
            p38.this.j0();
            p38.this.m.post(new f(i2, i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            if (bluetoothGattDescriptor != null) {
                wil.d("GattConnection", "onDescriptorWrite:value " + bluetoothGattDescriptor.getValue() + ", status = " + i);
            }
            p38.this.m.post(new e(i));
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            wil.d("GattConnection", "onMtuChanged new mtu: " + i + ", status " + i2);
            p38.this.m.post(new d(i, bluetoothGatt, i2));
            super.onMtuChanged(bluetoothGatt, i, i2);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            wil.d("GattConnection", "onServicesDiscovered:status = " + i);
            p38.this.m.post(new RunnableC0913g(bluetoothGatt, i));
        }
    }

    public p38(Context context, BluetoothDevice bluetoothDevice, t38 t38Var, long j2) {
        this.i = context;
        this.f15172j = bluetoothDevice;
        this.k = t38Var;
        this.f15174n = j2;
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
        t38 t38Var;
        wil.d("GattConnection", "gatt Closing..., reason = " + i);
        this.m.removeCallbacks(this.C);
        this.s.g();
        if (this.u != null) {
            j0();
            k0();
            synchronized (this.f15173l) {
                while (!this.f15173l.isEmpty()) {
                    o38 o38VarPoll = this.f15173l.poll();
                    if (o38VarPoll != null) {
                        o38VarPoll.c(new RuntimeException("Got disconnected"));
                    }
                }
            }
            o38 o38Var = this.t;
            if (o38Var != null) {
                o38Var.c(new RuntimeException("Got disconnected"));
                this.t = null;
            }
            synchronized (this) {
                if (this.u != null) {
                    this.y = System.currentTimeMillis();
                    try {
                        this.u.disconnect();
                        this.u.close();
                    } catch (Throwable th) {
                        wil.d("GattConnection", "BluetoothGatt.close() error: " + th);
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
        wil.d("GattConnection", "clear gatt now...");
        int i2 = this.p;
        B(3);
        if (i2 != 3 && (t38Var = this.k) != null) {
            t38Var.c(i);
        }
    }

    public boolean F() {
        if (this.p == 1 || this.p == 2) {
            return false;
        }
        B(1);
        t38 t38Var = this.k;
        if (t38Var != null) {
            t38Var.e();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.y;
        long j2 = 2000;
        if (jCurrentTimeMillis < 2000 && jCurrentTimeMillis > 0) {
            j2 = 2000 - jCurrentTimeMillis;
        } else if (jCurrentTimeMillis > 2000) {
            j2 = 0;
        }
        wil.d("GattConnection", "connect: delay " + j2);
        this.m.postDelayed(this.B, j2);
        return true;
    }

    public final void G() {
        h0(this.f15174n);
        this.q = System.currentTimeMillis();
        this.u = this.f15172j.connectGatt(this.i, false, this.E, 2);
    }

    public void H(int i) {
        I(i, false);
    }

    public void I(int i, boolean z) {
        wil.d("GattConnection", "begin disconnect:mExecutingCommand = " + this.t + ", reason = " + i + ",directDisconnect " + z);
        this.o = true;
        b0();
        if (this.t == null || z) {
            L(i);
        } else {
            wil.k("GattConnection", "Waiting for current command to finish");
        }
    }

    public final void J() {
        e0(new s38(new f()));
    }

    public final void K() {
        if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            g0();
        } else {
            wil.b("GattConnection", "Bluetooth is not enabled, just wait for it to be enabled!");
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
            wil.a("GattConnection", "Characteristic not found: " + uuid2);
        } else {
            wil.d("GattConnection", "Service not found: " + uuid);
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
        t38 t38Var;
        if (this.u == null || (t38Var = this.k) == null) {
            return;
        }
        t38Var.b(uuid, uuid2, bArr);
    }

    public final void Q(byte[] bArr, int i) {
        if (this.t == null) {
            return;
        }
        wil.d("GattConnection", "Characteristic read (status = " + i + "), " + bArr.length + ", " + fe8.a(bArr));
        if (i == 0) {
            this.t.d(bArr);
            X();
        }
    }

    public final void R(int i) {
        if (this.t == null) {
            return;
        }
        wil.d("GattConnection", "Characteristic written (status = " + i + ")");
        if (i == 0) {
            this.t.f();
            X();
        }
    }

    public final void S() {
        wil.d("GattConnection", "Connection too long notify error");
        E(209);
    }

    public final void T(int i, int i2) {
        if (i == 2) {
            wil.d("GattConnection", "STATE_CONNECTED, and gatt status = " + i2);
            if (this.v) {
                wil.a("GattConnection", "onConnectionStateChange: not need discoverService");
                return;
            }
            this.r = false;
            this.v = true;
            this.o = false;
            J();
        } else if (i == 0) {
            wil.d("GattConnection", "STATE_DISCONNECTED, and gatt status = " + i2);
            if (i2 != 0) {
                wil.d("GattConnection", "Disconnected with an error code. (Don't) Remove bond here.");
            }
            k0();
            D();
        } else {
            wil.b("GattConnection", "Unknown connection state!");
        }
        t38 t38Var = this.k;
        if (t38Var != null) {
            t38Var.a(i, i2);
        }
    }

    public final void U(int i) {
        if (this.t == null) {
            return;
        }
        wil.d("GattConnection", "Descriptor written (status = " + i + ")");
        if (i == 0) {
            this.t.b();
            X();
        }
    }

    public final void V(int i, int i2) {
        t38 t38Var = this.k;
        if (t38Var != null) {
            t38Var.d(i, i2);
        }
    }

    public final void W(int i) {
        wil.d("GattConnection", "mExecutingCommand = " + this.t);
        o38 o38Var = this.t;
        if (o38Var != null && i == 0) {
            o38Var.e();
            X();
        }
    }

    public final void X() {
        o38 o38VarPoll;
        wil.d("GattConnection", "Command succeeded, mIsForceDisconnect = " + this.o);
        k0();
        if (this.o) {
            this.o = false;
            this.t = null;
            L(201);
            return;
        }
        synchronized (this.f15173l) {
            o38VarPoll = this.f15173l.poll();
            this.t = o38VarPoll;
        }
        if (o38VarPoll == null) {
            wil.d("GattConnection", "No command in queue");
            return;
        }
        wil.d("GattConnection", "Executing queued command: " + this.t.getClass().getSimpleName());
        i0(30000L);
        this.t.a(this.u);
    }

    public final void Y() {
        wil.d("GattConnection", "Timed out!");
        o38 o38Var = this.t;
        if (o38Var != null) {
            o38Var.c(new RuntimeException("Timeout"));
            this.t = null;
            wil.d("GattConnection", "execute command error, disconnect");
        }
        E(208);
    }

    public final void Z() {
        if (this.w == null) {
            this.w = new e();
            iu1.h().d(this.w);
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
            wil.a("GattConnection", "Succeed to requestMtu");
            return true;
        }
        wil.b("GattConnection", "Failed to requestMtu");
        return false;
    }

    public final void d0() {
        k0();
        synchronized (this.f15173l) {
            this.f15173l.clear();
        }
        this.t = null;
    }

    public final synchronized void e0(o38 o38Var) {
        wil.d("GattConnection", "runCommand:mIsForceDisconnect = " + this.o);
        if (this.u == null) {
            o38Var.c(new RuntimeException("Disconnected Gatt == null"));
            return;
        }
        if (this.o) {
            wil.d("GattConnection", "Rejecting new command since we're disconnecting");
            o38Var.c(new RuntimeException("Disconnecting"));
        } else if (this.t == null) {
            wil.d("GattConnection", "Starting command directly: " + o38Var.getClass().getSimpleName());
            this.t = o38Var;
            i0(30000L);
            o38Var.a(this.u);
        } else {
            wil.d("GattConnection", "Queuing command");
            synchronized (this.f15173l) {
                this.f15173l.add(o38Var);
            }
        }
    }

    public void f0(UUID uuid, UUID uuid2, boolean z, xs2<Void> xs2Var) {
        wil.a("GattConnection", "Set notification: " + uuid + " / " + uuid2);
        BluetoothGattCharacteristic bluetoothGattCharacteristicM = M(uuid, uuid2);
        if (bluetoothGattCharacteristicM != null) {
            e0(new u38(bluetoothGattCharacteristicM, true, z, xs2Var));
            return;
        }
        wil.b("GattConnection", "Setting notification failed!");
        if (xs2Var != null) {
            xs2Var.a(new RuntimeException("Didn't find characteristic!"), 203);
        }
    }

    public final synchronized void g0() {
        if (this.f15172j == null) {
            wil.b("GattConnection", "startActiveConnect: Device is null");
            return;
        }
        wil.d("GattConnection", "startActiveConnect: Device:" + gdb.a(this.f15172j.getAddress()) + " connectState:" + this.p);
        if (this.p != 1) {
            wil.b("GattConnection", "startActiveConnect: connect state not connecting");
            return;
        }
        this.v = false;
        d0();
        G();
    }

    public final void h0(long j2) {
        wil.d("GattConnection", "startConnectGattTimeout, timeoutTime: " + j2 + ", mHandler = " + this.m);
        this.m.removeCallbacks(this.A);
        this.m.postDelayed(this.A, j2);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 100) {
            return false;
        }
        Y();
        return false;
    }

    public final void i0(long j2) {
        wil.d("GattConnection", "Starting timeout");
        this.m.sendEmptyMessageDelayed(100, j2);
    }

    public void j0() {
        this.m.removeCallbacks(this.A);
    }

    public final void k0() {
        wil.d("GattConnection", "Canceling timeout");
        this.m.removeMessages(100);
    }

    public final void l0() {
        if (this.w != null) {
            iu1.h().l(this.w);
            this.w = null;
        }
    }

    public void m0(UUID uuid, UUID uuid2, byte[] bArr, xs2<Void> xs2Var) {
        wil.a("GattConnection", "write: " + uuid + " / " + uuid2);
        BluetoothGattCharacteristic bluetoothGattCharacteristicM = M(uuid, uuid2);
        if (bluetoothGattCharacteristicM != null) {
            e0(new v38(bluetoothGattCharacteristicM, bArr, xs2Var));
            return;
        }
        wil.d("GattConnection", "Write failed!");
        if (xs2Var != null) {
            xs2Var.a(new RuntimeException("Write failed. Didn't find characteristic!"), 203);
        }
    }
}
