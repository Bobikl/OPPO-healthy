package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.p14;

/* JADX INFO: loaded from: classes10.dex */
public enum FlowableInternalHelper$RequestMax implements p14<c3j> {
    INSTANCE;

    @Override // com.oplus.aiunit.vision.p14
    public void accept(c3j c3jVar) throws Exception {
        c3jVar.request(Long.MAX_VALUE);
    }
}
