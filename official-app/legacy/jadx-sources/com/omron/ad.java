package com.omron;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ad extends com.omron.p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final LinkedList<p> f8778j;

    @NonNull
    private final o k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    private final el f8779l;

    @NonNull
    private final x m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    private List<ai> f8780n;
    private boolean o;

    @Nullable
    private ae p;

    @NonNull
    private final Runnable q;

    public class a implements Runnable {
        final /* synthetic */ ae a;
        final /* synthetic */ z b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8781c;

        public a(ae aeVar, z zVar, int i) {
            this.a = aeVar;
            this.b = zVar;
            this.f8781c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(ad.this, this.b, this.f8781c);
        }
    }

    public class b implements Runnable {
        final /* synthetic */ ae a;
        final /* synthetic */ t b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8782c;

        public b(ae aeVar, t tVar, int i) {
            this.a = aeVar;
            this.b = tVar;
            this.f8782c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(ad.this, this.b, this.f8782c);
        }
    }

    public class c implements Runnable {
        final /* synthetic */ ae a;
        final /* synthetic */ z b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8783c;

        public c(ae aeVar, z zVar, int i) {
            this.a = aeVar;
            this.b = zVar;
            this.f8783c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(ad.this, this.b, this.f8783c);
        }
    }

    public class d implements Runnable {
        final /* synthetic */ ae a;
        final /* synthetic */ t b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f8784c;

        public d(ae aeVar, t tVar, int i) {
            this.a = aeVar;
            this.b = tVar;
            this.f8784c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.b(ad.this, this.b, this.f8784c);
        }
    }

    public class e implements x.d {
        public e() {
        }

        @Override // com.omron.x.d
        public void a() {
            ad.this.k.b(ad.this);
        }

        @Override // com.omron.x.d
        public void b() {
            ad adVar = ad.this;
            adVar.f8780n = adVar.e(adVar);
            ad.this.f8778j.clear();
            ad.this.o = false;
            ad.this.k.a(ad.this);
        }

        @Override // com.omron.x.d
        public void c() {
            ad.this.k.c(ad.this);
        }

        @Override // com.omron.x.d
        public void a(@NonNull af afVar) {
            ad.this.k.a(ad.this, afVar);
        }

        @Override // com.omron.x.d
        public void a(@NonNull ag agVar) {
            ad.this.k.a(ad.this, agVar);
        }
    }

    public static /* synthetic */ class f {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f8785c;
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[com.omron.p.i.values().length];
            d = iArr;
            try {
                iArr[com.omron.p.i.Connected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[com.omron.p.i.Disconnected.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[com.omron.p.g.values().length];
            f8785c = iArr2;
            try {
                iArr2[com.omron.p.g.Connected.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8785c[com.omron.p.g.Disconnected.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[com.omron.p.h.values().length];
            b = iArr3;
            try {
                iArr3[com.omron.p.h.Bonded.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[com.omron.p.h.Bonding.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[com.omron.p.h.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr4 = new int[p.a.values().length];
            a = iArr4;
            try {
                iArr4[p.a.ReadCharacteristic.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[p.a.ReadDescriptor.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[p.a.WriteCharacteristic.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[p.a.WriteDescriptor.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[p.a.Notify.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            aa.b("Event timeout.");
            ad.this.c(129);
        }
    }

    public class h implements Runnable {
        final /* synthetic */ ae a;

        public h(ae aeVar) {
            this.a = aeVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ad.this.p = this.a;
        }
    }

    public class i implements Runnable {
        final /* synthetic */ en a;

        public i(en enVar) {
            this.a = enVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(ad.this.f8780n);
            this.a.c();
        }
    }

    public class j implements Runnable {
        final /* synthetic */ t a;

        public j(t tVar) {
            this.a = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ad.this.f8778j.add(new p(p.a.ReadCharacteristic, this.a));
            ad.this.t();
        }
    }

    public class k implements Runnable {
        final /* synthetic */ z a;

        public k(z zVar) {
            this.a = zVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ad.this.f8778j.add(new p(p.a.ReadDescriptor, this.a));
            ad.this.t();
        }
    }

    public class l implements Runnable {
        final /* synthetic */ t a;

        public l(t tVar) {
            this.a = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ad.this.f8778j.add(new p(p.a.WriteCharacteristic, this.a));
            ad.this.t();
        }
    }

    public class m implements Runnable {
        final /* synthetic */ t a;
        final /* synthetic */ boolean b;

        public m(t tVar, boolean z) {
            this.a = tVar;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ad.this.f8778j.add(new p(p.a.Notify, this.a, this.b));
            ad.this.t();
        }
    }

    public class n implements Runnable {
        final /* synthetic */ ae a;
        final /* synthetic */ t b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ byte[] f8787c;
        final /* synthetic */ int d;

        public n(ae aeVar, t tVar, byte[] bArr, int i) {
            this.a = aeVar;
            this.b = tVar;
            this.f8787c = bArr;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(ad.this, this.b, this.f8787c, this.d);
        }
    }

    public interface o {
        void a(@NonNull ad adVar);

        void a(@NonNull ad adVar, @NonNull af afVar);

        void a(@NonNull ad adVar, @NonNull ag agVar);

        void a(@NonNull ad adVar, @NonNull com.omron.p.g gVar);

        void a(@NonNull ad adVar, @NonNull com.omron.p.h hVar);

        void a(@NonNull ad adVar, @NonNull com.omron.p.i iVar, int i);

        void a(@NonNull ad adVar, @NonNull y.a aVar);

        void b(@NonNull ad adVar);

        void c(@NonNull ad adVar);
    }

    public static class p {

        @NonNull
        final a a;
        final t b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final z f8789c;
        final byte[] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f8790e;

        public enum a {
            ReadCharacteristic,
            ReadDescriptor,
            WriteCharacteristic,
            WriteDescriptor,
            Notify
        }

        public p(@NonNull a aVar, @NonNull t tVar) {
            this.a = aVar;
            this.b = tVar;
            this.f8789c = null;
            this.d = null;
            this.f8790e = false;
        }

        public p(@NonNull a aVar, @NonNull t tVar, boolean z) {
            this.a = aVar;
            this.b = tVar;
            this.f8789c = null;
            this.d = null;
            this.f8790e = z;
        }

        public p(@NonNull a aVar, @NonNull z zVar) {
            this.a = aVar;
            this.b = null;
            this.f8789c = zVar;
            this.d = null;
            this.f8790e = false;
        }
    }

    public ad(@NonNull Context context, @NonNull BluetoothDevice bluetoothDevice, @NonNull o oVar, @NonNull Looper looper) {
        super(context, bluetoothDevice, null);
        this.f8778j = new LinkedList<>();
        this.f8780n = new ArrayList();
        this.o = false;
        this.q = new g();
        this.k = oVar;
        this.f8779l = new el(looper);
        this.m = s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2) {
        aa.a();
        if (!this.o) {
            aa.b("!mIsValueUpdatingEventRunning");
            return;
        }
        this.o = false;
        k().removeCallbacks(this.q);
        p pVarPoll = this.f8778j.poll();
        int i3 = f.a[pVarPoll.a.ordinal()];
        if (i3 == 1) {
            b(pVarPoll.b, i2);
        } else if (i3 == 2) {
            a(pVarPoll.f8789c, i2);
        } else if (i3 == 3) {
            c(pVarPoll.b, i2);
        } else if (i3 == 4) {
            b(pVarPoll.f8789c, i2);
        } else if (i3 == 5) {
            a(pVarPoll.b, i2);
        }
        if (this.f8778j.isEmpty()) {
            return;
        }
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public List<ai> e(@NonNull ad adVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<BluetoothGattService> it = adVar.m().iterator();
        while (it.hasNext()) {
            arrayList.add(new ai(adVar, it.next()));
        }
        a(arrayList);
        return arrayList;
    }

    @NonNull
    private x s() {
        return new x(this, new e(), k().getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        boolean zA;
        aa.a();
        if (this.f8778j.isEmpty()) {
            aa.b("ValueUpdatingEvent is Empty.");
            return;
        }
        if (this.o) {
            aa.a("Value Updating Event Running.");
            return;
        }
        this.o = true;
        p pVarPeek = this.f8778j.peek();
        if (!this.m.e()) {
            aa.b("!mConnector.isConnected()");
            c(129);
            return;
        }
        int i2 = f.a[pVarPeek.a.ordinal()];
        if (i2 == 1) {
            zA = a(pVarPeek.b);
        } else if (i2 == 2) {
            zA = a(pVarPeek.f8789c);
        } else if (i2 == 3) {
            zA = b(pVarPeek.b);
        } else if (i2 == 4) {
            zA = b(pVarPeek.f8789c);
        } else if (i2 != 5) {
            aa.b("Unknown event type.");
            zA = false;
        } else {
            zA = a(pVarPeek.f8790e, pVarPeek.b);
        }
        if (zA) {
            k().postDelayed(this.q, 10000L);
        } else {
            c(129);
        }
    }

    @Override // com.omron.p
    @NonNull
    public /* bridge */ /* synthetic */ String g() {
        return super.g();
    }

    @Override // com.omron.p
    public /* bridge */ /* synthetic */ com.omron.p.h h() {
        return super.h();
    }

    @Override // com.omron.p
    @NonNull
    public /* bridge */ /* synthetic */ com.omron.p.i j() {
        return super.j();
    }

    @Override // com.omron.p
    @Nullable
    public /* bridge */ /* synthetic */ String l() {
        return super.l();
    }

    @Override // com.omron.p
    public /* bridge */ /* synthetic */ boolean o() {
        return super.o();
    }

    @Override // com.omron.p
    public /* bridge */ /* synthetic */ boolean p() {
        return super.p();
    }

    public void u() {
        this.m.d(268435459);
    }

    public void v() {
        this.m.d(268435458);
    }

    @NonNull
    public List<ai> w() {
        if (k().a()) {
            return this.f8780n;
        }
        en enVar = new en();
        k().post(new i(enVar));
        enVar.b();
        return (List) eo.a(enVar.a());
    }

    @NonNull
    public ag x() {
        return this.m.d();
    }

    @Nullable
    private t a(@NonNull List<ai> list, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        Iterator<ai> it = list.iterator();
        while (it.hasNext()) {
            for (t tVar : it.next().b()) {
                if (tVar.c().equals(bluetoothGattCharacteristic)) {
                    return tVar;
                }
            }
        }
        return null;
    }

    @Override // com.omron.p
    public void b(int i2) {
        aa.a();
        x xVar = this.m;
        if (i2 == 0) {
            xVar.d(268439561);
        } else {
            xVar.b(268439562, i2);
        }
    }

    @Override // com.omron.p
    public void b(int i2, int i3) {
    }

    public void c(@NonNull t tVar) {
        aa.a();
        k().post(new j(tVar));
    }

    private void c(@NonNull t tVar, int i2) {
        aa.e(tVar.a().toString());
        ae aeVar = this.p;
        if (aeVar == null) {
            aa.f("null == mDelegate");
        } else {
            this.f8779l.post(new b(aeVar, tVar, i2));
        }
    }

    @Override // com.omron.p
    public void b(@NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        aa.a();
        c(i2);
    }

    @Override // com.omron.p
    public void b(@NonNull BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
        aa.a();
        c(i2);
    }

    public void c(@NonNull z zVar) {
        aa.a();
        k().post(new k(zVar));
    }

    private void b(@NonNull t tVar, int i2) {
        a(tVar, tVar.g(), i2);
    }

    @Override // com.omron.p
    public void a(int i2) {
    }

    @Override // com.omron.p
    public void a(int i2, int i3) {
    }

    @Override // com.omron.p
    public void b(@NonNull y.a aVar) {
        aa.e(aVar.name());
        this.k.a(this, aVar);
        this.m.b(268439553, aVar);
    }

    private void b(@NonNull z zVar, int i2) {
        aa.e(zVar.a().toString());
        ae aeVar = this.p;
        if (aeVar == null) {
            aa.f("null == mDelegate");
        } else {
            this.f8779l.post(new c(aeVar, zVar, i2));
        }
    }

    @Override // com.omron.p
    public void a(@NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        aa.a();
        c(i2);
    }

    @Override // com.omron.p
    public void a(@NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr) {
        aa.a();
        t tVarA = a(this.f8780n, bluetoothGattCharacteristic);
        if (tVarA == null) {
            aa.b("null == characteristic");
        } else {
            a(tVarA, bArr, 0);
        }
    }

    public void b(boolean z, @NonNull t tVar) {
        aa.a();
        k().post(new m(tVar, z));
    }

    private boolean b(@NonNull t tVar) {
        aa.e(tVar.a().toString());
        if (b(tVar.c())) {
            return true;
        }
        aa.b("writeCharacteristic() failed.");
        return false;
    }

    @Override // com.omron.p
    public void a(@NonNull BluetoothGattDescriptor bluetoothGattDescriptor, int i2) {
        aa.a();
        c(i2);
    }

    private boolean b(@NonNull z zVar) {
        aa.e(zVar.a().toString());
        if (b(zVar.b())) {
            return true;
        }
        aa.b("writeDescriptor() failed.");
        return false;
    }

    public void a(@NonNull Bundle bundle) {
        this.m.a(bundle);
    }

    public void a(@Nullable ae aeVar) {
        aa.a();
        k().post(new h(aeVar));
    }

    @Override // com.omron.p
    public void a(@NonNull com.omron.p.g gVar) {
        x xVar;
        int i2;
        aa.e(gVar.name());
        this.k.a(this, gVar);
        int i3 = f.f8785c[gVar.ordinal()];
        if (i3 == 1) {
            xVar = this.m;
            i2 = 268439557;
        } else {
            if (i3 != 2) {
                return;
            }
            xVar = this.m;
            i2 = 268439558;
        }
        xVar.d(i2);
    }

    @Override // com.omron.p
    public void a(@NonNull com.omron.p.h hVar) {
        x xVar;
        int i2;
        aa.e(hVar.name());
        this.k.a(this, hVar);
        int i3 = f.b[hVar.ordinal()];
        if (i3 == 1) {
            xVar = this.m;
            i2 = 268439554;
        } else if (i3 == 2) {
            xVar = this.m;
            i2 = 268439555;
        } else {
            if (i3 != 3) {
                return;
            }
            xVar = this.m;
            i2 = 268439556;
        }
        xVar.d(i2);
    }

    @Override // com.omron.p
    public void a(@NonNull com.omron.p.i iVar, int i2) {
        aa.e(iVar.name());
        this.k.a(this, iVar, i2);
        int i3 = f.d[iVar.ordinal()];
        if (i3 == 1) {
            this.m.d(268439559);
        } else {
            if (i3 != 2) {
                return;
            }
            this.m.b(268439560, i2);
        }
    }

    private void a(@NonNull t tVar, int i2) {
        aa.e(tVar.a().toString());
        ae aeVar = this.p;
        if (aeVar == null) {
            aa.f("null == mDelegate");
        } else {
            this.f8779l.post(new d(aeVar, tVar, i2));
        }
    }

    private void a(@NonNull t tVar, @NonNull byte[] bArr, int i2) {
        aa.e(tVar.a().toString());
        ae aeVar = this.p;
        if (aeVar == null) {
            aa.f("null == mDelegate");
        } else {
            this.f8779l.post(new n(aeVar, tVar, bArr, i2));
        }
    }

    private void a(@NonNull z zVar, int i2) {
        aa.e(zVar.a().toString());
        ae aeVar = this.p;
        if (aeVar == null) {
            aa.f("null == mDelegate");
        } else {
            this.f8779l.post(new a(aeVar, zVar, i2));
        }
    }

    private void a(@NonNull List<ai> list) {
        Iterator<ai> it = list.iterator();
        while (it.hasNext()) {
            aa.c(it.next().toString());
        }
    }

    public void a(@NonNull byte[] bArr, @NonNull t tVar, @NonNull v vVar) {
        aa.a();
        tVar.c().setValue(bArr);
        tVar.c().setWriteType(vVar.a());
        k().post(new l(tVar));
    }

    private boolean a(@NonNull t tVar) {
        aa.e(tVar.a().toString());
        if (a(tVar.c())) {
            return true;
        }
        aa.b("readCharacteristic() failed.");
        return false;
    }

    private boolean a(@NonNull z zVar) {
        aa.e(zVar.a().toString());
        if (a(zVar.b())) {
            return true;
        }
        aa.b("readDescriptor() failed.");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c A[RETURN] */
    private boolean a(boolean z, @NonNull t tVar) {
        String str;
        byte[] bArr;
        aa.e(tVar.a().toString());
        z zVarA = tVar.a(new aj("2902"));
        if (zVarA == null) {
            str = "null == descriptor";
        } else {
            BluetoothGattCharacteristic bluetoothGattCharacteristicC = tVar.c();
            BluetoothGattDescriptor bluetoothGattDescriptorB = zVarA.b();
            int properties = bluetoothGattCharacteristicC.getProperties();
            if (u.Indicate.a(properties)) {
                if (z) {
                    aa.a("Enable indication.");
                    bArr = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
                } else {
                    bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
                }
                if (!bluetoothGattDescriptorB.setValue(bArr)) {
                    str = "Desc set value failed.";
                } else if (!a(bluetoothGattCharacteristicC, z)) {
                    str = "setCharacteristicNotification() failed.";
                } else {
                    if (!b(bluetoothGattDescriptorB)) {
                        return true;
                    }
                    str = "writeDescriptor() failed.";
                }
            } else if (u.Notify.a(properties)) {
                if (z) {
                    aa.a("Enable notification.");
                    bArr = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
                } else {
                    bArr = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
                }
                if (!bluetoothGattDescriptorB.setValue(bArr)) {
                    str = "Desc set value failed.";
                } else if (!a(bluetoothGattCharacteristicC, z)) {
                    str = "setCharacteristicNotification() failed.";
                } else {
                    if (!b(bluetoothGattDescriptorB)) {
                        return true;
                    }
                    str = "writeDescriptor() failed.";
                }
            } else {
                str = "Notification unsupported.";
            }
        }
        aa.b(str);
        return false;
    }
}
