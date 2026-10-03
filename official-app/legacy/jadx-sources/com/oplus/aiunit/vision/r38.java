package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.heytap.health.devicemanager.util.BluetoothUtil;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class r38 extends x95 {
    public final iu1.b A;
    public final long s;
    public p38 t;
    public volatile boolean u;
    public final Object v;
    public volatile int w;
    public volatile boolean x;
    public final t38 y;
    public iu1.c z;

    public class a implements t38 {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.r38$a$a, reason: collision with other inner class name */
        public class C0920a implements xs2<Void> {

            /* JADX INFO: renamed from: com.oplus.aiunit.vision.r38$a$a$a, reason: collision with other inner class name */
            public class C0921a implements xs2<Void> {
                public C0921a() {
                }

                @Override // com.oplus.aiunit.vision.xs2
                public void a(Throwable th, int i) {
                    wil.a("GattDevice", "onError: setNotification");
                    r38.this.i(204);
                }

                @Override // com.oplus.aiunit.vision.xs2
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Void r2) {
                    wil.a("GattDevice", "onSuccess: ble file setNotification");
                    r38 r38Var = r38.this;
                    r38Var.s(r38Var.p);
                }
            }

            public C0920a() {
            }

            @Override // com.oplus.aiunit.vision.xs2
            public void a(Throwable th, int i) {
                wil.a("GattDevice", "onError: setNotification");
                r38.this.i(204);
            }

            @Override // com.oplus.aiunit.vision.xs2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r4) {
                if (r38.this.Y(ufk.c())) {
                    r38.this.c0(ufk.c(), ufk.b(), true, new C0921a());
                    return;
                }
                wil.a("GattDevice", "onSuccess: setNotification");
                r38 r38Var = r38.this;
                r38Var.s(r38Var.p);
            }
        }

        public a() {
        }

        @Override // com.oplus.aiunit.vision.t38
        public void a(int i, int i2) {
        }

        @Override // com.oplus.aiunit.vision.t38
        public void b(UUID uuid, UUID uuid2, byte[] bArr) {
            wil.a("GattDevice", "onCharacteristicChanged " + fe8.a(bArr));
            if (ufk.c().equals(uuid)) {
                Iterator it = r38.this.o.iterator();
                while (it.hasNext()) {
                    ((uj5) it.next()).d(r38.this, bArr);
                }
            } else {
                Iterator it2 = r38.this.o.iterator();
                while (it2.hasNext()) {
                    ((uj5) it2.next()).e(r38.this, bArr);
                }
            }
        }

        @Override // com.oplus.aiunit.vision.t38
        public void c(int i) {
            synchronized (r38.this) {
                r38.this.u = false;
            }
            synchronized (r38.this.v) {
                if (r38.this.p != null) {
                    wil.a("GattDevice", "onDisconnected: mBondState " + r38.this.w + ", getBondState " + r38.this.p.getBondState());
                    if (r38.this.p.getBondState() != 12 && r38.this.w == 11) {
                        r38.this.x = true;
                        r38.this.w = 10;
                    }
                }
            }
            r38.this.t(i);
        }

        @Override // com.oplus.aiunit.vision.t38
        public void d(int i, int i2) {
            if (i2 == 0) {
                wil.a("GattDevice", "onMtuChanged: mtu " + i);
            }
        }

        @Override // com.oplus.aiunit.vision.t38
        public void e() {
            r38.this.x();
        }

        @Override // com.oplus.aiunit.vision.t38
        public void onConnected() {
            synchronized (r38.this) {
                r38.this.u = true;
            }
            wil.d("GattDevice", "onConnected setNotification ");
            r38.this.c0(ufk.f(), ufk.e(), true, new C0920a());
        }
    }

    public class b implements iu1.c {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.iu1.c
        public void a(String str, int i) {
            if (r38.this.p == null) {
                wil.b("GattDevice", "onBondStateChanged: mBluetoothDevice == null ");
                return;
            }
            String address = r38.this.p.getAddress();
            wil.a("GattDevice", "onBondStateChanged: MAC:" + gdb.a(str) + " state:" + i);
            synchronized (r38.this.v) {
                if (BluetoothUtil.INSTANCE.l(str, address)) {
                    if (r38.this.t != null) {
                        r38.this.t.O(i);
                    }
                    if (r38.this.w == 11 && i == 10) {
                        r38.this.x = true;
                        r38.this.W(201, true);
                    }
                    r38.this.w = i;
                }
            }
        }
    }

    public class c implements xs2<Void> {
        public final /* synthetic */ xs2 a;

        public c(xs2 xs2Var) {
            this.a = xs2Var;
        }

        @Override // com.oplus.aiunit.vision.xs2
        public void a(Throwable th, int i) {
            wil.b("GattDevice", "onError: wrte error " + i);
            this.a.a(th, i);
        }

        @Override // com.oplus.aiunit.vision.xs2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r3) {
            wil.a("GattDevice", "onSuccess: write success");
            this.a.onSuccess(r3);
        }
    }

    public class d implements xs2<Void> {
        public final /* synthetic */ xs2 a;

        public d(xs2 xs2Var) {
            this.a = xs2Var;
        }

        @Override // com.oplus.aiunit.vision.xs2
        public void a(Throwable th, int i) {
            wil.b("GattDevice", "sendData onError: wrte error " + i);
            this.a.a(th, i);
        }

        @Override // com.oplus.aiunit.vision.xs2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r3) {
            wil.a("GattDevice", "sendData onSuccess: write success");
            this.a.onSuccess(r3);
        }
    }

    public r38(Context context, ModuleInfo moduleInfo, long j2) {
        super(context, moduleInfo);
        this.u = false;
        this.v = new Object();
        this.w = 10;
        this.x = false;
        this.y = new a();
        this.z = new b();
        this.A = new iu1.b() { // from class: com.oplus.aiunit.vision.q38
            @Override // com.oplus.aiunit.vision.iu1.b
            public final void a(int i) {
                this.a.b0(i);
            }
        };
        this.s = j2;
        Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(int i) {
        if (i == 12) {
            wil.d("GattDevice", "onBluetoothStateChanged: state " + i);
            d0();
        }
    }

    public final boolean V(boolean z) {
        wil.d("GattDevice", "begin connect");
        if (a0()) {
            wil.d("GattDevice", "is connected not need connect");
            return false;
        }
        A(false);
        return X();
    }

    public void W(int i, boolean z) {
        A(i == 201);
        p38 p38Var = this.t;
        if (p38Var != null) {
            p38Var.I(i, z);
        }
    }

    public final boolean X() {
        wil.d("GattDevice", "begin gattConnect");
        BluetoothDevice bluetoothDevice = this.p;
        if (bluetoothDevice == null) {
            wil.b("GattDevice", "gattConnect: bluetoothDevice == null");
            return false;
        }
        if (this.t == null) {
            this.t = new p38(this.i, bluetoothDevice, this.y, this.s);
        }
        return this.t.F();
    }

    public boolean Y(UUID uuid) {
        p38 p38Var;
        if (!this.u || (p38Var = this.t) == null) {
            return false;
        }
        return p38Var.N(uuid);
    }

    public final void Z() {
        ModuleInfo moduleInfo = this.k;
        if (moduleInfo == null) {
            wil.b("GattDevice", "init: module == null");
            return;
        }
        if (!moduleInfo.isMainModule()) {
            wil.d("GattDevice", "init: stub module");
            return;
        }
        wil.d("GattDevice", "init: main module");
        iu1.h().e(this.z);
        iu1.h().d(this.A);
        d0();
    }

    @Override // com.oplus.aiunit.vision.x95, com.oplus.aiunit.vision.mw9
    public boolean a() {
        ModuleInfo moduleInfo = this.k;
        if (moduleInfo == null || !moduleInfo.isMainModule()) {
            return super.a();
        }
        if (this.w != 12) {
            d0();
        }
        return this.w == 12;
    }

    public boolean a0() {
        return this.u;
    }

    @Override // com.oplus.aiunit.vision.x95, com.oplus.aiunit.vision.mw9
    public boolean b() {
        if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            wil.a("GattDevice", "isNeedRetry: bluetooth not enable ");
            return false;
        }
        if (k() != 3) {
            wil.a("GattDevice", "isNeedRetry: mConnectionState " + this.f18541l);
            return false;
        }
        if (this.p == null) {
            wil.a("GattDevice", "isNeedRetry: mBluetoothDevice == null ");
            return false;
        }
        wil.a("GattDevice", "isNeedRetry: isActiveDisconnect " + r() + ",mCancelBond " + this.x);
        return (r() || this.x) ? false : true;
    }

    public void c0(UUID uuid, UUID uuid2, boolean z, xs2<Void> xs2Var) {
        p38 p38Var;
        if (this.u && (p38Var = this.t) != null) {
            p38Var.f0(uuid, uuid2, z, xs2Var);
        } else if (xs2Var != null) {
            xs2Var.a(new RuntimeException("Not connected"), 202);
        }
    }

    public final void d0() {
        synchronized (this.v) {
            BluetoothDevice bluetoothDevice = this.p;
            if (bluetoothDevice != null) {
                this.w = bluetoothDevice.getBondState();
            }
        }
    }

    public void e0(UUID uuid, UUID uuid2, byte[] bArr, xs2<Void> xs2Var) {
        p38 p38Var;
        if (this.u && (p38Var = this.t) != null) {
            p38Var.m0(uuid, uuid2, bArr, xs2Var);
        } else if (xs2Var != null) {
            xs2Var.a(new RuntimeException("Not connected"), 202);
        }
    }

    @Override // com.oplus.aiunit.vision.x95
    public boolean g() {
        this.x = false;
        return V(false);
    }

    @Override // com.oplus.aiunit.vision.x95
    public void i(int i) {
        W(i, false);
    }

    @Override // com.oplus.aiunit.vision.x95
    public ModuleInfo l() {
        return this.k;
    }

    @Override // com.oplus.aiunit.vision.x95
    public void q() {
        super.q();
        V(true);
    }

    @Override // com.oplus.aiunit.vision.x95
    public void u() {
        h();
        ModuleInfo moduleInfo = this.k;
        if (moduleInfo != null && moduleInfo.isMainModule()) {
            iu1.h().m(this.z);
            iu1.h().l(this.A);
        }
        p38 p38Var = this.t;
        if (p38Var != null) {
            p38Var.a0();
        }
    }

    @Override // com.oplus.aiunit.vision.x95
    public int y(byte[] bArr, xs2<Void> xs2Var) {
        if (this.t == null) {
            return super.y(bArr, xs2Var);
        }
        e0(ufk.c(), ufk.d(), bArr, new d(xs2Var));
        return 0;
    }

    @Override // com.oplus.aiunit.vision.x95
    public int z(byte[] bArr, xs2<Void> xs2Var) {
        if (this.t == null) {
            return super.z(bArr, xs2Var);
        }
        e0(ufk.f(), ufk.g(), bArr, new c(xs2Var));
        return 0;
    }
}
