package io.reactivex.internal.operators.mixed;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.c4h;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.es3;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatMapCompletable$ConcatMapCompletableObserver<T> extends AtomicInteger implements wu7<T>, cv5 {
    private static final long serialVersionUID = 3610901111000061034L;
    volatile boolean active;
    int consumed;
    volatile boolean disposed;
    volatile boolean done;
    final bs3 downstream;
    final ErrorMode errorMode;
    final AtomicThrowable errors = new AtomicThrowable();
    final ConcatMapInnerObserver inner = new ConcatMapInnerObserver(this);
    final j08<? super T, ? extends es3> mapper;
    final int prefetch;
    final c4h<T> queue;
    c3j upstream;

    public static final class ConcatMapInnerObserver extends AtomicReference<cv5> implements bs3 {
        private static final long serialVersionUID = 5638352172918776687L;
        final FlowableConcatMapCompletable$ConcatMapCompletableObserver<?> parent;

        public ConcatMapInnerObserver(FlowableConcatMapCompletable$ConcatMapCompletableObserver<?> flowableConcatMapCompletable$ConcatMapCompletableObserver) {
            this.parent = flowableConcatMapCompletable$ConcatMapCompletableObserver;
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

    public FlowableConcatMapCompletable$ConcatMapCompletableObserver(bs3 bs3Var, j08<? super T, ? extends es3> j08Var, ErrorMode errorMode, int i) {
        this.downstream = bs3Var;
        this.mapper = j08Var;
        this.errorMode = errorMode;
        this.prefetch = i;
        this.queue = new SpscArrayQueue(i);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.disposed = true;
        this.upstream.cancel();
        this.inner.dispose();
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        while (!this.disposed) {
            if (!this.active) {
                if (this.errorMode == ErrorMode.BOUNDARY && this.errors.get() != null) {
                    this.queue.clear();
                    this.downstream.onError(this.errors.terminate());
                    return;
                }
                boolean z = this.done;
                T tPoll = this.queue.poll();
                boolean z2 = tPoll == null;
                if (z && z2) {
                    Throwable thTerminate = this.errors.terminate();
                    if (thTerminate != null) {
                        this.downstream.onError(thTerminate);
                        return;
                    } else {
                        this.downstream.onComplete();
                        return;
                    }
                }
                if (!z2) {
                    int i = this.prefetch;
                    int i2 = i - (i >> 1);
                    int i3 = this.consumed + 1;
                    if (i3 == i2) {
                        this.consumed = 0;
                        this.upstream.request(i2);
                    } else {
                        this.consumed = i3;
                    }
                    try {
                        es3 es3Var = (es3) abd.d(this.mapper.apply(tPoll), "The mapper returned a null CompletableSource");
                        this.active = true;
                        es3Var.a(this.inner);
                    } catch (Throwable th) {
                        iu6.b(th);
                        this.queue.clear();
                        this.upstream.cancel();
                        this.errors.addThrowable(th);
                        this.downstream.onError(this.errors.terminate());
                        return;
                    }
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
        this.upstream.cancel();
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

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
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
        this.inner.dispose();
        Throwable thTerminate = this.errors.terminate();
        if (thTerminate != ExceptionHelper.TERMINATED) {
            this.downstream.onError(thTerminate);
        }
        if (getAndIncrement() == 0) {
            this.queue.clear();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.queue.offer(t)) {
            drain();
        } else {
            this.upstream.cancel();
            onError(new MissingBackpressureException("Queue full?!"));
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(this.prefetch);
        }
    }
}
