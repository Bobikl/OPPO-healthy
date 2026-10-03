package io.reactivex.internal.operators.mixed;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.b7f;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.es3;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.yki;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableConcatMapCompletable$ConcatMapCompletableObserver<T> extends AtomicInteger implements bed<T>, cv5 {
    private static final long serialVersionUID = 3610901111000061034L;
    volatile boolean active;
    volatile boolean disposed;
    volatile boolean done;
    final bs3 downstream;
    final ErrorMode errorMode;
    final AtomicThrowable errors = new AtomicThrowable();
    final ConcatMapInnerObserver inner = new ConcatMapInnerObserver(this);
    final j08<? super T, ? extends es3> mapper;
    final int prefetch;
    g4h<T> queue;
    cv5 upstream;

    public static final class ConcatMapInnerObserver extends AtomicReference<cv5> implements bs3 {
        private static final long serialVersionUID = 5638352172918776687L;
        final ObservableConcatMapCompletable$ConcatMapCompletableObserver<?> parent;

        public ConcatMapInnerObserver(ObservableConcatMapCompletable$ConcatMapCompletableObserver<?> observableConcatMapCompletable$ConcatMapCompletableObserver) {
            this.parent = observableConcatMapCompletable$ConcatMapCompletableObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onComplete() {
            this.parent.innerComplete();
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onError(Throwable th) {
            this.parent.innerError(th);
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.replace(this, cv5Var);
        }
    }

    public ObservableConcatMapCompletable$ConcatMapCompletableObserver(bs3 bs3Var, j08<? super T, ? extends es3> j08Var, ErrorMode errorMode, int i) {
        this.downstream = bs3Var;
        this.mapper = j08Var;
        this.errorMode = errorMode;
        this.prefetch = i;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.disposed = true;
        this.upstream.dispose();
        this.inner.dispose();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public void drain() {
        es3 es3Var;
        boolean z;
        if (getAndIncrement() != 0) {
            return;
        }
        AtomicThrowable atomicThrowable = this.errors;
        ErrorMode errorMode = this.errorMode;
        while (!this.disposed) {
            if (!this.active) {
                if (errorMode == ErrorMode.BOUNDARY && atomicThrowable.get() != null) {
                    this.disposed = true;
                    this.queue.clear();
                    this.downstream.onError(atomicThrowable.terminate());
                    return;
                }
                boolean z2 = this.done;
                try {
                    T tPoll = this.queue.poll();
                    if (tPoll != null) {
                        es3Var = (es3) abd.d(this.mapper.apply(tPoll), "The mapper returned a null CompletableSource");
                        z = false;
                    } else {
                        es3Var = null;
                        z = true;
                    }
                    if (z2 && z) {
                        this.disposed = true;
                        Throwable thTerminate = atomicThrowable.terminate();
                        if (thTerminate != null) {
                            this.downstream.onError(thTerminate);
                            return;
                        } else {
                            this.downstream.onComplete();
                            return;
                        }
                    }
                    if (!z) {
                        this.active = true;
                        es3Var.a(this.inner);
                    }
                } catch (Throwable th) {
                    iu6.b(th);
                    this.disposed = true;
                    this.queue.clear();
                    this.upstream.dispose();
                    atomicThrowable.addThrowable(th);
                    this.downstream.onError(atomicThrowable.terminate());
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.queue.clear();
    }

    public void innerComplete() {
        this.active = false;
        drain();
    }

    public void innerError(Throwable th) {
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        if (this.errorMode != ErrorMode.IMMEDIATE) {
            this.active = false;
            drain();
            return;
        }
        this.disposed = true;
        this.upstream.dispose();
        Throwable thTerminate = this.errors.terminate();
        if (thTerminate != ExceptionHelper.TERMINATED) {
            this.downstream.onError(thTerminate);
        }
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.disposed;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        if (this.errorMode != ErrorMode.IMMEDIATE) {
            this.done = true;
            drain();
            return;
        }
        this.disposed = true;
        this.inner.dispose();
        Throwable thTerminate = this.errors.terminate();
        if (thTerminate != ExceptionHelper.TERMINATED) {
            this.downstream.onError(thTerminate);
        }
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        if (t != null) {
            this.queue.offer(t);
        }
        drain();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.validate(this.upstream, cv5Var)) {
            this.upstream = cv5Var;
            if (cv5Var instanceof b7f) {
                b7f b7fVar = (b7f) cv5Var;
                int iRequestFusion = b7fVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.queue = b7fVar;
                    this.done = true;
                    this.downstream.onSubscribe(this);
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.queue = b7fVar;
                    this.downstream.onSubscribe(this);
                    return;
                }
            }
            this.queue = new yki(this.prefetch);
            this.downstream.onSubscribe(this);
        }
    }
}
