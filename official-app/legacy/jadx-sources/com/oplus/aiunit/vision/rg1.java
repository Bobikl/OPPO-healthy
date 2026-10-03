package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.base.bluetooth.OplusBTCloseBroadcastReceiver;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes15.dex */
public class rg1 implements n38.a, Handler.Callback, mqf {
    public static final String TAG = "BleClient";
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f16191j;
    public final Handler k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n38 f16192l;
    public final Deque<gh1> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public hu5 f16193n;
    public final AtomicReference<gh1> o;
    public HandlerThread p;
    public BroadcastReceiver q;
    public int r;
    public int s;
    public final boolean t;
    public final int u;
    public final int v;
    public Context w;

    public class a extends OplusBTCloseBroadcastReceiver {
        public a() {
        }

        @Override // com.heytap.health.base.bluetooth.OplusBTCloseBroadcastReceiver
        public void onRealReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", 10);
            if ((intExtra == 10 || intExtra == 13) && intExtra2 != 13 && intExtra2 != 10 && rg1.this.v()) {
                rg1.this.f16192l.a();
                rg1.this.x();
            }
        }
    }

    public static class b {
        public boolean a = false;
        public int b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16194c = 32000;
        public final Context d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f16195e;

        public b(Context context, String str) {
            this.d = context.getApplicationContext();
            this.f16195e = str;
        }

        public rg1 f() {
            return new rg1(this);
        }
    }

    public final synchronized void A() {
        if (this.q != null) {
            return;
        }
        a aVar = new a();
        this.q = aVar;
        rdf.a(this.w, aVar, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
    }

    public void B(fy3 fy3Var) {
        l().l(fy3Var);
    }

    public gh1 C(UUID uuid, UUID uuid2, boolean z) {
        gh1 gh1VarB = gh1.b(uuid, uuid2);
        gh1VarB.q(z ? 7 : 8);
        gh1VarB.n(this);
        gh1VarB.k(this.k);
        return gh1VarB;
    }

    public final void D(int i) {
        this.f16191j.sendEmptyMessageDelayed(4, i);
    }

    public final void E() {
        this.f16191j.removeMessages(4);
    }

    public final void F() {
        this.f16191j.obtainMessage(5).sendToTarget();
    }

    public final boolean G(gh1 gh1Var) {
        return gh1Var != null && gh1Var.h() > 0;
    }

    public final boolean H(s4m s4mVar) {
        return s4mVar.h() == 4 ? this.f16192l.p(s4mVar.g(), s4mVar.d(), s4mVar.t(this.s)) : this.f16192l.q(s4mVar.g(), s4mVar.d(), s4mVar.e(), s4mVar.t(this.s));
    }

    @Override // com.oplus.aiunit.vision.n38.a
    public void a(int i, boolean z, byte[] bArr) {
        this.f16191j.obtainMessage(3, i, z ? hh1.SUCCESS : hh1.FAIL, bArr).sendToTarget();
    }

    @Override // com.oplus.aiunit.vision.mqf
    public void b(gh1 gh1Var) {
        if (!G(gh1Var)) {
            throw new IllegalArgumentException("Request params error");
        }
        this.f16191j.obtainMessage(1, gh1Var).sendToTarget();
    }

    @Override // com.oplus.aiunit.vision.n38.a
    public void c(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        l().h(bluetoothGatt, bluetoothGattCharacteristic);
    }

    @Override // com.oplus.aiunit.vision.n38.a
    public void d(boolean z, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onConnectionStateChange: ");
        sb.append(i);
        if (i == 2) {
            A();
            return;
        }
        if (i == 3) {
            this.r = 0;
            k(true);
        } else {
            if (i != 4 || z) {
                return;
            }
            if (!this.t || this.r >= this.u) {
                x();
            } else {
                F();
            }
        }
    }

    public void g(fy3 fy3Var) {
        l().c(fy3Var);
    }

    public void h() {
        E();
        this.f16192l.a();
        this.m.clear();
        l().e();
        BroadcastReceiver broadcastReceiver = this.q;
        if (broadcastReceiver != null) {
            this.w.unregisterReceiver(broadcastReceiver);
            this.q = null;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        StringBuilder sb = new StringBuilder();
        sb.append("handleMessage-->what:");
        sb.append(message.what);
        switch (message.what) {
            case 1:
                this.m.add((gh1) message.obj);
                p();
                break;
            case 2:
                p();
                break;
            case 3:
                r(message.arg1, message.arg2, (byte[]) message.obj);
                break;
            case 4:
                s();
                break;
            case 5:
                q();
                break;
            case 6:
                o();
                break;
        }
        return true;
    }

    public cy3 i() {
        cy3 cy3Var = new cy3();
        cy3Var.n(this);
        cy3Var.u(true);
        cy3Var.k(this.k);
        cy3Var.o(this.v);
        return cy3Var;
    }

    public xtk j(UUID uuid, UUID uuid2) {
        xtk xtkVarM = l().m(uuid, uuid2);
        xtkVarM.e();
        return xtkVarM;
    }

    public final void k(boolean z) {
        l().f(this.i, z);
    }

    public final hu5 l() {
        if (this.f16193n == null) {
            this.f16193n = new hu5(this.k.getLooper());
        }
        return this.f16193n;
    }

    public String m() {
        return this.i;
    }

    public final Looper n() {
        if (this.p == null) {
            HandlerThread handlerThread = new HandlerThread("Ble Request Thread");
            this.p = handlerThread;
            handlerThread.start();
        }
        return this.p.getLooper();
    }

    public final void o() {
        this.r = 0;
        gh1 andSet = this.o.getAndSet(null);
        StringBuilder sb = new StringBuilder();
        sb.append("handleGattDisconnect--->request");
        sb.append(andSet);
        if (andSet != null && andSet.h() != 1) {
            andSet.c(hh1.STATE_ERROR, null);
        }
        Iterator<gh1> it = this.m.iterator();
        while (it.hasNext()) {
            gh1 next = it.next();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BleRequest-->:");
            sb2.append(next);
            if (next != null && next.h() != 1) {
                next.c(hh1.STATE_ERROR, null);
                it.remove();
            }
        }
        k(false);
    }

    public final void p() {
        gh1 gh1VarPoll;
        if (this.o.get() != null) {
            return;
        }
        try {
            gh1VarPoll = this.m.poll();
        } catch (Exception e2) {
            a7b.b(TAG, "handleProcessNextRequest: error " + e2);
            gh1VarPoll = null;
        }
        if (gh1VarPoll != null) {
            y(gh1VarPoll);
        }
    }

    public final void q() {
        gh1 gh1Var = this.o.get();
        if (gh1Var == null || gh1Var.h() != 1) {
            this.r++;
            if (gh1Var != null && gh1Var.h() != 1) {
                gh1Var.c(hh1.STATE_ERROR, null);
                this.o.set(null);
            }
            E();
            y(new cy3());
        }
    }

    public final void r(int i, int i2, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("handleRequestComplete-->requestType:");
        sb.append(i);
        sb.append("    code:");
        sb.append(i2);
        if (i == 12 && i2 == hh1.SUCCESS) {
            this.s = qd2.a(bArr);
        }
        gh1 gh1Var = this.o.get();
        if (gh1Var == null) {
            E();
            p();
            return;
        }
        if (gh1Var.h() == i || u(gh1Var, i)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("dispatchResult   request:");
            sb2.append(gh1Var);
            gh1Var.c(i2, bArr);
        }
        this.o.set(null);
        if (i2 == hh1.SUCCESS) {
            if (i == 1 && (gh1Var instanceof cy3)) {
                if (((cy3) gh1Var).t()) {
                    this.o.set(gh1Var);
                    E();
                    this.f16192l.c();
                    D(gh1Var.f());
                }
            } else if ((i == 4 || i == 6) && (gh1Var instanceof s4m)) {
                s4m s4mVar = (s4m) gh1Var;
                if (s4mVar.u()) {
                    H(s4mVar);
                    this.o.set(gh1Var);
                }
            }
            if (gh1Var.s()) {
                this.o.set(gh1Var);
            }
        }
        p();
    }

    public final void s() {
        gh1 andSet = this.o.getAndSet(null);
        if (andSet == null) {
            p();
            return;
        }
        andSet.c(hh1.TIMEOUT, null);
        if (!w(andSet) || this.r >= this.u) {
            p();
        } else {
            q();
        }
    }

    public boolean t(UUID uuid, UUID uuid2) {
        n38 n38Var = this.f16192l;
        return (n38Var == null || n38Var.d(uuid, uuid2) == null) ? false : true;
    }

    public final boolean u(gh1 gh1Var, int i) {
        if ((gh1Var instanceof cy3) && i == 2) {
            return ((cy3) gh1Var).t();
        }
        return false;
    }

    public boolean v() {
        return this.f16192l.f();
    }

    public final boolean w(@Nullable gh1 gh1Var) {
        return gh1Var != null && gh1Var.h() == 1 && this.r > 0;
    }

    public final void x() {
        this.f16191j.obtainMessage(6).sendToTarget();
    }

    public final void y(gh1 gh1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("processRequest-->request.getType():");
        sb.append(gh1Var.h());
        this.o.set(gh1Var);
        boolean zB = false;
        switch (gh1Var.h()) {
            case 1:
                zB = this.f16192l.b(this.w);
                break;
            case 2:
                zB = this.f16192l.c();
                break;
            case 3:
                zB = this.f16192l.h(gh1Var.g(), gh1Var.d());
                break;
            case 4:
            case 6:
                zB = H((s4m) gh1Var);
                break;
            case 5:
                zB = this.f16192l.i(gh1Var.g(), gh1Var.d(), gh1Var.e());
                break;
            case 7:
                zB = this.f16192l.o(gh1Var.g(), gh1Var.d(), true);
                break;
            case 8:
                zB = this.f16192l.o(gh1Var.g(), gh1Var.d(), false);
                break;
            case 9:
                zB = this.f16192l.n(gh1Var.g(), gh1Var.d(), true);
                break;
            case 10:
                zB = this.f16192l.n(gh1Var.g(), gh1Var.d(), false);
                break;
            case 11:
                zB = this.f16192l.j();
                break;
            case 12:
                zB = this.f16192l.l(((z6c) gh1Var).t());
                break;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("processRequest-->result:");
        sb2.append(zB);
        if (!zB) {
            r(gh1Var.h(), hh1.FAIL, null);
        } else {
            E();
            D(gh1Var.f());
        }
    }

    public ybf z(UUID uuid, UUID uuid2) {
        ybf ybfVarT = ybf.t(uuid, uuid2);
        ybfVarT.q(3);
        ybfVarT.n(this);
        ybfVarT.k(this.k);
        return ybfVarT;
    }

    public rg1(b bVar) {
        this.m = new LinkedList();
        this.o = new AtomicReference<>();
        this.r = 0;
        this.s = 23;
        this.w = bVar.d;
        this.i = bVar.f16195e;
        this.t = bVar.a;
        this.u = bVar.b;
        this.v = bVar.f16194c;
        n38 n38Var = new n38(bVar.f16195e);
        this.f16192l = n38Var;
        n38Var.m(this);
        this.f16191j = new Handler(n(), this);
        this.k = new Handler(Looper.getMainLooper());
    }
}
