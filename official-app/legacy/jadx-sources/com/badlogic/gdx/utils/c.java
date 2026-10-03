package com.badlogic.gdx.utils;

import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.aiunit.vision.ik3;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public class c<V> implements Iterable<b<V>> {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f1294j;
    public V[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public V f1295l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f1296n;
    public int o;
    public int p;
    public int q;
    public transient a r;
    public transient a s;

    public static class a<V> extends C0170c<V> implements Iterable<b<V>>, Iterator<b<V>> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final b<V> f1297n;

        public a(c cVar) {
            super(cVar);
            this.f1297n = new b<>();
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
            c<V> cVar = this.f1298j;
            int[] iArr = cVar.f1294j;
            int i = this.k;
            if (i == -1) {
                b<V> bVar = this.f1297n;
                bVar.a = 0;
                bVar.b = cVar.f1295l;
            } else {
                b<V> bVar2 = this.f1297n;
                bVar2.a = iArr[i];
                bVar2.b = cVar.k[i];
            }
            this.f1299l = i;
            a();
            return this.f1297n;
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

        @Override // com.badlogic.gdx.utils.c.C0170c, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.c.C0170c
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public static class b<V> {
        public int a;
        public V b;

        public String toString() {
            return this.a + HttpUtils.EQUAL_SIGN + this.b;
        }
    }

    /* JADX INFO: renamed from: com.badlogic.gdx.utils.c$c, reason: collision with other inner class name */
    public static class C0170c<V> {
        public boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final c<V> f1298j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1299l;
        public boolean m = true;

        public C0170c(c<V> cVar) {
            this.f1298j = cVar;
            reset();
        }

        public void a() {
            int i;
            int[] iArr = this.f1298j.f1294j;
            int length = iArr.length;
            do {
                i = this.k + 1;
                this.k = i;
                if (i >= length) {
                    this.i = false;
                    return;
                }
            } while (iArr[i] == 0);
            this.i = true;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0023  */
        /* JADX WARN: Code duplicated, block: B:13:0x0031  */
        /* JADX WARN: Code duplicated, block: B:17:0x0043  */
        /* JADX WARN: Code duplicated, block: B:20:0x0055  */
        /* JADX WARN: Code duplicated, block: B:22:0x003b A[EDGE_INSN: B:22:0x003b->B:15:0x003b BREAK  A[LOOP:0: B:9:0x001e->B:14:0x0038], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:0x0038 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0012 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        public void remove() {
            int[] iArr;
            V[] vArr;
            int i;
            int i2;
            int i3;
            int i4;
            int iD;
            int i5 = this.f1299l;
            if (i5 == -1) {
                c<V> cVar = this.f1298j;
                if (cVar.m) {
                    cVar.m = false;
                    cVar.f1295l = null;
                } else {
                    if (i5 >= 0) {
                        throw new IllegalStateException("next must be called before remove.");
                    }
                    c<V> cVar2 = this.f1298j;
                    iArr = cVar2.f1294j;
                    vArr = cVar2.k;
                    i = cVar2.q;
                    i2 = i5 + 1;
                    while (true) {
                        i3 = i2 & i;
                        i4 = iArr[i3];
                        if (i4 != 0) {
                            break;
                        }
                        iD = this.f1298j.d(i4);
                        if (((i3 - iD) & i) > ((i5 - iD) & i)) {
                            iArr[i5] = i4;
                            vArr[i5] = vArr[i3];
                            i5 = i3;
                        }
                        i2 = i3 + 1;
                    }
                    iArr[i5] = 0;
                    vArr[i5] = null;
                    if (i5 != this.f1299l) {
                        this.k--;
                    }
                }
            } else {
                if (i5 >= 0) {
                    throw new IllegalStateException("next must be called before remove.");
                }
                c<V> cVar3 = this.f1298j;
                iArr = cVar3.f1294j;
                vArr = cVar3.k;
                i = cVar3.q;
                i2 = i5 + 1;
                while (true) {
                    i3 = i2 & i;
                    i4 = iArr[i3];
                    if (i4 != 0) {
                        break;
                        break;
                    }
                    iD = this.f1298j.d(i4);
                    if (((i3 - iD) & i) > ((i5 - iD) & i)) {
                        iArr[i5] = i4;
                        vArr[i5] = vArr[i3];
                        i5 = i3;
                    }
                    i2 = i3 + 1;
                }
                iArr[i5] = 0;
                vArr[i5] = null;
                if (i5 != this.f1299l) {
                    this.k--;
                }
            }
            this.f1299l = -2;
            this.f1298j.i--;
        }

        public void reset() {
            this.f1299l = -2;
            this.k = -1;
            if (this.f1298j.m) {
                this.i = true;
            } else {
                a();
            }
        }
    }

    public c() {
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

    public V b(int i, V v) {
        if (i == 0) {
            return this.m ? this.f1295l : v;
        }
        int iC = c(i);
        return iC >= 0 ? this.k[iC] : v;
    }

    public final int c(int i) {
        int[] iArr = this.f1294j;
        int iD = d(i);
        while (true) {
            int i2 = iArr[iD];
            if (i2 == 0) {
                return -(iD + 1);
            }
            if (i2 == i) {
                return iD;
            }
            iD = (iD + 1) & this.q;
        }
    }

    public int d(int i) {
        return (int) ((((long) i) * (-7046029254386353131L)) >>> this.p);
    }

    public V e(int i, V v) {
        if (i == 0) {
            V v2 = this.f1295l;
            this.f1295l = v;
            if (!this.m) {
                this.m = true;
                this.i++;
            }
            return v2;
        }
        int iC = c(i);
        if (iC >= 0) {
            V[] vArr = this.k;
            V v3 = vArr[iC];
            vArr[iC] = v;
            return v3;
        }
        int i2 = -(iC + 1);
        int[] iArr = this.f1294j;
        iArr[i2] = i;
        this.k[i2] = v;
        int i3 = this.i + 1;
        this.i = i3;
        if (i3 < this.o) {
            return null;
        }
        g(iArr.length << 1);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (cVar.i != this.i) {
            return false;
        }
        boolean z = cVar.m;
        boolean z2 = this.m;
        if (z != z2) {
            return false;
        }
        if (z2) {
            V v = cVar.f1295l;
            if (v == null) {
                if (this.f1295l != null) {
                    return false;
                }
            } else if (!v.equals(this.f1295l)) {
                return false;
            }
        }
        int[] iArr = this.f1294j;
        V[] vArr = this.k;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                V v2 = vArr[i];
                if (v2 == null) {
                    if (cVar.b(i2, i.v) != null) {
                        return false;
                    }
                } else if (!v2.equals(cVar.get(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void f(int i, V v) {
        int[] iArr = this.f1294j;
        int iD = d(i);
        while (iArr[iD] != 0) {
            iD = (iD + 1) & this.q;
        }
        iArr[iD] = i;
        this.k[iD] = v;
    }

    public final void g(int i) {
        int length = this.f1294j.length;
        this.o = (int) (i * this.f1296n);
        int i2 = i - 1;
        this.q = i2;
        this.p = Long.numberOfLeadingZeros(i2);
        int[] iArr = this.f1294j;
        V[] vArr = this.k;
        this.f1294j = new int[i];
        this.k = (V[]) new Object[i];
        if (this.i > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                int i4 = iArr[i3];
                if (i4 != 0) {
                    f(i4, vArr[i3]);
                }
            }
        }
    }

    public V get(int i) {
        if (i == 0) {
            if (this.m) {
                return this.f1295l;
            }
            return null;
        }
        int iC = c(i);
        if (iC >= 0) {
            return this.k[iC];
        }
        return null;
    }

    public int hashCode() {
        V v;
        int iHashCode = this.i;
        if (this.m && (v = this.f1295l) != null) {
            iHashCode += v.hashCode();
        }
        int[] iArr = this.f1294j;
        V[] vArr = this.k;
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                iHashCode += i2 * 31;
                V v2 = vArr[i];
                if (v2 != null) {
                    iHashCode += v2.hashCode();
                }
            }
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator<b<V>> iterator() {
        return a();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[EDGE_INSN: B:21:0x0048->B:15:0x003e BREAK  A[LOOP:0: B:9:0x0029->B:13:0x0031]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003e -> B:16:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.String toString() {
        /*
            r6 = this;
            int r0 = r6.i
            if (r0 != 0) goto L7
            java.lang.String r6 = "[]"
            return r6
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 32
            r0.<init>(r1)
            r1 = 91
            r0.append(r1)
            int[] r1 = r6.f1294j
            V[] r2 = r6.k
            int r3 = r1.length
            boolean r4 = r6.m
            r5 = 61
            if (r4 == 0) goto L29
            java.lang.String r4 = "0="
            r0.append(r4)
            V r6 = r6.f1295l
            r0.append(r6)
            goto L3f
        L29:
            int r6 = r3 + (-1)
            if (r3 <= 0) goto L3e
            r3 = r1[r6]
            if (r3 != 0) goto L33
            r3 = r6
            goto L29
        L33:
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r6]
            r0.append(r3)
        L3e:
            r3 = r6
        L3f:
            int r6 = r3 + (-1)
            if (r3 <= 0) goto L59
            r3 = r1[r6]
            if (r3 != 0) goto L48
            goto L3e
        L48:
            java.lang.String r4 = ", "
            r0.append(r4)
            r0.append(r3)
            r0.append(r5)
            r3 = r2[r6]
            r0.append(r3)
            goto L3e
        L59:
            r6 = 93
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.utils.c.toString():java.lang.String");
    }

    public c(int i, float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f);
        }
        this.f1296n = f;
        int iH = j.h(i, f);
        this.o = (int) (iH * f);
        int i2 = iH - 1;
        this.q = i2;
        this.p = Long.numberOfLeadingZeros(i2);
        this.f1294j = new int[iH];
        this.k = (V[]) new Object[iH];
    }
}
