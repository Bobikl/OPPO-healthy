package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class dvf<T> implements m6h<T> {
    public final AtomicReference<cv5> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m6h<? super T> f10703j;

    public dvf(AtomicReference<cv5> atomicReference, m6h<? super T> m6hVar) {
        this.i = atomicReference;
        this.f10703j = m6hVar;
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        this.f10703j.onError(th);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.replace(this.i, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(T t) {
        this.f10703j.onSuccess(t);
    }
}
