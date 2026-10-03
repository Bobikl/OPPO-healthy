package com.badlogic.gdx.utils;

import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.aiunit.vision.ik3;
import com.oplus.aiunit.vision.kam;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public class h<K> implements Iterable<b<K>> {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public K[] f1323j;
    public int[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1324l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1325n;
    public int o;
    public transient a p;
    public transient a q;

    public static class a<K> extends c<K> implements Iterable<b<K>>, Iterator<b<K>> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public b<K> f1326n;

        public a(h<K> hVar) {
            super(hVar);
            this.f1326n = new b<>();
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a<K> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b<K> next() {
            if (!this.i) {
                throw new NoSuchElementException();
            }
            if (!this.m) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            h<K> hVar = this.f1327j;
            K[] kArr = hVar.f1323j;
            b<K> bVar = this.f1326n;
            int i = this.k;
            bVar.a = kArr[i];
            bVar.b = hVar.k[i];
            this.f1328l = i;
            a();
            return this.f1326n;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.m) {
                return this.i;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // com.badlogic.gdx.utils.h.c, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.h.c
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public static class b<K> {
        public K a;
        public int b;

        public String toString() {
            return this.a + HttpUtils.EQUAL_SIGN + this.b;
        }
    }

    public static class c<K> {
        public boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final h<K> f1327j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1328l;
        public boolean m = true;

        public c(h<K> hVar) {
            this.f1327j = hVar;
            reset();
        }

        public void a() {
            int i;
            K[] kArr = this.f1327j.f1323j;
            int length = kArr.length;
            do {
                i = this.k + 1;
                this.k = i;
                if (i >= length) {
                    this.i = false;
                    return;
                }
            } while (kArr[i] == null);
            this.i = true;
        }

        public void remove() {
            int i = this.f1328l;
            if (i < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            h<K> hVar = this.f1327j;
            K[] kArr = hVar.f1323j;
            int[] iArr = hVar.k;
            int i2 = hVar.o;
            int i3 = i + 1;
            while (true) {
                int i4 = i3 & i2;
                K k = kArr[i4];
                if (k == null) {
                    break;
                }
                int iH = this.f1327j.h(k);
                if (((i4 - iH) & i2) > ((i - iH) & i2)) {
                    kArr[i] = k;
                    iArr[i] = iArr[i4];
                    i = i4;
                }
                i3 = i4 + 1;
            }
            kArr[i] = null;
            this.f1327j.i--;
            if (i != this.f1328l) {
                this.k--;
            }
            this.f1328l = -1;
        }

        public void reset() {
            this.f1328l = -1;
            this.k = -1;
            a();
        }
    }

    public h() {
        this(51, 0.8f);
    }

    public void a(int i) {
        int iH = j.h(i, this.f1324l);
        if (this.f1323j.length <= iH) {
            clear();
        } else {
            this.i = 0;
            k(iH);
        }
    }

    public boolean b(K k) {
        return g(k) >= 0;
    }

    public a<K> c() {
        if (ik3.allocateIterators) {
            return new a<>(this);
        }
        if (this.p == null) {
            this.p = new a(this);
            this.q = new a(this);
        }
        a aVar = this.p;
        if (aVar.m) {
            this.q.reset();
            a<K> aVar2 = this.q;
            aVar2.m = true;
            this.p.m = false;
            return aVar2;
        }
        aVar.reset();
        a<K> aVar3 = this.p;
        aVar3.m = true;
        this.q.m = false;
        return aVar3;
    }

    public void clear() {
        if (this.i == 0) {
            return;
        }
        this.i = 0;
        Arrays.fill(this.f1323j, (Object) null);
    }

    public int d(K k, int i) {
        int iG = g(k);
        return iG < 0 ? i : this.k[iG];
    }

    public int e(K k, int i, int i2) {
        int iG = g(k);
        if (iG >= 0) {
            int[] iArr = this.k;
            int i3 = iArr[iG];
            iArr[iG] = i2 + i3;
            return i3;
        }
        int i4 = -(iG + 1);
        K[] kArr = this.f1323j;
        kArr[i4] = k;
        this.k[i4] = i2 + i;
        int i5 = this.i + 1;
        this.i = i5;
        if (i5 >= this.m) {
            k(kArr.length << 1);
        }
        return i;
    }

    public boolean equals(Object obj) {
        int iD;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (hVar.i != this.i) {
            return false;
        }
        K[] kArr = this.f1323j;
        int[] iArr = this.k;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null && (((iD = hVar.d(k, 0)) == 0 && !hVar.b(k)) || iD != iArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a<K> iterator() {
        return c();
    }

    public int g(K k) {
        if (k == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        K[] kArr = this.f1323j;
        int iH = h(k);
        while (true) {
            K k2 = kArr[iH];
            if (k2 == null) {
                return -(iH + 1);
            }
            if (k2.equals(k)) {
                return iH;
            }
            iH = (iH + 1) & this.o;
        }
    }

    public int h(K k) {
        return (int) ((((long) k.hashCode()) * (-7046029254386353131L)) >>> this.f1325n);
    }

    public int hashCode() {
        int iHashCode = this.i;
        K[] kArr = this.f1323j;
        int[] iArr = this.k;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                iHashCode += k.hashCode() + iArr[i];
            }
        }
        return iHashCode;
    }

    public void i(K k, int i) {
        int iG = g(k);
        if (iG >= 0) {
            this.k[iG] = i;
            return;
        }
        int i2 = -(iG + 1);
        K[] kArr = this.f1323j;
        kArr[i2] = k;
        this.k[i2] = i;
        int i3 = this.i + 1;
        this.i = i3;
        if (i3 >= this.m) {
            k(kArr.length << 1);
        }
    }

    public final void j(K k, int i) {
        K[] kArr = this.f1323j;
        int iH = h(k);
        while (kArr[iH] != null) {
            iH = (iH + 1) & this.o;
        }
        kArr[iH] = k;
        this.k[iH] = i;
    }

    public final void k(int i) {
        int length = this.f1323j.length;
        this.m = (int) (i * this.f1324l);
        int i2 = i - 1;
        this.o = i2;
        this.f1325n = Long.numberOfLeadingZeros(i2);
        K[] kArr = this.f1323j;
        int[] iArr = this.k;
        this.f1323j = (K[]) new Object[i];
        this.k = new int[i];
        if (this.i > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                K k = kArr[i3];
                if (k != null) {
                    j(k, iArr[i3]);
                }
            }
        }
    }

    public final String l(String str, boolean z) {
        int i;
        if (this.i == 0) {
            return z ? "{}" : "";
        }
        StringBuilder sb = new StringBuilder(32);
        if (z) {
            sb.append('{');
        }
        K[] kArr = this.f1323j;
        int[] iArr = this.k;
        int length = kArr.length;
        while (true) {
            i = length - 1;
            if (length > 0) {
                K k = kArr[i];
                if (k != null) {
                    sb.append(k);
                    sb.append(kam.h);
                    sb.append(iArr[i]);
                    break;
                }
                length = i;
            } else {
                break;
            }
        }
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            K k2 = kArr[i2];
            if (k2 != null) {
                sb.append(str);
                sb.append(k2);
                sb.append(kam.h);
                sb.append(iArr[i2]);
            }
            i = i2;
        }
        if (z) {
            sb.append('}');
        }
        return sb.toString();
    }

    public String toString() {
        return l(", ", true);
    }

    public h(int i, float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f);
        }
        this.f1324l = f;
        int iH = j.h(i, f);
        this.m = (int) (iH * f);
        int i2 = iH - 1;
        this.o = i2;
        this.f1325n = Long.numberOfLeadingZeros(i2);
        this.f1323j = (K[]) new Object[iH];
        this.k = new int[iH];
    }
}
