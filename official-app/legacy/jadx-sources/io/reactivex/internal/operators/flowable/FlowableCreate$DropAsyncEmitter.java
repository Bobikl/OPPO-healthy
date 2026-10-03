package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.v2j;

/* JADX INFO: loaded from: classes10.dex */
final class FlowableCreate$DropAsyncEmitter<T> extends FlowableCreate$NoOverflowBaseAsyncEmitter<T> {
    private static final long serialVersionUID = 8360058422307496563L;

    public FlowableCreate$DropAsyncEmitter(v2j<? super T> v2jVar) {
        super(v2jVar);
    }

    @Override // io.reactivex.internal.operators.flowable.FlowableCreate$NoOverflowBaseAsyncEmitter
    public void onOverflow() {
    }
}
