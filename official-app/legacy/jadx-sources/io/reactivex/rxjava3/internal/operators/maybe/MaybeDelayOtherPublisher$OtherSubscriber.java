package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeDelayOtherPublisher$OtherSubscriber<T> extends AtomicReference<c3j> implements vu7<Object> {
    private static final long serialVersionUID = -1215060610805418006L;
    final lob<? super T> downstream;
    Throwable error;
    T value;

    public MaybeDelayOtherPublisher$OtherSubscriber(lob<? super T> lobVar) {
        this.downstream = lobVar;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        Throwable th = this.error;
        if (th != null) {
            this.downstream.onError(th);
            return;
        }
        T t = this.value;
        if (t != null) {
            this.downstream.onSuccess(t);
        } else {
            this.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        Throwable th2 = this.error;
        if (th2 == null) {
            this.downstream.onError(th);
        } else {
            this.downstream.onError(new CompositeException(th2, th));
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(Object obj) {
        c3j c3jVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (c3jVar != subscriptionHelper) {
            lazySet(subscriptionHelper);
            c3jVar.cancel();
            onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
    }
}
