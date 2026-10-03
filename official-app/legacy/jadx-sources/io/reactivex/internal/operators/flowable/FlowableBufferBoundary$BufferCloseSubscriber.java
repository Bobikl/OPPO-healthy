package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableBufferBoundary$BufferCloseSubscriber<T, C extends Collection<? super T>> extends AtomicReference<c3j> implements wu7<Object>, cv5 {
    private static final long serialVersionUID = -8498650778633225126L;
    final long index;
    final FlowableBufferBoundary$BufferBoundarySubscriber<T, C, ?, ?> parent;

    public FlowableBufferBoundary$BufferCloseSubscriber(FlowableBufferBoundary$BufferBoundarySubscriber<T, C, ?, ?> flowableBufferBoundary$BufferBoundarySubscriber, long j2) {
        this.parent = flowableBufferBoundary$BufferBoundarySubscriber;
        this.index = j2;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
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
            h4g.r(th);
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

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
    }
}
