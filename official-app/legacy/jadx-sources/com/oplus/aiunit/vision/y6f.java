package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public class y6f<T> implements Iterable<T> {
    public T[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18893j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18894l;
    public transient a m;

    public static class a<T> implements Iterable<T> {
        public final y6f<T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f18895j;
        public b k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public b f18896l;

        public a(y6f<T> y6fVar) {
            this(y6fVar, true);
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            if (ik3.allocateIterators) {
                return new b(this.i, this.f18895j);
            }
            if (this.k == null) {
                this.k = new b(this.i, this.f18895j);
                this.f18896l = new b(this.i, this.f18895j);
            }
            b bVar = this.k;
            if (!bVar.f18898l) {
                bVar.k = 0;
                bVar.f18898l = true;
                this.f18896l.f18898l = false;
                return bVar;
            }
            b bVar2 = this.f18896l;
            bVar2.k = 0;
            bVar2.f18898l = true;
            bVar.f18898l = false;
            return bVar2;
        }

        public a(y6f<T> y6fVar, boolean z) {
            this.i = y6fVar;
            this.f18895j = z;
        }
    }

    public static class b<T> implements Iterator<T>, Iterable<T> {
        public final y6f<T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f18897j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f18898l = true;

        public b(y6f<T> y6fVar, boolean z) {
            this.i = y6fVar;
            this.f18897j = z;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f18898l) {
                return this.k < this.i.f18894l;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.k;
            y6f<T> y6fVar = this.i;
            if (i >= y6fVar.f18894l) {
                throw new NoSuchElementException(String.valueOf(this.k));
            }
            if (!this.f18898l) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            this.k = i + 1;
            return y6fVar.get(i);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f18897j) {
                throw new GdxRuntimeException("Remove not allowed.");
            }
            int i = this.k - 1;
            this.k = i;
            this.i.a(i);
        }
    }

    public y6f() {
        this(16);
    }

    public T a(int i) {
        T t;
        if (i < 0) {
            throw new IndexOutOfBoundsException("index can't be < 0: " + i);
        }
        if (i >= this.f18894l) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f18894l);
        }
        T[] tArr = this.i;
        int i2 = this.f18893j;
        int i3 = this.k;
        int i4 = i + i2;
        if (i2 < i3) {
            t = tArr[i4];
            System.arraycopy(tArr, i4 + 1, tArr, i4, i3 - i4);
            tArr[i3] = null;
            this.k--;
        } else if (i4 >= tArr.length) {
            int length = i4 - tArr.length;
            t = tArr[length];
            System.arraycopy(tArr, length + 1, tArr, length, i3 - length);
            this.k--;
        } else {
            T t2 = tArr[i4];
            System.arraycopy(tArr, i2, tArr, i2 + 1, i4 - i2);
            tArr[i2] = null;
            int i5 = this.f18893j + 1;
            this.f18893j = i5;
            if (i5 == tArr.length) {
                this.f18893j = 0;
            }
            t = t2;
        }
        this.f18894l--;
        return t;
    }

    public void addLast(T t) {
        T[] tArr = this.i;
        if (this.f18894l == tArr.length) {
            b(tArr.length << 1);
            tArr = this.i;
        }
        int i = this.k;
        int i2 = i + 1;
        this.k = i2;
        tArr[i] = t;
        if (i2 == tArr.length) {
            this.k = 0;
        }
        this.f18894l++;
    }

    public void b(int i) {
        T[] tArr = this.i;
        int i2 = this.f18893j;
        int i3 = this.k;
        T[] tArr2 = (T[]) ((Object[]) dh0.a(tArr.getClass().getComponentType(), i));
        if (i2 < i3) {
            System.arraycopy(tArr, i2, tArr2, 0, i3 - i2);
        } else if (this.f18894l > 0) {
            int length = tArr.length - i2;
            System.arraycopy(tArr, i2, tArr2, 0, length);
            System.arraycopy(tArr, 0, tArr2, length, i3);
        }
        this.i = tArr2;
        this.f18893j = 0;
        this.k = this.f18894l;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0038  */
    /* JADX WARN: Code duplicated, block: B:26:0x003b  */
    /* JADX WARN: Code duplicated, block: B:34:0x003c A[SYNTHETIC] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof y6f)) {
            return false;
        }
        y6f y6fVar = (y6f) obj;
        int i = this.f18894l;
        if (y6fVar.f18894l != i) {
            return false;
        }
        T[] tArr = this.i;
        int length = tArr.length;
        T[] tArr2 = y6fVar.i;
        int length2 = tArr2.length;
        int i2 = this.f18893j;
        int i3 = y6fVar.f18893j;
        for (int i4 = 0; i4 < i; i4++) {
            T t = tArr[i2];
            T t2 = tArr2[i3];
            if (t == null) {
                if (t2 != null) {
                    return false;
                }
                i2++;
                i3++;
                if (i2 == length) {
                    i2 = 0;
                }
                if (i3 == length2) {
                    i3 = 0;
                }
            } else {
                if (!t.equals(t2)) {
                    return false;
                }
                i2++;
                i3++;
                if (i2 == length) {
                    i2 = 0;
                }
                if (i3 == length2) {
                    i3 = 0;
                }
            }
        }
        return true;
    }

    public T get(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("index can't be < 0: " + i);
        }
        if (i < this.f18894l) {
            T[] tArr = this.i;
            int length = this.f18893j + i;
            if (length >= tArr.length) {
                length -= tArr.length;
            }
            return tArr[length];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f18894l);
    }

    public int hashCode() {
        int i = this.f18894l;
        T[] tArr = this.i;
        int length = tArr.length;
        int i2 = this.f18893j;
        int iHashCode = i + 1;
        for (int i3 = 0; i3 < i; i3++) {
            T t = tArr[i2];
            iHashCode *= 31;
            if (t != null) {
                iHashCode += t.hashCode();
            }
            i2++;
            if (i2 == length) {
                i2 = 0;
            }
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        if (ik3.allocateIterators) {
            return new b(this, true);
        }
        if (this.m == null) {
            this.m = new a(this);
        }
        return this.m.iterator();
    }

    public String toString() {
        if (this.f18894l == 0) {
            return "[]";
        }
        T[] tArr = this.i;
        int length = this.f18893j;
        int i = this.k;
        t0j t0jVar = new t0j(64);
        t0jVar.append('[');
        t0jVar.m(tArr[length]);
        while (true) {
            length = (length + 1) % tArr.length;
            if (length == i) {
                t0jVar.append(']');
                return t0jVar.toString();
            }
            t0jVar.n(", ").m(tArr[length]);
        }
    }

    public y6f(int i) {
        this.f18893j = 0;
        this.k = 0;
        this.f18894l = 0;
        this.i = (T[]) new Object[i];
    }
}
