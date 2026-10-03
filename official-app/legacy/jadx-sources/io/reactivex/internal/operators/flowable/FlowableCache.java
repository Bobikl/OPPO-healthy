package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.g6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowableCache<T> extends g6<T, T> implements wu7<T> {

    public static final class CacheSubscription<T> extends AtomicInteger implements c3j {
        private static final long serialVersionUID = 6770240836423125754L;
        final v2j<? super T> downstream;
        long index;
        a<T> node;
        int offset;
        final FlowableCache<T> parent;
        final AtomicLong requested;

        public CacheSubscription(v2j<? super T> v2jVar, FlowableCache<T> flowableCache) {
            this.downstream = v2jVar;
            throw null;
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void cancel() {
            if (this.requested.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                throw null;
            }
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void request(long j2) {
            if (SubscriptionHelper.validate(j2)) {
                wr0.b(this.requested, j2);
                throw null;
            }
        }
    }

    public static final class a<T> {
    }
}
