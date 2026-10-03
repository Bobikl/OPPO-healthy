package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import java.util.Collections;

/* JADX INFO: loaded from: classes19.dex */
public class vtk<K, A> extends w51<K, A> {
    public final A i;

    public vtk(mi6<A> mi6Var) {
        this(mi6Var, null);
    }

    @Override // com.oplus.aiunit.vision.w51
    public float c() {
        return 1.0f;
    }

    @Override // com.oplus.aiunit.vision.w51
    public A h() {
        mi6<A> mi6Var = this.f18122e;
        A a = this.i;
        return mi6Var.b(0.0f, 0.0f, a, a, f(), f(), f());
    }

    @Override // com.oplus.aiunit.vision.w51
    public A i(xoa<K> xoaVar, float f) {
        return h();
    }

    @Override // com.oplus.aiunit.vision.w51
    public void k() {
        if (this.f18122e != null) {
            super.k();
        }
    }

    @Override // com.oplus.aiunit.vision.w51
    public void m(float f) {
        this.d = f;
    }

    public vtk(mi6<A> mi6Var, @Nullable A a) {
        super(Collections.emptyList());
        n(mi6Var);
        this.i = a;
    }
}
