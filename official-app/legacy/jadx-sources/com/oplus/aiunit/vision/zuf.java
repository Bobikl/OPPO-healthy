package com.oplus.aiunit.vision;

import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes11.dex */
public final class zuf<T> extends kbd<vuf<T>> {
    public final kbd<ztf<T>> i;

    public static class a<R> implements bed<ztf<R>> {
        public final bed<? super vuf<R>> i;

        public a(bed<? super vuf<R>> bedVar) {
            this.i = bedVar;
        }

        @Override // com.oplus.aiunit.vision.bed
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(ztf<R> ztfVar) {
            this.i.onNext(vuf.b(ztfVar));
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            try {
                this.i.onNext(vuf.a(th));
                this.i.onComplete();
            } catch (Throwable th2) {
                try {
                    this.i.onError(th2);
                } catch (Throwable th3) {
                    iu6.b(th3);
                    h4g.r(new CompositeException(th2, th3));
                }
            }
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            this.i.onSubscribe(cv5Var);
        }
    }

    public zuf(kbd<ztf<T>> kbdVar) {
        this.i = kbdVar;
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super vuf<T>> bedVar) {
        this.i.subscribe(new a(bedVar));
    }
}
