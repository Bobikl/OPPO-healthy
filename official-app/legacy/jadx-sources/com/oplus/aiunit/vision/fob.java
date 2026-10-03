package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class fob<R> implements m6h<R> {
    public final AtomicReference<cv5> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m6h<? super R> f11444j;

    public fob(AtomicReference<cv5> atomicReference, m6h<? super R> m6hVar) {
        this.i = atomicReference;
        this.f11444j = m6hVar;
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        this.f11444j.onError(th);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.replace(this.i, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(R r) {
        this.f11444j.onSuccess(r);
    }
}
