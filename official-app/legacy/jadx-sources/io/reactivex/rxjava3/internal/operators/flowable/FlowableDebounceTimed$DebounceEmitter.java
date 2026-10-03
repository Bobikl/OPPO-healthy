package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableDebounceTimed$DebounceEmitter<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements Runnable, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 6812032969491025141L;
    final long idx;
    final AtomicBoolean once = new AtomicBoolean();
    final FlowableDebounceTimed$DebounceTimedSubscriber<T> parent;
    final T value;

    public FlowableDebounceTimed$DebounceEmitter(T t, long j2, FlowableDebounceTimed$DebounceTimedSubscriber<T> flowableDebounceTimed$DebounceTimedSubscriber) {
        this.value = t;
        this.idx = j2;
        this.parent = flowableDebounceTimed$DebounceTimedSubscriber;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    public void emit() {
        if (this.once.compareAndSet(false, true)) {
            this.parent.emit(this.idx, this.value, this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // java.lang.Runnable
    public void run() {
        emit();
    }

    public void setResource(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.replace(this, aVar);
    }
}
