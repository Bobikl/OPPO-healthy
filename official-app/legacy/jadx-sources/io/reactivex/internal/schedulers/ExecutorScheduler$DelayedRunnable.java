package io.reactivex.internal.schedulers;

import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ExecutorScheduler$DelayedRunnable extends AtomicReference<Runnable> implements Runnable, cv5 {
    private static final long serialVersionUID = -4101336210206799084L;
    final SequentialDisposable direct;
    final SequentialDisposable timed;

    public ExecutorScheduler$DelayedRunnable(Runnable runnable) {
        super(runnable);
        this.timed = new SequentialDisposable();
        this.direct = new SequentialDisposable();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (getAndSet(null) != null) {
            this.timed.dispose();
            this.direct.dispose();
        }
    }

    public Runnable getWrappedRunnable() {
        Runnable runnable = get();
        return runnable != null ? runnable : Functions.EMPTY_RUNNABLE;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() == null;
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = get();
        if (runnable != null) {
            try {
                runnable.run();
                lazySet(null);
                this.timed.lazySet(DisposableHelper.DISPOSED);
                SequentialDisposable sequentialDisposable = this.direct;
            } finally {
                lazySet(null);
                this.timed.lazySet(DisposableHelper.DISPOSED);
                this.direct.lazySet(DisposableHelper.DISPOSED);
            }
        }
    }
}
