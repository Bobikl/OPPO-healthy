package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.f4j;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.md1;
import com.oplus.aiunit.vision.v2j;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableOnBackpressureReduceWith$BackpressureReduceWithSubscriber<T, R> extends AbstractBackpressureThrottlingSubscriber<T, R> {
    private static final long serialVersionUID = 8255923705960622424L;
    final md1<R, ? super T, R> reducer;
    final f4j<R> supplier;

    public FlowableOnBackpressureReduceWith$BackpressureReduceWithSubscriber(v2j<? super R> v2jVar, f4j<R> f4jVar, md1<R, ? super T, R> md1Var) {
        super(v2jVar);
        this.reducer = md1Var;
        this.supplier = f4jVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.rxjava3.internal.operators.flowable.AbstractBackpressureThrottlingSubscriber, com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        R andSet = this.current.get();
        if (andSet != null) {
            andSet = this.current.getAndSet(null);
        }
        try {
            if (andSet == null) {
                AtomicReference<R> atomicReference = this.current;
                md1<R, ? super T, R> md1Var = this.reducer;
                R r = this.supplier.get();
                Objects.requireNonNull(r, "The supplier returned a null value");
                R rApply = md1Var.apply(r, (Object) t);
                Objects.requireNonNull(rApply, "The reducer returned a null value");
                atomicReference.lazySet(rApply);
            } else {
                AtomicReference<R> atomicReference2 = this.current;
                R rApply2 = this.reducer.apply(andSet, (Object) t);
                Objects.requireNonNull(rApply2, "The reducer returned a null value");
                atomicReference2.lazySet(rApply2);
            }
            drain();
        } catch (Throwable th) {
            hu6.b(th);
            this.upstream.cancel();
            onError(th);
        }
    }
}
