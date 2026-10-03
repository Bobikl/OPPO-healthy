package com.badlogic.gdx.utils;

import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.aiunit.vision.ik3;
import com.oplus.aiunit.vision.kam;
import com.oplus.aiunit.vision.wg0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public class i<K, V> implements Iterable<b<K, V>> {
    public static final Object v = new Object();
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public K[] f1329j;
    public V[] k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f1330l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1331n;
    public int o;
    public transient a p;
    public transient a q;
    public transient e r;
    public transient e s;
    public transient c t;
    public transient c u;

    public static class a<K, V> extends d<K, V, b<K, V>> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public b<K, V> f1332n;

        public a(i<K, V> iVar) {
            super(iVar);
            this.f1332n = new b<>();
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a<K, V> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b<K, V> next() {
            if (!this.i) {
                throw new NoSuchElementException();
            }
            if (!this.m) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            i<K, V> iVar = this.f1333j;
            K[] kArr = iVar.f1329j;
            b<K, V> bVar = this.f1332n;
            int i = this.k;
            bVar.a = kArr[i];
            bVar.b = iVar.k[i];
            this.f1334l = i;
            a();
            return this.f1332n;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.m) {
                return this.i;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // com.badlogic.gdx.utils.i.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.i.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public static class b<K, V> {
        public K a;
        public V b;

        public String toString() {
            return this.a + HttpUtils.EQUAL_SIGN + this.b;
        }
    }

    public static class c<K> extends d<K, Object, K> {
        public c(i<K, ?> iVar) {
            super(iVar);
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c<K> iterator() {
            return this;
        }

        public wg0<K> c() {
            return d(new wg0<>(true, this.f1333j.i));
        }

        public wg0<K> d(wg0<K> wg0Var) {
            while (this.i) {
                wg0Var.a(next());
            }
            return wg0Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.m) {
                return this.i;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public K next() {
            if (!this.i) {
                throw new NoSuchElementException();
            }
            if (!this.m) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            K[] kArr = this.f1333j.f1329j;
            int i = this.k;
            K k = kArr[i];
            this.f1334l = i;
            a();
            return k;
        }

        @Override // com.badlogic.gdx.utils.i.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.i.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public static abstract class d<K, V, I> implements Iterable<I>, Iterator<I> {
        public boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final i<K, V> f1333j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1334l;
        public boolean m = true;

        public d(i<K, V> iVar) {
            this.f1333j = iVar;
            reset();
        }

        public void a() {
            int i;
            K[] kArr = this.f1333j.f1329j;
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
            int i = this.f1334l;
            if (i < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            i<K, V> iVar = this.f1333j;
            K[] kArr = iVar.f1329j;
            V[] vArr = iVar.k;
            int i2 = iVar.o;
            int i3 = i + 1;
            while (true) {
                int i4 = i3 & i2;
                K k = kArr[i4];
                if (k == null) {
                    break;
                }
                int iG = this.f1333j.g(k);
                if (((i4 - iG) & i2) > ((i - iG) & i2)) {
                    kArr[i] = k;
                    vArr[i] = vArr[i4];
                    i = i4;
                }
                i3 = i4 + 1;
            }
            kArr[i] = null;
            vArr[i] = null;
            this.f1333j.i--;
            if (i != this.f1334l) {
                this.k--;
            }
            this.f1334l = -1;
        }

        public void reset() {
            this.f1334l = -1;
            this.k = -1;
            a();
        }
    }

    public static class e<V> extends d<Object, V, V> {
        public e(i<?, V> iVar) {
            super(iVar);
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e<V> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.m) {
                return this.i;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.i) {
                throw new NoSuchElementException();
            }
            if (!this.m) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            V[] vArr = this.f1333j.k;
            int i = this.k;
            V v = vArr[i];
            this.f1334l = i;
            a();
            return v;
        }

        @Override // com.badlogic.gdx.utils.i.d, java.util.Iterator
        public /* bridge */ /* synthetic */ void remove() {
            super.remove();
        }

        @Override // com.badlogic.gdx.utils.i.d
        public /* bridge */ /* synthetic */ void reset() {
            super.reset();
        }
    }

    public i() {
        this(51, 0.8f);
    }

    public void a(int i) {
        int iH = j.h(i, this.f1330l);
        if (this.f1329j.length <= iH) {
            clear();
        } else {
            this.i = 0;
            k(iH);
        }
    }

    public boolean b(K k) {
        return f(k) >= 0;
    }

    public a<K, V> c() {
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
            a<K, V> aVar2 = this.q;
            aVar2.m = true;
            this.p.m = false;
            return aVar2;
        }
        aVar.reset();
        a<K, V> aVar3 = this.p;
        aVar3.m = true;
        this.q.m = false;
        return aVar3;
    }

    public void clear() {
        if (this.i == 0) {
            return;
        }
        this.i = 0;
        Arrays.fill(this.f1329j, (Object) null);
        Arrays.fill(this.k, (Object) null);
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a<K, V> iterator() {
        return c();
    }

    public c<K> e() {
        if (ik3.allocateIterators) {
            return new c<>(this);
        }
        if (this.t == null) {
            this.t = new c(this);
            this.u = new c(this);
        }
        c cVar = this.t;
        if (cVar.m) {
            this.u.reset();
            c<K> cVar2 = this.u;
            cVar2.m = true;
            this.t.m = false;
            return cVar2;
        }
        cVar.reset();
        c<K> cVar3 = this.t;
        cVar3.m = true;
        this.u.m = false;
        return cVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (iVar.i != this.i) {
            return false;
        }
        K[] kArr = this.f1329j;
        V[] vArr = this.k;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                V v2 = vArr[i];
                if (v2 == null) {
                    if (iVar.get(k, v) != null) {
                        return false;
                    }
                } else if (!v2.equals(iVar.get(k))) {
                    return false;
                }
            }
        }
        return true;
    }

    public int f(K k) {
        if (k == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        K[] kArr = this.f1329j;
        int iG = g(k);
        while (true) {
            K k2 = kArr[iG];
            if (k2 == null) {
                return -(iG + 1);
            }
            if (k2.equals(k)) {
                return iG;
            }
            iG = (iG + 1) & this.o;
        }
    }

    public int g(K k) {
        return (int) ((((long) k.hashCode()) * (-7046029254386353131L)) >>> this.f1331n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends K> V get(T t) {
        int iF = f(t);
        if (iF < 0) {
            return null;
        }
        return this.k[iF];
    }

    public V h(K k, V v2) {
        int iF = f(k);
        if (iF >= 0) {
            V[] vArr = this.k;
            V v3 = vArr[iF];
            vArr[iF] = v2;
            return v3;
        }
        int i = -(iF + 1);
        K[] kArr = this.f1329j;
        kArr[i] = k;
        this.k[i] = v2;
        int i2 = this.i + 1;
        this.i = i2;
        if (i2 < this.m) {
            return null;
        }
        k(kArr.length << 1);
        return null;
    }

    public int hashCode() {
        int iHashCode = this.i;
        K[] kArr = this.f1329j;
        V[] vArr = this.k;
        int length = kArr.length;
        for (int i = 0; i < length; i++) {
            K k = kArr[i];
            if (k != null) {
                iHashCode += k.hashCode();
                V v2 = vArr[i];
                if (v2 != null) {
                    iHashCode += v2.hashCode();
                }
            }
        }
        return iHashCode;
    }

    public final void i(K k, V v2) {
        K[] kArr = this.f1329j;
        int iG = g(k);
        while (kArr[iG] != null) {
            iG = (iG + 1) & this.o;
        }
        kArr[iG] = k;
        this.k[iG] = v2;
    }

    public V j(K k) {
        int iF = f(k);
        if (iF < 0) {
            return null;
        }
        K[] kArr = this.f1329j;
        V[] vArr = this.k;
        V v2 = vArr[iF];
        int i = this.o;
        int i2 = iF + 1;
        while (true) {
            int i3 = i2 & i;
            K k2 = kArr[i3];
            if (k2 == null) {
                kArr[iF] = null;
                vArr[iF] = null;
                this.i--;
                return v2;
            }
            int iG = g(k2);
            if (((i3 - iG) & i) > ((iF - iG) & i)) {
                kArr[iF] = k2;
                vArr[iF] = vArr[i3];
                iF = i3;
            }
            i2 = i3 + 1;
        }
    }

    public final void k(int i) {
        int length = this.f1329j.length;
        this.m = (int) (i * this.f1330l);
        int i2 = i - 1;
        this.o = i2;
        this.f1331n = Long.numberOfLeadingZeros(i2);
        K[] kArr = this.f1329j;
        V[] vArr = this.k;
        this.f1329j = (K[]) new Object[i];
        this.k = (V[]) new Object[i];
        if (this.i > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                K k = kArr[i3];
                if (k != null) {
                    i(k, vArr[i3]);
                }
            }
        }
    }

    public String l(String str, boolean z) {
        int i;
        if (this.i == 0) {
            return z ? "{}" : "";
        }
        StringBuilder sb = new StringBuilder(32);
        if (z) {
            sb.append('{');
        }
        Object[] objArr = this.f1329j;
        Object[] objArr2 = this.k;
        int length = objArr.length;
        while (true) {
            i = length - 1;
            if (length > 0) {
                Object obj = objArr[i];
                if (obj != null) {
                    if (obj == this) {
                        obj = "(this)";
                    }
                    sb.append(obj);
                    sb.append(kam.h);
                    Object obj2 = objArr2[i];
                    if (obj2 == this) {
                        obj2 = "(this)";
                    }
                    sb.append(obj2);
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
            Object obj3 = objArr[i2];
            if (obj3 != null) {
                sb.append(str);
                if (obj3 == this) {
                    obj3 = "(this)";
                }
                sb.append(obj3);
                sb.append(kam.h);
                Object obj4 = objArr2[i2];
                if (obj4 == this) {
                    obj4 = "(this)";
                }
                sb.append(obj4);
            }
            i = i2;
        }
        if (z) {
            sb.append('}');
        }
        return sb.toString();
    }

    public e<V> m() {
        if (ik3.allocateIterators) {
            return new e<>(this);
        }
        if (this.r == null) {
            this.r = new e(this);
            this.s = new e(this);
        }
        e eVar = this.r;
        if (eVar.m) {
            this.s.reset();
            e<V> eVar2 = this.s;
            eVar2.m = true;
            this.r.m = false;
            return eVar2;
        }
        eVar.reset();
        e<V> eVar3 = this.r;
        eVar3.m = true;
        this.s.m = false;
        return eVar3;
    }

    public String toString() {
        return l(", ", true);
    }

    public i(int i) {
        this(i, 0.8f);
    }

    public i(int i, float f) {
        if (f > 0.0f && f < 1.0f) {
            this.f1330l = f;
            int iH = j.h(i, f);
            this.m = (int) (iH * f);
            int i2 = iH - 1;
            this.o = i2;
            this.f1331n = Long.numberOfLeadingZeros(i2);
            this.f1329j = (K[]) new Object[iH];
            this.k = (V[]) new Object[iH];
            return;
        }
        throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f);
    }

    public V get(K k, V v2) {
        int iF = f(k);
        return iF < 0 ? v2 : this.k[iF];
    }
}
