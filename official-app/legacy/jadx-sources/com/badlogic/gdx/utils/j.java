package com.badlogic.gdx.utils;

import com.oplus.aiunit.vision.ik3;
import com.oplus.aiunit.vision.onb;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public class j<T> implements Iterable<T> {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public T[] f1335j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1336l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1337n;
    public transient a o;
    public transient a p;

    public static class a<K> implements Iterable<K>, Iterator<K> {
        public boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final j<K> f1338j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1339l;
        public boolean m = true;

        public a(j<K> jVar) {
            this.f1338j = jVar;
            reset();
        }

        public final void a() {
            int i;
            K[] kArr = this.f1338j.f1335j;
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

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a<K> iterator() {
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
        public K next() {
            if (!this.i) {
                throw new NoSuchElementException();
            }
            if (!this.m) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            K[] kArr = this.f1338j.f1335j;
            int i = this.k;
            K k = kArr[i];
            this.f1339l = i;
            a();
            return k;
        }

        @Override // java.util.Iterator
        public void remove() {
            int i = this.f1339l;
            if (i < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            j<K> jVar = this.f1338j;
            K[] kArr = jVar.f1335j;
            int i2 = jVar.f1337n;
            int i3 = i + 1;
            while (true) {
                int i4 = i3 & i2;
                K k = kArr[i4];
                if (k == null) {
                    break;
                }
                int iF = this.f1338j.f(k);
                if (((i4 - iF) & i2) > ((i - iF) & i2)) {
                    kArr[i] = k;
                    i = i4;
                }
                i3 = i4 + 1;
            }
            kArr[i] = null;
            this.f1338j.i--;
            if (i != this.f1339l) {
                this.k--;
            }
            this.f1339l = -1;
        }

        public void reset() {
            this.f1339l = -1;
            this.k = -1;
            a();
        }
    }

    public j() {
        this(51, 0.8f);
    }

    public static int h(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be >= 0: " + i);
        }
        int iL = onb.l(Math.max(2, (int) Math.ceil(i / f)));
        if (iL <= 1073741824) {
            return iL;
        }
        throw new IllegalArgumentException("The required capacity is too large: " + i);
    }

    public final void a(T t) {
        T[] tArr = this.f1335j;
        int iF = f(t);
        while (tArr[iF] != null) {
            iF = (iF + 1) & this.f1337n;
        }
        tArr[iF] = t;
    }

    public boolean add(T t) {
        int iE = e(t);
        if (iE >= 0) {
            return false;
        }
        T[] tArr = this.f1335j;
        tArr[-(iE + 1)] = t;
        int i = this.i + 1;
        this.i = i;
        if (i >= this.f1336l) {
            g(tArr.length << 1);
        }
        return true;
    }

    public void b(int i) {
        int iH = h(i, this.k);
        if (this.f1335j.length <= iH) {
            clear();
        } else {
            this.i = 0;
            g(iH);
        }
    }

    public void c(int i) {
        int iH = h(this.i + i, this.k);
        if (this.f1335j.length < iH) {
            g(iH);
        }
    }

    public void clear() {
        if (this.i == 0) {
            return;
        }
        this.i = 0;
        Arrays.fill(this.f1335j, (Object) null);
    }

    public boolean contains(T t) {
        return e(t) >= 0;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a<T> iterator() {
        if (ik3.allocateIterators) {
            return new a<>(this);
        }
        if (this.o == null) {
            this.o = new a(this);
            this.p = new a(this);
        }
        a aVar = this.o;
        if (aVar.m) {
            this.p.reset();
            a<T> aVar2 = this.p;
            aVar2.m = true;
            this.o.m = false;
            return aVar2;
        }
        aVar.reset();
        a<T> aVar3 = this.o;
        aVar3.m = true;
        this.p.m = false;
        return aVar3;
    }

    public int e(T t) {
        if (t == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        T[] tArr = this.f1335j;
        int iF = f(t);
        while (true) {
            T t2 = tArr[iF];
            if (t2 == null) {
                return -(iF + 1);
            }
            if (t2.equals(t)) {
                return iF;
            }
            iF = (iF + 1) & this.f1337n;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (jVar.i != this.i) {
            return false;
        }
        for (T t : this.f1335j) {
            if (t != null && !jVar.contains(t)) {
                return false;
            }
        }
        return true;
    }

    public int f(T t) {
        return (int) ((((long) t.hashCode()) * (-7046029254386353131L)) >>> this.m);
    }

    public final void g(int i) {
        int length = this.f1335j.length;
        this.f1336l = (int) (i * this.k);
        int i2 = i - 1;
        this.f1337n = i2;
        this.m = Long.numberOfLeadingZeros(i2);
        T[] tArr = this.f1335j;
        this.f1335j = (T[]) new Object[i];
        if (this.i > 0) {
            for (int i3 = 0; i3 < length; i3++) {
                T t = tArr[i3];
                if (t != null) {
                    a(t);
                }
            }
        }
    }

    public int hashCode() {
        int iHashCode = this.i;
        for (T t : this.f1335j) {
            if (t != null) {
                iHashCode += t.hashCode();
            }
        }
        return iHashCode;
    }

    public String i(String str) {
        int i;
        if (this.i == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(32);
        Object[] objArr = this.f1335j;
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
                return sb.toString();
            }
            Object obj2 = objArr[i2];
            if (obj2 != null) {
                sb.append(str);
                if (obj2 == this) {
                    obj2 = "(this)";
                }
                sb.append(obj2);
            }
            i = i2;
        }
    }

    public String toString() {
        return '{' + i(", ") + '}';
    }

    public j(int i) {
        this(i, 0.8f);
    }

    public j(int i, float f) {
        if (f > 0.0f && f < 1.0f) {
            this.k = f;
            int iH = h(i, f);
            this.f1336l = (int) (iH * f);
            int i2 = iH - 1;
            this.f1337n = i2;
            this.m = Long.numberOfLeadingZeros(i2);
            this.f1335j = (T[]) new Object[iH];
            return;
        }
        throw new IllegalArgumentException("loadFactor must be > 0 and < 1: " + f);
    }
}
