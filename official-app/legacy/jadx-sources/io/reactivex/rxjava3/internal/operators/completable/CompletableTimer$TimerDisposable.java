package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.as3;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableTimer$TimerDisposable extends AtomicReference<a> implements a, Runnable {
    private static final long serialVersionUID = 3167244060586201109L;
    final as3 downstream;

    public CompletableTimer$TimerDisposable(as3 as3Var) {
        this.downstream = as3Var;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // java.lang.Runnable
    public void run() {
        this.downstream.onComplete();
    }

    public void setFuture(a aVar) {
        DisposableHelper.replace(this, aVar);
    }
}
