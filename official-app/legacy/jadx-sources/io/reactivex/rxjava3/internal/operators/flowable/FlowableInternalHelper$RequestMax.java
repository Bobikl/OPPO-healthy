package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.o14;

/* JADX INFO: loaded from: classes10.dex */
public enum FlowableInternalHelper$RequestMax implements o14<c3j> {
    INSTANCE;

    @Override // com.oplus.aiunit.vision.o14
    public void accept(c3j c3jVar) {
        c3jVar.request(Long.MAX_VALUE);
    }
}
