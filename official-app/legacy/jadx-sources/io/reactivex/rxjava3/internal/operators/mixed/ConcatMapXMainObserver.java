package io.reactivex.rxjava3.internal.operators.mixed;

import com.oplus.aiunit.vision.a7f;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ConcatMapXMainObserver<T> extends AtomicInteger implements aed<T>, a {
    private static final long serialVersionUID = -3214213361171757852L;
    volatile boolean disposed;
    volatile boolean done;
    final ErrorMode errorMode;
    final AtomicThrowable errors = new AtomicThrowable();
    final int prefetch;
    f4h<T> queue;
    a upstream;

    public ConcatMapXMainObserver(int i, ErrorMode errorMode) {
        this.errorMode = errorMode;
        this.prefetch = i;
    }

    public void clearValue() {
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public final void dispose() {
        this.disposed = true;
        this.upstream.dispose();
        disposeInner();
        this.errors.tryTerminateAndReport();
        if (getAndIncrement() == 0) {
            this.queue.clear();
            clearValue();
        }
    }

    public abstract void disposeInner();

    public abstract void drain();

    @Override // io.reactivex.rxjava3.disposables.a
    public final boolean isDisposed() {
        return this.disposed;
    }

    @Override // com.oplus.aiunit.vision.aed
    public final void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public final void onError(Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            if (this.errorMode == ErrorMode.IMMEDIATE) {
                disposeInner();
            }
            this.done = true;
            drain();
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public final void onNext(T t) {
        if (t != null) {
            this.queue.offer(t);
        }
        drain();
    }

    @Override // com.oplus.aiunit.vision.aed
    public final void onSubscribe(a aVar) {
        if (DisposableHelper.validate(this.upstream, aVar)) {
            this.upstream = aVar;
            if (aVar instanceof a7f) {
                a7f a7fVar = (a7f) aVar;
                int iRequestFusion = a7fVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.queue = a7fVar;
                    this.done = true;
                    onSubscribeDownstream();
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.queue = a7fVar;
                    onSubscribeDownstream();
                    return;
                }
            }
            this.queue = new xki(this.prefetch);
            onSubscribeDownstream();
        }
    }

    public abstract void onSubscribeDownstream();
}
