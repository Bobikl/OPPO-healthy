package io.reactivex.rxjava3.disposables;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FutureDisposable extends AtomicReference<Future<?>> implements a {
    private static final long serialVersionUID = 6545242830671168775L;
    private final boolean allowInterrupt;

    public FutureDisposable(Future<?> future, boolean z) {
        super(future);
        this.allowInterrupt = z;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(this.allowInterrupt);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        Future<?> future = get();
        return future == null || future.isDone();
    }
}
