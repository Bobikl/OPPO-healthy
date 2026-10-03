package com.amap.api.col.p0003sl;

import android.os.SystemClock;
import android.text.TextUtils;
import com.amap.api.maps.AMapException;
import com.oplus.aiunit.vision.q3n;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class i0 {
    public static int a = 0;
    public static String b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static HashMap<String, String> f738c;
    public static HashMap<String, String> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HashMap<String, String> f739e;
    public static i0 f;

    public interface a {
    }

    public i0() {
        e0.O();
    }

    public static int a(la laVar, long j2) {
        try {
            k(laVar);
            long jElapsedRealtime = 0;
            if (j2 != 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime() - j2;
            }
            int conntectionTimeout = laVar.getConntectionTimeout();
            if (laVar.getDegradeAbility() != la.a.FIX && laVar.getDegradeAbility() != la.a.SINGLE) {
                long j3 = conntectionTimeout;
                if (jElapsedRealtime < j3) {
                    long j4 = j3 - jElapsedRealtime;
                    if (j4 >= 1000) {
                        return (int) j4;
                    }
                }
                return Math.min(1000, laVar.getConntectionTimeout());
            }
            return conntectionTimeout;
        } catch (Throwable unused) {
            return 5000;
        }
    }

    public static i0 b() {
        if (f == null) {
            f = new i0();
        }
        return f;
    }

    public static la.b c(la laVar, boolean z) {
        if (laVar.getDegradeAbility() == la.a.FIX) {
            return la.b.FIX_NONDEGRADE;
        }
        if (laVar.getDegradeAbility() != la.a.SINGLE && z) {
            return la.b.FIRST_NONDEGRADE;
        }
        return la.b.NEVER_GRADE;
    }

    public static q3n d(la laVar) throws ik {
        return j(laVar, laVar.isHttps());
    }

    public static q3n e(la laVar, la.b bVar, int i) throws ik {
        try {
            k(laVar);
            laVar.setDegradeType(bVar);
            laVar.setReal_max_timeout(i);
            return new k0().x(laVar);
        } catch (ik e2) {
            throw e2;
        } catch (Throwable th) {
            th.printStackTrace();
            throw new ik(AMapException.ERROR_UNKNOWN);
        }
    }

    public static la.b f(la laVar, boolean z) {
        if (laVar.getDegradeAbility() == la.a.FIX) {
            return z ? la.b.FIX_DEGRADE_BYERROR : la.b.FIX_DEGRADE_ONLY;
        }
        return z ? la.b.DEGRADE_BYERROR : la.b.DEGRADE_ONLY;
    }

    public static boolean g(la laVar) throws ik {
        k(laVar);
        try {
            String ipv6url = laVar.getIPV6URL();
            if (TextUtils.isEmpty(ipv6url)) {
                return false;
            }
            String host = new URL(ipv6url).getHost();
            if (!TextUtils.isEmpty(laVar.getIPDNSName())) {
                host = laVar.getIPDNSName();
            }
            return e0.U(host);
        } catch (Throwable unused) {
            return true;
        }
    }

    public static int h(la laVar, boolean z) {
        try {
            k(laVar);
            int conntectionTimeout = laVar.getConntectionTimeout();
            int i = e0.f682e;
            return (laVar.getDegradeAbility() == la.a.FIX || laVar.getDegradeAbility() == la.a.SINGLE || conntectionTimeout < i || !z) ? conntectionTimeout : i;
        } catch (Throwable unused) {
            return 5000;
        }
    }

    public static boolean i(la laVar) throws ik {
        k(laVar);
        try {
            if (!g(laVar)) {
                return true;
            }
            if (laVar.getURL().equals(laVar.getIPV6URL()) || laVar.getDegradeAbility() == la.a.SINGLE || !e0.h) {
                return false;
            }
        } catch (Throwable unused) {
        }
        return true;
    }

    @Deprecated
    public static q3n j(la laVar, boolean z) throws ik {
        byte[] bArr;
        k(laVar);
        laVar.setHttpProtocol(z ? la.c.HTTPS : la.c.HTTP);
        q3n q3nVarE = null;
        long jElapsedRealtime = 0;
        boolean z2 = false;
        if (g(laVar)) {
            boolean zI = i(laVar);
            try {
                jElapsedRealtime = SystemClock.elapsedRealtime();
                q3nVarE = e(laVar, c(laVar, zI), h(laVar, zI));
            } catch (ik e2) {
                if ((e2.f() == 21 && laVar.getDegradeAbility() == la.a.INTERRUPT_IO) || !zI) {
                    throw e2;
                }
                z2 = true;
            }
        }
        return (q3nVarE == null || (bArr = q3nVarE.a) == null || bArr.length <= 0) ? e(laVar, f(laVar, z2), a(laVar, jElapsedRealtime)) : q3nVarE;
    }

    public static void k(la laVar) throws ik {
        if (laVar == null) {
            throw new ik("requeust is null");
        }
        if (laVar.getURL() == null || "".equals(laVar.getURL())) {
            throw new ik("request url is empty");
        }
    }
}
