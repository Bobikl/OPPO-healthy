package io.reactivex.internal.operators.single;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.m6h;
import com.oplus.aiunit.vision.t6h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleToObservable<T> extends kbd<T> {
    public final t6h<? extends T> i;

    public static final class SingleToObservableObserver<T> extends DeferredScalarDisposable<T> implements m6h<T> {
        private static final long serialVersionUID = 3786543492451018833L;
        cv5 upstream;

        public SingleToObservableObserver(bed<? super T> bedVar) {
            super(bedVar);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
        public void dispose() {
            super.dispose();
            this.upstream.dispose();
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onError(Throwable th) {
            error(th);
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onSubscribe(cv5 cv5Var) {
            if (DisposableHelper.validate(this.upstream, cv5Var)) {
                this.upstream = cv5Var;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // com.oplus.aiunit.vision.m6h
        public void onSuccess(T t) {
            complete(t);
        }
    }

    public SingleToObservable(t6h<? extends T> t6hVar) {
        this.i = t6hVar;
    }

    public static <T> m6h<T> I(bed<? super T> bedVar) {
        return new SingleToObservableObserver(bedVar);
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super T> bedVar) {
        this.i.a(I(bedVar));
    }
}
