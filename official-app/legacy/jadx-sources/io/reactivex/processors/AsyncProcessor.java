package io.reactivex.processors;

import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.pu7;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;

/* JADX INFO: loaded from: classes10.dex */
public final class AsyncProcessor<T> extends pu7<T> {

    public static final class AsyncSubscription<T> extends DeferredScalarSubscription<T> {
        private static final long serialVersionUID = 5629876084736248016L;
        final AsyncProcessor<T> parent;

        public AsyncSubscription(v2j<? super T> v2jVar, AsyncProcessor<T> asyncProcessor) {
            super(v2jVar);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
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
                h4g.r(th);
            } else {
                this.downstream.onError(th);
            }
        }
    }
}
