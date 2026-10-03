package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class a6h<R> implements lob<R> {
    public final AtomicReference<io.reactivex.rxjava3.disposables.a> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lob<? super R> f9213j;

    public a6h(AtomicReference<io.reactivex.rxjava3.disposables.a> atomicReference, lob<? super R> lobVar) {
        this.i = atomicReference;
        this.f9213j = lobVar;
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        this.f9213j.onComplete();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        this.f9213j.onError(th);
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.replace(this.i, aVar);
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(R r) {
        this.f9213j.onSuccess(r);
    }
}
