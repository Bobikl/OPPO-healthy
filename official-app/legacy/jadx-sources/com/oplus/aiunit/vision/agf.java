package com.oplus.aiunit.vision;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class agf {
    public final Map<String, Map<Long, b>> a = new HashMap();
    public final AtomicBoolean b = new AtomicBoolean(false);

    public class a implements Runnable {
        public final /* synthetic */ Map i;

        public a(Map map) {
            this.i = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            xv9 xv9VarA = fgf.a();
            if (xv9VarA == null) {
                return;
            }
            for (Map.Entry entry : this.i.entrySet()) {
                String str = (String) entry.getKey();
                if (xv9VarA.n(str)) {
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        try {
                            xv9VarA.j(str, ((Long) entry2.getKey()).longValue(), (b) entry2.getValue());
                        } catch (Throwable th) {
                            z6b.p("ReconciliationAccumulator", "flushAsync error: appId=" + str, th);
                        }
                    }
                }
            }
        }
    }

    public static final class b {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<Integer, Integer> f9351c = new HashMap();
        public final Map<Integer, Integer> d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Map<Integer, Integer> f9352e = new HashMap();
    }

    public void a(String str, long j2, int i) {
        if (i <= 0 || str == null) {
            return;
        }
        g(str, j2).b += i;
    }

    public void b(String str, long j2, int i, int i2) {
        if (i <= 0 || str == null) {
            return;
        }
        b bVarG = g(str, j2);
        Integer num = bVarG.d.get(Integer.valueOf(i2));
        bVarG.d.put(Integer.valueOf(i2), Integer.valueOf((num != null ? num.intValue() : 0) + i));
    }

    public void c(String str, long j2, int i, int i2) {
        if (i <= 0 || str == null) {
            return;
        }
        b bVarG = g(str, j2);
        Integer num = bVarG.f9352e.get(Integer.valueOf(i2));
        bVarG.f9352e.put(Integer.valueOf(i2), Integer.valueOf((num != null ? num.intValue() : 0) + i));
    }

    public void d(String str, long j2, int i) {
        if (i <= 0 || str == null) {
            return;
        }
        g(str, j2).a += i;
    }

    public void e(String str, long j2, int i, int i2) {
        if (i <= 0 || str == null) {
            return;
        }
        b bVarG = g(str, j2);
        Integer num = bVarG.f9351c.get(Integer.valueOf(i2));
        bVarG.f9351c.put(Integer.valueOf(i2), Integer.valueOf((num != null ? num.intValue() : 0) + i));
    }

    public void f() {
        if (this.b.compareAndSet(false, true) && !this.a.isEmpty()) {
            HashMap map = new HashMap(this.a);
            this.a.clear();
            try {
                u56.m(new a(map));
            } catch (Throwable th) {
                z6b.p("ReconciliationAccumulator", "flushAsync submit error", th);
            }
        }
    }

    public final b g(String str, long j2) {
        Map<Long, b> map = this.a.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.a.put(str, map);
        }
        long jC = hgf.c(j2);
        b bVar = map.get(Long.valueOf(jC));
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        map.put(Long.valueOf(jC), bVar2);
        return bVar2;
    }
}
