package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.as3;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.ds3;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.vu7;
import com.oplus.aiunit.vision.xs3;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber<T> extends AtomicInteger implements vu7<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 8443155186132538303L;
    final boolean delayErrors;
    volatile boolean disposed;
    final as3 downstream;
    final d08<? super T, ? extends ds3> mapper;
    final int maxConcurrency;
    c3j upstream;
    final AtomicThrowable errors = new AtomicThrowable();
    final xs3 set = new xs3();

    public final class InnerObserver extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements as3, io.reactivex.rxjava3.disposables.a {
        private static final long serialVersionUID = 8606673141535671828L;

        public InnerObserver() {
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
            FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber.this.innerComplete(this);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onError(Throwable th) {
            FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber.this.innerError(this, th);
        }

        @Override // com.oplus.aiunit.vision.as3
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }
    }

    public FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber(as3 as3Var, d08<? super T, ? extends ds3> d08Var, boolean z, int i) {
        this.downstream = as3Var;
        this.mapper = d08Var;
        this.delayErrors = z;
        this.maxConcurrency = i;
        lazySet(1);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        this.disposed = true;
        this.upstream.cancel();
        this.set.dispose();
        this.errors.tryTerminateAndReport();
    }

    public void innerComplete(FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber<T>.InnerObserver innerObserver) {
        this.set.b(innerObserver);
        onComplete();
    }

    public void innerError(FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber<T>.InnerObserver innerObserver, Throwable th) {
        this.set.b(innerObserver);
        onError(th);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.set.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (decrementAndGet() == 0) {
            this.errors.tryTerminateConsumer(this.downstream);
        } else if (this.maxConcurrency != Integer.MAX_VALUE) {
            this.upstream.request(1L);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.errors.tryAddThrowableOrReport(th)) {
            if (!this.delayErrors) {
                this.disposed = true;
                this.upstream.cancel();
                this.set.dispose();
                this.errors.tryTerminateConsumer(this.downstream);
                return;
            }
            if (decrementAndGet() == 0) {
                this.errors.tryTerminateConsumer(this.downstream);
            } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        try {
            ds3 ds3VarApply = this.mapper.apply(t);
            Objects.requireNonNull(ds3VarApply, "The mapper returned a null CompletableSource");
            ds3 ds3Var = ds3VarApply;
            getAndIncrement();
            InnerObserver innerObserver = new InnerObserver();
            if (this.disposed || !this.set.a(innerObserver)) {
                return;
            }
            ds3Var.a(innerObserver);
        } catch (Throwable th) {
            hu6.b(th);
            this.upstream.cancel();
            onError(th);
        }
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
}
