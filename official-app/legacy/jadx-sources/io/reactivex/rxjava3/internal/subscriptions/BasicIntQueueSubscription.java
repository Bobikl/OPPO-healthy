package io.reactivex.rxjava3.internal.subscriptions;

import com.oplus.aiunit.vision.g7f;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BasicIntQueueSubscription<T> extends AtomicInteger implements g7f<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    public abstract /* synthetic */ void cancel();

    public abstract /* synthetic */ void clear();

    public abstract /* synthetic */ boolean isEmpty();

    @Override // com.oplus.aiunit.vision.f4h
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public abstract /* synthetic */ Object poll() throws Throwable;

    public abstract /* synthetic */ void request(long j2);

    public abstract /* synthetic */ int requestFusion(int i);

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
