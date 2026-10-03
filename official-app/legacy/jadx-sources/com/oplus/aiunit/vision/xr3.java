package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class xr3 extends pr3 {
    public final Cdo i;

    public xr3(Cdo cdo) {
        this.i = cdo;
    }

    @Override // com.oplus.aiunit.vision.pr3
    public void k(as3 as3Var) {
        io.reactivex.rxjava3.disposables.a aVarE = io.reactivex.rxjava3.disposables.a.e();
        as3Var.onSubscribe(aVarE);
        if (aVarE.isDisposed()) {
            return;
        }
        try {
            this.i.run();
            if (aVarE.isDisposed()) {
                return;
            }
            as3Var.onComplete();
        } catch (Throwable th) {
            hu6.b(th);
            if (aVarE.isDisposed()) {
                g4g.u(th);
            } else {
                as3Var.onError(th);
            }
        }
    }
}
