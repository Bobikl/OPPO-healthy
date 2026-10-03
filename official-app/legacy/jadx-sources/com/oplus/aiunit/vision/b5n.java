package com.oplus.aiunit.vision;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class b5n {
    public com.amap.api.col.p0003sl.ni a;
    public com.amap.api.col.p0003sl.ni b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j6n f9614c;
    public a d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<com.amap.api.col.p0003sl.ni> f9615e = new ArrayList(3);

    public static class a {
        public byte a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.amap.api.col.p0003sl.ni f9616c;
        public com.amap.api.col.p0003sl.ni d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.amap.api.col.p0003sl.ni f9617e;
        public List<com.amap.api.col.p0003sl.ni> f = new ArrayList();
        public List<com.amap.api.col.p0003sl.ni> g = new ArrayList();

        public static boolean c(com.amap.api.col.p0003sl.ni niVar, com.amap.api.col.p0003sl.ni niVar2) {
            if (niVar == null || niVar2 == null) {
                return (niVar == null) == (niVar2 == null);
            }
            if ((niVar instanceof com.amap.api.col.p0003sl.nk) && (niVar2 instanceof com.amap.api.col.p0003sl.nk)) {
                com.amap.api.col.p0003sl.nk nkVar = (com.amap.api.col.p0003sl.nk) niVar;
                com.amap.api.col.p0003sl.nk nkVar2 = (com.amap.api.col.p0003sl.nk) niVar2;
                return nkVar.f799j == nkVar2.f799j && nkVar.k == nkVar2.k;
            }
            if ((niVar instanceof com.amap.api.col.p0003sl.nj) && (niVar2 instanceof com.amap.api.col.p0003sl.nj)) {
                com.amap.api.col.p0003sl.nj njVar = (com.amap.api.col.p0003sl.nj) niVar;
                com.amap.api.col.p0003sl.nj njVar2 = (com.amap.api.col.p0003sl.nj) niVar2;
                return njVar.f797l == njVar2.f797l && njVar.k == njVar2.k && njVar.f796j == njVar2.f796j;
            }
            if ((niVar instanceof com.amap.api.col.p0003sl.nl) && (niVar2 instanceof com.amap.api.col.p0003sl.nl)) {
                com.amap.api.col.p0003sl.nl nlVar = (com.amap.api.col.p0003sl.nl) niVar;
                com.amap.api.col.p0003sl.nl nlVar2 = (com.amap.api.col.p0003sl.nl) niVar2;
                return nlVar.f802j == nlVar2.f802j && nlVar.k == nlVar2.k;
            }
            if ((niVar instanceof com.amap.api.col.p0003sl.nm) && (niVar2 instanceof com.amap.api.col.p0003sl.nm)) {
                com.amap.api.col.p0003sl.nm nmVar = (com.amap.api.col.p0003sl.nm) niVar;
                com.amap.api.col.p0003sl.nm nmVar2 = (com.amap.api.col.p0003sl.nm) niVar2;
                if (nmVar.f805j == nmVar2.f805j && nmVar.k == nmVar2.k) {
                    return true;
                }
            }
            return false;
        }

        public final void a() {
            this.a = (byte) 0;
            this.b = "";
            this.f9616c = null;
            this.d = null;
            this.f9617e = null;
            this.f.clear();
            this.g.clear();
        }

        public final void b(byte b, String str, List<com.amap.api.col.p0003sl.ni> list) {
            a();
            this.a = b;
            this.b = str;
            if (list != null) {
                this.f.addAll(list);
                for (com.amap.api.col.p0003sl.ni niVar : this.f) {
                    boolean z = niVar.i;
                    if (!z && niVar.h) {
                        this.d = niVar;
                    } else if (z && niVar.h) {
                        this.f9617e = niVar;
                    }
                }
            }
            com.amap.api.col.p0003sl.ni niVar2 = this.d;
            if (niVar2 == null) {
                niVar2 = this.f9617e;
            }
            this.f9616c = niVar2;
        }

        public final String toString() {
            return "CellInfo{radio=" + ((int) this.a) + ", operator='" + this.b + "', mainCell=" + this.f9616c + ", mainOldInterCell=" + this.d + ", mainNewInterCell=" + this.f9617e + ", cells=" + this.f + ", historyMainCellList=" + this.g + '}';
        }
    }

    public final a a(j6n j6nVar, boolean z, byte b, String str, List<com.amap.api.col.p0003sl.ni> list) {
        if (z) {
            this.d.a();
            return null;
        }
        this.d.b(b, str, list);
        if (this.d.f9616c == null) {
            return null;
        }
        if (!(this.f9614c == null || d(j6nVar) || !a.c(this.d.d, this.a) || !a.c(this.d.f9617e, this.b))) {
            return null;
        }
        a aVar = this.d;
        this.a = aVar.d;
        this.b = aVar.f9617e;
        this.f9614c = j6nVar;
        e6n.c(aVar.f);
        c(this.d);
        return this.d;
    }

    public final void b(com.amap.api.col.p0003sl.ni niVar) {
        if (niVar == null) {
            return;
        }
        int size = this.f9615e.size();
        if (size == 0) {
            this.f9615e.add(niVar);
            return;
        }
        int i = -1;
        long jMin = Long.MAX_VALUE;
        int i2 = 0;
        int i3 = -1;
        while (true) {
            if (i2 >= size) {
                i = i3;
                break;
            }
            com.amap.api.col.p0003sl.ni niVar2 = this.f9615e.get(i2);
            if (niVar.equals(niVar2)) {
                int i4 = niVar.f794c;
                if (i4 == niVar2.f794c) {
                    break;
                }
                niVar2.f795e = i4;
                niVar2.f794c = i4;
                break;
            }
            jMin = Math.min(jMin, niVar2.f795e);
            if (jMin == niVar2.f795e) {
                i3 = i2;
            }
            i2++;
        }
        if (i >= 0) {
            if (size < 3) {
                this.f9615e.add(niVar);
            } else {
                if (niVar.f795e <= jMin || i >= size) {
                    return;
                }
                this.f9615e.remove(i);
                this.f9615e.add(niVar);
            }
        }
    }

    public final void c(a aVar) {
        synchronized (this.f9615e) {
            for (com.amap.api.col.p0003sl.ni niVar : aVar.f) {
                if (niVar != null && niVar.h) {
                    com.amap.api.col.p0003sl.ni niVarClone = niVar.clone();
                    niVarClone.f795e = SystemClock.elapsedRealtime();
                    b(niVarClone);
                }
            }
            this.d.g.clear();
            this.d.g.addAll(this.f9615e);
        }
    }

    public final boolean d(j6n j6nVar) {
        float f;
        float f2 = j6nVar.g;
        if (f2 > 10.0f) {
            f = 2000.0f;
        } else {
            f = f2 > 2.0f ? 500.0f : 100.0f;
        }
        return j6nVar.a(this.f9614c) > ((double) f);
    }
}
