package com.amap.api.col.p0003sl;

import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public class x {
    public static volatile x b;
    public HashMap<String, y> a = new HashMap<>();

    public static class a {
        public boolean a = true;
        public long b = 86400;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f865c = 10;
        public double d = 0.0d;

        public final void a(double d) {
            this.d = d;
        }

        public final void b(int i) {
            this.f865c = i;
        }

        public final void c(long j2) {
            this.b = j2;
        }

        public final void d(boolean z) {
            this.a = z;
        }

        public final boolean e() {
            return this.a;
        }

        public final long f() {
            return this.b;
        }

        public final int g() {
            return this.f865c;
        }

        public final double h() {
            return this.d;
        }
    }

    public static class b {
        public String a;
        public Object b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                String str = this.a;
                if (str == null) {
                    return bVar.a == null && this.b == bVar.b;
                }
                if (str.equals(bVar.a) && this.b == bVar.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            Object obj = this.b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static class c {
        public Object a;
        public boolean b;

        public c(Object obj, boolean z) {
            this.a = obj;
            this.b = z;
        }
    }

    public static x b() {
        if (b == null) {
            synchronized (x.class) {
                if (b == null) {
                    b = new x();
                }
            }
        }
        return b;
    }

    public final c a(b bVar) {
        c cVarA;
        if (bVar == null) {
            return null;
        }
        for (y yVar : this.a.values()) {
            if (yVar != null && (cVarA = yVar.a(bVar)) != null) {
                return cVarA;
            }
        }
        return null;
    }

    public final synchronized y c(String str) {
        return this.a.get(str);
    }

    public final void d(a aVar) {
        if (aVar == null) {
            return;
        }
        for (y yVar : this.a.values()) {
            if (yVar != null) {
                yVar.c(aVar);
            }
        }
    }

    public final void e(b bVar, Object obj) {
        for (y yVar : this.a.values()) {
            if (yVar != null) {
                yVar.d(bVar, obj);
            }
        }
    }

    public final void f(String str, a aVar) {
        y yVar;
        if (str == null || aVar == null || (yVar = this.a.get(str)) == null) {
            return;
        }
        yVar.c(aVar);
    }

    public final synchronized void g(String str, y yVar) {
        this.a.put(str, yVar);
    }

    public final boolean h(b bVar) {
        if (bVar == null) {
            return false;
        }
        for (y yVar : this.a.values()) {
            if (yVar != null && yVar.j(bVar)) {
                return true;
            }
        }
        return false;
    }
}
