package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.lob;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeTimer$TimerDisposable extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements io.reactivex.rxjava3.disposables.a, Runnable {
    private static final long serialVersionUID = 2875964065294031672L;
    final lob<? super Long> downstream;

    public MaybeTimer$TimerDisposable(lob<? super Long> lobVar) {
        this.downstream = lobVar;
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
        this.downstream.onSuccess(0L);
    }

    public void setFuture(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.replace(this, aVar);
    }
}
