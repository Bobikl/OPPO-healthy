package com.oplus.aiunit.vision;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class f5f<T> extends r6<T> {
    public final b<T> h;

    public static final class b<T2> extends q6<T2, f5f<T2>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f11228e;
        public final int f;

        public b(a6<T2, ?> a6Var, String str, String[] strArr, int i, int i2) {
            super(a6Var, str, strArr);
            this.f11228e = i;
            this.f = i2;
        }

        @Override // com.oplus.aiunit.vision.q6
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public f5f<T2> a() {
            return new f5f<>(this, this.b, this.a, (String[]) this.f15638c.clone(), this.f11228e, this.f);
        }
    }

    public static <T2> f5f<T2> c(a6<T2, ?> a6Var, String str, Object[] objArr, int i, int i2) {
        return new b(a6Var, str, p6.b(objArr), i, i2).b();
    }

    public static <T2> f5f<T2> e(a6<T2, ?> a6Var, String str, Object[] objArr) {
        return c(a6Var, str, objArr, -1, -1);
    }

    public f5f<T> d() {
        return (f5f) this.h.c(this);
    }

    public List<T> f() {
        a();
        return this.b.a(this.a.getDatabase().b(this.f15206c, this.d));
    }

    public T g() {
        a();
        return this.b.b(this.a.getDatabase().b(this.f15206c, this.d));
    }

    public f5f(b<T> bVar, a6<T, ?> a6Var, String str, String[] strArr, int i, int i2) {
        super(a6Var, str, strArr, i, i2);
        this.h = bVar;
    }
}
