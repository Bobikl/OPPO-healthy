package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes10.dex */
public final class fcd extends kbd<Object> implements Callable {
    public static final kbd<Object> INSTANCE = new fcd();

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super Object> bedVar) {
        EmptyDisposable.complete(bedVar);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return null;
    }
}
