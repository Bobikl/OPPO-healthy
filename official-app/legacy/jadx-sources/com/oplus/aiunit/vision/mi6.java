package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes19.dex */
public class mi6<T> {
    public final fi6<T> a;

    @Nullable
    public w51<?, ?> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public T f14082c;

    public mi6() {
        this.a = new fi6<>();
        this.f14082c = null;
    }

    @Nullable
    public T a(fi6<T> fi6Var) {
        return this.f14082c;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final T b(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return a(this.a.h(f, f2, t, t2, f3, f4, f5));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void c(@Nullable w51<?, ?> w51Var) {
        this.b = w51Var;
    }

    public mi6(@Nullable T t) {
        this.a = new fi6<>();
        this.f14082c = t;
    }
}
