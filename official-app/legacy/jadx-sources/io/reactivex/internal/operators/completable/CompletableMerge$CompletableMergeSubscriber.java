package io.reactivex.internal.operators.completable;

import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.es3;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.ys3;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableMerge$CompletableMergeSubscriber extends AtomicInteger implements wu7<es3>, cv5 {
    private static final long serialVersionUID = -2108443387387077490L;
    final boolean delayErrors;
    final bs3 downstream;
    final int maxConcurrency;
    c3j upstream;
    final ys3 set = new ys3();
    final AtomicThrowable error = new AtomicThrowable();

    public final class MergeInnerObserver extends AtomicReference<cv5> implements bs3, cv5 {
        private static final long serialVersionUID = 251330541679988317L;

        public MergeInnerObserver() {
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onComplete() {
            CompletableMerge$CompletableMergeSubscriber.this.innerComplete(this);
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onError(Throwable th) {
            CompletableMerge$CompletableMergeSubscriber.this.innerError(this, th);
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }
    }

    public CompletableMerge$CompletableMergeSubscriber(bs3 bs3Var, int i, boolean z) {
        this.downstream = bs3Var;
        this.maxConcurrency = i;
        this.delayErrors = z;
        lazySet(1);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.upstream.cancel();
        this.set.dispose();
    }

    public void innerComplete(MergeInnerObserver mergeInnerObserver) {
        this.set.b(mergeInnerObserver);
        if (decrementAndGet() != 0) {
            if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
        } else {
            Throwable th = this.error.get();
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    public void innerError(MergeInnerObserver mergeInnerObserver, Throwable th) {
        this.set.b(mergeInnerObserver);
        if (!this.delayErrors) {
            this.upstream.cancel();
            this.set.dispose();
            if (!this.error.addThrowable(th)) {
                h4g.r(th);
                return;
            } else {
                if (getAndSet(0) > 0) {
                    this.downstream.onError(this.error.terminate());
                    return;
                }
                return;
            }
        }
        if (!this.error.addThrowable(th)) {
            h4g.r(th);
        } else if (decrementAndGet() == 0) {
            this.downstream.onError(this.error.terminate());
        } else if (this.maxConcurrency != Integer.MAX_VALUE) {
            this.upstream.request(1L);
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.set.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (decrementAndGet() == 0) {
            if (this.error.get() != null) {
                this.downstream.onError(this.error.terminate());
            } else {
                this.downstream.onComplete();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.delayErrors) {
            if (!this.error.addThrowable(th)) {
                h4g.r(th);
                return;
            } else {
                if (decrementAndGet() == 0) {
                    this.downstream.onError(this.error.terminate());
                    return;
                }
                return;
            }
        }
        this.set.dispose();
        if (!this.error.addThrowable(th)) {
            h4g.r(th);
        } else if (getAndSet(0) > 0) {
            this.downstream.onError(this.error.terminate());
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            int i = this.maxConcurrency;
            if (i == Integer.MAX_VALUE) {
                c3jVar.request(Long.MAX_VALUE);
            } else {
                c3jVar.request(i);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(es3 es3Var) {
        getAndIncrement();
        MergeInnerObserver mergeInnerObserver = new MergeInnerObserver();
        this.set.a(mergeInnerObserver);
        es3Var.a(mergeInnerObserver);
    }
}
