package com.oplus.drs.core.db.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteFullException;
import com.oplus.aiunit.vision.b25;
import com.oplus.aiunit.vision.bi8;
import com.oplus.aiunit.vision.fgf;
import com.oplus.aiunit.vision.jo3;
import com.oplus.aiunit.vision.q15;
import com.oplus.aiunit.vision.u56;
import com.oplus.aiunit.vision.wn3;
import com.oplus.aiunit.vision.x56;
import com.oplus.aiunit.vision.xv9;
import com.oplus.aiunit.vision.z6b;
import io.netty.util.internal.StringUtil;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class CapacityGovernor {
    public static final int DEFAULT_MAX_STORAGE_MB = 350;
    public final jo3 a;
    public final wn3 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bi8 f19710c;
    public final x56 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b25 f19711e;
    public Context f;
    public SharedPreferences g;
    public volatile f h;
    public volatile d i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile ScheduledFuture<?> f19714n;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f19712j = new AtomicBoolean(false);
    public final Object k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayDeque<Long> f19713l = new ArrayDeque<>();
    public volatile long m = 0;
    public volatile boolean o = false;

    public enum CleanupTriggerReason {
        SCHEDULED,
        SQLITE_FULL_EXCEPTION,
        MANUAL
    }

    public class a implements com.oplus.drs.core.db.service.a.o {
        public final /* synthetic */ CapacityGovernor a;

        public a(CapacityGovernor capacityGovernor) {
            this.a = capacityGovernor;
        }

        @Override // com.oplus.drs.core.db.service.a.o
        public void a(SQLiteFullException sQLiteFullException) {
            this.a.s(sQLiteFullException);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ CapacityGovernor i;

        public b(CapacityGovernor capacityGovernor) {
            this.i = capacityGovernor;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.i.u();
        }
    }

    public class c implements Callable<Void> {
        public final /* synthetic */ CleanupTriggerReason i;

        public c(CleanupTriggerReason cleanupTriggerReason) {
            this.i = cleanupTriggerReason;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            try {
                CapacityGovernor.this.k(this.i);
                return null;
            } finally {
                CapacityGovernor.this.f19712j.set(false);
            }
        }
    }

    public interface d {
        void a(e eVar);
    }

    public static class e {
        public final CleanupTriggerReason a;
        public final long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19717c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f19718e;
        public int f;
        public int g;
        public int h;
        public long i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f19719j;
        public long k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f19720l;
        public boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f19721n;
        public final Map<String, Integer> o = new HashMap();

        public e(CleanupTriggerReason cleanupTriggerReason, long j2, long j3) {
            this.a = cleanupTriggerReason;
            this.b = j2;
            this.f19717c = j3;
        }

        public int a() {
            return this.f19718e + this.f + this.g + this.h;
        }
    }

    public interface f {
        int a();
    }

    public CapacityGovernor(jo3 jo3Var, wn3 wn3Var, bi8 bi8Var, x56 x56Var) {
        this.a = jo3Var;
        this.b = wn3Var;
        this.f19710c = bi8Var;
        this.d = x56Var;
        this.f19711e = x56Var != null ? new b25(x56Var) : null;
    }

    public boolean A(CleanupTriggerReason cleanupTriggerReason) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.m;
        if (j2 > 0 && jCurrentTimeMillis < j2) {
            return false;
        }
        if (this.f19712j.compareAndSet(false, true)) {
            if (C(cleanupTriggerReason)) {
                u56.p(new c(cleanupTriggerReason));
                return true;
            }
            this.f19712j.set(false);
            return false;
        }
        z6b.q("CapacityGovernor", "Cleanup already in progress, skipping trigger: " + cleanupTriggerReason);
        return false;
    }

    public final int B() {
        bi8 bi8Var = this.f19710c;
        if (bi8Var == null) {
            return 0;
        }
        try {
            int iD = bi8Var.d();
            if (iD > 0) {
                z6b.k("CapacityGovernor", "Trimmed header_index: deleted " + iD + " old templates");
            }
            return iD;
        } catch (Exception e2) {
            z6b.p("CapacityGovernor", "Failed to trim header_index", e2);
            return 0;
        }
    }

    public final boolean C(CleanupTriggerReason cleanupTriggerReason) {
        long jLongValue;
        Long lPeekFirst;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.k) {
            w(jCurrentTimeMillis);
            int size = this.f19713l.size();
            long j2 = jCurrentTimeMillis - 600000;
            int i = 0;
            for (Long l2 : this.f19713l) {
                if (l2 != null && l2.longValue() > j2) {
                    i++;
                }
            }
            if (i < 3 && size < 12) {
                this.f19713l.addLast(Long.valueOf(jCurrentTimeMillis));
                while (this.f19713l.size() > 12) {
                    this.f19713l.pollFirst();
                }
                this.m = 0L;
                v();
                return true;
            }
            long jMax = (size < 12 || (lPeekFirst = this.f19713l.peekFirst()) == null || lPeekFirst.longValue() <= 0) ? 0L : Math.max(0L, lPeekFirst.longValue() + 43200000);
            if (i >= 3) {
                Iterator<Long> it = this.f19713l.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        jLongValue = 0;
                        break;
                    }
                    Long next = it.next();
                    if (next != null && next.longValue() > j2) {
                        jLongValue = next.longValue();
                        break;
                    }
                }
                if (jLongValue > 0) {
                    jMax = Math.max(jMax, jLongValue + 600000);
                }
            }
            if (jMax <= jCurrentTimeMillis) {
                jMax = 30000 + jCurrentTimeMillis;
            }
            this.m = jMax;
            z6b.u("CapacityGovernor", "Cleanup trigger rate limited: reason=" + cleanupTriggerReason + ", last5m=" + i + "/3, last12h=" + size + "/12, blockedUntil=" + jMax + ", waitMs=" + Math.max(0L, jMax - jCurrentTimeMillis));
            return false;
        }
    }

    public final long d() {
        SharedPreferences sharedPreferences = this.g;
        if (sharedPreferences == null) {
            return 43200000L;
        }
        long j2 = sharedPreferences.getLong("last_check_time", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
        if (j2 == 0 || jCurrentTimeMillis >= 43200000) {
            return 60000L;
        }
        return 43200000 - jCurrentTimeMillis;
    }

    public final boolean e(CleanupTriggerReason cleanupTriggerReason) {
        CleanupTriggerReason cleanupTriggerReason2 = CleanupTriggerReason.SCHEDULED;
        return true;
    }

    public final int f(long j2, e eVar) {
        HashMap map = new HashMap();
        try {
            long jMax = Math.max(1L, j2 / 1024);
            Map<String, List<Long>> mapI = this.b.i(3, (int) Math.min(jMax, 5000L));
            q(map, mapI);
            int iJ = 0 + j(mapI);
            long j3 = iJ;
            if (j3 >= jMax) {
                eVar.g = iJ;
                x(map, "PRIORITY_CLEANUP");
                return iJ;
            }
            Map<String, List<Long>> mapI2 = this.b.i(2, (int) Math.min(jMax - j3, 5000L));
            q(map, mapI2);
            int iJ2 = iJ + j(mapI2);
            long j4 = iJ2;
            if (j4 >= jMax) {
                eVar.g = iJ2;
                x(map, "PRIORITY_CLEANUP");
                return iJ2;
            }
            Map<String, List<Long>> mapI3 = this.b.i(1, (int) Math.min(jMax - j4, 5000L));
            q(map, mapI3);
            int iJ3 = iJ2 + j(mapI3);
            eVar.g = iJ3;
            x(map, "PRIORITY_CLEANUP");
            return iJ3;
        } catch (Exception e2) {
            z6b.p("CapacityGovernor", "Failed to cleanup by priority", e2);
            return 0;
        }
    }

    public final int g(e eVar) {
        long jCurrentTimeMillis = System.currentTimeMillis() - 604800000;
        int iJ = 0;
        try {
            Map<String, List<Long>> mapC = this.a.c(jCurrentTimeMillis);
            Map<String, List<Long>> mapC2 = this.b.c(jCurrentTimeMillis);
            iJ = j(mapC2) + j(mapC);
            eVar.f19718e = iJ;
            x(mapC, "TTL_EXPIRED");
            x(mapC2, "TTL_EXPIRED");
            return iJ;
        } catch (Exception e2) {
            z6b.p("CapacityGovernor", "Failed to cleanup expired data", e2);
            return iJ;
        }
    }

    public final int h(long j2, e eVar) {
        int iJ = 0;
        try {
            long jMin = Math.min(j2 / 1024, 5000L);
            Map<String, List<Long>> mapB = this.a.b(jMin);
            Map<String, List<Long>> mapB2 = this.b.b(jMin);
            iJ = j(mapB) + j(mapB2);
            eVar.f = iJ;
            x(mapB, "PENDING_DATA_CLEANUP");
            x(mapB2, "PENDING_DATA_CLEANUP");
            return iJ;
        } catch (Exception e2) {
            z6b.p("CapacityGovernor", "Failed to cleanup pending data", e2);
            return iJ;
        }
    }

    public final int i(long j2, e eVar) {
        int iJ = 0;
        try {
            Map<String, List<Long>> mapO = this.a.o((int) Math.min(Math.max(1L, j2 / 1024), 5000L));
            iJ = j(mapO);
            eVar.h = iJ;
            x(mapO, "DB_CAPACITY_FULL");
            return iJ;
        } catch (Exception e2) {
            z6b.p("CapacityGovernor", "Failed to cleanup realtime data", e2);
            return iJ;
        }
    }

    public final int j(Map<String, List<Long>> map) {
        int size = 0;
        if (map != null && !map.isEmpty()) {
            for (List<Long> list : map.values()) {
                if (list != null) {
                    size += list.size();
                }
            }
        }
        return size;
    }

    public final void k(CleanupTriggerReason cleanupTriggerReason) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        z6b.q("CapacityGovernor", "Starting capacity cleanup, reason=" + cleanupTriggerReason);
        if (!e(cleanupTriggerReason)) {
            z6b.q("CapacityGovernor", "Environment check failed, skip cleanup");
            return;
        }
        long jM = m();
        long jN = n();
        long j2 = (long) (jN * 0.8d);
        z6b.q("CapacityGovernor", String.format("DB size check: current=%dMB, max=%dMB, target=%dMB", Long.valueOf(jM / 1048576), Long.valueOf(jN / 1048576), Long.valueOf(j2 / 1048576)));
        e eVar = new e(cleanupTriggerReason, jM, jN);
        z6b.q("CapacityGovernor", "Phase 1 (expired): deleted " + g(eVar) + " rows");
        long jM2 = m();
        if (jM2 <= j2) {
            z6b.q("CapacityGovernor", "Target reached after phase 1, cleanup complete");
            l(eVar, jCurrentTimeMillis);
            return;
        }
        z6b.q("CapacityGovernor", "Phase 2 (pending): deleted " + h(jM2 - j2, eVar) + " rows");
        long jM3 = m();
        if (jM3 <= j2) {
            z6b.q("CapacityGovernor", "Target reached after phase 2, cleanup complete");
            l(eVar, jCurrentTimeMillis);
            return;
        }
        z6b.q("CapacityGovernor", "Phase 3 (priority): deleted " + f(jM3 - j2, eVar) + " rows");
        long jM4 = m();
        if (jM4 <= j2) {
            z6b.q("CapacityGovernor", "Target reached after phase 3, cleanup complete");
            l(eVar, jCurrentTimeMillis);
            return;
        }
        z6b.q("CapacityGovernor", "Phase 4 (realtime): deleted " + i(jM4 - j2, eVar) + " rows");
        l(eVar, jCurrentTimeMillis);
    }

    public final void l(e eVar, long j2) {
        t(eVar);
        eVar.i = System.currentTimeMillis() - j2;
        eVar.d = m();
        z6b.q("CapacityGovernor", String.format("Cleanup complete: reason=%s, expired=%d, pending=%d, priority=%d, realtime=%d, duration=%dms, before=%dMB, after=%dMB, checkpoint=%dms, vacuum=%dms(%d pages), shrink=%b, headerTrim=%d", eVar.a, Integer.valueOf(eVar.f19718e), Integer.valueOf(eVar.f), Integer.valueOf(eVar.g), Integer.valueOf(eVar.h), Long.valueOf(eVar.i), Long.valueOf(eVar.b / 1048576), Long.valueOf(eVar.d / 1048576), Long.valueOf(eVar.f19719j), Long.valueOf(eVar.k), Integer.valueOf(eVar.f19720l), Boolean.valueOf(eVar.m), Integer.valueOf(eVar.f19721n)));
        r(eVar);
    }

    public final long m() {
        b25 b25Var = this.f19711e;
        if (b25Var != null) {
            return b25Var.a();
        }
        return 0L;
    }

    public final long n() {
        int iA;
        f fVar = this.h;
        if (fVar == null || (iA = fVar.a()) <= 0) {
            return 367001600L;
        }
        return ((long) iA) * 1024 * 1024;
    }

    public void o(Context context, f fVar, com.oplus.drs.core.db.service.a aVar) {
        if (this.o) {
            return;
        }
        synchronized (this) {
            if (this.o) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            this.f = applicationContext;
            this.g = applicationContext.getSharedPreferences("drs_capacity_governor", 0);
            this.h = fVar;
            p();
            if (aVar != null) {
                aVar.D(new a(this));
            }
            z();
            this.o = true;
            z6b.q("CapacityGovernor", "CapacityGovernor initialized");
        }
    }

    public final void p() {
        synchronized (this.k) {
            this.f19713l.clear();
            SharedPreferences sharedPreferences = this.g;
            if (sharedPreferences == null) {
                return;
            }
            String string = sharedPreferences.getString("cleanup_trigger_history", null);
            if (string == null || string.isEmpty()) {
                return;
            }
            try {
                for (String str : string.split(",")) {
                    if (str != null) {
                        String strTrim = str.trim();
                        if (!strTrim.isEmpty()) {
                            try {
                                long j2 = Long.parseLong(strTrim);
                                if (j2 > 0) {
                                    this.f19713l.addLast(Long.valueOf(j2));
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            w(System.currentTimeMillis());
            while (this.f19713l.size() > 12) {
                this.f19713l.pollFirst();
            }
            v();
        }
    }

    public final void q(Map<String, List<Long>> map, Map<String, List<Long>> map2) {
        if (map2 == null || map2.isEmpty()) {
            return;
        }
        for (Map.Entry<String, List<Long>> entry : map2.entrySet()) {
            List<Long> arrayList = map.get(entry.getKey());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(entry.getKey(), arrayList);
            }
            arrayList.addAll(entry.getValue());
        }
    }

    public final void r(e eVar) {
        d dVar = this.i;
        if (dVar != null) {
            try {
                dVar.a(eVar);
            } catch (Exception e2) {
                z6b.p("CapacityGovernor", "Failed to notify reconciliation", e2);
            }
        }
    }

    public boolean s(SQLiteFullException sQLiteFullException) {
        z6b.v("CapacityGovernor", "SQLiteFullException caught, triggering emergency cleanup", sQLiteFullException);
        return A(CleanupTriggerReason.SQLITE_FULL_EXCEPTION);
    }

    public final void t(e eVar) {
        int iA = eVar.a();
        if (iA <= 0) {
            z6b.k("CapacityGovernor", "No data deleted, skip post-cleanup optimization");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        q15.d();
        eVar.f19719j = System.currentTimeMillis() - jCurrentTimeMillis;
        int iMax = Math.max(100, Math.min((iA * 1024) / 4096, 1000));
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        q15.c(iMax);
        eVar.k = System.currentTimeMillis() - jCurrentTimeMillis2;
        eVar.f19720l = iMax;
        eVar.f19721n = B();
        if (iA > 10000) {
            q15.f();
            eVar.m = true;
        }
        z6b.q("CapacityGovernor", "Post-cleanup optimization done: checkpoint=" + eVar.f19719j + "ms, vacuum=" + eVar.k + "ms, pages=" + eVar.f19720l);
    }

    public final void u() {
        SharedPreferences sharedPreferences = this.g;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("last_check_time", System.currentTimeMillis()).apply();
        }
        A(CleanupTriggerReason.SCHEDULED);
    }

    public final void v() {
        if (this.g == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Long l2 : this.f19713l) {
            if (l2 != null && l2.longValue() > 0) {
                if (sb.length() > 0) {
                    sb.append(StringUtil.COMMA);
                }
                sb.append(l2);
            }
        }
        this.g.edit().putString("cleanup_trigger_history", sb.toString()).apply();
    }

    public final void w(long j2) {
        long j3 = j2 - 43200000;
        while (!this.f19713l.isEmpty()) {
            Long lPeekFirst = this.f19713l.peekFirst();
            if (lPeekFirst != null && lPeekFirst.longValue() > j3) {
                return;
            } else {
                this.f19713l.pollFirst();
            }
        }
    }

    public final void x(Map<String, List<Long>> map, String str) {
        xv9 xv9VarA;
        if (map == null || map.isEmpty() || (xv9VarA = fgf.a()) == null) {
            return;
        }
        int size = 0;
        for (Map.Entry<String, List<Long>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<Long> value = entry.getValue();
            if (value != null && !value.isEmpty()) {
                try {
                    Iterator<Long> it = value.iterator();
                    while (it.hasNext()) {
                        xv9VarA.i(key, 1, it.next().longValue(), str);
                    }
                    size += value.size();
                    z6b.q("CapacityGovernor", "Recorded cleanup: appId=" + key + ", count=" + value.size() + ", reason=" + str);
                } catch (Exception e2) {
                    z6b.p("CapacityGovernor", "Failed to record cleanup for appId=" + key, e2);
                }
            }
        }
        z6b.q("CapacityGovernor", "Total cleanup records: " + size + ", reason=" + str);
    }

    public void y(d dVar) {
        this.i = dVar;
    }

    public void z() {
        if (this.f19714n == null || this.f19714n.isCancelled()) {
            long jD = d();
            this.f19714n = u56.o().scheduleWithFixedDelay(new b(this), jD, 43200000L, TimeUnit.MILLISECONDS);
            z6b.q("CapacityGovernor", "Capacity governance scheduled check started, interval=12h, initialDelay=" + ((jD / 1000) / 60) + "min");
        }
    }
}
