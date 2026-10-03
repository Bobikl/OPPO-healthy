package io.reactivex.internal.operators.parallel;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.nd1;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelReduceFull$ParallelReduceFullInnerSubscriber<T> extends AtomicReference<c3j> implements wu7<T> {
    private static final long serialVersionUID = -7954444275102466525L;
    boolean done;
    final ParallelReduceFull$ParallelReduceFullMainSubscriber<T> parent;
    final nd1<T, T, T> reducer;
    T value;

    public ParallelReduceFull$ParallelReduceFullInnerSubscriber(ParallelReduceFull$ParallelReduceFullMainSubscriber<T> parallelReduceFull$ParallelReduceFullMainSubscriber, nd1<T, T, T> nd1Var) {
        this.parent = parallelReduceFull$ParallelReduceFullMainSubscriber;
        this.reducer = nd1Var;
    }

    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.parent.innerComplete(this.value);
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
        } else {
            this.done = true;
            this.parent.innerError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        T t2 = this.value;
        if (t2 == null) {
            this.value = t;
            return;
        }
        try {
            this.value = (T) abd.d(this.reducer.apply(t2, t), "The reducer returned a null value");
        } catch (Throwable th) {
            iu6.b(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
    }
}
