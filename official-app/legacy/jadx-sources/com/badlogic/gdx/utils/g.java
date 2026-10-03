package com.badlogic.gdx.utils;

import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.aiunit.vision.ik3;
import com.oplus.aiunit.vision.kam;
import com.oplus.aiunit.vision.rzc;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public class g<K> implements Iterable<b<K>> {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public K[] f1317j;
    public float[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1318l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1319n;
    public int o;
    public transient a p;
    public transient a q;

    public static class a<K> extends c<K> implements Iterable<b<K>>, Iterator<b<K>> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public b<K> f1320n;

        public a(g<K> gVar) {
            super(gVar);
            this.f1320n = new b<>();
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
            g<K> gVar = this.f1321j;
            K[] kArr = gVar.f1317j;
            b<K> bVar = this.f1320n;
            int i = this.k;
            bVar.a = kArr[i];
            bVar.b = gVar.k[i];
            this.f1322l = i;
            a();
            return this.f1320n;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.m) {
                return this.i;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // com.badlogic.gdx.utils.g.c, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.g.c
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public static class b<K> {
        public K a;
        public float b;

        public String toString() {
            return this.a + HttpUtils.EQUAL_SIGN + this.b;
        }
    }

    public static class c<K> {
        public boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final g<K> f1321j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1322l;
        public boolean m = true;

        public c(g<K> gVar) {
            this.f1321j = gVar;
            reset();
        }

        public void a() {
            int i;
            K[] kArr = this.f1321j.f1317j;
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
            int i = this.f1322l;
            if (i < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            g<K> gVar = this.f1321j;
            K[] kArr = gVar.f1317j;
            float[] fArr = gVar.k;
            int i2 = gVar.o;
            int i3 = i + 1;
            while (true) {
                int i4 = i3 & i2;
                K k = kArr[i4];
                if (k == null) {
                    break;
                }
                int iF = this.f1321j.f(k);
                if (((i4 - iF) & i2) > ((i - iF) & i2)) {
                    kArr[i] = k;
                    fArr[i] = fArr[i4];
                    i = i4;
                }
                i3 = i4 + 1;
            }
            kArr[i] = null;
            this.f1321j.i--;
            if (i != this.f1322l) {
                this.k--;
            }
            this.f1322l = -1;
        }

        public void reset() {
            this.f1322l = -1;
            this.k = -1;
            a();
        }
    }

    public g() {
        this(51, 0.8f);
    }

    public boolean a(K k) {
        return e(k) >= 0;
    }

    public a<K> b() {
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

    public float c(K k, float f) {
        int iE = e(k);
        return iE < 0 ? f : this.k[iE];
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a<K> iterator() {
        return b();
    }

    public int e(K k) {
        if (k == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        K[] kArr = this.f1317j;
        int iF = f(k);
        while (true) {
            K k2 = kArr[iF];
            if (k2 == null) {
                return -(iF + 1);
            }
            if (k2.equals(k)) {
                return iF;
            }
            iF = (iF + 1) & this.o;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (gVar.i != this.i) {
            return false;
        }
        K[] kArr = this.f1317j;
        float[] fArr = this.k;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                float fC = gVar.c(k, 0.0f);
                if ((fC == 0.0f && !gVar.a(k)) || fC != fArr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public int f(K k) {
        return (int) ((((long) k.hashCode()) * (-7046029254386353131L)) >>> this.f1319n);
    }

    public void g(K k, float f) {
        int iE = e(k);
        if (iE >= 0) {
            this.k[iE] = f;
            return;
        }
        int i = -(iE + 1);
        K[] kArr = this.f1317j;
        kArr[i] = k;
        this.k[i] = f;
        int i2 = this.i + 1;
        this.i = i2;
        if (i2 >= this.m) {
            i(kArr.length << 1);
        }
    }

    public final void h(K k, float f) {
        K[] kArr = this.f1317j;
        int iF = f(k);
        while (kArr[iF] != null) {
            iF = (iF + 1) & this.o;
        }
        kArr[iF] = k;
        this.k[iF] = f;
    }

    public int hashCode() {
        int iHashCode = this.i;
        K[] kArr = this.f1317j;
        float[] fArr = this.k;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                iHashCode += k.hashCode() + rzc.b(fArr[i]);
            }
        }
        return iHashCode;
    }

    public final void i(int i) {
        int length = this.f1317j.length;
        this.m = (int) (i * this.f1318l);
        int i2 = i - 1;
        this.o = i2;
        this.f1319n = Long.numberOfLeadingZeros(i2);
        K[] kArr = this.f1317j;
        float[] fArr = this.k;
        this.f1317j = (K[]) new Object[i];
        this.k = new float[i];
        if (this.i > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                K k = kArr[i3];
                if (k != null) {
                    h(k, fArr[i3]);
                }
            }
        }
    }

    public final String j(String str, boolean z) {
        int i;
        if (this.i == 0) {
            return z ? "{}" : "";
        }
        StringBuilder sb = new StringBuilder(32);
        if (z) {
            sb.append('{');
        }
        K[] kArr = this.f1317j;
        float[] fArr = this.k;
        int length = kArr.length;
        while (true) {
            i = length - 1;
            if (length > 0) {
                K k = kArr[i];
                if (k != null) {
                    sb.append(k);
                    sb.append(kam.h);
                    sb.append(fArr[i]);
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
                sb.append(fArr[i2]);
            }
            i = i2;
        }
        if (z) {
            sb.append('}');
        }
        return sb.toString();
    }

    public String toString() {
        return j(", ", true);
    }

    public g(int i, float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f);
        }
        this.f1318l = f;
        int iH = j.h(i, f);
        this.m = (int) (iH * f);
        int i2 = iH - 1;
        this.o = i2;
        this.f1319n = Long.numberOfLeadingZeros(i2);
        this.f1317j = (K[]) new Object[iH];
        this.k = new float[iH];
    }
}
