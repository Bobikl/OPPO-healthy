package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public abstract class kv5<T> implements bed<T>, cv5 {
    public final AtomicReference<cv5> i = new AtomicReference<>();

    public void a() {
    }

    @Override // com.oplus.aiunit.vision.cv5
    public final void dispose() {
        DisposableHelper.dispose(this.i);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public final boolean isDisposed() {
        return this.i.get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.bed
    public final void onSubscribe(cv5 cv5Var) {
        if (kn6.c(this.i, cv5Var, getClass())) {
            a();
        }
    }
}
