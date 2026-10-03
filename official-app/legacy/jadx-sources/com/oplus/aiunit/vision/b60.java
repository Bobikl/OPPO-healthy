package com.oplus.aiunit.vision;

import com.oplus.aiunit.vision.a60;

/* JADX INFO: loaded from: classes13.dex */
public class b60<A extends a60, M> {
    public final A a;
    public final M b;

    public b60(A a, M m) {
        this.a = a;
        this.b = m;
    }

    public static <A extends a60, M> b60<A, M> a(A a, M m) {
        return new b60<>(a, m);
    }
}
