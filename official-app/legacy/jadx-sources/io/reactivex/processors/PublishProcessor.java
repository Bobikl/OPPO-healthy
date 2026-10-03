package io.reactivex.processors;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.pu7;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class PublishProcessor<T> extends pu7<T> {

    public static final class PublishSubscription<T> extends AtomicLong implements c3j {
        private static final long serialVersionUID = 3562861878281475070L;
        final v2j<? super T> downstream;
        final PublishProcessor<T> parent;

        public PublishSubscription(v2j<? super T> v2jVar, PublishProcessor<T> publishProcessor) {
            this.downstream = v2jVar;
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                throw null;
            }
        }

        public boolean isCancelled() {
            return get() == Long.MIN_VALUE;
        }

        public boolean isFull() {
            return get() == 0;
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            } else {
                h4g.r(th);
            }
        }

        public void onNext(T t) {
            long j2 = get();
            if (j2 == Long.MIN_VALUE) {
                return;
            }
            if (j2 != 0) {
                this.downstream.onNext(t);
                wr0.f(this, 1L);
            } else {
                cancel();
                this.downstream.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            }
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void request(long j2) {
            if (SubscriptionHelper.validate(j2)) {
                wr0.b(this, j2);
            }
        }
    }
}
