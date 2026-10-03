package com.badlogic.gdx.utils;

import com.oplus.aiunit.vision.dh0;
import com.oplus.aiunit.vision.ik3;
import com.oplus.aiunit.vision.kam;
import com.oplus.aiunit.vision.t0j;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public class a<K, V> implements Iterable<i.b<K, V>> {
    public K[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public V[] f1287j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1288l;
    public transient C0169a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient C0169a f1289n;

    /* JADX INFO: renamed from: com.badlogic.gdx.utils.a$a, reason: collision with other inner class name */
    public static class C0169a<K, V> implements Iterable<i.b<K, V>>, Iterator<i.b<K, V>> {
        public final a<K, V> i;
        public int k;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public i.b<K, V> f1290j = new i.b<>();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f1291l = true;

        public C0169a(a<K, V> aVar) {
            this.i = aVar;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i.b<K, V> next() {
            int i = this.k;
            a<K, V> aVar = this.i;
            if (i >= aVar.k) {
                throw new NoSuchElementException(String.valueOf(this.k));
            }
            if (!this.f1291l) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            i.b<K, V> bVar = this.f1290j;
            bVar.a = aVar.i[i];
            V[] vArr = aVar.f1287j;
            this.k = i + 1;
            bVar.b = vArr[i];
            return bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1291l) {
                return this.k < this.i.k;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<i.b<K, V>> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this.k - 1;
            this.k = i;
            this.i.d(i);
        }
    }

    public a() {
        this(true, 16);
    }

    public C0169a<K, V> a() {
        if (ik3.allocateIterators) {
            return new C0169a<>(this);
        }
        if (this.m == null) {
            this.m = new C0169a(this);
            this.f1289n = new C0169a(this);
        }
        C0169a<K, V> c0169a = this.m;
        if (!c0169a.f1291l) {
            c0169a.k = 0;
            c0169a.f1291l = true;
            this.f1289n.f1291l = false;
            return c0169a;
        }
        C0169a<K, V> c0169a2 = this.f1289n;
        c0169a2.k = 0;
        c0169a2.f1291l = true;
        c0169a.f1291l = false;
        return c0169a2;
    }

    public int b(K k) {
        K[] kArr = this.i;
        int i = 0;
        if (k == null) {
            int i2 = this.k;
            while (i < i2) {
                if (kArr[i] == k) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.k;
        while (i < i3) {
            if (k.equals(kArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int c(K k, V v) {
        int iB = b(k);
        if (iB == -1) {
            int i = this.k;
            if (i == this.i.length) {
                e(Math.max(8, (int) (i * 1.75f)));
            }
            iB = this.k;
            this.k = iB + 1;
        }
        this.i[iB] = k;
        this.f1287j[iB] = v;
        return iB;
    }

    public void clear() {
        Arrays.fill(this.i, 0, this.k, (Object) null);
        Arrays.fill(this.f1287j, 0, this.k, (Object) null);
        this.k = 0;
    }

    public void d(int i) {
        int i2 = this.k;
        if (i >= i2) {
            throw new IndexOutOfBoundsException(String.valueOf(i));
        }
        K[] kArr = this.i;
        int i3 = i2 - 1;
        this.k = i3;
        if (this.f1288l) {
            int i4 = i + 1;
            System.arraycopy(kArr, i4, kArr, i, i3 - i);
            V[] vArr = this.f1287j;
            System.arraycopy(vArr, i4, vArr, i, this.k - i);
        } else {
            kArr[i] = kArr[i3];
            V[] vArr2 = this.f1287j;
            vArr2[i] = vArr2[i3];
        }
        int i5 = this.k;
        kArr[i5] = null;
        this.f1287j[i5] = null;
    }

    public void e(int i) {
        K[] kArr = (K[]) ((Object[]) dh0.a(this.i.getClass().getComponentType(), i));
        System.arraycopy(this.i, 0, kArr, 0, Math.min(this.k, kArr.length));
        this.i = kArr;
        V[] vArr = (V[]) ((Object[]) dh0.a(this.f1287j.getClass().getComponentType(), i));
        System.arraycopy(this.f1287j, 0, vArr, 0, Math.min(this.k, vArr.length));
        this.f1287j = vArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i = aVar.k;
        int i2 = this.k;
        if (i != i2) {
            return false;
        }
        K[] kArr = this.i;
        V[] vArr = this.f1287j;
        for (int i3 = 0; i3 < i2; i3++) {
            K k = kArr[i3];
            V v = vArr[i3];
            if (v == null) {
                if (aVar.get(k, i.v) != null) {
                    return false;
                }
            } else if (!v.equals(aVar.get(k))) {
                return false;
            }
        }
        return true;
    }

    public V get(K k) {
        return get(k, null);
    }

    public int hashCode() {
        K[] kArr = this.i;
        V[] vArr = this.f1287j;
        int i = this.k;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            K k = kArr[i2];
            V v = vArr[i2];
            if (k != null) {
                iHashCode += k.hashCode() * 31;
            }
            if (v != null) {
                iHashCode += v.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator<i.b<K, V>> iterator() {
        return a();
    }

    public String toString() {
        if (this.k == 0) {
            return "{}";
        }
        K[] kArr = this.i;
        V[] vArr = this.f1287j;
        t0j t0jVar = new t0j(32);
        t0jVar.append('{');
        t0jVar.m(kArr[0]);
        t0jVar.append(kam.h);
        t0jVar.m(vArr[0]);
        for (int i = 1; i < this.k; i++) {
            t0jVar.n(", ");
            t0jVar.m(kArr[i]);
            t0jVar.append(kam.h);
            t0jVar.m(vArr[i]);
        }
        t0jVar.append('}');
        return t0jVar.toString();
    }

    public a(boolean z, int i) {
        this.f1288l = z;
        this.i = (K[]) new Object[i];
        this.f1287j = (V[]) new Object[i];
    }

    public V get(K k, V v) {
        K[] kArr = this.i;
        int i = this.k - 1;
        if (k == null) {
            while (i >= 0) {
                if (kArr[i] == k) {
                    return this.f1287j[i];
                }
                i--;
            }
        } else {
            while (i >= 0) {
                if (k.equals(kArr[i])) {
                    return this.f1287j[i];
                }
                i--;
            }
        }
        return v;
    }

    public a(boolean z, int i, Class cls, Class cls2) {
        this.f1288l = z;
        this.i = (K[]) ((Object[]) dh0.a(cls, i));
        this.f1287j = (V[]) ((Object[]) dh0.a(cls2, i));
    }

    public a(Class cls, Class cls2) {
        this(false, 16, cls, cls2);
    }
}
