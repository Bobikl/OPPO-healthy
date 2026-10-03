package io.reactivex.subjects;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.r2j;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* JADX INFO: loaded from: classes10.dex */
public final class AsyncSubject<T> extends r2j<T> {

    public static final class AsyncDisposable<T> extends DeferredScalarDisposable<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final AsyncSubject<T> parent;

        public AsyncDisposable(bed<? super T> bedVar, AsyncSubject<T> asyncSubject) {
            super(bedVar);
        }

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
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
                h4g.r(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }
}
