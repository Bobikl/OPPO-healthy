package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ev5 implements as3, io.reactivex.rxjava3.disposables.a {
    public final AtomicReference<io.reactivex.rxjava3.disposables.a> i = new AtomicReference<>();

    public void a() {
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public final void dispose() {
        DisposableHelper.dispose(this.i);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public final boolean isDisposed() {
        return this.i.get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.as3
    public final void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        if (jn6.d(this.i, aVar, getClass())) {
            a();
        }
    }
}
