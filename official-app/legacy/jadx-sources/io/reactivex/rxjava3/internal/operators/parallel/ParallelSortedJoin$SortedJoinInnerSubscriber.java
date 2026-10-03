package io.reactivex.rxjava3.internal.operators.parallel;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelSortedJoin$SortedJoinInnerSubscriber<T> extends AtomicReference<c3j> implements vu7<List<T>> {
    private static final long serialVersionUID = 6751017204873808094L;
    final int index;
    final ParallelSortedJoin$SortedJoinSubscription<T> parent;

    public ParallelSortedJoin$SortedJoinInnerSubscriber(ParallelSortedJoin$SortedJoinSubscription<T> parallelSortedJoin$SortedJoinSubscription, int i) {
        this.parent = parallelSortedJoin$SortedJoinSubscription;
        this.index = i;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.parent.innerError(th);
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(List<T> list) {
        this.parent.innerNext(list, this.index);
    }
}
