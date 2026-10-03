package com.oplus.aiunit.vision;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes11.dex */
public final class is2<T> extends kbd<ztf<T>> {
    public final xr2<T> i;

    public static final class a implements cv5 {
        public final xr2<?> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f12631j;

        public a(xr2<?> xr2Var) {
            this.i = xr2Var;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            this.f12631j = true;
            this.i.cancel();
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.f12631j;
        }
    }

    public is2(xr2<T> xr2Var) {
        this.i = xr2Var;
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super ztf<T>> bedVar) {
        boolean z;
        xr2<T> xr2VarM5145clone = this.i.m5145clone();
        a aVar = new a(xr2VarM5145clone);
        bedVar.onSubscribe(aVar);
        try {
            ztf<T> ztfVarExecute = xr2VarM5145clone.execute();
            if (!aVar.isDisposed()) {
                bedVar.onNext(ztfVarExecute);
            }
            if (aVar.isDisposed()) {
                return;
            }
            try {
                bedVar.onComplete();
            } catch (Throwable th) {
                th = th;
                z = true;
                iu6.b(th);
                if (z) {
                    h4g.r(th);
                    return;
                }
                if (aVar.isDisposed()) {
                    return;
                }
                try {
                    bedVar.onError(th);
                } catch (Throwable th2) {
                    iu6.b(th2);
                    h4g.r(new CompositeException(th, th2));
                }
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }
}
