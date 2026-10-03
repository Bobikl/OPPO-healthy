package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class eob<R> implements l6h<R> {
    public final AtomicReference<io.reactivex.rxjava3.disposables.a> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lob<? super R> f10997j;

    public eob(AtomicReference<io.reactivex.rxjava3.disposables.a> atomicReference, lob<? super R> lobVar) {
        this.i = atomicReference;
        this.f10997j = lobVar;
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        this.f10997j.onError(th);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.replace(this.i, aVar);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(R r) {
        this.f10997j.onSuccess(r);
    }
}
