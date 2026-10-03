package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class gob<R> implements m6h<R> {
    public final AtomicReference<cv5> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mob<? super R> f11829j;

    public gob(AtomicReference<cv5> atomicReference, mob<? super R> mobVar) {
        this.i = atomicReference;
        this.f11829j = mobVar;
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        this.f11829j.onError(th);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.replace(this.i, cv5Var);
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(R r) {
        this.f11829j.onSuccess(r);
    }
}
