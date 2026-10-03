package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.v2j;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableConcatMap$SimpleScalarSubscription<T> extends AtomicBoolean implements c3j {
    private static final long serialVersionUID = -7606889335172043256L;
    final v2j<? super T> downstream;
    final T value;

    public FlowableConcatMap$SimpleScalarSubscription(T t, v2j<? super T> v2jVar) {
        this.value = t;
        this.downstream = v2jVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (j2 <= 0 || !compareAndSet(false, true)) {
            return;
        }
        v2j<? super T> v2jVar = this.downstream;
        v2jVar.onNext(this.value);
        v2jVar.onComplete();
    }
}
