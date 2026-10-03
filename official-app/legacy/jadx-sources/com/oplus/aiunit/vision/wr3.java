package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes10.dex */
public final class wr3 extends pr3 {
    public final Throwable i;

    public wr3(Throwable th) {
        this.i = th;
    }

    @Override // com.oplus.aiunit.vision.pr3
    public void k(as3 as3Var) {
        EmptyDisposable.error(this.i, as3Var);
    }
}
