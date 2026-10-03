package io.reactivex.internal.schedulers;

import com.oplus.aiunit.vision.cv5;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
final class ExecutorScheduler$ExecutorWorker$BooleanRunnable extends AtomicBoolean implements Runnable, cv5 {
    private static final long serialVersionUID = -2421395018820541164L;
    final Runnable actual;

    public ExecutorScheduler$ExecutorWorker$BooleanRunnable(Runnable runnable) {
        this.actual = runnable;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        lazySet(true);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (get()) {
            return;
        }
        try {
            this.actual.run();
        } finally {
            lazySet(true);
        }
    }
}
