package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class b6h<R> implements mob<R> {
    public final AtomicReference<cv5> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mob<? super R> f9626j;

    public b6h(AtomicReference<cv5> atomicReference, mob<? super R> mobVar) {
        this.i = atomicReference;
        this.f9626j = mobVar;
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onComplete() {
        this.f9626j.onComplete();
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onError(Throwable th) {
        this.f9626j.onError(th);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.replace(this.i, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.mob
    public void onSuccess(R r) {
        this.f9626j.onSuccess(r);
    }
}
