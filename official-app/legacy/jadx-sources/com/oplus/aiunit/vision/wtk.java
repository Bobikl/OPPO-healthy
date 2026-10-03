package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import java.util.Collections;

/* JADX INFO: loaded from: classes12.dex */
public class wtk<K, A> extends v51<K, A> {
    public final A i;

    public wtk(mbb<A> mbbVar) {
        this(mbbVar, null);
    }

    @Override // com.oplus.aiunit.vision.v51
    public float c() {
        return 1.0f;
    }

    @Override // com.oplus.aiunit.vision.v51
    public A h() {
        mbb<A> mbbVar = this.f17711e;
        A a = this.i;
        return mbbVar.b(0.0f, 0.0f, a, a, f(), f(), f());
    }

    @Override // com.oplus.aiunit.vision.v51
    public A i(yoa<K> yoaVar, float f) {
        return h();
    }

    @Override // com.oplus.aiunit.vision.v51
    public void l() {
        if (this.f17711e != null) {
            super.l();
        }
    }

    @Override // com.oplus.aiunit.vision.v51
    public void n(float f) {
        this.d = f;
    }

    public wtk(mbb<A> mbbVar, @Nullable A a) {
        super(Collections.emptyList());
        o(mbbVar);
        this.i = a;
    }
}
