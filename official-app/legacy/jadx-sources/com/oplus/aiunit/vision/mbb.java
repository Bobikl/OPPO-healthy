package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes12.dex */
public class mbb<T> {
    public final wab<T> a;

    @Nullable
    public v51<?, ?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public T f14009c;

    public mbb() {
        this.a = new wab<>();
        this.f14009c = null;
    }

    @Nullable
    public T a(wab<T> wabVar) {
        return this.f14009c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final T b(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return a(this.a.h(f, f2, t, t2, f3, f4, f5));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void c(@Nullable v51<?, ?> v51Var) {
        this.b = v51Var;
    }

    public mbb(@Nullable T t) {
        this.a = new wab<>();
        this.f14009c = t;
    }
}
