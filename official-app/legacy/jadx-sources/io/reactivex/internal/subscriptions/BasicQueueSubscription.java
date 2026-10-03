package io.reactivex.internal.subscriptions;

import com.oplus.aiunit.vision.h7f;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BasicQueueSubscription<T> extends AtomicLong implements h7f<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    public abstract /* synthetic */ void cancel();

    public abstract /* synthetic */ void clear();

    public abstract /* synthetic */ boolean isEmpty();

    @Override // com.oplus.aiunit.vision.g4h
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public abstract /* synthetic */ Object poll() throws Exception;

    public abstract /* synthetic */ void request(long j2);

    public abstract /* synthetic */ int requestFusion(int i);

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
