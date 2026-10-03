package io.reactivex.rxjava3.processors;

import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.ou7;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;

/* JADX INFO: loaded from: classes10.dex */
public final class AsyncProcessor<T> extends ou7<T> {

    public static final class AsyncSubscription<T> extends DeferredScalarSubscription<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final AsyncProcessor<T> parent;

        public AsyncSubscription(v2j<? super T> v2jVar, AsyncProcessor<T> asyncProcessor) {
            super(v2jVar);
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
        public void cancel() {
            if (super.tryCancel()) {
                throw null;
            }
        }

        public void onComplete() {
            if (isCancelled()) {
                return;
            }
            this.downstream.onComplete();
        }

        public void onError(Throwable th) {
            if (isCancelled()) {
                g4g.u(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }
}
