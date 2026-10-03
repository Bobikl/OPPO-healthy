package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public class wg0<T> implements Iterable<T> {
    public T[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18241j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient a<T> f18242l;

    public static class a<T> implements Iterable<T> {
        public final wg0<T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f18243j;
        public transient b<T> k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public transient b<T> f18244l;

        public a(wg0<T> wg0Var) {
            this(wg0Var, true);
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b<T> iterator() {
            if (ik3.allocateIterators) {
                return new b<>(this.i, this.f18243j);
            }
            if (this.k == null) {
                this.k = new b<>(this.i, this.f18243j);
                this.f18244l = new b<>(this.i, this.f18243j);
            }
            b<T> bVar = this.k;
            if (!bVar.f18246l) {
                bVar.k = 0;
                bVar.f18246l = true;
                this.f18244l.f18246l = false;
                return bVar;
            }
            b<T> bVar2 = this.f18244l;
            bVar2.k = 0;
            bVar2.f18246l = true;
            bVar.f18246l = false;
            return bVar2;
        }

        public a(wg0<T> wg0Var, boolean z) {
            this.i = wg0Var;
            this.f18243j = z;
        }
    }

    public static class b<T> implements Iterator<T>, Iterable<T> {
        public final wg0<T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f18245j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f18246l = true;

        public b(wg0<T> wg0Var, boolean z) {
            this.i = wg0Var;
            this.f18245j = z;
        }

        @Override // java.lang.Iterable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b<T> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f18246l) {
                return this.k < this.i.f18241j;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.k;
            wg0<T> wg0Var = this.i;
            if (i >= wg0Var.f18241j) {
                throw new NoSuchElementException(String.valueOf(this.k));
            }
            if (!this.f18246l) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            T[] tArr = wg0Var.i;
            this.k = i + 1;
            return tArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f18245j) {
                throw new GdxRuntimeException("Remove not allowed.");
            }
            int i = this.k - 1;
            this.k = i;
            this.i.h(i);
        }
    }

    public wg0() {
        this(true, 16);
    }

    public static <T> wg0<T> n(T... tArr) {
        return new wg0<>(tArr);
    }

    public void a(T t) {
        T[] tArrJ = this.i;
        int i = this.f18241j;
        if (i == tArrJ.length) {
            tArrJ = j(Math.max(8, (int) (i * 1.75f)));
        }
        int i2 = this.f18241j;
        this.f18241j = i2 + 1;
        tArrJ[i2] = t;
    }

    public void b(wg0<? extends T> wg0Var) {
        d(wg0Var.i, 0, wg0Var.f18241j);
    }

    public void c(wg0<? extends T> wg0Var, int i, int i2) {
        if (i + i2 <= wg0Var.f18241j) {
            d(wg0Var.i, i, i2);
            return;
        }
        throw new IllegalArgumentException("start + count must be <= size: " + i + " + " + i2 + " <= " + wg0Var.f18241j);
    }

    public void clear() {
        Arrays.fill(this.i, 0, this.f18241j, (Object) null);
        this.f18241j = 0;
    }

    public void d(T[] tArr, int i, int i2) {
        T[] tArrJ = this.i;
        int i3 = this.f18241j + i2;
        if (i3 > tArrJ.length) {
            tArrJ = j(Math.max(Math.max(8, i3), (int) (this.f18241j * 1.75f)));
        }
        System.arraycopy(tArr, i, tArrJ, this.f18241j, i2);
        this.f18241j = i3;
    }

    public T[] e(int i) {
        if (i >= 0) {
            int i2 = this.f18241j + i;
            if (i2 > this.i.length) {
                j(Math.max(Math.max(8, i2), (int) (this.f18241j * 1.75f)));
            }
            return this.i;
        }
        throw new IllegalArgumentException("additionalCapacity must be >= 0: " + i);
    }

    public boolean equals(Object obj) {
        int i;
        if (obj == this) {
            return true;
        }
        if (!this.k || !(obj instanceof wg0)) {
            return false;
        }
        wg0 wg0Var = (wg0) obj;
        if (!wg0Var.k || (i = this.f18241j) != wg0Var.f18241j) {
            return false;
        }
        T[] tArr = this.i;
        T[] tArr2 = wg0Var.i;
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            T t2 = tArr2[i2];
            if (t == null) {
                if (t2 != null) {
                    return false;
                }
            } else {
                if (!t.equals(t2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void f(int i, T t) {
        int i2 = this.f18241j;
        if (i > i2) {
            throw new IndexOutOfBoundsException("index can't be > size: " + i + " > " + this.f18241j);
        }
        T[] tArrJ = this.i;
        if (i2 == tArrJ.length) {
            tArrJ = j(Math.max(8, (int) (i2 * 1.75f)));
        }
        if (this.k) {
            System.arraycopy(tArrJ, i, tArrJ, i + 1, this.f18241j - i);
        } else {
            tArrJ[this.f18241j] = tArrJ[i];
        }
        this.f18241j++;
        tArrJ[i] = t;
    }

    public T first() {
        if (this.f18241j != 0) {
            return this.i[0];
        }
        throw new IllegalStateException("Array is empty.");
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b<T> iterator() {
        if (ik3.allocateIterators) {
            return new b<>(this, true);
        }
        if (this.f18242l == null) {
            this.f18242l = new a<>(this);
        }
        return this.f18242l.iterator();
    }

    public T get(int i) {
        if (i < this.f18241j) {
            return this.i[i];
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f18241j);
    }

    public T h(int i) {
        int i2 = this.f18241j;
        if (i >= i2) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f18241j);
        }
        T[] tArr = this.i;
        T t = tArr[i];
        int i3 = i2 - 1;
        this.f18241j = i3;
        if (this.k) {
            System.arraycopy(tArr, i + 1, tArr, i, i3 - i);
        } else {
            tArr[i] = tArr[i3];
        }
        tArr[this.f18241j] = null;
        return t;
    }

    public int hashCode() {
        if (!this.k) {
            return super.hashCode();
        }
        T[] tArr = this.i;
        int i = this.f18241j;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode *= 31;
            T t = tArr[i2];
            if (t != null) {
                iHashCode += t.hashCode();
            }
        }
        return iHashCode;
    }

    public boolean i(T t, boolean z) {
        T[] tArr = this.i;
        if (z || t == null) {
            int i = this.f18241j;
            for (int i2 = 0; i2 < i; i2++) {
                if (tArr[i2] == t) {
                    h(i2);
                    return true;
                }
            }
        } else {
            int i3 = this.f18241j;
            for (int i4 = 0; i4 < i3; i4++) {
                if (t.equals(tArr[i4])) {
                    h(i4);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return this.f18241j == 0;
    }

    public T[] j(int i) {
        T[] tArr = this.i;
        T[] tArr2 = (T[]) ((Object[]) dh0.a(tArr.getClass().getComponentType(), i));
        System.arraycopy(tArr, 0, tArr2, 0, Math.min(this.f18241j, tArr2.length));
        this.i = tArr2;
        return tArr2;
    }

    public void k(int i, T t) {
        if (i < this.f18241j) {
            this.i[i] = t;
            return;
        }
        throw new IndexOutOfBoundsException("index can't be >= size: " + i + " >= " + this.f18241j);
    }

    public void l() {
        z2i.a().b(this.i, 0, this.f18241j);
    }

    public <V> V[] m(Class<V> cls) {
        V[] vArr = (V[]) ((Object[]) dh0.a(cls, this.f18241j));
        System.arraycopy(this.i, 0, vArr, 0, this.f18241j);
        return vArr;
    }

    public T peek() {
        int i = this.f18241j;
        if (i != 0) {
            return this.i[i - 1];
        }
        throw new IllegalStateException("Array is empty.");
    }

    public T pop() {
        int i = this.f18241j;
        if (i == 0) {
            throw new IllegalStateException("Array is empty.");
        }
        int i2 = i - 1;
        this.f18241j = i2;
        T[] tArr = this.i;
        T t = tArr[i2];
        tArr[i2] = null;
        return t;
    }

    public void sort(Comparator<? super T> comparator) {
        z2i.a().c(this.i, comparator, 0, this.f18241j);
    }

    public String toString() {
        if (this.f18241j == 0) {
            return "[]";
        }
        T[] tArr = this.i;
        t0j t0jVar = new t0j(32);
        t0jVar.append('[');
        t0jVar.m(tArr[0]);
        for (int i = 1; i < this.f18241j; i++) {
            t0jVar.n(", ");
            t0jVar.m(tArr[i]);
        }
        t0jVar.append(']');
        return t0jVar.toString();
    }

    public wg0(int i) {
        this(true, i);
    }

    public wg0(boolean z, int i) {
        this.k = z;
        this.i = (T[]) new Object[i];
    }

    public wg0(boolean z, int i, Class cls) {
        this.k = z;
        this.i = (T[]) ((Object[]) dh0.a(cls, i));
    }

    public wg0(Class cls) {
        this(true, 16, cls);
    }

    public wg0(wg0<? extends T> wg0Var) {
        this(wg0Var.k, wg0Var.f18241j, wg0Var.i.getClass().getComponentType());
        int i = wg0Var.f18241j;
        this.f18241j = i;
        System.arraycopy(wg0Var.i, 0, this.i, 0, i);
    }

    public wg0(T[] tArr) {
        this(true, tArr, 0, tArr.length);
    }

    public wg0(boolean z, T[] tArr, int i, int i2) {
        this(z, i2, tArr.getClass().getComponentType());
        this.f18241j = i2;
        System.arraycopy(tArr, i, this.i, 0, i2);
    }
}
