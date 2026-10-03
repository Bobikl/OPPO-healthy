package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes10.dex */
public final class hv5<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
    public final aed<? super T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o14<? super io.reactivex.rxjava3.disposables.a> f12285j;
    public final Cdo k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.a f12286l;

    public hv5(aed<? super T> aedVar, o14<? super io.reactivex.rxjava3.disposables.a> o14Var, Cdo cdo) {
        this.i = aedVar;
        this.f12285j = o14Var;
        this.k = cdo;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        io.reactivex.rxjava3.disposables.a aVar = this.f12286l;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar != disposableHelper) {
            this.f12286l = disposableHelper;
            try {
                this.k.run();
            } catch (Throwable th) {
                hu6.b(th);
                g4g.u(th);
            }
            aVar.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.f12286l.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        io.reactivex.rxjava3.disposables.a aVar = this.f12286l;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar != disposableHelper) {
            this.f12286l = disposableHelper;
            this.i.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        io.reactivex.rxjava3.disposables.a aVar = this.f12286l;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar == disposableHelper) {
            g4g.u(th);
        } else {
            this.f12286l = disposableHelper;
            this.i.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        this.i.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        try {
            this.f12285j.accept(aVar);
            if (DisposableHelper.validate(this.f12286l, aVar)) {
                this.f12286l = aVar;
                this.i.onSubscribe(this);
            }
        } catch (Throwable th) {
            hu6.b(th);
            aVar.dispose();
            this.f12286l = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th, this.i);
        }
    }
}
