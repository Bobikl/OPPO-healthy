package com.heytap.accessory.sdp.endpoint;

import android.os.Handler;
import android.util.ArrayMap;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.utils.HexUtils;
import com.heytap.accessory.utils.buffer.Buffer;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class c {
    public static com.heytap.accessory.connectivity.core.interfaces.a e;
    public final com.heytap.accessory.connectivity.c a = com.heytap.accessory.connectivity.c.b();
    public static final Object b = new Object();
    public static final String c = c.class.getSimpleName() + " - epitrack";
    public static com.heytap.accessory.connectivity.interfaces.a d = new a();
    public static com.heytap.accessory.sdp.endpoint.state.e f = new b();
    public static Map<Long, d> g = new ArrayMap();
    public static com.heytap.accessory.connectivity.interfaces.b h = new c();

    public class b implements com.heytap.accessory.sdp.endpoint.state.e {
        @Override // com.heytap.accessory.sdp.endpoint.state.e
        public void a(com.heytap.accessory.base.bean.b bVar, int i) {
            c.e.a(bVar, i);
        }

        @Override // com.heytap.accessory.sdp.endpoint.state.e
        public void b(com.heytap.accessory.base.bean.b bVar) {
            com.heytap.accessory.base.logging.a.c(c.c, "openConnection to CM");
            f.a.a.b(bVar, c.d);
        }

        @Override // com.heytap.accessory.sdp.endpoint.state.e
        public void c(com.heytap.accessory.base.bean.b bVar) {
            f.a.a.a(bVar, c.d);
        }

        @Override // com.heytap.accessory.sdp.endpoint.state.e
        public void d(com.heytap.accessory.base.bean.b bVar) {
            c.e.c(bVar);
        }

        @Override // com.heytap.accessory.sdp.endpoint.state.e
        public void a(com.heytap.accessory.base.bean.b bVar, com.heytap.accessory.sdp.endpoint.d dVar, int i) {
            f.a.d(bVar.l());
            if (!f.a.e(bVar.l())) {
                com.heytap.accessory.base.logging.a.e(c.c, "Received peerDescriptionSuccess after Timeout for AccId: " + bVar.l() + " Returning...");
                return;
            }
            if (dVar != null) {
                com.heytap.accessory.base.bean.b bVarD = com.heytap.accessory.connectivity.core.b.d(bVar.p(), bVar.h(), bVar.F());
                String str = c.c;
                com.heytap.accessory.base.logging.a.a(str, "[epiparamTrack]pd success, oldAcc: " + bVarD);
                com.heytap.accessory.base.logging.a.a(str, "[epiparamTrack] newAcc: " + bVar);
                com.heytap.accessory.base.logging.a.a(str, "[epiparamTrack] modifiedEpi: " + dVar);
                if (bVarD == null) {
                    bVar.p(dVar.l());
                    bVar.e(dVar.a());
                    bVar.i(dVar.n());
                    bVar.k(dVar.g());
                    bVar.m(dVar.m());
                    bVar.e(dVar.q());
                    bVar.n(dVar.r());
                    bVar.b(dVar.b());
                    bVar.a(dVar.b());
                    bVar.j(dVar.k());
                    bVar.k(dVar.s());
                    bVar.g(dVar.j());
                    bVar.d(dVar.e());
                    bVar.j(dVar.o());
                    bVar.c(dVar.d());
                    bVar.c(dVar.c() == 1);
                    bVar.d(dVar.h());
                    bVar.f(dVar.f());
                } else {
                    bVar.p(bVarD.H());
                    bVar.e(bVarD.c());
                    bVar.i(bVarD.v());
                    bVar.k(bVarD.y());
                    bVar.m(bVarD.B());
                    bVar.e(bVarD.C());
                    bVar.n(bVarD.D());
                    bVar.b(bVarD.g());
                    bVar.a(bVarD.f());
                    bVar.j(bVarD.s());
                    bVar.k(bVarD.G());
                    bVar.g(bVarD.p());
                    bVar.d(bVarD.k());
                    bVar.j(bVarD.w());
                    bVar.g(bVarD.m());
                    bVar.c(bVarD.i());
                    bVar.c(bVarD.L());
                    bVar.d(bVarD.o());
                    bVar.f(bVarD.n());
                    bVar.b(true);
                }
            }
            if (bVar.w() != -1) {
                com.heytap.accessory.base.logging.a.a(c.c, "Local profile count = " + bVar.m() + ", remote profile count =  " + bVar.w());
                if (bVar.w() != bVar.m()) {
                    bVar.f(bVar.w() < bVar.m());
                } else {
                    bVar.f(i == 1);
                }
            } else {
                com.heytap.accessory.base.logging.a.a(c.c, "accessory.getServiceCount() ==0, Local profile count = " + bVar.m() + ", remote profile count =  " + bVar.w());
                bVar.f(false);
            }
            bVar.h(i);
            c.e.b(bVar);
        }

        @Override // com.heytap.accessory.sdp.endpoint.state.e
        public void b(long j) {
            f.a.e(j);
            f.a.d(j);
            c.f(Long.valueOf(j));
        }

        @Override // com.heytap.accessory.sdp.endpoint.state.e
        public void a(com.heytap.accessory.message.b bVar) {
            if (f.a.a.a(bVar.a(), bVar.e(), bVar) != 0) {
                com.heytap.accessory.base.logging.a.b(c.c, "sendMessage failed");
            }
        }

        @Override // com.heytap.accessory.sdp.endpoint.state.e
        public void a(long j) {
            f.a.a.b(j);
        }

        @Override // com.heytap.accessory.sdp.endpoint.state.e
        public void a(com.heytap.accessory.base.bean.b bVar) {
            f.a.a.b(bVar);
        }
    }

    public class c implements com.heytap.accessory.connectivity.interfaces.b {
        @Override // com.heytap.accessory.connectivity.interfaces.b
        public void a(int i, com.heytap.accessory.base.bean.b bVar, int i2) {
        }

        @Override // com.heytap.accessory.connectivity.interfaces.b
        public void a(com.heytap.accessory.connectivity.params.c cVar, int i, int i2) {
        }

        @Override // com.heytap.accessory.connectivity.interfaces.b
        public void a(com.heytap.accessory.base.bean.b bVar, int i) {
            com.heytap.accessory.base.logging.a.c(c.c, "Connection accepted on accessory address:" + HexUtils.hideAddress(bVar.d()) + ", accessory connectType:" + bVar.h());
            com.heytap.accessory.misc.utils.g.b(bVar.d(), "SERVER");
            c.e.d(bVar);
        }
    }

    public static class d {
        public h a;
        public g b;
        public e c;

        public d(h hVar, g gVar, e eVar) {
            this.a = hVar;
            this.b = gVar;
            this.c = eVar;
        }
    }

    public static final class e implements Runnable {
        public long a;

        public e(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = c.c;
            com.heytap.accessory.base.logging.a.e(str, "send retry pd message when not receive pd: " + this.a);
            h hVarD = c.d(Long.valueOf(this.a));
            if (hVarD == null) {
                com.heytap.accessory.base.logging.a.c(str, "Accessory " + this.a + " already cleaned up!");
                return;
            }
            com.heytap.accessory.base.bean.b bVarB = hVarD.b();
            if (bVarB.A() == 3) {
                f.a.b(hVarD);
                return;
            }
            com.heytap.accessory.base.logging.a.e(str, "WARNING! Ignoring timer expiry in Accessory state " + bVarB.A());
        }
    }

    public static final class f {
        public static final c a = new c();
    }

    public static final class g implements Runnable {
        public long a;

        public g(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = c.c;
            com.heytap.accessory.base.logging.a.e(str, "PD Timer Expired! AccId: " + this.a);
            h hVarD = c.d(Long.valueOf(this.a));
            if (hVarD == null) {
                com.heytap.accessory.base.logging.a.d(str, "Accessory " + this.a + " already cleaned up!");
                return;
            }
            com.heytap.accessory.base.bean.b bVarB = hVarD.b();
            if (bVarB.A() != 3) {
                com.heytap.accessory.base.logging.a.e(str, "WARNING! Ignoring timer expiry in Accessory state " + bVarB.A());
                return;
            }
            com.heytap.accessory.base.logging.a.e(str, "Failed to exchange PD. Closing the connection for AccId: " + this.a);
            c.f(Long.valueOf(this.a));
            f.a.a(hVarD);
            c.f.a(bVarB, ConnectConstant.ERROR_DISCOVERY_SELF_PEER_DESCRIPTION_FAILED);
        }
    }

    public static d f(Long l) {
        d dVarRemove;
        synchronized (b) {
            dVarRemove = g.remove(l);
        }
        return dVarRemove;
    }

    public void e(com.heytap.accessory.base.bean.b bVar) {
        com.heytap.accessory.sdp.endpoint.state.d dVar = new com.heytap.accessory.sdp.endpoint.state.d(f, bVar);
        a(Long.valueOf(bVar.l()), dVar);
        c(bVar.l());
        dVar.b(bVar);
    }

    public class a implements com.heytap.accessory.connectivity.interfaces.a {
        @Override // com.heytap.accessory.connectivity.interfaces.a
        public int a(long j, int i, Buffer buffer) {
            h hVarD = c.d(Long.valueOf(j));
            if (hVarD != null) {
                return hVarD.a(j, buffer);
            }
            return -1;
        }

        @Override // com.heytap.accessory.connectivity.interfaces.a
        public void a(long j, int i, long j2, com.heytap.accessory.message.b bVar) {
            h hVarD = c.d(Long.valueOf(j));
            if (hVarD != null) {
                hVarD.a(bVar);
            }
        }

        @Override // com.heytap.accessory.connectivity.interfaces.a
        public void a(long j, int i, int i2, int i3) {
            com.heytap.accessory.base.logging.a.a(c.c, "Connection state changed. accessoryId:" + j + " status:" + i2);
            h hVarD = c.d(Long.valueOf(j));
            if (hVarD != null) {
                if (i2 != 2) {
                    f.a.e(j);
                    f.a.d(j);
                } else {
                    f.a.c(j);
                    f.a.b(j);
                }
                hVarD.a(j, i2, i3);
            }
        }
    }

    public boolean d(com.heytap.accessory.base.bean.b bVar) {
        synchronized (b) {
            Iterator<d> it = g.values().iterator();
            while (it.hasNext()) {
                com.heytap.accessory.base.bean.b bVarB = it.next().a.b();
                if (bVarB != null && bVarB.d().equals(bVar.d()) && bVarB.h() == bVar.h()) {
                    com.heytap.accessory.base.logging.a.c(c, "Accessory with address = " + PlatformUtils.getAddrforLog(bVar.d()) + " and conn Flags = " + bVar.h() + " found in map");
                    return true;
                }
            }
            return false;
        }
    }

    public void c(com.heytap.accessory.base.bean.b bVar) {
        this.a.b(bVar);
    }

    public boolean b(com.heytap.accessory.base.bean.b bVar) {
        e(bVar.l());
        d(bVar.l());
        h hVarD = d(Long.valueOf(bVar.l()));
        if (hVarD != null) {
            return a(hVarD);
        }
        c(bVar);
        return true;
    }

    public final boolean c(long j) {
        g gVarE = e(Long.valueOf(j));
        if (gVarE == null) {
            return false;
        }
        com.heytap.accessory.base.logging.a.a(c, "Starting PD timer for AccId: " + j);
        d().postDelayed(gVarE, 30000L);
        return true;
    }

    public static c a(com.heytap.accessory.connectivity.core.interfaces.a aVar) {
        e = aVar;
        return f.a;
    }

    public final boolean e(long j) {
        g gVarE = e(Long.valueOf(j));
        if (gVarE == null) {
            return false;
        }
        com.heytap.accessory.base.logging.a.a(c, "Stopping PD timer for AccId: " + j);
        d().removeCallbacks(gVarE);
        return true;
    }

    public static e c(Long l) {
        e eVar;
        synchronized (b) {
            d dVar = g.get(l);
            eVar = dVar != null ? dVar.c : null;
        }
        return eVar;
    }

    public void a(com.heytap.accessory.base.bean.b bVar) {
        com.heytap.accessory.sdp.endpoint.state.b bVar2 = new com.heytap.accessory.sdp.endpoint.state.b(f, bVar);
        a(Long.valueOf(bVar.l()), bVar2);
        a(bVar, bVar2);
    }

    public static g e(Long l) {
        g gVar;
        synchronized (b) {
            d dVar = g.get(l);
            gVar = dVar != null ? dVar.b : null;
        }
        return gVar;
    }

    public void b(h hVar) {
        ((com.heytap.accessory.sdp.endpoint.state.b) hVar).k();
    }

    public void a(com.heytap.accessory.base.bean.b bVar, h hVar) {
        hVar.a(bVar);
    }

    public void b(int i) {
        this.a.a(i);
    }

    public final boolean d(long j) {
        e eVarC = c(Long.valueOf(j));
        if (eVarC == null) {
            return false;
        }
        com.heytap.accessory.base.logging.a.a(c, "Stopping RETRY PD timer for AccId: " + j);
        d().removeCallbacks(eVarC);
        return true;
    }

    public boolean a(h hVar) {
        return hVar.a();
    }

    public final boolean b(long j) {
        e eVarC = c(Long.valueOf(j));
        if (eVarC == null) {
            return false;
        }
        com.heytap.accessory.base.logging.a.a(c, "Starting retry PD timer for AccId: " + j);
        d().postDelayed(eVarC, 15000L);
        return true;
    }

    public void a(long j) {
        h hVarD = d(Long.valueOf(j));
        if (hVarD != null) {
            hVarD.c();
        }
    }

    public static h d(Long l) {
        h hVar;
        synchronized (b) {
            d dVar = g.get(l);
            hVar = dVar != null ? dVar.a : null;
        }
        return hVar;
    }

    public boolean a(int i) {
        return this.a.a(i, h);
    }

    public static void a(Long l, h hVar) {
        synchronized (b) {
            g.put(l, new d(hVar, new g(l.longValue()), new e(l.longValue())));
        }
    }

    public Handler d() {
        return com.heytap.accessory.connectivity.core.b.d();
    }
}
