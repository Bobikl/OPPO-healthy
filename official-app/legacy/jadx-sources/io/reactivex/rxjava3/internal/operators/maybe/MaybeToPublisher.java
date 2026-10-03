package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.pob;

/* JADX INFO: loaded from: classes10.dex */
public enum MaybeToPublisher implements d08<pob<Object>, k3f<Object>> {
    INSTANCE;

    public static <T> d08<pob<T>, k3f<T>> instance() {
        return INSTANCE;
    }

    @Override // com.oplus.aiunit.vision.d08
    public k3f<Object> apply(pob<Object> pobVar) {
        return new MaybeToFlowable(pobVar);
    }
}
