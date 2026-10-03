package io.reactivex.rxjava3.internal.subscriptions;

import com.oplus.aiunit.vision.c3j;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class BooleanSubscription extends AtomicBoolean implements c3j {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        SubscriptionHelper.validate(j2);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
