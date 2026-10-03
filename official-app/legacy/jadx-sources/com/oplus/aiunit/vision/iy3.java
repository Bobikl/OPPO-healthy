package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public abstract class iy3<T> extends lbd<T> {
    public lbd<T> t1(int i) {
        return u1(i, Functions.e());
    }

    public lbd<T> u1(int i, o14<? super io.reactivex.rxjava3.disposables.a> o14Var) {
        Objects.requireNonNull(o14Var, "connection is null");
        if (i > 0) {
            return g4g.q(new obd(this, i, o14Var));
        }
        v1(o14Var);
        return g4g.n(this);
    }

    public abstract void v1(o14<? super io.reactivex.rxjava3.disposables.a> o14Var);
}
