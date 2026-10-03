package io.reactivex.rxjava3.subjects;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.s2j;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;

/* JADX INFO: loaded from: classes10.dex */
public final class AsyncSubject<T> extends s2j<T> {

    public static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final AsyncSubject<T> parent;

        public AsyncDisposable(aed<? super T> aedVar, AsyncSubject<T> asyncSubject) {
            super(aedVar);
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
        public void dispose() {
            if (super.tryDispose()) {
                throw null;
            }
        }

        public void onComplete() {
            if (isDisposed()) {
                return;
            }
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            if (isDisposed()) {
                g4g.u(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }
}
