package com.badlogic.gdx.utils;

import com.oplus.aiunit.vision.ik3;
import com.oplus.aiunit.vision.kam;
import com.oplus.aiunit.vision.wg0;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public class k<K, V> extends i<K, V> {
    public final wg0<K> w;

    public static class a<K, V> extends i.a<K, V> {
        public wg0<K> o;

        public a(k<K, V> kVar) {
            super(kVar);
            this.o = kVar.w;
        }

        @Override // com.badlogic.gdx.utils.i.a, java.util.Iterator
        /* JADX INFO: renamed from: c */
        public i.b next() {
            if (!this.i) {
                throw new NoSuchElementException();
            }
            if (!this.m) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            int i = this.k;
            this.f1334l = i;
            this.f1332n.a = this.o.get(i);
            i.b<K, V> bVar = this.f1332n;
            bVar.b = this.f1333j.get(bVar.a);
            int i2 = this.k + 1;
            this.k = i2;
            this.i = i2 < this.f1333j.i;
            return this.f1332n;
        }

        @Override // com.badlogic.gdx.utils.i.a, com.badlogic.gdx.utils.i.d, java.util.Iterator
        public void remove() {
            if (this.f1334l < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            this.f1333j.j(this.f1332n.a);
            this.k--;
            this.f1334l = -1;
        }

        @Override // com.badlogic.gdx.utils.i.a, com.badlogic.gdx.utils.i.d
        public void reset() {
            this.f1334l = -1;
            this.k = 0;
            this.i = this.f1333j.i > 0;
        }
    }

    public static class b<K> extends i.c<K> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public wg0<K> f1340n;

        public b(k<K, ?> kVar) {
            super(kVar);
            this.f1340n = kVar.w;
        }

        @Override // com.badlogic.gdx.utils.i.c
        public wg0<K> c() {
            return d(new wg0<>(true, this.f1340n.f18241j - this.k));
        }

        @Override // com.badlogic.gdx.utils.i.c
        public wg0<K> d(wg0<K> wg0Var) {
            wg0<K> wg0Var2 = this.f1340n;
            int i = this.k;
            wg0Var.c(wg0Var2, i, wg0Var2.f18241j - i);
            this.k = this.f1340n.f18241j;
            this.i = false;
            return wg0Var;
        }

        @Override // com.badlogic.gdx.utils.i.c, java.util.Iterator
        public K next() {
            if (!this.i) {
                throw new NoSuchElementException();
            }
            if (!this.m) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            K k = this.f1340n.get(this.k);
            int i = this.k;
            this.f1334l = i;
            int i2 = i + 1;
            this.k = i2;
            this.i = i2 < this.f1333j.i;
            return k;
        }

        @Override // com.badlogic.gdx.utils.i.c, com.badlogic.gdx.utils.i.d, java.util.Iterator
        public void remove() {
            int i = this.f1334l;
            if (i < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            ((k) this.f1333j).n(i);
            this.k = this.f1334l;
            this.f1334l = -1;
        }

        @Override // com.badlogic.gdx.utils.i.c, com.badlogic.gdx.utils.i.d
        public void reset() {
            this.f1334l = -1;
            this.k = 0;
            this.i = this.f1333j.i > 0;
        }
    }

    public static class c<V> extends i.e<V> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public wg0 f1341n;

        public c(k<?, V> kVar) {
            super(kVar);
            this.f1341n = kVar.w;
        }

        @Override // com.badlogic.gdx.utils.i.e, java.util.Iterator
        public V next() {
            if (!this.i) {
                throw new NoSuchElementException();
            }
            if (!this.m) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            V v = this.f1333j.get(this.f1341n.get(this.k));
            int i = this.k;
            this.f1334l = i;
            int i2 = i + 1;
            this.k = i2;
            this.i = i2 < this.f1333j.i;
            return v;
        }

        @Override // com.badlogic.gdx.utils.i.e, com.badlogic.gdx.utils.i.d, java.util.Iterator
        public void remove() {
            int i = this.f1334l;
            if (i < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            ((k) this.f1333j).n(i);
            this.k = this.f1334l;
            this.f1334l = -1;
        }

        @Override // com.badlogic.gdx.utils.i.e, com.badlogic.gdx.utils.i.d
        public void reset() {
            this.f1334l = -1;
            this.k = 0;
            this.i = this.f1333j.i > 0;
        }
    }

    public k() {
        this.w = new wg0<>();
    }

    @Override // com.badlogic.gdx.utils.i
    public void a(int i) {
        this.w.clear();
        super.a(i);
    }

    @Override // com.badlogic.gdx.utils.i
    public i.a<K, V> c() {
        if (ik3.allocateIterators) {
            return new a(this);
        }
        if (this.p == null) {
            this.p = new a(this);
            this.q = new a(this);
        }
        i.a aVar = this.p;
        if (aVar.m) {
            this.q.reset();
            i.a<K, V> aVar2 = this.q;
            aVar2.m = true;
            this.p.m = false;
            return aVar2;
        }
        aVar.reset();
        i.a<K, V> aVar3 = this.p;
        aVar3.m = true;
        this.q.m = false;
        return aVar3;
    }

    @Override // com.badlogic.gdx.utils.i
    public void clear() {
        this.w.clear();
        super.clear();
    }

    @Override // com.badlogic.gdx.utils.i, java.lang.Iterable
    /* JADX INFO: renamed from: d */
    public i.a<K, V> iterator() {
        return c();
    }

    @Override // com.badlogic.gdx.utils.i
    public i.c<K> e() {
        if (ik3.allocateIterators) {
            return new b(this);
        }
        if (this.t == null) {
            this.t = new b(this);
            this.u = new b(this);
        }
        i.c cVar = this.t;
        if (cVar.m) {
            this.u.reset();
            i.c<K> cVar2 = this.u;
            cVar2.m = true;
            this.t.m = false;
            return cVar2;
        }
        cVar.reset();
        i.c<K> cVar3 = this.t;
        cVar3.m = true;
        this.u.m = false;
        return cVar3;
    }

    @Override // com.badlogic.gdx.utils.i
    public V h(K k, V v) {
        int iF = f(k);
        if (iF >= 0) {
            V[] vArr = this.k;
            V v2 = vArr[iF];
            vArr[iF] = v;
            return v2;
        }
        int i = -(iF + 1);
        this.f1329j[i] = k;
        this.k[i] = v;
        this.w.a(k);
        int i2 = this.i + 1;
        this.i = i2;
        if (i2 < this.m) {
            return null;
        }
        k(this.f1329j.length << 1);
        return null;
    }

    @Override // com.badlogic.gdx.utils.i
    public V j(K k) {
        this.w.i(k, false);
        return (V) super.j(k);
    }

    @Override // com.badlogic.gdx.utils.i
    public String l(String str, boolean z) {
        if (this.i == 0) {
            return z ? "{}" : "";
        }
        StringBuilder sb = new StringBuilder(32);
        if (z) {
            sb.append('{');
        }
        wg0<K> wg0Var = this.w;
        int i = wg0Var.f18241j;
        for (int i2 = 0; i2 < i; i2++) {
            K k = wg0Var.get(i2);
            if (i2 > 0) {
                sb.append(str);
            }
            Object obj = "(this)";
            sb.append(k == this ? "(this)" : k);
            sb.append(kam.h);
            V v = get(k);
            if (v != this) {
                obj = v;
            }
            sb.append(obj);
        }
        if (z) {
            sb.append('}');
        }
        return sb.toString();
    }

    @Override // com.badlogic.gdx.utils.i
    public i.e<V> m() {
        if (ik3.allocateIterators) {
            return new c(this);
        }
        if (this.r == null) {
            this.r = new c(this);
            this.s = new c(this);
        }
        i.e eVar = this.r;
        if (eVar.m) {
            this.s.reset();
            i.e<V> eVar2 = this.s;
            eVar2.m = true;
            this.r.m = false;
            return eVar2;
        }
        eVar.reset();
        i.e<V> eVar3 = this.r;
        eVar3.m = true;
        this.s.m = false;
        return eVar3;
    }

    public V n(int i) {
        return (V) super.j(this.w.h(i));
    }

    public k(int i) {
        super(i);
        this.w = new wg0<>(i);
    }
}
