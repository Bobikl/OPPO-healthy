package io.reactivex.rxjava3.internal.operators.completable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.ds3;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.xs3;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class CompletableMerge$CompletableMergeSubscriber extends AtomicInteger implements vu7<ds3>, a {
    private static final long serialVersionUID = -2108443387387077490L;
    final boolean delayErrors;
    final as3 downstream;
    final int maxConcurrency;
    c3j upstream;
    final xs3 set = new xs3();
    final AtomicThrowable errors = new AtomicThrowable();

    public final class MergeInnerObserver extends AtomicReference<a> implements as3, a {
        private static final long serialVersionUID = 251330541679988317L;

        public MergeInnerObserver() {
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onComplete() {
            CompletableMerge$CompletableMergeSubscriber.this.innerComplete(this);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onError(Throwable th) {
            CompletableMerge$CompletableMergeSubscriber.this.innerError(this, th);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onSubscribe(a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }
    }

    public CompletableMerge$CompletableMergeSubscriber(as3 as3Var, int i, boolean z) {
        this.downstream = as3Var;
        this.maxConcurrency = i;
        this.delayErrors = z;
        lazySet(1);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.upstream.cancel();
        this.set.dispose();
        this.errors.tryTerminateAndReport();
    }

    public void innerComplete(MergeInnerObserver mergeInnerObserver) {
        this.set.b(mergeInnerObserver);
        if (decrementAndGet() == 0) {
            this.errors.tryTerminateConsumer(this.downstream);
        } else if (this.maxConcurrency != Integer.MAX_VALUE) {
            this.upstream.request(1L);
        }
    }

    public void innerError(MergeInnerObserver mergeInnerObserver, Throwable th) {
        this.set.b(mergeInnerObserver);
        if (!this.delayErrors) {
            this.upstream.cancel();
            this.set.dispose();
            if (!this.errors.tryAddThrowableOrReport(th) || getAndSet(0) <= 0) {
                return;
            }
            this.errors.tryTerminateConsumer(this.downstream);
            return;
        }
        if (this.errors.tryAddThrowableOrReport(th)) {
            if (decrementAndGet() == 0) {
                this.errors.tryTerminateConsumer(this.downstream);
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.set.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (decrementAndGet() == 0) {
            this.errors.tryTerminateConsumer(this.downstream);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.delayErrors) {
            if (this.errors.tryAddThrowableOrReport(th) && decrementAndGet() == 0) {
                this.errors.tryTerminateConsumer(this.downstream);
                return;
            }
            return;
        }
        this.set.dispose();
        if (!this.errors.tryAddThrowableOrReport(th) || getAndSet(0) <= 0) {
            return;
        }
        this.errors.tryTerminateConsumer(this.downstream);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
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
    public void onNext(ds3 ds3Var) {
        getAndIncrement();
        MergeInnerObserver mergeInnerObserver = new MergeInnerObserver();
        this.set.a(mergeInnerObserver);
        ds3Var.a(mergeInnerObserver);
    }
}
