package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class sdd<T> implements bed<T> {
    public final bed<? super T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<cv5> f16554j;

    public sdd(bed<? super T> bedVar, AtomicReference<cv5> atomicReference) {
        this.i = bedVar;
        this.f16554j = atomicReference;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.i.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.i.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.i.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.replace(this.f16554j, cv5Var);
    }
}
