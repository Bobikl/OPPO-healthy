package io.reactivex.rxjava3.internal.operators.parallel;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.md1;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ParallelReduceFull$ParallelReduceFullInnerSubscriber<T> extends AtomicReference<c3j> implements vu7<T> {
    private static final long serialVersionUID = -7954444275102466525L;
    boolean done;
    final ParallelReduceFull$ParallelReduceFullMainSubscriber<T> parent;
    final md1<T, T, T> reducer;
    T value;

    public ParallelReduceFull$ParallelReduceFullInnerSubscriber(ParallelReduceFull$ParallelReduceFullMainSubscriber<T> parallelReduceFull$ParallelReduceFullMainSubscriber, md1<T, T, T> md1Var) {
        this.parent = parallelReduceFull$ParallelReduceFullMainSubscriber;
        this.reducer = md1Var;
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
            g4g.u(th);
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
            T tApply = this.reducer.apply(t2, t);
            Objects.requireNonNull(tApply, "The reducer returned a null value");
            this.value = tApply;
        } catch (Throwable th) {
            hu6.b(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, Long.MAX_VALUE);
    }
}
