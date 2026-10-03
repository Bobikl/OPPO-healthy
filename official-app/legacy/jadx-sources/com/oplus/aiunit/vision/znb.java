package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class znb<T> implements lob<T> {
    public final AtomicReference<io.reactivex.rxjava3.disposables.a> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lob<? super T> f19470j;

    public znb(AtomicReference<io.reactivex.rxjava3.disposables.a> atomicReference, lob<? super T> lobVar) {
        this.i = atomicReference;
        this.f19470j = lobVar;
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onComplete() {
        this.f19470j.onComplete();
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onError(Throwable th) {
        this.f19470j.onError(th);
    }

    @Override // com.oplus.aiunit.vision.lob
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.replace(this.i, aVar);
    }

    @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.f19470j.onSuccess(t);
    }
}
