package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableToList$ToListSubscriber<T, U extends Collection<? super T>> extends DeferredScalarSubscription<U> implements wu7<T>, c3j {
    private static final long serialVersionUID = -8134157938864266736L;
    c3j upstream;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowableToList$ToListSubscriber(v2j<? super U> v2jVar, U u) {
        super(v2jVar);
        this.value = u;
    }

    @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
    public void cancel() {
        super.cancel();
        this.upstream.cancel();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        complete(this.value);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.value = null;
        this.downstream.onError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        Collection collection = (Collection) this.value;
        if (collection != null) {
            collection.add(t);
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
            this.upstream = c3jVar;
            this.downstream.onSubscribe(this);
            c3jVar.request(Long.MAX_VALUE);
        }
    }
}
