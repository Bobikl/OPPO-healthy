package io.reactivex.rxjava3.internal.observers;

import com.oplus.aiunit.vision.a7f;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements a7f<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    public abstract /* synthetic */ void clear();

    public abstract /* synthetic */ void dispose();

    public abstract /* synthetic */ boolean isDisposed();

    public abstract /* synthetic */ boolean isEmpty();

    @Override // com.oplus.aiunit.vision.f4h
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }

    public abstract /* synthetic */ Object poll() throws Throwable;

    public abstract /* synthetic */ int requestFusion(int i);

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
