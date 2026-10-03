package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.mob;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeDelayOtherPublisher$OtherSubscriber<T> extends AtomicReference<c3j> implements wu7<Object> {
    private static final long serialVersionUID = -1215060610805418006L;
    final mob<? super T> downstream;
    Throwable error;
    T value;

    public MaybeDelayOtherPublisher$OtherSubscriber(mob<? super T> mobVar) {
        this.downstream = mobVar;
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

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
    }
}
