package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.heytap.health.devicemanager.util.BluetoothUtil;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import java.util.Iterator;
import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class u48 extends sa5 {
    public final wu1.b A;
    public final long s;
    public s48 t;
    public volatile boolean u;
    public final Object v;
    public volatile int w;
    public volatile boolean x;
    public final w48 y;
    public wu1.c z;

    public class a implements w48 {

        public class a implements lt2<Void> {

            public class a implements lt2<Void> {
                public a() {
                }

                @Override // com.oplus.aiunit.vision.lt2
                public void a(Throwable th, int i) {
                    uml.a("GattDevice", "onError: setNotification");
                    u48.this.i(204);
                }

                @Override // com.oplus.aiunit.vision.lt2
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Void r2) {
                    uml.a("GattDevice", "onSuccess: ble file setNotification");
                    u48 u48Var = u48.this;
                    u48Var.s(u48Var.p);
                }
            }

            public a() {
            }

            @Override // com.oplus.aiunit.vision.lt2
            public void a(Throwable th, int i) {
                uml.a("GattDevice", "onError: setNotification");
                u48.this.i(204);
            }

            @Override // com.oplus.aiunit.vision.lt2
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Void r4) {
                if (u48.this.Y(wjk.c())) {
                    u48.this.c0(wjk.c(), wjk.b(), true, new a());
                    return;
                }
                uml.a("GattDevice", "onSuccess: setNotification");
                u48 u48Var = u48.this;
                u48Var.s(u48Var.p);
            }
        }

        public a() {
        }

        @Override // com.oplus.aiunit.vision.w48
        public void a(int i, int i2) {
        }

        @Override // com.oplus.aiunit.vision.w48
        public void b(UUID uuid, UUID uuid2, byte[] bArr) {
            uml.a("GattDevice", "onCharacteristicChanged " + if8.a(bArr));
            if (wjk.c().equals(uuid)) {
                Iterator it = u48.this.o.iterator();
                while (it.hasNext()) {
                    ((qk5) it.next()).d(u48.this, bArr);
                }
            } else {
                Iterator it2 = u48.this.o.iterator();
                while (it2.hasNext()) {
                    ((qk5) it2.next()).e(u48.this, bArr);
                }
            }
        }

        @Override // com.oplus.aiunit.vision.w48
        public void c(int i) {
            synchronized (u48.this) {
                u48.this.u = false;
            }
            synchronized (u48.this.v) {
                if (u48.this.p != null) {
                    uml.a("GattDevice", "onDisconnected: mBondState " + u48.this.w + ", getBondState " + u48.this.p.getBondState());
                    if (u48.this.p.getBondState() != 12 && u48.this.w == 11) {
                        u48.this.x = true;
                        u48.this.w = 10;
                    }
                }
            }
            u48.this.t(i);
        }

        @Override // com.oplus.aiunit.vision.w48
        public void d(int i, int i2) {
            if (i2 == 0) {
                uml.a("GattDevice", "onMtuChanged: mtu " + i);
            }
        }

        @Override // com.oplus.aiunit.vision.w48
        public void e() {
            u48.this.x();
        }

        @Override // com.oplus.aiunit.vision.w48
        public void onConnected() {
            synchronized (u48.this) {
                u48.this.u = true;
            }
            uml.d("GattDevice", "onConnected setNotification ");
            u48.this.c0(wjk.f(), wjk.e(), true, new a());
        }
    }

    public class b implements wu1.c {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.wu1.c
        public void a(String str, int i) {
            if (u48.this.p == null) {
                uml.b("GattDevice", "onBondStateChanged: mBluetoothDevice == null ");
                return;
            }
            String address = u48.this.p.getAddress();
            uml.a("GattDevice", "onBondStateChanged: MAC:" + veb.a(str) + " state:" + i);
            synchronized (u48.this.v) {
                if (BluetoothUtil.INSTANCE.l(str, address)) {
                    if (u48.this.t != null) {
                        u48.this.t.O(i);
                    }
                    if (u48.this.w == 11 && i == 10) {
                        u48.this.x = true;
                        u48.this.W(201, true);
                    }
                    u48.this.w = i;
                }
            }
        }
    }

    public class c implements lt2<Void> {
        public final /* synthetic */ lt2 a;

        public c(lt2 lt2Var) {
            this.a = lt2Var;
        }

        @Override // com.oplus.aiunit.vision.lt2
        public void a(Throwable th, int i) {
            uml.b("GattDevice", "onError: wrte error " + i);
            this.a.a(th, i);
        }

        @Override // com.oplus.aiunit.vision.lt2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r3) {
            uml.a("GattDevice", "onSuccess: write success");
            this.a.onSuccess(r3);
        }
    }

    public class d implements lt2<Void> {
        public final /* synthetic */ lt2 a;

        public d(lt2 lt2Var) {
            this.a = lt2Var;
        }

        @Override // com.oplus.aiunit.vision.lt2
        public void a(Throwable th, int i) {
            uml.b("GattDevice", "sendData onError: wrte error " + i);
            this.a.a(th, i);
        }

        @Override // com.oplus.aiunit.vision.lt2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r3) {
            uml.a("GattDevice", "sendData onSuccess: write success");
            this.a.onSuccess(r3);
        }
    }

    public u48(Context context, ModuleInfo moduleInfo, long j) {
        super(context, moduleInfo);
        this.u = false;
        this.v = new Object();
        this.w = 10;
        this.x = false;
        this.y = new a();
        this.z = new b();
        this.A = new wu1.b() { // from class: com.oplus.aiunit.vision.t48
            @Override // com.oplus.aiunit.vision.wu1.b
            public final void a(int i) {
                this.a.b0(i);
            }
        };
        this.s = j;
        Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(int i) {
        if (i == 12) {
            uml.d("GattDevice", "onBluetoothStateChanged: state " + i);
            d0();
        }
    }

    public final boolean V(boolean z) {
        uml.d("GattDevice", "begin connect");
        if (a0()) {
            uml.d("GattDevice", "is connected not need connect");
            return false;
        }
        A(false);
        return X();
    }

    public void W(int i, boolean z) {
        A(i == 201);
        s48 s48Var = this.t;
        if (s48Var != null) {
            s48Var.I(i, z);
        }
    }

    public final boolean X() {
        uml.d("GattDevice", "begin gattConnect");
        BluetoothDevice bluetoothDevice = this.p;
        if (bluetoothDevice == null) {
            uml.b("GattDevice", "gattConnect: bluetoothDevice == null");
            return false;
        }
        if (this.t == null) {
            this.t = new s48(this.i, bluetoothDevice, this.y, this.s);
        }
        return this.t.F();
    }

    public boolean Y(UUID uuid) {
        s48 s48Var;
        if (!this.u || (s48Var = this.t) == null) {
            return false;
        }
        return s48Var.N(uuid);
    }

    public final void Z() {
        ModuleInfo moduleInfo = this.k;
        if (moduleInfo == null) {
            uml.b("GattDevice", "init: module == null");
            return;
        }
        if (!moduleInfo.isMainModule()) {
            uml.d("GattDevice", "init: stub module");
            return;
        }
        uml.d("GattDevice", "init: main module");
        wu1.h().e(this.z);
        wu1.h().d(this.A);
        d0();
    }

    @Override // com.oplus.aiunit.vision.sa5, com.oplus.aiunit.vision.tx9
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

    @Override // com.oplus.aiunit.vision.sa5, com.oplus.aiunit.vision.tx9
    public boolean b() {
        if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            uml.a("GattDevice", "isNeedRetry: bluetooth not enable ");
            return false;
        }
        if (k() != 3) {
            uml.a("GattDevice", "isNeedRetry: mConnectionState " + this.l);
            return false;
        }
        if (this.p == null) {
            uml.a("GattDevice", "isNeedRetry: mBluetoothDevice == null ");
            return false;
        }
        uml.a("GattDevice", "isNeedRetry: isActiveDisconnect " + r() + ",mCancelBond " + this.x);
        return (r() || this.x) ? false : true;
    }

    public void c0(UUID uuid, UUID uuid2, boolean z, lt2<Void> lt2Var) {
        s48 s48Var;
        if (this.u && (s48Var = this.t) != null) {
            s48Var.f0(uuid, uuid2, z, lt2Var);
        } else if (lt2Var != null) {
            lt2Var.a(new RuntimeException("Not connected"), 202);
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

    public void e0(UUID uuid, UUID uuid2, byte[] bArr, lt2<Void> lt2Var) {
        s48 s48Var;
        if (this.u && (s48Var = this.t) != null) {
            s48Var.m0(uuid, uuid2, bArr, lt2Var);
        } else if (lt2Var != null) {
            lt2Var.a(new RuntimeException("Not connected"), 202);
        }
    }

    @Override // com.oplus.aiunit.vision.sa5
    public boolean g() {
        this.x = false;
        return V(false);
    }

    @Override // com.oplus.aiunit.vision.sa5
    public void i(int i) {
        W(i, false);
    }

    @Override // com.oplus.aiunit.vision.sa5
    public ModuleInfo l() {
        return this.k;
    }

    @Override // com.oplus.aiunit.vision.sa5
    public void q() {
        super.q();
        V(true);
    }

    @Override // com.oplus.aiunit.vision.sa5
    public void u() {
        h();
        ModuleInfo moduleInfo = this.k;
        if (moduleInfo != null && moduleInfo.isMainModule()) {
            wu1.h().m(this.z);
            wu1.h().l(this.A);
        }
        s48 s48Var = this.t;
        if (s48Var != null) {
            s48Var.a0();
        }
    }

    @Override // com.oplus.aiunit.vision.sa5
    public int y(byte[] bArr, lt2<Void> lt2Var) {
        if (this.t == null) {
            return super.y(bArr, lt2Var);
        }
        e0(wjk.c(), wjk.d(), bArr, new d(lt2Var));
        return 0;
    }

    @Override // com.oplus.aiunit.vision.sa5
    public int z(byte[] bArr, lt2<Void> lt2Var) {
        if (this.t == null) {
            return super.z(bArr, lt2Var);
        }
        e0(wjk.f(), wjk.g(), bArr, new c(lt2Var));
        return 0;
    }
}
