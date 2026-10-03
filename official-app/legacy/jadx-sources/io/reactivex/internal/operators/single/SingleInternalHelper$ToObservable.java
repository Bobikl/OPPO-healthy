package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.t6h;

/* JADX INFO: loaded from: classes10.dex */
enum SingleInternalHelper$ToObservable implements j08<t6h, kbd> {
    INSTANCE;

    @Override // com.oplus.aiunit.vision.j08
    public kbd apply(t6h t6hVar) {
        return new SingleToObservable(t6hVar);
    }
}
