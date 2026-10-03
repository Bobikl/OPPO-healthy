package io.reactivex.internal.observers;

import com.oplus.aiunit.vision.b7f;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BasicIntQueueDisposable<T> extends AtomicInteger implements b7f<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // com.oplus.aiunit.vision.g4h
    public abstract /* synthetic */ void clear();

    @Override // com.oplus.aiunit.vision.cv5
    public abstract /* synthetic */ void dispose();

    @Override // com.oplus.aiunit.vision.cv5
    public abstract /* synthetic */ boolean isDisposed();

    @Override // com.oplus.aiunit.vision.g4h
    public abstract /* synthetic */ boolean isEmpty();

    @Override // com.oplus.aiunit.vision.g4h
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // com.oplus.aiunit.vision.g4h
    public abstract /* synthetic */ Object poll() throws Exception;

    @Override // com.oplus.aiunit.vision.f7f
    public abstract /* synthetic */ int requestFusion(int i);

    public final boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
