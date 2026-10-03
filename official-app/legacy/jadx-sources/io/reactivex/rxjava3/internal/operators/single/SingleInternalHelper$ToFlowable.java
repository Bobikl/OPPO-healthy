package io.reactivex.rxjava3.internal.operators.single;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.k3f;
import com.oplus.aiunit.vision.s6h;

/* JADX INFO: loaded from: classes10.dex */
enum SingleInternalHelper$ToFlowable implements d08<s6h, k3f> {
    INSTANCE;

    @Override // com.oplus.aiunit.vision.d08
    public k3f apply(s6h s6hVar) {
        return new SingleToFlowable(s6hVar);
    }
}
