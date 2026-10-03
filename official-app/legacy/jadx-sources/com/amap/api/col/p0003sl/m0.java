package com.amap.api.col.p0003sl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.amap.api.maps.AMapException;
import com.oplus.aiunit.vision.c2n;
import com.oplus.aiunit.vision.q3n;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class m0 extends i0 {
    public static m0 i;
    public q0 g;
    public Handler h;

    public static class a extends Handler {
        public /* synthetic */ a(Looper looper, byte b) {
            this(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            try {
                int i = message.what;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public a(Looper looper) {
            super(looper);
        }

        public a() {
        }
    }

    public m0(boolean z) {
        if (z) {
            try {
                this.g = q0.i(new o0.b().c("amap-netmanger-threadpool-%d").h());
            } catch (Throwable th) {
                c2n.r(th, "NetManger", "NetManger1");
                th.printStackTrace();
                return;
            }
        }
        if (Looper.myLooper() == null) {
            this.h = new a(Looper.getMainLooper(), (byte) 0);
        } else {
            this.h = new a();
        }
    }

    public static synchronized m0 l(boolean z) {
        try {
            m0 m0Var = i;
            if (m0Var == null) {
                i = new m0(z);
            } else if (z && m0Var.g == null) {
                m0Var.g = q0.i(new o0.b().c("amap-netmanger-threadpool-%d").h());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return i;
    }

    public static Map<String, String> m(la laVar, la.b bVar, int i2) throws ik {
        try {
            i0.k(laVar);
            laVar.setDegradeType(bVar);
            laVar.setReal_max_timeout(i2);
            return new k0().j(laVar);
        } catch (ik e2) {
            throw e2;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new ik(AMapException.ERROR_UNKNOWN);
        }
    }

    public static m0 n() {
        return l(true);
    }

    public static q3n o(la laVar, la.b bVar, int i2) throws ik {
        try {
            i0.k(laVar);
            laVar.setDegradeType(bVar);
            laVar.setReal_max_timeout(i2);
            return new k0().q(laVar);
        } catch (ik e2) {
            throw e2;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new ik(AMapException.ERROR_UNKNOWN);
        }
    }

    public static m0 p() {
        return l(false);
    }

    @Deprecated
    public static Map<String, String> q(la laVar, boolean z) throws ik {
        i0.k(laVar);
        laVar.setHttpProtocol(z ? la.c.HTTPS : la.c.HTTP);
        Map<String, String> mapM = null;
        long jElapsedRealtime = 0;
        boolean z2 = false;
        if (i0.g(laVar)) {
            boolean zI = i0.i(laVar);
            try {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                mapM = m(laVar, i0.c(laVar, zI), i0.h(laVar, zI));
            } catch (ik e2) {
                if (!zI) {
                    throw e2;
                }
                z2 = true;
            }
        }
        return mapM == null ? m(laVar, i0.f(laVar, z2), i0.a(laVar, jElapsedRealtime)) : mapM;
    }

    public static q3n r(la laVar) throws ik {
        return s(laVar, laVar.isHttps());
    }

    @Deprecated
    public static q3n s(la laVar, boolean z) throws ik {
        byte[] bArr;
        i0.k(laVar);
        laVar.setHttpProtocol(z ? la.c.HTTPS : la.c.HTTP);
        q3n q3nVarO = null;
        long jElapsedRealtime = 0;
        boolean z2 = false;
        if (i0.g(laVar)) {
            boolean zI = i0.i(laVar);
            try {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                q3nVarO = o(laVar, i0.c(laVar, zI), i0.h(laVar, zI));
            } catch (ik e2) {
                if ((e2.f() == 21 && laVar.getDegradeAbility() == la.a.INTERRUPT_IO) || !zI) {
                    throw e2;
                }
                z2 = true;
            }
        }
        return (q3nVarO == null || (bArr = q3nVarO.a) == null || bArr.length <= 0) ? o(laVar, i0.f(laVar, z2), i0.a(laVar, jElapsedRealtime)) : q3nVarO;
    }
}
