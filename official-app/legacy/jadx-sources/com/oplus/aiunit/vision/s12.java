package com.oplus.aiunit.vision;

import io.reactivex.exceptions.CompositeException;
import retrofit2.adapter.rxjava2.HttpException;

/* JADX INFO: loaded from: classes11.dex */
public final class s12<T> extends kbd<T> {
    public final kbd<ztf<T>> i;

    public static class a<R> implements bed<ztf<R>> {
        public final bed<? super R> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f16433j;

        public a(bed<? super R> bedVar) {
            this.i = bedVar;
        }

        @Override // com.oplus.aiunit.vision.bed
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(ztf<R> ztfVar) {
            if (ztfVar.g()) {
                this.i.onNext(ztfVar.a());
                return;
            }
            this.f16433j = true;
            HttpException httpException = new HttpException(ztfVar);
            try {
                this.i.onError(httpException);
            } catch (Throwable th) {
                iu6.b(th);
                h4g.r(new CompositeException(httpException, th));
            }
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            if (this.f16433j) {
                return;
            }
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            if (!this.f16433j) {
                this.i.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            h4g.r(assertionError);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            this.i.onSubscribe(cv5Var);
        }
    }

    public s12(kbd<ztf<T>> kbdVar) {
        this.i = kbdVar;
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super T> bedVar) {
        this.i.subscribe(new a(bedVar));
    }
}
