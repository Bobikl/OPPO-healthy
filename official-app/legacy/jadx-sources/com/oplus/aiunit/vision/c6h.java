package com.oplus.aiunit.vision;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class c6h<T> extends f5h<T> {
    public final Callable<? extends T> i;

    public c6h(Callable<? extends T> callable) {
        this.i = callable;
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super T> l6hVar) {
        io.reactivex.rxjava3.disposables.a aVarE = io.reactivex.rxjava3.disposables.a.e();
        l6hVar.onSubscribe(aVarE);
        if (aVarE.isDisposed()) {
            return;
        }
        try {
            T tCall = this.i.call();
            Objects.requireNonNull(tCall, "The callable returned a null value");
            if (aVarE.isDisposed()) {
                return;
            }
            l6hVar.onSuccess(tCall);
        } catch (Throwable th) {
            hu6.b(th);
            if (aVarE.isDisposed()) {
                g4g.u(th);
            } else {
                l6hVar.onError(th);
            }
        }
    }
}
