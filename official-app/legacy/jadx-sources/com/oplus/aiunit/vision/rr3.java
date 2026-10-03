package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class rr3 implements as3 {
    public final AtomicReference<io.reactivex.rxjava3.disposables.a> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final as3 f16321j;

    public rr3(AtomicReference<io.reactivex.rxjava3.disposables.a> atomicReference, as3 as3Var) {
        this.i = atomicReference;
        this.f16321j = as3Var;
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onComplete() {
        this.f16321j.onComplete();
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onError(Throwable th) {
        this.f16321j.onError(th);
    }

    @Override // com.oplus.aiunit.vision.as3
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.replace(this.i, aVar);
    }
}
