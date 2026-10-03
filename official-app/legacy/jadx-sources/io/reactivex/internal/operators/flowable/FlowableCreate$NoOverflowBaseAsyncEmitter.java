package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;

/* JADX INFO: loaded from: classes10.dex */
abstract class FlowableCreate$NoOverflowBaseAsyncEmitter<T> extends FlowableCreate$BaseEmitter<T> {
    private static final long serialVersionUID = 4127754106204442833L;

    public FlowableCreate$NoOverflowBaseAsyncEmitter(v2j<? super T> v2jVar) {
        super(v2jVar);
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableCreate$BaseEmitter, com.oplus.aiunit.vision.ll6
    public final void onNext(T t) {
        if (isCancelled()) {
            return;
        }
        if (t == null) {
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else if (get() == 0) {
            onOverflow();
        } else {
            this.downstream.onNext(t);
            wr0.e(this, 1L);
        }
    }

    public abstract void onOverflow();
}
