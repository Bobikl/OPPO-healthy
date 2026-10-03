package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.qu7;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.vr0;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
final class FlowablePublishMulticast$MulticastSubscription<T> extends AtomicLong implements c3j {
    private static final long serialVersionUID = 8664815189257569791L;
    final v2j<? super T> downstream;
    long emitted;
    final qu7<T> parent;

    public FlowablePublishMulticast$MulticastSubscription(v2j<? super T> v2jVar, qu7<T> qu7Var) {
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

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2)) {
            vr0.b(this, j2);
            throw null;
        }
    }
}
