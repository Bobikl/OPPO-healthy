package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableBufferBoundary$BufferCloseSubscriber<T, C extends Collection<? super T>> extends AtomicReference<c3j> implements vu7<Object>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = -8498650778633225126L;
    final long index;
    final FlowableBufferBoundary$BufferBoundarySubscriber<T, C, ?, ?> parent;

    public FlowableBufferBoundary$BufferCloseSubscriber(FlowableBufferBoundary$BufferBoundarySubscriber<T, C, ?, ?> flowableBufferBoundary$BufferBoundarySubscriber, long j2) {
        this.parent = flowableBufferBoundary$BufferBoundarySubscriber;
        this.index = j2;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        c3j c3jVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (c3jVar != subscriptionHelper) {
            lazySet(subscriptionHelper);
            this.parent.close(this, this.index);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        c3j c3jVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (c3jVar == subscriptionHelper) {
            g4g.u(th);
        } else {
            lazySet(subscriptionHelper);
            this.parent.boundaryError(this, th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(Object obj) {
        c3j c3jVar = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (c3jVar != subscriptionHelper) {
            lazySet(subscriptionHelper);
            c3jVar.cancel();
            this.parent.close(this, this.index);
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
    }
}
