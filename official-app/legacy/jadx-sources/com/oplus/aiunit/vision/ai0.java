package com.oplus.aiunit.vision;

import com.oplus.aiunit.vision.bi0;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ai0<T, P extends bi0<T>> {
    public mb7 a;

    public ai0(mb7 mb7Var) {
        this.a = mb7Var;
    }

    public abstract wg0<yh0> a(String str, kb7 kb7Var, P p);

    public kb7 b(String str) {
        return this.a.resolve(str);
    }
}
