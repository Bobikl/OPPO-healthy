package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes10.dex */
public final class iv5<T> implements bed<T>, cv5 {
    public final bed<? super T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p14<? super cv5> f12664j;
    public final eo k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public cv5 f12665l;

    public iv5(bed<? super T> bedVar, p14<? super cv5> p14Var, eo eoVar) {
        this.i = bedVar;
        this.f12664j = p14Var;
        this.k = eoVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        cv5 cv5Var = this.f12665l;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var != disposableHelper) {
            this.f12665l = disposableHelper;
            try {
                this.k.run();
            } catch (Throwable th) {
                iu6.b(th);
                h4g.r(th);
            }
            cv5Var.dispose();
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.f12665l.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        cv5 cv5Var = this.f12665l;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var != disposableHelper) {
            this.f12665l = disposableHelper;
            this.i.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        cv5 cv5Var = this.f12665l;
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (cv5Var == disposableHelper) {
            h4g.r(th);
        } else {
            this.f12665l = disposableHelper;
            this.i.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.i.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        try {
            this.f12664j.accept(cv5Var);
            if (DisposableHelper.validate(this.f12665l, cv5Var)) {
                this.f12665l = cv5Var;
                this.i.onSubscribe(this);
            }
        } catch (Throwable th) {
            iu6.b(th);
            cv5Var.dispose();
            this.f12665l = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th, this.i);
        }
    }
}
