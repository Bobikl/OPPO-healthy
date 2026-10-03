package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class e6n {

    public static class a implements c6n {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10808c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.f10808c = i3;
        }

        @Override // com.oplus.aiunit.vision.c6n
        public final long a() {
            return e6n.a(this.a, this.b);
        }

        @Override // com.oplus.aiunit.vision.c6n
        public final int b() {
            return this.f10808c;
        }
    }

    public static class b implements c6n {
        public long a;
        public int b;

        public b(long j2, int i) {
            this.a = j2;
            this.b = i;
        }

        @Override // com.oplus.aiunit.vision.c6n
        public final long a() {
            return this.a;
        }

        @Override // com.oplus.aiunit.vision.c6n
        public final int b() {
            return this.b;
        }
    }

    public static long a(int i, int i2) {
        return (((long) i2) & 4294967295L) | ((((long) i) & 4294967295L) << 32);
    }

    public static synchronized short b(long j2) {
        return d6n.a().b(j2);
    }

    public static synchronized void c(List<com.amap.api.col.p0003sl.ni> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList(list.size());
                for (com.amap.api.col.p0003sl.ni niVar : list) {
                    if (niVar instanceof com.amap.api.col.p0003sl.nk) {
                        com.amap.api.col.p0003sl.nk nkVar = (com.amap.api.col.p0003sl.nk) niVar;
                        arrayList.add(new a(nkVar.f799j, nkVar.k, nkVar.f794c));
                    } else if (niVar instanceof com.amap.api.col.p0003sl.nl) {
                        com.amap.api.col.p0003sl.nl nlVar = (com.amap.api.col.p0003sl.nl) niVar;
                        arrayList.add(new a(nlVar.f802j, nlVar.k, nlVar.f794c));
                    } else if (niVar instanceof com.amap.api.col.p0003sl.nm) {
                        com.amap.api.col.p0003sl.nm nmVar = (com.amap.api.col.p0003sl.nm) niVar;
                        arrayList.add(new a(nmVar.f805j, nmVar.k, nmVar.f794c));
                    } else if (niVar instanceof com.amap.api.col.p0003sl.nj) {
                        com.amap.api.col.p0003sl.nj njVar = (com.amap.api.col.p0003sl.nj) niVar;
                        arrayList.add(new a(njVar.k, njVar.f797l, njVar.f794c));
                    }
                }
                d6n.a().d(arrayList);
            }
        }
    }

    public static synchronized short d(long j2) {
        return d6n.a().g(j2);
    }

    public static synchronized void e(List<k6n> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList(list.size());
                for (k6n k6nVar : list) {
                    arrayList.add(new b(k6nVar.a, k6nVar.f13176c));
                }
                d6n.a().h(arrayList);
            }
        }
    }
}
