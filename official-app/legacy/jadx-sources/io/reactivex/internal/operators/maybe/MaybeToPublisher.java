package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.qob;

/* JADX INFO: loaded from: classes10.dex */
public enum MaybeToPublisher implements j08<qob<Object>, k3f<Object>> {
    INSTANCE;

    public static <T> j08<qob<T>, k3f<T>> instance() {
        return INSTANCE;
    }

    @Override // com.oplus.aiunit.vision.j08
    public k3f<Object> apply(qob<Object> qobVar) throws Exception {
        return new MaybeToFlowable(qobVar);
    }
}
