package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeTimeoutPublisher$TimeoutOtherMaybeObserver<T, U> extends AtomicReference<c3j> implements vu7<Object> {
    private static final long serialVersionUID = 8663801314800248617L;
    final MaybeTimeoutPublisher$TimeoutMainMaybeObserver<T, U> parent;

    public MaybeTimeoutPublisher$TimeoutOtherMaybeObserver(MaybeTimeoutPublisher$TimeoutMainMaybeObserver<T, U> maybeTimeoutPublisher$TimeoutMainMaybeObserver) {
        this.parent = maybeTimeoutPublisher$TimeoutMainMaybeObserver;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.parent.otherComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.parent.otherError(th);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(Object obj) {
        get().cancel();
        this.parent.otherComplete();
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
    }
}
