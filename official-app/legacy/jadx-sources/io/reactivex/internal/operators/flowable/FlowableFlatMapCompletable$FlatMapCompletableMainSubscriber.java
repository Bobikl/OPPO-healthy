package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.bs3;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.es3;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.ys3;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableFlatMapCompletable$FlatMapCompletableMainSubscriber<T> extends BasicIntQueueSubscription<T> implements wu7<T> {
    private static final long serialVersionUID = 8443155186132538303L;
    volatile boolean cancelled;
    final boolean delayErrors;
    final v2j<? super T> downstream;
    final j08<? super T, ? extends es3> mapper;
    final int maxConcurrency;
    c3j upstream;
    final AtomicThrowable errors = new AtomicThrowable();
    final ys3 set = new ys3();

    public final class InnerConsumer extends AtomicReference<cv5> implements bs3, cv5 {
        private static final long serialVersionUID = 8606673141535671828L;

        public InnerConsumer() {
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
            FlowableFlatMapCompletable$FlatMapCompletableMainSubscriber.this.innerComplete(this);
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onError(Throwable th) {
            FlowableFlatMapCompletable$FlatMapCompletableMainSubscriber.this.innerError(this, th);
        }

        @Override // com.oplus.aiunit.vision.bs3
        public void onSubscribe(cv5 cv5Var) {
            DisposableHelper.setOnce(this, cv5Var);
        }
    }

    public FlowableFlatMapCompletable$FlatMapCompletableMainSubscriber(v2j<? super T> v2jVar, j08<? super T, ? extends es3> j08Var, boolean z, int i) {
        this.downstream = v2jVar;
        this.mapper = j08Var;
        this.delayErrors = z;
        this.maxConcurrency = i;
        lazySet(1);
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        this.cancelled = true;
        this.upstream.cancel();
        this.set.dispose();
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public void clear() {
    }

    public void innerComplete(FlowableFlatMapCompletable$FlatMapCompletableMainSubscriber<T>.InnerConsumer innerConsumer) {
        this.set.b(innerConsumer);
        onComplete();
    }

    public void innerError(FlowableFlatMapCompletable$FlatMapCompletableMainSubscriber<T>.InnerConsumer innerConsumer, Throwable th) {
        this.set.b(innerConsumer);
        onError(th);
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return true;
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
            cancel();
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
            InnerConsumer innerConsumer = new InnerConsumer();
            if (this.cancelled || !this.set.a(innerConsumer)) {
                return;
            }
            es3Var.a(innerConsumer);
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

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
    public T poll() throws Exception {
        return null;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void request(long j2) {
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f7f
    public int requestFusion(int i) {
        return i & 2;
    }
}
