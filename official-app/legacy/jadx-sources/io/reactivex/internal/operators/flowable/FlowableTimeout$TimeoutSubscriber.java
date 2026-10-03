package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.abd;
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
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableTimeout$TimeoutSubscriber<T> extends AtomicLong implements wu7<T>, c3j, yu7 {
    private static final long serialVersionUID = 3764492702657003550L;
    final v2j<? super T> downstream;
    final j08<? super T, ? extends k3f<?>> itemTimeoutIndicator;
    final SequentialDisposable task = new SequentialDisposable();
    final AtomicReference<c3j> upstream = new AtomicReference<>();
    final AtomicLong requested = new AtomicLong();

    public FlowableTimeout$TimeoutSubscriber(v2j<? super T> v2jVar, j08<? super T, ? extends k3f<?>> j08Var) {
        this.downstream = v2jVar;
        this.itemTimeoutIndicator = j08Var;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        SubscriptionHelper.cancel(this.upstream);
        this.task.dispose();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.task.dispose();
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            h4g.r(th);
        } else {
            this.task.dispose();
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        long j2 = get();
        if (j2 != Long.MAX_VALUE) {
            long j3 = 1 + j2;
            if (compareAndSet(j2, j3)) {
                cv5 cv5Var = this.task.get();
                if (cv5Var != null) {
                    cv5Var.dispose();
                }
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
                    getAndSet(Long.MAX_VALUE);
                    this.downstream.onError(th);
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, c3jVar);
    }

    @Override // com.oplus.aiunit.vision.cv7
    public void onTimeout(long j2) {
        if (compareAndSet(j2, Long.MAX_VALUE)) {
            SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(new TimeoutException());
        }
    }

    @Override // com.oplus.aiunit.vision.yu7
    public void onTimeoutError(long j2, Throwable th) {
        if (!compareAndSet(j2, Long.MAX_VALUE)) {
            h4g.r(th);
        } else {
            SubscriptionHelper.cancel(this.upstream);
            this.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.deferredRequest(this.upstream, this.requested, j2);
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
