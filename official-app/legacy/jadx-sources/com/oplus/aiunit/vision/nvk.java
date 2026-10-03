package com.oplus.aiunit.vision;

import com.badlogic.gdx.utils.GdxRuntimeException;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes13.dex */
public final class nvk implements Iterable<mvk>, Comparable<nvk> {
    public final mvk[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14665j;
    public long k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14666l = -1;
    public int m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a<mvk> f14667n;

    public static class a<T> implements Iterable<T> {
        public final T[] i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public b f14668j;
        public b k;

        public a(T[] tArr) {
            this.i = tArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            if (ik3.allocateIterators) {
                return new b(this.i);
            }
            if (this.f14668j == null) {
                this.f14668j = new b(this.i);
                this.k = new b(this.i);
            }
            b bVar = this.f14668j;
            if (!bVar.k) {
                bVar.f14669j = 0;
                bVar.k = true;
                this.k.k = false;
                return bVar;
            }
            b bVar2 = this.k;
            bVar2.f14669j = 0;
            bVar2.k = true;
            bVar.k = false;
            return bVar2;
        }
    }

    public static class b<T> implements Iterator<T>, Iterable<T> {
        public final T[] i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f14669j;
        public boolean k = true;

        public b(T[] tArr) {
            this.i = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.k) {
                return this.f14669j < this.i.length;
            }
            throw new GdxRuntimeException("#iterator() cannot be used nested.");
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this;
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.f14669j;
            T[] tArr = this.i;
            if (i >= tArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f14669j));
            }
            if (!this.k) {
                throw new GdxRuntimeException("#iterator() cannot be used nested.");
            }
            this.f14669j = i + 1;
            return tArr[i];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new GdxRuntimeException("Remove not allowed.");
        }
    }

    public nvk(mvk... mvkVarArr) {
        if (mvkVarArr.length == 0) {
            throw new IllegalArgumentException("attributes must be >= 1");
        }
        mvk[] mvkVarArr2 = new mvk[mvkVarArr.length];
        for (int i = 0; i < mvkVarArr.length; i++) {
            mvkVarArr2[i] = mvkVarArr[i];
        }
        this.i = mvkVarArr2;
        this.f14665j = d();
    }

    public final int d() {
        int i = 0;
        int iK = 0;
        while (true) {
            mvk[] mvkVarArr = this.i;
            if (i >= mvkVarArr.length) {
                return iK;
            }
            mvk mvkVar = mvkVarArr[i];
            mvkVar.f14250e = iK;
            iK += mvkVar.k();
            i++;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(nvk nvkVar) {
        mvk[] mvkVarArr = this.i;
        int length = mvkVarArr.length;
        mvk[] mvkVarArr2 = nvkVar.i;
        if (length != mvkVarArr2.length) {
            return mvkVarArr.length - mvkVarArr2.length;
        }
        long jH = h();
        long jH2 = nvkVar.h();
        if (jH != jH2) {
            return jH < jH2 ? -1 : 1;
        }
        for (int length2 = this.i.length - 1; length2 >= 0; length2--) {
            mvk mvkVar = this.i[length2];
            mvk mvkVar2 = nvkVar.i[length2];
            int i = mvkVar.a;
            int i2 = mvkVar2.a;
            if (i != i2) {
                return i - i2;
            }
            int i3 = mvkVar.g;
            int i4 = mvkVar2.g;
            if (i3 != i4) {
                return i3 - i4;
            }
            int i5 = mvkVar.b;
            int i6 = mvkVar2.b;
            if (i5 != i6) {
                return i5 - i6;
            }
            boolean z = mvkVar.f14249c;
            if (z != mvkVar2.f14249c) {
                return z ? 1 : -1;
            }
            int i7 = mvkVar.d;
            int i8 = mvkVar2.d;
            if (i7 != i8) {
                return i7 - i8;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nvk)) {
            return false;
        }
        nvk nvkVar = (nvk) obj;
        if (this.i.length != nvkVar.i.length) {
            return false;
        }
        int i = 0;
        while (true) {
            mvk[] mvkVarArr = this.i;
            if (i >= mvkVarArr.length) {
                return true;
            }
            if (!mvkVarArr[i].i(nvkVar.i[i])) {
                return false;
            }
            i++;
        }
    }

    public mvk g(int i) {
        return this.i[i];
    }

    public long h() {
        if (this.k == -1) {
            long j2 = 0;
            int i = 0;
            while (true) {
                mvk[] mvkVarArr = this.i;
                if (i >= mvkVarArr.length) {
                    break;
                }
                j2 |= (long) mvkVarArr[i].a;
                i++;
            }
            this.k = j2;
        }
        return this.k;
    }

    public int hashCode() {
        long length = this.i.length * 61;
        int i = 0;
        while (true) {
            mvk[] mvkVarArr = this.i;
            if (i >= mvkVarArr.length) {
                return (int) (length ^ (length >> 32));
            }
            length = (length * 61) + ((long) mvkVarArr[i].hashCode());
            i++;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<mvk> iterator() {
        if (this.f14667n == null) {
            this.f14667n = new a<>(this.i);
        }
        return this.f14667n.iterator();
    }

    public int size() {
        return this.i.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.i.length; i++) {
            sb.append("(");
            sb.append(this.i[i].f);
            sb.append(", ");
            sb.append(this.i[i].a);
            sb.append(", ");
            sb.append(this.i[i].b);
            sb.append(", ");
            sb.append(this.i[i].f14250e);
            sb.append(")");
            sb.append(Weather.SEPARATOR);
        }
        sb.append("]");
        return sb.toString();
    }
}
