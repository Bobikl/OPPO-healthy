package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.md1;
import com.oplus.aiunit.vision.v2j;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableOnBackpressureReduce$BackpressureReduceSubscriber<T> extends AbstractBackpressureThrottlingSubscriber<T, T> {
    private static final long serialVersionUID = 821363947659780367L;
    final md1<T, T, T> reducer;

    public FlowableOnBackpressureReduce$BackpressureReduceSubscriber(v2j<? super T> v2jVar, md1<T, T, T> md1Var) {
        super(v2jVar);
        this.reducer = md1Var;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.rxjava3.internal.operators.flowable.AbstractBackpressureThrottlingSubscriber, com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        Object andSet = this.current.get();
        if (andSet != null) {
            andSet = this.current.getAndSet(null);
        }
        if (andSet == null) {
            this.current.lazySet((R) t);
        } else {
            try {
                AtomicReference<R> atomicReference = this.current;
                T tApply = this.reducer.apply((T) andSet, t);
                Objects.requireNonNull(tApply, "The reducer returned a null value");
                atomicReference.lazySet((R) tApply);
            } catch (Throwable th) {
                hu6.b(th);
                this.upstream.cancel();
                onError(th);
                return;
            }
        }
        drain();
    }
}
