package io.reactivex.internal.subscriptions;

import com.oplus.aiunit.vision.h7f;
import com.oplus.aiunit.vision.v2j;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ScalarSubscription<T> extends AtomicInteger implements h7f<T> {
    static final int CANCELLED = 2;
    static final int NO_REQUEST = 0;
    static final int REQUESTED = 1;
    private static final long serialVersionUID = -3830916580126663321L;
    final v2j<? super T> subscriber;
    final T value;

    public ScalarSubscription(v2j<? super T> v2jVar, T t) {
        this.subscriber = v2jVar;
        this.value = t;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        lazySet(2);
    }

    @Override // com.oplus.aiunit.vision.g4h
    public void clear() {
        lazySet(1);
    }

    public boolean isCancelled() {
        return get() == 2;
    }

    @Override // com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // com.oplus.aiunit.vision.g4h
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // com.oplus.aiunit.vision.g4h
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (SubscriptionHelper.validate(j2) && compareAndSet(0, 1)) {
            v2j<? super T> v2jVar = this.subscriber;
            v2jVar.onNext(this.value);
            if (get() != 2) {
                v2jVar.onComplete();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.f7f
    public int requestFusion(int i) {
        return i & 1;
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
