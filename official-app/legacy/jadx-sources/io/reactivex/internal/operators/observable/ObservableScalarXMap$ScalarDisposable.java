package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.b7f;
import com.oplus.aiunit.vision.bed;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableScalarXMap$ScalarDisposable<T> extends AtomicInteger implements b7f<T>, Runnable {
    static final int FUSED = 1;
    static final int ON_COMPLETE = 3;
    static final int ON_NEXT = 2;
    static final int START = 0;
    private static final long serialVersionUID = 3880992722410194083L;
    final bed<? super T> observer;
    final T value;

    public ObservableScalarXMap$ScalarDisposable(bed<? super T> bedVar, T t) {
        this.observer = bedVar;
        this.value = t;
    }

    @Override // com.oplus.aiunit.vision.g4h
    public void clear() {
        lazySet(3);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        set(3);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() == 3;
    }

    @Override // com.oplus.aiunit.vision.g4h
    public boolean isEmpty() {
        return get() != 1;
    }

    @Override // com.oplus.aiunit.vision.g4h
    public boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // com.oplus.aiunit.vision.g4h
    public T poll() throws Exception {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.value;
    }

    @Override // com.oplus.aiunit.vision.f7f
    public int requestFusion(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            this.observer.onNext(this.value);
            if (get() == 2) {
                lazySet(3);
                this.observer.onComplete();
            }
        }
    }

    public boolean offer(T t, T t2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
