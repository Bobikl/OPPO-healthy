package com.amap.api.col.p0003sl;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class y {
    public boolean a = true;
    public long b = 86400;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f866c = 10;
    public long d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap<x.b, Object> f867e = new LinkedHashMap<>();
    public final Object f = new Object();
    public final LinkedHashMap<x.b, Object> g = new LinkedHashMap<>();
    public final Object h = new Object();
    public ArrayList<String> i = new ArrayList<>();

    public y(String... strArr) {
        e(strArr);
    }

    public final x.c a(x.b bVar) {
        if (!this.a || bVar == null || !j(bVar)) {
            return null;
        }
        h();
        synchronized (this.f) {
            if (f(this.f867e, bVar)) {
                return new x.c(g(this.f867e, bVar), true);
            }
            synchronized (this.h) {
                if (f(this.g, bVar)) {
                    while (!f(this.f867e, bVar) && f(this.g, bVar)) {
                        try {
                            this.h.wait(1000L);
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    }
                } else {
                    this.g.put(bVar, null);
                }
            }
            return new x.c(g(this.f867e, bVar), false);
        }
    }

    public final void b() {
        int size = this.f867e.size();
        if (size <= 0 || size < this.f866c) {
            return;
        }
        for (x.b bVar : this.f867e.keySet()) {
            if (bVar != null) {
                k(this.f867e, bVar);
            }
        }
        bVar = null;
        k(this.f867e, bVar);
    }

    public void c(x.a aVar) {
        if (aVar != null) {
            this.a = aVar.e();
            this.b = aVar.f();
            this.f866c = aVar.g();
        }
    }

    public final void d(x.b bVar, Object obj) {
        if (this.a && bVar != null && j(bVar)) {
            i(bVar, obj);
            synchronized (this.h) {
                k(this.g, bVar);
                this.h.notify();
            }
        }
    }

    public final void e(String... strArr) {
        this.d = System.currentTimeMillis();
        this.f867e.clear();
        this.i.clear();
        for (String str : strArr) {
            if (str != null) {
                this.i.add(str);
            }
        }
    }

    public boolean f(LinkedHashMap<x.b, Object> linkedHashMap, x.b bVar) {
        if (linkedHashMap == null || bVar == null) {
            return false;
        }
        return linkedHashMap.containsKey(bVar);
    }

    public Object g(LinkedHashMap<x.b, Object> linkedHashMap, x.b bVar) {
        if (linkedHashMap == null || bVar == null) {
            return null;
        }
        return linkedHashMap.get(bVar);
    }

    public final void h() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((jCurrentTimeMillis - this.d) / 1000 > this.b) {
            this.f867e.clear();
            this.d = jCurrentTimeMillis;
        }
    }

    public final void i(x.b bVar, Object obj) {
        synchronized (this.f) {
            b();
            h();
            this.f867e.put(bVar, obj);
        }
    }

    public final boolean j(x.b bVar) {
        if (bVar != null && bVar.a != null) {
            for (String str : this.i) {
                if (str != null && bVar.a.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Object k(LinkedHashMap<x.b, Object> linkedHashMap, x.b bVar) {
        if (linkedHashMap == null || bVar == null) {
            return null;
        }
        return linkedHashMap.remove(bVar);
    }
}
