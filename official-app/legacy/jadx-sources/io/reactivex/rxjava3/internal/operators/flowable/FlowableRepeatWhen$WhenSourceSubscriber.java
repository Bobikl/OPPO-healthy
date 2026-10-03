package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.ou7;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;

/* JADX INFO: loaded from: classes10.dex */
abstract class FlowableRepeatWhen$WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements vu7<T> {
    private static final long serialVersionUID = -5604623027276966720L;
    protected final v2j<? super T> downstream;
    protected final ou7<U> processor;
    private long produced;
    protected final c3j receiver;

    public FlowableRepeatWhen$WhenSourceSubscriber(v2j<? super T> v2jVar, ou7<U> ou7Var, c3j c3jVar) {
        super(false);
        this.downstream = v2jVar;
        this.processor = ou7Var;
        this.receiver = c3jVar;
    }

    public final void again(U u) {
        setSubscription(EmptySubscription.INSTANCE);
        long j2 = this.produced;
        if (j2 != 0) {
            this.produced = 0L;
            produced(j2);
        }
        this.receiver.request(1L);
        this.processor.onNext(u);
    }

    @Override // io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter, com.oplus.aiunit.vision.c3j
    public final void cancel() {
        super.cancel();
        this.receiver.cancel();
    }

    public abstract /* synthetic */ void onComplete();

    public abstract /* synthetic */ void onError(Throwable th);

    @Override // com.oplus.aiunit.vision.v2j
    public final void onNext(T t) {
        this.produced++;
        this.downstream.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public final void onSubscribe(c3j c3jVar) {
        setSubscription(c3jVar);
    }
}
