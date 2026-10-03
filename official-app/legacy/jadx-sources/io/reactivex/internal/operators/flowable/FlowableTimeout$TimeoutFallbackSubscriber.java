package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.av7;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.yu7;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTimeout$TimeoutFallbackSubscriber<T> extends SubscriptionArbiter implements wu7<T>, yu7 {
    private static final long serialVersionUID = 3764492702657003550L;
    long consumed;
    final v2j<? super T> downstream;
    k3f<? extends T> fallback;
    final AtomicLong index;
    final j08<? super T, ? extends k3f<?>> itemTimeoutIndicator;
    final SequentialDisposable task;
    final AtomicReference<c3j> upstream;

    public FlowableTimeout$TimeoutFallbackSubscriber(v2j<? super T> v2jVar, j08<? super T, ? extends k3f<?>> j08Var, k3f<? extends T> k3fVar) {
        super(true);
        this.downstream = v2jVar;
        this.itemTimeoutIndicator = j08Var;
        this.task = new SequentialDisposable();
        this.upstream = new AtomicReference<>();
        this.fallback = k3fVar;
        this.index = new AtomicLong();
    }

    @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        this.task.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onComplete();
            this.task.dispose();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.index.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            h4g.r(th);
            return;
        }
        this.task.dispose();
        this.downstream.onError(th);
        this.task.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        long j2 = this.index.get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = j2 + 1;
            if (this.index.compareAndSet(j2, j3)) {
                cv5 cv5Var = this.task.get();
                if (cv5Var != null) {
                    cv5Var.dispose();
                }
                this.consumed++;
                this.downstream.onNext(t);
                try {
                    k3f k3fVar = (k3f) abd.d(this.itemTimeoutIndicator.apply(t), "The itemTimeoutIndicator returned a null Publisher.");
                    FlowableTimeout$TimeoutConsumer flowableTimeout$TimeoutConsumer = new FlowableTimeout$TimeoutConsumer(j3, this);
                    if (this.task.replace(flowableTimeout$TimeoutConsumer)) {
                        k3fVar.subscribe(flowableTimeout$TimeoutConsumer);
                    }
                } catch (Throwable th) {
                    iu6.b(th);
                    this.upstream.get().cancel();
                    this.index.getAndSet(Long.MAX_VALUE);
                    this.downstream.onError(th);
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this.upstream, c3jVar)) {
            setSubscription(c3jVar);
        }
    }

    @Override // com.oplus.aiunit.vision.cv7
    public void onTimeout(long j2) {
        if (this.index.compareAndSet(j2, Long.MAX_VALUE)) {
            SubscriptionHelper.cancel(this.upstream);
            k3f<? extends T> k3fVar = this.fallback;
            this.fallback = null;
            long j3 = this.consumed;
            if (j3 != 0) {
                produced(j3);
            }
            k3fVar.subscribe(new av7(this.downstream, this));
        }
    }

    @Override // com.oplus.aiunit.vision.yu7
    public void onTimeoutError(long j2, Throwable th) {
        if (!this.index.compareAndSet(j2, Long.MAX_VALUE)) {
            h4g.r(th);
        } else {
            SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(th);
        }
    }

    public void startFirstTimeout(k3f<?> k3fVar) {
        if (k3fVar != null) {
            FlowableTimeout$TimeoutConsumer flowableTimeout$TimeoutConsumer = new FlowableTimeout$TimeoutConsumer(0L, this);
            if (this.task.replace(flowableTimeout$TimeoutConsumer)) {
                k3fVar.subscribe(flowableTimeout$TimeoutConsumer);
            }
        }
    }
}
