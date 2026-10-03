package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class y5h<T> extends f5h<T> {
    public final f4j<? extends Throwable> i;

    public y5h(f4j<? extends Throwable> f4jVar) {
        this.i = f4jVar;
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super T> l6hVar) {
        try {
            th = (Throwable) ExceptionHelper.c(this.i.get(), "Supplier returned a null Throwable.");
        } catch (Throwable th) {
            th = th;
            hu6.b(th);
        }
        EmptyDisposable.error(th, l6hVar);
    }
}
