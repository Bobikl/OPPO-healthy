package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class tr3 extends pr3 {
    public final f4j<? extends ds3> i;

    public tr3(f4j<? extends ds3> f4jVar) {
        this.i = f4jVar;
    }

    @Override // com.oplus.aiunit.vision.pr3
    public void k(as3 as3Var) {
        try {
            ds3 ds3Var = this.i.get();
            Objects.requireNonNull(ds3Var, "The completableSupplier returned a null CompletableSource");
            ds3Var.a(as3Var);
        } catch (Throwable th) {
            hu6.b(th);
            EmptyDisposable.error(th, as3Var);
        }
    }
}
