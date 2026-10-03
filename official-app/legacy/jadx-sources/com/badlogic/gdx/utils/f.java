package com.badlogic.gdx.utils;

import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.aiunit.vision.ik3;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public class f<V> implements Iterable<b<V>> {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f1311j;
    public V[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public V f1312l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f1313n;
    public int o;
    public int p;
    public int q;
    public transient a r;
    public transient a s;

    public static class a<V> extends c<V> implements Iterable<b<V>>, Iterator<b<V>> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final b<V> f1314n;

        public a(f fVar) {
            super(fVar);
            this.f1314n = new b<>();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b<V> next() {
            if (!this.i) {
                throw new NoSuchElementException();
            }
            if (!this.m) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            f<V> fVar = this.f1315j;
            long[] jArr = fVar.f1311j;
            int i = this.k;
            if (i == -1) {
                b<V> bVar = this.f1314n;
                bVar.a = 0L;
                bVar.b = fVar.f1312l;
            } else {
                b<V> bVar2 = this.f1314n;
                bVar2.a = jArr[i];
                bVar2.b = fVar.k[i];
            }
            this.f1316l = i;
            a();
            return this.f1314n;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.m) {
                return this.i;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<b<V>> iterator() {
            return this;
        }

        @Override // com.badlogic.gdx.utils.f.c, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.f.c
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public static class b<V> {
        public long a;
        public V b;

        public String toString() {
            return this.a + HttpUtils.EQUAL_SIGN + this.b;
        }
    }

    public static class c<V> {
        public boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final f<V> f1315j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1316l;
        public boolean m = true;

        public c(f<V> fVar) {
            this.f1315j = fVar;
            reset();
        }

        public void a() {
            int i;
            long[] jArr = this.f1315j.f1311j;
            int length = jArr.length;
            do {
                i = this.k + 1;
                this.k = i;
                if (i >= length) {
                    this.i = false;
                    return;
                }
            } while (jArr[i] == 0);
            this.i = true;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0027  */
        /* JADX WARN: Code duplicated, block: B:13:0x0035  */
        /* JADX WARN: Code duplicated, block: B:17:0x0047  */
        /* JADX WARN: Code duplicated, block: B:20:0x0059  */
        /* JADX WARN: Code duplicated, block: B:22:0x003f A[EDGE_INSN: B:22:0x003f->B:15:0x003f BREAK  A[LOOP:0: B:9:0x001e->B:14:0x003c], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:0x003c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0012 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        public void remove() {
            long[] jArr;
            V[] vArr;
            int i;
            int i2;
            int i3;
            long j2;
            int iE;
            int i4 = this.f1316l;
            if (i4 == -1) {
                f<V> fVar = this.f1315j;
                if (fVar.m) {
                    fVar.m = false;
                    fVar.f1312l = null;
                } else {
                    if (i4 >= 0) {
                        throw new IllegalStateException("next must be called before remove.");
                    }
                    f<V> fVar2 = this.f1315j;
                    jArr = fVar2.f1311j;
                    vArr = fVar2.k;
                    i = fVar2.q;
                    i2 = i4 + 1;
                    while (true) {
                        i3 = i2 & i;
                        j2 = jArr[i3];
                        if (j2 != 0) {
                            break;
                        }
                        iE = this.f1315j.e(j2);
                        if (((i3 - iE) & i) > ((i4 - iE) & i)) {
                            jArr[i4] = j2;
                            vArr[i4] = vArr[i3];
                            i4 = i3;
                        }
                        i2 = i3 + 1;
                    }
                    jArr[i4] = 0;
                    vArr[i4] = null;
                    if (i4 != this.f1316l) {
                        this.k--;
                    }
                }
            } else {
                if (i4 >= 0) {
                    throw new IllegalStateException("next must be called before remove.");
                }
                f<V> fVar3 = this.f1315j;
                jArr = fVar3.f1311j;
                vArr = fVar3.k;
                i = fVar3.q;
                i2 = i4 + 1;
                while (true) {
                    i3 = i2 & i;
                    j2 = jArr[i3];
                    if (j2 != 0) {
                        break;
                        break;
                    }
                    iE = this.f1315j.e(j2);
                    if (((i3 - iE) & i) > ((i4 - iE) & i)) {
                        jArr[i4] = j2;
                        vArr[i4] = vArr[i3];
                        i4 = i3;
                    }
                    i2 = i3 + 1;
                }
                jArr[i4] = 0;
                vArr[i4] = null;
                if (i4 != this.f1316l) {
                    this.k--;
                }
            }
            this.f1316l = -2;
            this.f1315j.i--;
        }

        public void reset() {
            this.f1316l = -2;
            this.k = -1;
            if (this.f1315j.m) {
                this.i = true;
            } else {
                a();
            }
        }
    }

    public f() {
        this(51, 0.8f);
    }

    public a<V> a() {
        if (ik3.allocateIterators) {
            return new a<>(this);
        }
        if (this.r == null) {
            this.r = new a(this);
            this.s = new a(this);
        }
        a aVar = this.r;
        if (aVar.m) {
            this.s.reset();
            a<V> aVar2 = this.s;
            aVar2.m = true;
            this.r.m = false;
            return aVar2;
        }
        aVar.reset();
        a<V> aVar3 = this.r;
        aVar3.m = true;
        this.s.m = false;
        return aVar3;
    }

    public V b(long j2) {
        if (j2 == 0) {
            if (this.m) {
                return this.f1312l;
            }
            return null;
        }
        int iD = d(j2);
        if (iD >= 0) {
            return this.k[iD];
        }
        return null;
    }

    public V c(long j2, V v) {
        if (j2 == 0) {
            return this.m ? this.f1312l : v;
        }
        int iD = d(j2);
        return iD >= 0 ? this.k[iD] : v;
    }

    public final int d(long j2) {
        long[] jArr = this.f1311j;
        int iE = e(j2);
        while (true) {
            long j3 = jArr[iE];
            if (j3 == 0) {
                return -(iE + 1);
            }
            if (j3 == j2) {
                return iE;
            }
            iE = (iE + 1) & this.q;
        }
    }

    public int e(long j2) {
        return (int) (((j2 ^ (j2 >>> 32)) * (-7046029254386353131L)) >>> this.p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (fVar.i != this.i) {
            return false;
        }
        boolean z = fVar.m;
        boolean z2 = this.m;
        if (z != z2) {
            return false;
        }
        if (z2) {
            V v = fVar.f1312l;
            if (v == null) {
                if (this.f1312l != null) {
                    return false;
                }
            } else if (!v.equals(this.f1312l)) {
                return false;
            }
        }
        long[] jArr = this.f1311j;
        V[] vArr = this.k;
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            long j2 = jArr[i];
            if (j2 != 0) {
                V v2 = vArr[i];
                if (v2 == null) {
                    if (fVar.c(j2, i.v) != null) {
                        return false;
                    }
                } else if (!v2.equals(fVar.b(j2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public V f(long j2, V v) {
        if (j2 == 0) {
            V v2 = this.f1312l;
            this.f1312l = v;
            if (!this.m) {
                this.m = true;
                this.i++;
            }
            return v2;
        }
        int iD = d(j2);
        if (iD >= 0) {
            V[] vArr = this.k;
            V v3 = vArr[iD];
            vArr[iD] = v;
            return v3;
        }
        int i = -(iD + 1);
        long[] jArr = this.f1311j;
        jArr[i] = j2;
        this.k[i] = v;
        int i2 = this.i + 1;
        this.i = i2;
        if (i2 < this.o) {
            return null;
        }
        i(jArr.length << 1);
        return null;
    }

    public final void g(long j2, V v) {
        long[] jArr = this.f1311j;
        int iE = e(j2);
        while (jArr[iE] != 0) {
            iE = (iE + 1) & this.q;
        }
        jArr[iE] = j2;
        this.k[iE] = v;
    }

    public V h(long j2) {
        if (j2 == 0) {
            if (!this.m) {
                return null;
            }
            this.m = false;
            V v = this.f1312l;
            this.f1312l = null;
            this.i--;
            return v;
        }
        int iD = d(j2);
        if (iD < 0) {
            return null;
        }
        long[] jArr = this.f1311j;
        V[] vArr = this.k;
        V v2 = vArr[iD];
        int i = this.q;
        int i2 = iD + 1;
        while (true) {
            int i3 = i2 & i;
            long j3 = jArr[i3];
            if (j3 == 0) {
                jArr[iD] = 0;
                vArr[iD] = null;
                this.i--;
                return v2;
            }
            int iE = e(j3);
            if (((i3 - iE) & i) > ((iD - iE) & i)) {
                jArr[iD] = j3;
                vArr[iD] = vArr[i3];
                iD = i3;
            }
            i2 = i3 + 1;
        }
    }

    public int hashCode() {
        V v;
        int iHashCode = this.i;
        if (this.m && (v = this.f1312l) != null) {
            iHashCode += v.hashCode();
        }
        long[] jArr = this.f1311j;
        V[] vArr = this.k;
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            long j2 = jArr[i];
            if (j2 != 0) {
                iHashCode = (int) (((long) iHashCode) + (j2 * 31));
                V v2 = vArr[i];
                if (v2 != null) {
                    iHashCode += v2.hashCode();
                }
            }
        }
        return iHashCode;
    }

    public final void i(int i) {
        int length = this.f1311j.length;
        this.o = (int) (i * this.f1313n);
        int i2 = i - 1;
        this.q = i2;
        this.p = Long.numberOfLeadingZeros(i2);
        long[] jArr = this.f1311j;
        V[] vArr = this.k;
        this.f1311j = new long[i];
        this.k = (V[]) new Object[i];
        if (this.i > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                long j2 = jArr[i3];
                if (j2 != 0) {
                    g(j2, vArr[i3]);
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<b<V>> iterator() {
        return a();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:21:0x004e A[EDGE_INSN: B:21:0x004e->B:15:0x0042 BREAK  A[LOOP:0: B:9:0x002b->B:13:0x0035]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0042 -> B:16:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.String toString() {
        /*
            r9 = this;
            int r0 = r9.i
            if (r0 != 0) goto L7
            java.lang.String r9 = "[]"
            return r9
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            long[] r1 = r9.f1311j
            V[] r2 = r9.k
            int r3 = r1.length
            boolean r4 = r9.m
            r5 = 61
            r6 = 0
            if (r4 == 0) goto L2b
            java.lang.String r4 = "0="
            r0.append(r4)
            V r9 = r9.f1312l
            r0.append(r9)
            goto L43
        L2b:
            int r9 = r3 + (-1)
            if (r3 <= 0) goto L42
            r3 = r1[r9]
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L37
            r3 = r9
            goto L2b
        L37:
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r9]
            r0.append(r3)
        L42:
            r3 = r9
        L43:
            int r9 = r3 + (-1)
            if (r3 <= 0) goto L5f
            r3 = r1[r9]
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L4e
            goto L42
        L4e:
            java.lang.String r8 = ", "
            r0.append(r8)
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r9]
            r0.append(r3)
            goto L42
        L5f:
            r9 = 93
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.f.toString():java.lang.String");
    }

    public f(int i) {
        this(i, 0.8f);
    }

    public f(int i, float f) {
        if (f > 0.0f && f < 1.0f) {
            this.f1313n = f;
            int iH = j.h(i, f);
            this.o = (int) (iH * f);
            int i2 = iH - 1;
            this.q = i2;
            this.p = Long.numberOfLeadingZeros(i2);
            this.f1311j = new long[iH];
            this.k = (V[]) new Object[iH];
            return;
        }
        throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f);
    }
}
