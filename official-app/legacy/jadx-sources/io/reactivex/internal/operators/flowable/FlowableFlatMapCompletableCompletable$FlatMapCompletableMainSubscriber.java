package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.es3;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.ys3;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber<T> extends AtomicInteger implements wu7<T>, cv5 {
    private static final long serialVersionUID = 8443155186132538303L;
    final boolean delayErrors;
    volatile boolean disposed;
    final bs3 downstream;
    final j08<? super T, ? extends es3> mapper;
    final int maxConcurrency;
    c3j upstream;
    final AtomicThrowable errors = new AtomicThrowable();
    final ys3 set = new ys3();

    public final class InnerObserver extends AtomicReference<cv5> implements bs3, cv5 {
        private static final long serialVersionUID = 8606673141535671828L;

        public InnerObserver() {
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
            FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber.this.innerComplete(this);
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onError(Throwable th) {
            FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber.this.innerError(this, th);
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }
    }

    public FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber(bs3 bs3Var, j08<? super T, ? extends es3> j08Var, boolean z, int i) {
        this.downstream = bs3Var;
        this.mapper = j08Var;
        this.delayErrors = z;
        this.maxConcurrency = i;
        lazySet(1);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.disposed = true;
        this.upstream.cancel();
        this.set.dispose();
    }

    public void innerComplete(FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber<T>.InnerObserver innerObserver) {
        this.set.b(innerObserver);
        onComplete();
    }

    public void innerError(FlowableFlatMapCompletableCompletable$FlatMapCompletableMainSubscriber<T>.InnerObserver innerObserver, Throwable th) {
        this.set.b(innerObserver);
        onError(th);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.set.isDisposed();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (decrementAndGet() != 0) {
            if (this.maxConcurrency != Integer.MAX_VALUE) {
                this.upstream.request(1L);
            }
        } else {
            Throwable thTerminate = this.errors.terminate();
            if (thTerminate != null) {
                this.downstream.onError(thTerminate);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (!this.errors.addThrowable(th)) {
            h4g.r(th);
            return;
        }
        if (!this.delayErrors) {
            dispose();
            if (getAndSet(0) > 0) {
                this.downstream.onError(this.errors.terminate());
                return;
            }
            return;
        }
        if (decrementAndGet() == 0) {
            this.downstream.onError(this.errors.terminate());
        } else if (this.maxConcurrency != Integer.MAX_VALUE) {
            this.upstream.request(1L);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        try {
            es3 es3Var = (es3) abd.d(this.mapper.apply(t), "The mapper returned a null CompletableSource");
            getAndIncrement();
            InnerObserver innerObserver = new InnerObserver();
            if (this.disposed || !this.set.a(innerObserver)) {
                return;
            }
            es3Var.a(innerObserver);
        } catch (Throwable th) {
            iu6.b(th);
            this.upstream.cancel();
            onError(th);
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
}
