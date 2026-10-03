package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class sr3 implements bs3 {
    public final AtomicReference<cv5> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final bs3 f16710j;

    public sr3(AtomicReference<cv5> atomicReference, bs3 bs3Var) {
        this.i = atomicReference;
        this.f16710j = bs3Var;
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onComplete() {
        this.f16710j.onComplete();
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onError(Throwable th) {
        this.f16710j.onError(th);
    }

    @Override // com.oplus.aiunit.vision.bs3
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.replace(this.i, cv5Var);
    }
}
