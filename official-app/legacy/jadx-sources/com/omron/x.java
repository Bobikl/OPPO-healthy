package com.omron;

import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.EnumMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class x extends es {
    private static final EnumMap<af, ag> C;

    @NonNull
    private ag A;

    @NonNull
    private af B;
    private final er f;
    private final er g;
    private final er h;
    private final er i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final er f9098j;
    private final er k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final er f9099l;
    private final er m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final er f9100n;
    private final er o;
    private final er p;
    private final er q;
    private final er r;
    private final er s;
    private final er t;
    private final er u;

    @NonNull
    private final WeakReference<ad> v;

    @NonNull
    private final d w;

    @NonNull
    private final w x;
    private int y;
    private boolean z;

    public class a implements Runnable {
        final /* synthetic */ en a;

        public a(en enVar) {
            this.a = enVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a(x.this.A);
            this.a.c();
        }
    }

    public class b implements Runnable {
        final /* synthetic */ Bundle a;

        public b(Bundle bundle) {
            this.a = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.x.a(this.a);
        }
    }

    public static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[y.a.values().length];
            a = iArr;
            try {
                iArr[y.a.Pin.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[y.a.Pin16Digits.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[y.a.Passkey.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[y.a.PasskeyConfirmation.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[y.a.Consent.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[y.a.DisplayPasskey.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[y.a.DisplayPin.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[y.a.OobConsent.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public interface d {
        void a();

        void a(@NonNull af afVar);

        void a(@NonNull ag agVar);

        void b();

        void c();
    }

    public class e extends er {
        private boolean a;

        private e() {
        }

        private void c() {
            if (((ad) x.this.v.get()).p()) {
                ((ad) x.this.v.get()).e();
                return;
            }
            if (com.omron.p.h.Bonding == ((ad) x.this.v.get()).h()) {
                ((ad) x.this.v.get()).a();
            } else if (((ad) x.this.v.get()).n()) {
                if (x.this.x.j()) {
                    ((ad) x.this.v.get()).q();
                }
                ((ad) x.this.v.get()).b();
                x.this.d(-268435455);
            }
        }

        private void d() {
            if (!e()) {
                c();
                return;
            }
            if (!this.a && x.this.x.h()) {
                x xVar = x.this;
                xVar.c(xVar.r);
            } else {
                aa.f("Connection finished because not request a retry.");
                x xVar2 = x.this;
                xVar2.c(xVar2.u);
            }
        }

        private boolean e() {
            String str;
            if (((ad) x.this.v.get()).p()) {
                str = "Gatt disconnecting.";
            } else if (com.omron.p.h.Bonding == ((ad) x.this.v.get()).h()) {
                str = "Bond process canceling.";
            } else {
                if (!((ad) x.this.v.get()).n()) {
                    aa.c("Cleanup completed.");
                    return true;
                }
                str = "Gatt closing.";
            }
            aa.c(str);
            return false;
        }

        @Override // com.omron.er
        public void a() {
            x.this.c(-268435455);
            x.this.c(-268435454);
        }

        public /* synthetic */ e(x xVar, a aVar) {
            this();
        }

        @Override // com.omron.er
        public void a(Object[] objArr) {
            x.this.a(af.CleanupConnection);
            this.a = 1 == ((Integer) objArr[0]).intValue();
            d();
            x.this.a(-268435454, 15000L);
        }

        @Override // com.omron.er
        public boolean a(@NonNull Message message) {
            int i = message.what;
            if (i != -268435455) {
                if (i == -268435454) {
                    x xVar = x.this;
                    xVar.c(xVar.u);
                    return true;
                }
                if (i != 268439556 && i != 268439560) {
                    return false;
                }
            }
            d();
            return true;
        }
    }

    public class f extends er {
        private f() {
        }

        @Override // com.omron.er
        public void a(Object[] objArr) {
            x.this.a(af.ConnectCanceled);
            x.this.w.c();
        }

        public /* synthetic */ f(x xVar, a aVar) {
            this();
        }
    }

    public class g extends er {
        private g() {
        }

        private boolean c() {
            String str;
            if (((ad) x.this.v.get()).p()) {
                str = "Gatt disconnecting.";
            } else {
                if (com.omron.p.h.Bonding != ((ad) x.this.v.get()).h()) {
                    aa.c("Teardown completed.");
                    return true;
                }
                str = "Bond process canceling.";
            }
            aa.c(str);
            return false;
        }

        private void d() {
            if (c()) {
                x xVar = x.this;
                xVar.c(xVar.s);
            } else if (((ad) x.this.v.get()).p()) {
                ((ad) x.this.v.get()).e();
            } else if (com.omron.p.h.Bonding == ((ad) x.this.v.get()).h()) {
                ((ad) x.this.v.get()).a();
            }
        }

        @Override // com.omron.er
        public void a() {
            x.this.c(-268435455);
        }

        public /* synthetic */ g(x xVar, a aVar) {
            this();
        }

        @Override // com.omron.er
        public void a(Object[] objArr) {
            x.this.a(af.ConnectCanceling);
            d();
            x.this.a(-268435455, 15000L);
        }

        @Override // com.omron.er
        public boolean a(@NonNull Message message) {
            int i = message.what;
            if (i == -268435455) {
                aa.b("Connect cancel timeout.");
                x xVar = x.this;
                xVar.c(xVar.s);
                return true;
            }
            if (i != 268439556 && i != 268439560) {
                return false;
            }
            d();
            return true;
        }
    }

    public class h extends er {
        private h() {
        }

        @Override // com.omron.er
        public void a(Object[] objArr) {
            x.this.a(af.ConnectStarting);
            x.this.z = false;
            if (w.c.UsedBeforeConnectionProcessEveryTime == x.this.x.c() && ((ad) x.this.v.get()).o()) {
                x xVar = x.this;
                xVar.c(xVar.f9099l);
            } else if (w.a.UsedBeforeGattConnection != x.this.x.a() || ((ad) x.this.v.get()).o()) {
                x xVar2 = x.this;
                xVar2.c(xVar2.f9100n);
            } else {
                x xVar3 = x.this;
                xVar3.c(xVar3.m);
            }
        }

        public /* synthetic */ h(x xVar, a aVar) {
            this();
        }
    }

    public class i extends er {
        private i() {
        }

        @Override // com.omron.er
        public void a(Object[] objArr) {
            x.this.a(af.Connected);
            x.this.w.b();
        }

        public /* synthetic */ i(x xVar, a aVar) {
            this();
        }

        @Override // com.omron.er
        public boolean a(@NonNull Message message) {
            int i = message.what;
            if (i == 268435458) {
                x.this.w.c();
                return true;
            }
            if (i == 268435459) {
                x xVar = x.this;
                xVar.c(xVar.f9098j);
                return true;
            }
            if (i != 268439556 && i != 268439560) {
                return false;
            }
            x xVar2 = x.this;
            xVar2.c(xVar2.f9098j);
            return true;
        }
    }

    public class j extends er {
        private j() {
        }

        private void c() {
            if (x.this.z) {
                aa.f("Pairing canceled or timeout or invalid PIN input.");
                x xVar = x.this;
                xVar.a(xVar.q, new Object[]{0});
                return;
            }
            aa.b("Connection failed.");
            x xVar2 = x.this;
            xVar2.a(xVar2.q, new Object[]{1});
        }

        @Override // com.omron.er
        public void a(Object[] objArr) {
            x.this.y = 0;
        }

        public /* synthetic */ j(x xVar, a aVar) {
            this();
        }

        @Override // com.omron.er
        public boolean a(@NonNull Message message) {
            int i = message.what;
            if (i == 268435459) {
                x xVar = x.this;
                xVar.c(xVar.p);
                return true;
            }
            if (i != 268439560 && i != 268439555 && i != 268439556) {
                return false;
            }
            c();
            return true;
        }
    }

    public class k extends er {
        private k() {
        }

        @Override // com.omron.er
        public void a(Object[] objArr) {
            x.this.a(af.ConnectionFailed);
            x.this.w.c();
        }

        public /* synthetic */ k(x xVar, a aVar) {
            this();
        }
    }

    public class l extends er {
        private l() {
        }

        @Override // com.omron.er
        public void a() {
            x.this.c(-268435455);
        }

        public /* synthetic */ l(x xVar, a aVar) {
            this();
        }

        @Override // com.omron.er
        public void a(Object[] objArr) {
            x.this.a(af.ConnectionRetryReady);
            aa.b("Connection failed because retry count reaches the maximum value.");
            x xVar = x.this;
            xVar.c(xVar.u);
        }

        @Override // com.omron.er
        public boolean a(@NonNull Message message) {
            if (message.what != -268435455) {
                return false;
            }
            aa.f("Connection retry. count:" + x.this.y);
            x xVar = x.this;
            xVar.c(xVar.k);
            return true;
        }
    }

    public class m extends er {
        private m() {
        }

        @Override // com.omron.er
        public boolean a(@NonNull Message message) {
            return true;
        }

        public /* synthetic */ m(x xVar, a aVar) {
            this();
        }
    }

    public class n extends er {
        private n() {
        }

        @Override // com.omron.er
        public void a(Object[] objArr) {
            x.this.a(af.Disconnected);
            x.this.w.a();
        }

        public /* synthetic */ n(x xVar, a aVar) {
            this();
        }
    }

    public class o extends er {
        private o() {
        }

        private boolean c() {
            String str;
            if (((ad) x.this.v.get()).p()) {
                str = "Gatt disconnecting.";
            } else {
                if (com.omron.p.h.Bonding != ((ad) x.this.v.get()).h()) {
                    aa.c("Teardown completed.");
                    return true;
                }
                str = "Bond process canceling.";
            }
            aa.c(str);
            return false;
        }

        private void d() {
            if (c()) {
                x xVar = x.this;
                xVar.c(xVar.t);
            } else if (((ad) x.this.v.get()).p()) {
                ((ad) x.this.v.get()).e();
            } else if (com.omron.p.h.Bonding == ((ad) x.this.v.get()).h()) {
                ((ad) x.this.v.get()).a();
            }
        }

        @Override // com.omron.er
        public void a() {
            x.this.c(-268435455);
        }

        public /* synthetic */ o(x xVar, a aVar) {
            this();
        }

        @Override // com.omron.er
        public void a(Object[] objArr) {
            x.this.a(af.Disconnecting);
            d();
            x.this.a(-268435455, 15000L);
        }

        @Override // com.omron.er
        public boolean a(@NonNull Message message) {
            int i = message.what;
            if (i == -268435455) {
                aa.b("Disconnection timeout.");
                x xVar = x.this;
                xVar.c(xVar.t);
                return true;
            }
            if (i == 268435458) {
                x.this.w.c();
                return true;
            }
            if (i != 268439556 && i != 268439560) {
                return false;
            }
            d();
            return true;
        }
    }

    public class p extends er {
        private boolean a;

        private p() {
        }

        private void c() {
            if (!((ad) x.this.v.get()).p()) {
                aa.c("Gatt connecting.");
                return;
            }
            if (x.this.a(-268435454)) {
                aa.c("Wait connection stabled.");
                return;
            }
            if (!this.a && !((ad) x.this.v.get()).o()) {
                aa.c("Wait bonded.");
                return;
            }
            aa.c("Gatt connection completed.");
            x xVar = x.this;
            xVar.c(xVar.o);
        }

        @Override // com.omron.er
        public void a() {
            x.this.c(-268435455);
            x.this.c(-268435454);
        }

        public /* synthetic */ p(x xVar, a aVar) {
            this();
        }

        @Override // com.omron.er
        public void a(Object[] objArr) {
            x.this.a(af.GattConnecting);
            this.a = false;
            x.this.c();
            if (((ad) x.this.v.get()).c()) {
                x.this.a(-268435455, 15000L);
                return;
            }
            x xVar = x.this;
            xVar.a(xVar.q, new Object[]{1});
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.omron.er
        public boolean a(@NonNull Message message) {
            switch (message.what) {
                case -268435455:
                    aa.b("Gatt connection timeout.");
                    x xVar = x.this;
                    xVar.a(xVar.q, new Object[]{1});
                    return true;
                case -268435454:
                    if (com.omron.p.h.None == ((ad) x.this.v.get()).h()) {
                        this.a = true;
                        aa.c("Not been pairing in the connection process.");
                    }
                    c();
                    return true;
                case 268439553:
                    x.this.c(-268435455);
                    x.this.z = true;
                    x.this.a((y.a) message.obj);
                    return true;
                case 268439554:
                    x.this.z = false;
                    c();
                    return true;
                case 268439555:
                    return true;
                case 268439559:
                    x.this.c(-268435455);
                    x.this.a(-268435454, x.this.x.i() ? x.this.x.d() : 0L);
                    return true;
                default:
                    return false;
            }
        }
    }

    public class q extends er {
        private q() {
        }

        @Override // com.omron.er
        public void a() {
            x.this.c(-268435455);
        }

        public /* synthetic */ q(x xVar, a aVar) {
            this();
        }

        @Override // com.omron.er
        public void a(Object[] objArr) {
            x.this.a(af.PairRemoving);
            if (((ad) x.this.v.get()).r()) {
                x.this.a(-268435455, 5000L);
                return;
            }
            x xVar = x.this;
            xVar.a(xVar.q, new Object[]{1});
        }

        @Override // com.omron.er
        public boolean a(@NonNull Message message) {
            int i = message.what;
            if (i == -268435455) {
                aa.b("timeout.");
                x xVar = x.this;
                xVar.a(xVar.q, new Object[]{1});
            } else {
                if (i != 268439556) {
                    return false;
                }
                x.this.c(-268435455);
                aa.c("Pair removed.");
                if (w.a.UsedBeforeGattConnection != x.this.x.a() || ((ad) x.this.v.get()).o()) {
                    x xVar2 = x.this;
                    xVar2.c(xVar2.f9100n);
                } else {
                    x xVar3 = x.this;
                    xVar3.c(xVar3.m);
                }
            }
            return true;
        }
    }

    public class r extends er {
        private r() {
        }

        private void c() {
            if (!((ad) x.this.v.get()).o()) {
                aa.c("Wait bonded.");
                return;
            }
            aa.c("Pairing completed.");
            boolean zP = ((ad) x.this.v.get()).p();
            x xVar = x.this;
            if (zP) {
                xVar.c(xVar.i);
            } else {
                xVar.c(xVar.f9100n);
            }
        }

        @Override // com.omron.er
        public void a() {
            x.this.c(-268435455);
        }

        public /* synthetic */ r(x xVar, a aVar) {
            this();
        }

        @Override // com.omron.er
        public void a(Object[] objArr) {
            x.this.a(af.Pairing);
            x.this.c();
            if (((ad) x.this.v.get()).d()) {
                x.this.a(-268435455, 15000L);
                return;
            }
            x xVar = x.this;
            xVar.a(xVar.q, new Object[]{1});
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.omron.er
        public boolean a(@NonNull Message message) {
            int i = message.what;
            if (i == -268435455) {
                aa.b("Pairing timeout.");
                x xVar = x.this;
                xVar.a(xVar.q, new Object[]{1});
            } else {
                switch (i) {
                    case 268439553:
                        x.this.c(-268435455);
                        x.this.z = true;
                        x.this.a((y.a) message.obj);
                        break;
                    case 268439554:
                        x.this.c(-268435455);
                        x.this.z = false;
                        c();
                        break;
                    case 268439555:
                        break;
                    default:
                        return false;
                }
            }
            return true;
        }
    }

    public class s extends er {
        private int a;

        private s() {
        }

        private boolean c() {
            String str;
            List<BluetoothGattService> listM = ((ad) x.this.v.get()).m();
            if (listM.size() > 0) {
                for (BluetoothGattService bluetoothGattService : listM) {
                    if (bluetoothGattService.getCharacteristics() == null) {
                        str = "null == service.getCharacteristics()";
                    } else if (bluetoothGattService.getCharacteristics().size() <= 0) {
                        str = "0 >= service.getCharacteristics().size()";
                    }
                }
                return true;
            }
            str = "0 >= services.size()";
            aa.b(str);
            return false;
        }

        @Override // com.omron.er
        public void a() {
            x.this.c(-268435455);
            x.this.c(-268435454);
            x.this.c(-268435453);
            x.this.c(-268435452);
        }

        public /* synthetic */ s(x xVar, a aVar) {
            this();
        }

        @Override // com.omron.er
        public void a(Object[] objArr) {
            x.this.a(af.ServiceDiscovering);
            this.a = 0;
            x.this.d(((ad) x.this.v.get()).m().size() == 0 ? -268435455 : 268439561);
        }

        @Override // com.omron.er
        public boolean a(@NonNull Message message) {
            x xVar;
            int i;
            String str;
            int i2 = message.what;
            if (i2 == 268439561) {
                x.this.c(-268435453);
                x.this.c(-268435454);
                if (c()) {
                    aa.c("Discover service success.");
                    if (w.a.UsedAfterServicesDiscovered != x.this.x.a() || ((ad) x.this.v.get()).o()) {
                        x xVar2 = x.this;
                        xVar2.c(xVar2.i);
                    } else {
                        x xVar3 = x.this;
                        xVar3.c(xVar3.m);
                    }
                } else {
                    aa.b("Detected abnormality in services.");
                    xVar = x.this;
                    i = -268435452;
                    xVar.d(i);
                }
            } else if (i2 != 268439562) {
                switch (i2) {
                    case -268435455:
                        x.this.a(-268435453, 30000L);
                        x.this.d(-268435454);
                        break;
                    case -268435454:
                        ((ad) x.this.v.get()).f();
                        x.this.a(-268435454, 5000L);
                        break;
                    case -268435453:
                        str = "Discover service timeout.";
                        aa.b(str);
                        x.this.d(268439562);
                        break;
                    case -268435452:
                        int i3 = this.a;
                        if (2 <= i3) {
                            str = "Discover service failed because retry count reaches the maximum value.";
                            aa.b(str);
                            x.this.d(268439562);
                        } else {
                            this.a = i3 + 1;
                            aa.f("Discover service retry. count:" + this.a);
                            xVar = x.this;
                            i = -268435455;
                            xVar.d(i);
                        }
                        break;
                    default:
                        return false;
                }
            } else {
                x.this.c(-268435453);
                x.this.c(-268435454);
                aa.b("Discover service failure.");
                x xVar4 = x.this;
                xVar4.a(xVar4.q, new Object[]{1});
            }
            return true;
        }
    }

    public class t extends er {
        private t() {
        }

        @Override // com.omron.er
        public void a(Object[] objArr) {
            if (((ad) x.this.v.get()).n()) {
                if (x.this.x.j()) {
                    ((ad) x.this.v.get()).q();
                }
                ((ad) x.this.v.get()).b();
            }
        }

        public /* synthetic */ t(x xVar, a aVar) {
            this();
        }

        @Override // com.omron.er
        public boolean a(@NonNull Message message) {
            if (message.what != 268435458) {
                return false;
            }
            x xVar = x.this;
            xVar.c(xVar.k);
            return true;
        }
    }

    static {
        EnumMap<af, ag> enumMap = new EnumMap<>(af.class);
        C = enumMap;
        af afVar = af.Unconnected;
        ag agVar = ag.Disconnected;
        enumMap.put(afVar, agVar);
        af afVar2 = af.ConnectStarting;
        ag agVar2 = ag.Connecting;
        enumMap.put(afVar2, agVar2);
        enumMap.put(af.PairRemoving, agVar2);
        enumMap.put(af.Pairing, agVar2);
        enumMap.put(af.GattConnecting, agVar2);
        enumMap.put(af.ServiceDiscovering, agVar2);
        enumMap.put(af.ConnectCanceling, agVar2);
        enumMap.put(af.CleanupConnection, agVar2);
        enumMap.put(af.ConnectionRetryReady, agVar2);
        enumMap.put(af.ConnectCanceled, agVar);
        enumMap.put(af.ConnectionFailed, agVar);
        enumMap.put(af.Connected, ag.Connected);
        enumMap.put(af.Disconnecting, ag.Disconnecting);
        enumMap.put(af.Disconnected, agVar);
    }

    public x(@NonNull ad adVar, @NonNull d dVar, @NonNull Looper looper) {
        super(x.class.getSimpleName(), looper);
        a aVar = null;
        m mVar = new m(this, aVar);
        this.f = mVar;
        t tVar = new t(this, aVar);
        this.g = tVar;
        j jVar = new j(this, aVar);
        this.h = jVar;
        i iVar = new i(this, aVar);
        this.i = iVar;
        o oVar = new o(this, aVar);
        this.f9098j = oVar;
        h hVar = new h(this, aVar);
        this.k = hVar;
        q qVar = new q(this, aVar);
        this.f9099l = qVar;
        r rVar = new r(this, aVar);
        this.m = rVar;
        p pVar = new p(this, aVar);
        this.f9100n = pVar;
        s sVar = new s(this, aVar);
        this.o = sVar;
        g gVar = new g(this, aVar);
        this.p = gVar;
        e eVar = new e(this, aVar);
        this.q = eVar;
        l lVar = new l(this, aVar);
        this.r = lVar;
        f fVar = new f(this, aVar);
        this.s = fVar;
        n nVar = new n(this, aVar);
        this.t = nVar;
        k kVar = new k(this, aVar);
        this.u = kVar;
        this.v = new WeakReference<>(adVar);
        this.w = dVar;
        this.x = new w();
        a(mVar);
        a(tVar, mVar);
        a(jVar, mVar);
        a(iVar, mVar);
        a(oVar, mVar);
        a(hVar, jVar);
        a(qVar, jVar);
        a(rVar, jVar);
        a(pVar, jVar);
        a(sVar, jVar);
        a(gVar, jVar);
        a(eVar, jVar);
        a(lVar, jVar);
        a(fVar, tVar);
        a(kVar, tVar);
        a(nVar, tVar);
        this.A = ag.Disconnected;
        this.B = af.Unconnected;
        b(tVar);
        b(aa.f8772c);
        a(true);
        b();
    }

    public ag d() {
        if (a().a()) {
            return this.A;
        }
        en enVar = new en();
        a().post(new a(enVar));
        enVar.b();
        return (ag) enVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        BluetoothManager bluetoothManager;
        if (this.x.e() && (bluetoothManager = (BluetoothManager) this.v.get().i().getSystemService("bluetooth")) != null) {
            bluetoothManager.getAdapter().startDiscovery();
            bluetoothManager.getAdapter().cancelDiscovery();
        }
    }

    public void a(@NonNull Bundle bundle) {
        if (a().a()) {
            this.x.a(bundle);
        } else {
            a().post(new b(bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull af afVar) {
        if (this.B == afVar) {
            return;
        }
        a(C.get(afVar));
        this.B = afVar;
        this.w.a(afVar);
    }

    public boolean e() {
        return ag.Connected == d();
    }

    private void a(@NonNull ag agVar) {
        if (this.A == agVar) {
            return;
        }
        this.A = agVar;
        this.w.a(agVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(y.a aVar) {
        int i2 = c.a[aVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (!this.x.f() || this.x.b().isEmpty()) {
                return;
            }
            this.v.get().c(this.x.b());
            return;
        }
        if (i2 == 3) {
            if (!this.x.f() || this.x.b().isEmpty()) {
                return;
            }
            this.v.get().b(this.x.b());
            return;
        }
        if (i2 != 4) {
            if (i2 != 5 || !this.x.g()) {
                return;
            }
        } else if (!this.x.g()) {
            return;
        }
        this.v.get().a(true);
    }
}
