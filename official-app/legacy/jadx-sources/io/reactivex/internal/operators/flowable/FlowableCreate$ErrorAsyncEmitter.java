package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.v2j;
import io.reactivex.exceptions.MissingBackpressureException;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableCreate$ErrorAsyncEmitter<T> extends FlowableCreate$NoOverflowBaseAsyncEmitter<T> {
    private static final long serialVersionUID = 338953216916120960L;

    public FlowableCreate$ErrorAsyncEmitter(v2j<? super T> v2jVar) {
        super(v2jVar);
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableCreate$NoOverflowBaseAsyncEmitter
    public void onOverflow() {
        onError(new MissingBackpressureException("create: could not emit value due to lack of requests"));
    }
}
