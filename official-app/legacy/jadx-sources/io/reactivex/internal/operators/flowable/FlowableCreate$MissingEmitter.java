package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.v2j;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableCreate$MissingEmitter<T> extends FlowableCreate$BaseEmitter<T> {
    private static final long serialVersionUID = 3776720187248809713L;

    public FlowableCreate$MissingEmitter(v2j<? super T> v2jVar) {
        super(v2jVar);
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter, com.oplus.aiunit.vision.ll6
    public void onNext(T t) {
        long j2;
        if (isCancelled()) {
            return;
        }
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        this.downstream.onNext(t);
        do {
            j2 = get();
            if (j2 == 0) {
                return;
            }
        } while (!compareAndSet(j2, j2 - 1));
    }
}
