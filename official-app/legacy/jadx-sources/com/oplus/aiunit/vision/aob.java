package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class aob<T> implements mob<T> {
    public final AtomicReference<cv5> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mob<? super T> f9446j;

    public aob(AtomicReference<cv5> atomicReference, mob<? super T> mobVar) {
        this.i = atomicReference;
        this.f9446j = mobVar;
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        this.f9446j.onComplete();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.f9446j.onError(th);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.replace(this.i, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(T t) {
        this.f9446j.onSuccess(t);
    }
}
