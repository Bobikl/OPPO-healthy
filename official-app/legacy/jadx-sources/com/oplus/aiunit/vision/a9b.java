package com.oplus.aiunit.vision;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class a9b<T> {
    public a<T>[] a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9258c;
    public int d;

    public static final class a<T> {
        public final long a;
        public T b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a<T> f9259c;

        public a(long j2, T t, a<T> aVar) {
            this.a = j2;
            this.b = t;
            this.f9259c = aVar;
        }
    }

    public a9b() {
        this(16);
    }

    public void a() {
        this.d = 0;
        Arrays.fill(this.a, (Object) null);
    }

    public T b(long j2) {
        for (a<T> aVar = this.a[((((int) (j2 >>> 32)) ^ ((int) j2)) & Integer.MAX_VALUE) % this.b]; aVar != null; aVar = aVar.f9259c) {
            if (aVar.a == j2) {
                return aVar.b;
            }
        }
        return null;
    }

    public T c(long j2, T t) {
        int i = ((((int) (j2 >>> 32)) ^ ((int) j2)) & Integer.MAX_VALUE) % this.b;
        a<T> aVar = this.a[i];
        for (a<T> aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f9259c) {
            if (aVar2.a == j2) {
                T t2 = aVar2.b;
                aVar2.b = t;
                return t2;
            }
        }
        this.a[i] = new a<>(j2, t, aVar);
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 <= this.f9258c) {
            return null;
        }
        f(this.b * 2);
        return null;
    }

    public T d(long j2) {
        int i = ((((int) (j2 >>> 32)) ^ ((int) j2)) & Integer.MAX_VALUE) % this.b;
        a<T> aVar = this.a[i];
        a<T> aVar2 = null;
        while (aVar != null) {
            a<T> aVar3 = aVar.f9259c;
            if (aVar.a == j2) {
                if (aVar2 == null) {
                    this.a[i] = aVar3;
                } else {
                    aVar2.f9259c = aVar3;
                }
                this.d--;
                return aVar.b;
            }
            aVar2 = aVar;
            aVar = aVar3;
        }
        return null;
    }

    public void e(int i) {
        f((i * 5) / 3);
    }

    public void f(int i) {
        a<T>[] aVarArr = new a[i];
        int length = this.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            a<T> aVar = this.a[i2];
            while (aVar != null) {
                long j2 = aVar.a;
                int i3 = ((((int) j2) ^ ((int) (j2 >>> 32))) & Integer.MAX_VALUE) % i;
                a<T> aVar2 = aVar.f9259c;
                aVar.f9259c = aVarArr[i3];
                aVarArr[i3] = aVar;
                aVar = aVar2;
            }
        }
        this.a = aVarArr;
        this.b = i;
        this.f9258c = (i * 4) / 3;
    }

    public a9b(int i) {
        this.b = i;
        this.f9258c = (i * 4) / 3;
        this.a = new a[i];
    }
}
