package io.reactivex.rxjava3.processors;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.ou7;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class MulticastProcessor<T> extends ou7<T> {

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
            if (SubscriptionHelper.validate(j2)) {
                long jB = vr0.b(this, j2);
                if (jB != Long.MIN_VALUE && jB != Long.MAX_VALUE) {
                    throw null;
                }
            }
        }
    }
}
