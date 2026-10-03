package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.es3;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.h7f;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.xt7;
import com.oplus.aiunit.vision.yki;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableConcat$CompletableConcatSubscriber extends AtomicInteger implements wu7<es3>, cv5 {
    private static final long serialVersionUID = 9032184911934499404L;
    volatile boolean active;
    int consumed;
    volatile boolean done;
    final bs3 downstream;
    final int limit;
    final int prefetch;
    g4h<es3> queue;
    int sourceFused;
    c3j upstream;
    final ConcatInnerObserver inner = new ConcatInnerObserver(this);
    final AtomicBoolean once = new AtomicBoolean();

    public static final class ConcatInnerObserver extends AtomicReference<cv5> implements bs3 {
        private static final long serialVersionUID = -5454794857847146511L;
        final CompletableConcat$CompletableConcatSubscriber parent;

        public ConcatInnerObserver(CompletableConcat$CompletableConcatSubscriber completableConcat$CompletableConcatSubscriber) {
            this.parent = completableConcat$CompletableConcatSubscriber;
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

    public CompletableConcat$CompletableConcatSubscriber(bs3 bs3Var, int i) {
        this.downstream = bs3Var;
        this.prefetch = i;
        this.limit = i - (i >> 2);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.upstream.cancel();
        DisposableHelper.dispose(this.inner);
    }

    public void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        while (!isDisposed()) {
            if (!this.active) {
                boolean z = this.done;
                try {
                    es3 es3VarPoll = this.queue.poll();
                    boolean z2 = es3VarPoll == null;
                    if (z && z2) {
                        if (this.once.compareAndSet(false, true)) {
                            this.downstream.onComplete();
                            return;
                        }
                        return;
                    } else if (!z2) {
                        this.active = true;
                        es3VarPoll.a(this.inner);
                        request();
                    }
                } catch (Throwable th) {
                    iu6.b(th);
                    innerError(th);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    public void innerComplete() {
        this.active = false;
        drain();
    }

    public void innerError(Throwable th) {
        if (!this.once.compareAndSet(false, true)) {
            h4g.r(th);
        } else {
            this.upstream.cancel();
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(this.inner.get());
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.done = true;
        drain();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (!this.once.compareAndSet(false, true)) {
            h4g.r(th);
        } else {
            DisposableHelper.dispose(this.inner);
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            int i = this.prefetch;
            long j2 = i == Integer.MAX_VALUE ? Long.MAX_VALUE : i;
            if (c3jVar instanceof h7f) {
                h7f h7fVar = (h7f) c3jVar;
                int iRequestFusion = h7fVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.sourceFused = iRequestFusion;
                    this.queue = h7fVar;
                    this.done = true;
                    this.downstream.onSubscribe(this);
                    drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.sourceFused = iRequestFusion;
                    this.queue = h7fVar;
                    this.downstream.onSubscribe(this);
                    c3jVar.request(j2);
                    return;
                }
            }
            if (this.prefetch == Integer.MAX_VALUE) {
                this.queue = new yki(xt7.a());
            } else {
                this.queue = new SpscArrayQueue(this.prefetch);
            }
            this.downstream.onSubscribe(this);
            c3jVar.request(j2);
        }
    }

    public void request() {
        if (this.sourceFused != 1) {
            int i = this.consumed + 1;
            if (i != this.limit) {
                this.consumed = i;
            } else {
                this.consumed = 0;
                this.upstream.request(i);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(es3 es3Var) {
        if (this.sourceFused != 0 || this.queue.offer(es3Var)) {
            drain();
        } else {
            onError(new MissingBackpressureException());
        }
    }
}
