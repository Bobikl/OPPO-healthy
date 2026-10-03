package com.oplus.aiunit.vision;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class hob<T> extends xnb<T> implements f4j<T> {
    public final Callable<? extends T> i;

    public hob(Callable<? extends T> callable) {
        this.i = callable;
    }

    @Override // com.oplus.aiunit.vision.f4j
    public T get() throws Exception {
        return this.i.call();
    }

    @Override // com.oplus.aiunit.vision.xnb
    public void l(lob<? super T> lobVar) {
        io.reactivex.rxjava3.disposables.a aVarE = io.reactivex.rxjava3.disposables.a.e();
        lobVar.onSubscribe(aVarE);
        if (aVarE.isDisposed()) {
            return;
        }
        try {
            T tCall = this.i.call();
            if (aVarE.isDisposed()) {
                return;
            }
            if (tCall == null) {
                lobVar.onComplete();
            } else {
                lobVar.onSuccess(tCall);
            }
        } catch (Throwable th) {
            hu6.b(th);
            if (aVarE.isDisposed()) {
                g4g.u(th);
            } else {
                lobVar.onError(th);
            }
        }
    }
}
