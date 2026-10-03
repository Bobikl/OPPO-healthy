package io.reactivex.processors;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.pu7;
import com.oplus.aiunit.vision.v2j;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class MulticastProcessor<T> extends pu7<T> {

    public static final class MulticastSubscription<T> extends AtomicLong implements c3j {
        private static final long serialVersionUID = -363282618957264509L;
        final v2j<? super T> downstream;
        long emitted;
        final MulticastProcessor<T> parent;

        public MulticastSubscription(v2j<? super T> v2jVar, MulticastProcessor<T> multicastProcessor) {
            this.downstream = v2jVar;
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                throw null;
            }
        }

        public void onComplete() {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.downstream.onError(th);
            }
        }

        public void onNext(T t) {
            if (get() != Long.MIN_VALUE) {
                this.emitted++;
                this.downstream.onNext(t);
            }
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void request(long j2) {
            long j3;
            long j4;
            if (SubscriptionHelper.validate(j2)) {
                do {
                    j3 = get();
                    if (j3 == Long.MIN_VALUE) {
                        return;
                    }
                    if (j3 == Long.MAX_VALUE) {
                        return;
                    } else {
                        j4 = j3 + j2;
                    }
                } while (!compareAndSet(j3, j4 >= 0 ? j4 : Long.MAX_VALUE));
                throw null;
            }
        }
    }
}
