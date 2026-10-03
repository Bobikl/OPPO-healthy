package com.oplus.aiunit.vision;

import com.oplus.drs.base.ChannelMode;
import com.oplus.drs.core.ratelimit.QuotaCheckResult;
import com.oplus.drs.core.ratelimit.QuotaType;
import com.oppo.obus.common.configmetadata.core.entity.common.MinCommonConfig;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public final class qaf {
    public static final long DEFAULT_EVENT_SIZE_BYTES = 1024;
    public volatile long a = 0;
    public volatile long b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, AtomicLong> f15705c = new ConcurrentHashMap();
    public final Map<String, Long> d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, AtomicLong> f15706e = new ConcurrentHashMap();
    public volatile long f = 0;
    public volatile String g = B();
    public final oaf h;
    public final ou3 i;

    public qaf(oaf oafVar, ou3 ou3Var) {
        this.h = oafVar;
        this.i = ou3Var;
        r();
    }

    public final void A(long j2, long j3) {
        String strB = B();
        Iterator<Map.Entry<String, Long>> it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            String[] strArrSplit = key.split(":");
            if (strArrSplit.length == 3) {
                if (strArrSplit[0].equals(strB)) {
                    String str = strArrSplit[1];
                    String str2 = strArrSplit[2];
                    QuotaType quotaType = QuotaType.INGEST;
                    if (!quotaType.name().equals(str2)) {
                        quotaType = QuotaType.UPLOAD;
                    }
                    long jQ = q(strB, str, quotaType);
                    long jP = naf.GLOBAL_APP_ID.equals(str) ? j3 : p(str);
                    if (jQ < jP) {
                        it.remove();
                        z6b.q("RateLimitManager", "refreshExceededCache: removed " + key + ", used=" + jQ + ", limit=" + jP);
                    }
                } else {
                    it.remove();
                }
            }
        }
    }

    public final String B() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        return String.format(Locale.US, "%04d%02d%02d", Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)));
    }

    public final void a(String str, String str2, QuotaType quotaType, long j2) {
        n(this.f15705c, b(str, str2, quotaType), 0L).addAndGet(j2);
    }

    public final String b(String str, String str2, QuotaType quotaType) {
        return str + ":" + str2 + ":" + quotaType.name();
    }

    public final void c() {
        String strB = B();
        if (strB.equals(this.g)) {
            return;
        }
        u(strB);
    }

    public QuotaCheckResult d(String str, int i) {
        if (str == null || str.isEmpty() || i <= 0 || w56.a() == ChannelMode.STANDALONE) {
            return null;
        }
        String strB = B();
        if (!strB.equals(this.g)) {
            u(strB);
        }
        String strB2 = b(strB, str, QuotaType.INGEST);
        if (this.d.containsKey(strB2)) {
            return QuotaCheckResult.b(str, 0L, 0L);
        }
        long j2 = ((long) i) * 1024;
        AtomicLong atomicLong = this.f15706e.get(strB2);
        if (atomicLong == null || atomicLong.get() <= j2) {
            return e(str, j2, strB);
        }
        atomicLong.addAndGet(-j2);
        return null;
    }

    public final QuotaCheckResult e(String str, long j2, String str2) {
        long jP = p(str);
        QuotaType quotaType = QuotaType.INGEST;
        long jQ = q(str2, str, quotaType);
        if (j2 + jQ > jP) {
            this.d.put(b(str2, str, quotaType), Long.valueOf(System.currentTimeMillis()));
            return QuotaCheckResult.b(str, jQ, jP);
        }
        double d = jP - jQ;
        if (d <= jP * 0.8d) {
            return null;
        }
        n(this.f15706e, b(str2, str, quotaType), 0L).set((long) (d * 0.8d));
        return null;
    }

    public final void f(long j2, long j3) {
        if (j2 > this.a || j3 > this.b) {
            A(j2, j3);
        }
        this.a = j2;
        this.b = j3;
    }

    public QuotaCheckResult g(String str, long j2) {
        return w56.a() == ChannelMode.STANDALONE ? QuotaCheckResult.a(Long.MAX_VALUE) : h(str, j2, QuotaType.INGEST, false);
    }

    public final QuotaCheckResult h(String str, long j2, QuotaType quotaType, boolean z) {
        c();
        long jP = p(str);
        long jO = o();
        f(l(), jO);
        String strB = B();
        if (!z) {
            long jQ = q(strB, naf.GLOBAL_APP_ID, quotaType);
            if (j2 > 0 && jQ + j2 > jO) {
                this.d.put(b(strB, naf.GLOBAL_APP_ID, quotaType), Long.valueOf(System.currentTimeMillis()));
                return QuotaCheckResult.c(jQ, jO);
            }
        }
        if (str != null && j2 > 0) {
            long jQ2 = q(strB, str, quotaType);
            if (jQ2 + j2 > jP) {
                this.d.put(b(strB, str, quotaType), Long.valueOf(System.currentTimeMillis()));
                return QuotaCheckResult.b(str, jQ2, jP);
            }
        }
        return QuotaCheckResult.a(Math.max(0L, (jO - q(strB, naf.GLOBAL_APP_ID, quotaType)) - Math.max(0L, j2)));
    }

    public final QuotaCheckResult i(String str, long j2, String str2, QuotaType quotaType) {
        long jO = o();
        long jP = p(str);
        f(l(), jO);
        String strB = b(str2, naf.GLOBAL_APP_ID, quotaType);
        long jQ = q(str2, naf.GLOBAL_APP_ID, quotaType);
        if (jQ + j2 > jO) {
            this.d.put(strB, Long.valueOf(System.currentTimeMillis()));
            return QuotaCheckResult.c(jQ, jO);
        }
        double d = jO - jQ;
        if (d > jO * 0.8d) {
            n(this.f15706e, strB, 0L).set((long) (d * 0.8d));
        }
        if (str != null) {
            String strB2 = b(str2, str, quotaType);
            long jQ2 = q(str2, str, quotaType);
            if (jQ2 + j2 > jP) {
                this.d.put(strB2, Long.valueOf(System.currentTimeMillis()));
                return QuotaCheckResult.b(str, jQ2, jP);
            }
            double d2 = jP - jQ2;
            if (d2 > jP * 0.8d) {
                n(this.f15706e, strB2, 0L).set((long) (d2 * 0.8d));
            }
        }
        return QuotaCheckResult.a(Long.MAX_VALUE);
    }

    public QuotaCheckResult j(String str, long j2) {
        if (j2 <= 0) {
            return QuotaCheckResult.a(Long.MAX_VALUE);
        }
        String strB = B();
        if (!strB.equals(this.g)) {
            u(strB);
        }
        QuotaType quotaType = QuotaType.UPLOAD;
        if (this.d.containsKey(b(strB, naf.GLOBAL_APP_ID, quotaType))) {
            return QuotaCheckResult.c(0L, 0L);
        }
        if (str != null) {
            String strB2 = b(strB, str, quotaType);
            if (this.d.containsKey(strB2)) {
                return QuotaCheckResult.b(str, 0L, 0L);
            }
            AtomicLong atomicLong = this.f15706e.get(strB2);
            if (atomicLong != null && atomicLong.get() > j2) {
                atomicLong.addAndGet(-j2);
                return QuotaCheckResult.a(atomicLong.get());
            }
        }
        return i(str, j2, strB, quotaType);
    }

    public synchronized void k() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            int i = 0;
            for (Map.Entry<String, AtomicLong> entry : this.f15705c.entrySet()) {
                String[] strArrSplit = entry.getKey().split(":");
                if (strArrSplit.length == 3) {
                    this.h.a(strArrSplit[0], strArrSplit[1], QuotaType.valueOf(strArrSplit[2]).ordinal(), entry.getValue().get());
                    i++;
                }
            }
            this.f = System.currentTimeMillis();
            z6b.q("RateLimitManager", "flushToDisk: " + i + " counters in " + (this.f - jCurrentTimeMillis) + "ms");
        } catch (Exception e2) {
            z6b.p("RateLimitManager", "flushToDisk error", e2);
        }
    }

    public final long l() {
        return p(null);
    }

    public Set<String> m() {
        HashSet hashSet = new HashSet();
        String strB = B();
        Iterator<String> it = this.d.keySet().iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(":");
            if (strArrSplit.length == 3) {
                String str = strArrSplit[0];
                String str2 = strArrSplit[1];
                String str3 = strArrSplit[2];
                if (str.equals(strB) && QuotaType.UPLOAD.name().equals(str3) && !naf.GLOBAL_APP_ID.equals(str2)) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    public final AtomicLong n(Map<String, AtomicLong> map, String str, long j2) {
        AtomicLong atomicLong = map.get(str);
        if (atomicLong != null) {
            return atomicLong;
        }
        synchronized (map) {
            AtomicLong atomicLong2 = map.get(str);
            if (atomicLong2 != null) {
                return atomicLong2;
            }
            AtomicLong atomicLong3 = new AtomicLong(j2);
            map.put(str, atomicLong3);
            return atomicLong3;
        }
    }

    public final long o() {
        MinCommonConfig minCommonConfigJ;
        Integer quotaGlobalMB;
        ou3 ou3Var = this.i;
        if (ou3Var == null || (minCommonConfigJ = ou3Var.j()) == null || (quotaGlobalMB = minCommonConfigJ.getQuotaGlobalMB()) == null || quotaGlobalMB.intValue() <= 0) {
            return 157286400L;
        }
        return ((long) quotaGlobalMB.intValue()) * 1024 * 1024;
    }

    public final long p(String str) {
        MinCommonConfig minCommonConfigJ;
        int iIntValue;
        Map<String, Integer> quotaPerAppMBMap;
        Integer num;
        ou3 ou3Var = this.i;
        if (ou3Var == null || (minCommonConfigJ = ou3Var.j()) == null) {
            return 12582912L;
        }
        if (str == null || (quotaPerAppMBMap = minCommonConfigJ.getQuotaPerAppMBMap()) == null || (num = quotaPerAppMBMap.get(str)) == null || num.intValue() <= 0) {
            Integer defaultQuotaPerAppMB = minCommonConfigJ.getDefaultQuotaPerAppMB();
            if (defaultQuotaPerAppMB == null || defaultQuotaPerAppMB.intValue() <= 0) {
                return 12582912L;
            }
            iIntValue = defaultQuotaPerAppMB.intValue();
        } else {
            iIntValue = num.intValue();
        }
        return ((long) iIntValue) * 1024 * 1024;
    }

    public final long q(String str, String str2, QuotaType quotaType) {
        AtomicLong atomicLong = this.f15705c.get(b(str, str2, quotaType));
        if (atomicLong != null) {
            return atomicLong.get();
        }
        return 0L;
    }

    public final void r() {
        try {
            String strB = B();
            List<naf> listC = this.h.c(strB);
            for (naf nafVar : listC) {
                this.f15705c.put(b(nafVar.a, nafVar.b, QuotaType.values()[nafVar.f14418c]), new AtomicLong(nafVar.d));
            }
            z6b.q("RateLimitManager", "initCacheFromDb: loaded " + listC.size() + " counters for " + strB);
            v(strB);
        } catch (Exception e2) {
            z6b.p("RateLimitManager", "initCacheFromDb error", e2);
        }
    }

    public boolean s() {
        if (w56.a() == ChannelMode.STANDALONE) {
            return false;
        }
        String strB = B();
        if (!strB.equals(this.g)) {
            u(strB);
        }
        return this.d.containsKey(b(strB, naf.GLOBAL_APP_ID, QuotaType.INGEST));
    }

    public final void t() {
        if (System.currentTimeMillis() - this.f >= (w56.a() == ChannelMode.STANDALONE ? 60000L : 300000L)) {
            k();
        }
    }

    public final synchronized void u(String str) {
        if (str.equals(this.g)) {
            return;
        }
        z6b.q("RateLimitManager", "onDateChanged: " + this.g + " -> " + str);
        k();
        this.d.clear();
        this.f15706e.clear();
        this.f15705c.clear();
        this.g = str;
        r();
    }

    public final void v(String str) {
        long jO = o();
        int i = 0;
        for (Map.Entry<String, AtomicLong> entry : this.f15705c.entrySet()) {
            String key = entry.getKey();
            long j2 = entry.getValue().get();
            String[] strArrSplit = key.split(":");
            if (strArrSplit.length == 3 && strArrSplit[0].equals(str)) {
                String str2 = strArrSplit[1];
                long jP = naf.GLOBAL_APP_ID.equals(str2) ? jO : p(str2);
                if (j2 >= jP) {
                    this.d.put(key, Long.valueOf(System.currentTimeMillis()));
                    i++;
                    z6b.q("RateLimitManager", "rebuildExceededCache: marked exceeded " + key + ", used=" + j2 + ", limit=" + jP);
                }
            }
        }
        if (i > 0) {
            z6b.q("RateLimitManager", "rebuildExceededCache: rebuilt " + i + " exceeded entries");
        }
    }

    public void w(String str, QuotaType quotaType, long j2, int i) {
        if (j2 > 0 || i > 0) {
            String strB = B();
            try {
                oaf oafVar = this.h;
                if (oafVar != null) {
                    if (str == null) {
                        str = naf.GLOBAL_APP_ID;
                    }
                    oafVar.b(strB, str, quotaType.ordinal(), j2, i);
                }
            } catch (Exception e2) {
                z6b.p("RateLimitManager", "recordDropped error", e2);
            }
        }
    }

    public void x(String str, long j2) {
        z(str, j2, QuotaType.INGEST);
    }

    public void y(String str, long j2) {
        z(str, j2, QuotaType.UPLOAD);
    }

    public final void z(String str, long j2, QuotaType quotaType) {
        if (j2 <= 0) {
            return;
        }
        c();
        String strB = B();
        a(strB, naf.GLOBAL_APP_ID, quotaType, j2);
        if (str != null) {
            a(strB, str, quotaType, j2);
        }
        t();
    }
}
