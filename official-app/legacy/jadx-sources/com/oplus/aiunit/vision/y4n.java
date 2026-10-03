package com.oplus.aiunit.vision;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class y4n extends x4n {
    public y4n() {
        super(2048);
    }

    public static void e(List<com.amap.api.col.p0003sl.ni> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (com.amap.api.col.p0003sl.ni niVar : list) {
            if (niVar instanceof com.amap.api.col.p0003sl.nk) {
                com.amap.api.col.p0003sl.nk nkVar = (com.amap.api.col.p0003sl.nk) niVar;
                niVar.g = e6n.b(e6n.a(nkVar.f799j, nkVar.k));
            } else if (niVar instanceof com.amap.api.col.p0003sl.nl) {
                com.amap.api.col.p0003sl.nl nlVar = (com.amap.api.col.p0003sl.nl) niVar;
                niVar.g = e6n.b(e6n.a(nlVar.f802j, nlVar.k));
            } else if (niVar instanceof com.amap.api.col.p0003sl.nm) {
                com.amap.api.col.p0003sl.nm nmVar = (com.amap.api.col.p0003sl.nm) niVar;
                niVar.g = e6n.b(e6n.a(nmVar.f805j, nmVar.k));
            } else if (niVar instanceof com.amap.api.col.p0003sl.nj) {
                com.amap.api.col.p0003sl.nj njVar = (com.amap.api.col.p0003sl.nj) niVar;
                niVar.g = e6n.b(e6n.a(njVar.k, njVar.f797l));
            }
        }
    }

    public static void g(List<k6n> list) {
        for (k6n k6nVar : list) {
            k6nVar.g = e6n.d(k6nVar.a);
        }
    }

    public final int b(long j2, List<k6n> list) {
        g(list);
        int size = list.size();
        if (size <= 0) {
            return -1;
        }
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            k6n k6nVar = list.get(i);
            int iB = this.a.b(k6nVar.b);
            long j3 = k6nVar.a;
            iArr[i] = b6n.b(this.a, j3 == j2 && j3 != -1, j3, (short) k6nVar.f13176c, iB, k6nVar.g, (short) k6nVar.d);
        }
        return a6n.b(this.a, a6n.c(this.a, iArr));
    }

    public final int c(b5n.a aVar) {
        int iA;
        int i;
        int i2;
        byte b;
        int iB;
        int iB2;
        byte b2;
        e(aVar.f);
        int size = aVar.f.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            com.amap.api.col.p0003sl.ni niVar = aVar.f.get(i3);
            if (niVar instanceof com.amap.api.col.p0003sl.nk) {
                com.amap.api.col.p0003sl.nk nkVar = (com.amap.api.col.p0003sl.nk) niVar;
                iB = !nkVar.i ? o5n.b(this.a, nkVar.f799j, nkVar.k, nkVar.f794c, nkVar.f800l) : o5n.c(this.a, nkVar.b(), nkVar.c(), nkVar.f799j, nkVar.k, nkVar.f794c, nkVar.m, nkVar.f801n, nkVar.d, nkVar.f800l);
                i2 = -1;
                b = 1;
            } else {
                if (niVar instanceof com.amap.api.col.p0003sl.nl) {
                    com.amap.api.col.p0003sl.nl nlVar = (com.amap.api.col.p0003sl.nl) niVar;
                    iB2 = p5n.b(this.a, nlVar.b(), nlVar.c(), nlVar.f802j, nlVar.k, nlVar.f803l, nlVar.f794c, nlVar.m, nlVar.d);
                    b2 = 3;
                } else if (niVar instanceof com.amap.api.col.p0003sl.nj) {
                    com.amap.api.col.p0003sl.nj njVar = (com.amap.api.col.p0003sl.nj) niVar;
                    iB = !njVar.i ? i5n.b(this.a, njVar.f796j, njVar.k, njVar.f797l, njVar.m, njVar.f798n, njVar.f794c) : i5n.c(this.a, njVar.f796j, njVar.k, njVar.f797l, njVar.m, njVar.f798n, njVar.f794c, njVar.d);
                    b = 2;
                    i2 = -1;
                } else if (niVar instanceof com.amap.api.col.p0003sl.nm) {
                    com.amap.api.col.p0003sl.nm nmVar = (com.amap.api.col.p0003sl.nm) niVar;
                    iB2 = s5n.b(this.a, nmVar.b(), nmVar.c(), nmVar.f805j, nmVar.k, nmVar.f806l, nmVar.f794c, nmVar.m, nmVar.d);
                    b2 = 4;
                } else {
                    i2 = -1;
                    b = 0;
                    iB = -1;
                }
                b = b2;
                iB = iB2;
                i2 = -1;
            }
            if (iB == i2) {
                return i2;
            }
            iArr[i3] = l5n.b(this.a, niVar.h ? (byte) 1 : (byte) 0, niVar.i ? (byte) 1 : (byte) 0, (short) niVar.g, b, iB);
        }
        int iB3 = this.a.b(aVar.b);
        int iC = j5n.c(this.a, iArr);
        int size2 = aVar.g.size();
        int[] iArr2 = new int[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            com.amap.api.col.p0003sl.ni niVar2 = aVar.g.get(i4);
            long jElapsedRealtime = (SystemClock.elapsedRealtime() - niVar2.f795e) / 1000;
            if (jElapsedRealtime > 32767 || jElapsedRealtime < 0) {
                jElapsedRealtime = 32767;
            }
            if (niVar2 instanceof com.amap.api.col.p0003sl.nk) {
                com.amap.api.col.p0003sl.nk nkVar2 = (com.amap.api.col.p0003sl.nk) niVar2;
                iA = r5n.a(this.a, nkVar2.f799j, nkVar2.k, (short) jElapsedRealtime);
            } else if (niVar2 instanceof com.amap.api.col.p0003sl.nl) {
                com.amap.api.col.p0003sl.nl nlVar2 = (com.amap.api.col.p0003sl.nl) niVar2;
                iA = r5n.a(this.a, nlVar2.f802j, nlVar2.k, (short) jElapsedRealtime);
            } else {
                if (niVar2 instanceof com.amap.api.col.p0003sl.nj) {
                    com.amap.api.col.p0003sl.nj njVar2 = (com.amap.api.col.p0003sl.nj) niVar2;
                    iA = q5n.a(this.a, njVar2.f796j, njVar2.k, njVar2.f797l, (short) jElapsedRealtime);
                    i = 2;
                } else if (niVar2 instanceof com.amap.api.col.p0003sl.nm) {
                    com.amap.api.col.p0003sl.nm nmVar2 = (com.amap.api.col.p0003sl.nm) niVar2;
                    iA = r5n.a(this.a, nmVar2.f805j, nmVar2.k, (short) jElapsedRealtime);
                } else {
                    iA = 0;
                    i = 0;
                }
                iArr2[i4] = k5n.b(this.a, (byte) i, iA);
            }
            i = 1;
            iArr2[i4] = k5n.b(this.a, (byte) i, iA);
        }
        return j5n.b(this.a, iB3, aVar.a, iC, j5n.f(this.a, iArr2));
    }

    public final int d(j6n j6nVar) {
        return n5n.b(this.a, j6nVar.f12401c, j6nVar.k, (int) (j6nVar.f12402e * 1000000.0d), (int) (j6nVar.d * 1000000.0d), (int) j6nVar.f, (int) j6nVar.i, (int) j6nVar.g, (short) j6nVar.h, j6nVar.f12776l);
    }

    public final byte[] f(j6n j6nVar, b5n.a aVar, long j2, List<k6n> list) {
        List<com.amap.api.col.p0003sl.ni> list2;
        super.a();
        try {
            int iD = d(j6nVar);
            int iB = -1;
            int iC = (aVar == null || (list2 = aVar.f) == null || list2.size() <= 0) ? -1 : c(aVar);
            if (list != null && list.size() > 0) {
                iB = b(j2, list);
            }
            g5n.a(this.a);
            g5n.b(this.a, iD);
            if (iC > 0) {
                g5n.e(this.a, iC);
            }
            if (iB > 0) {
                g5n.d(this.a, iB);
            }
            this.a.w(g5n.c(this.a));
            return this.a.z();
        } catch (Throwable th) {
            n6n.a(th);
            return null;
        }
    }
}
