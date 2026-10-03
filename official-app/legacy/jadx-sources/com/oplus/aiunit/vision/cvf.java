package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class cvf<T> implements l6h<T> {
    public final AtomicReference<io.reactivex.rxjava3.disposables.a> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l6h<? super T> f10258j;

    public cvf(AtomicReference<io.reactivex.rxjava3.disposables.a> atomicReference, l6h<? super T> l6hVar) {
        this.i = atomicReference;
        this.f10258j = l6hVar;
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onError(Throwable th) {
        this.f10258j.onError(th);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.replace(this.i, aVar);
    }

    @Override // com.oplus.aiunit.vision.l6h
    public void onSuccess(T t) {
        this.f10258j.onSuccess(t);
    }
}
