package io.reactivex.internal.schedulers;

import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.gv5;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ExecutorScheduler$ExecutorWorker$InterruptibleRunnable extends AtomicInteger implements Runnable, cv5 {
    static final int FINISHED = 2;
    static final int INTERRUPTED = 4;
    static final int INTERRUPTING = 3;
    static final int READY = 0;
    static final int RUNNING = 1;
    private static final long serialVersionUID = -3603436687413320876L;
    final Runnable run;
    final gv5 tasks;
    volatile Thread thread;

    public ExecutorScheduler$ExecutorWorker$InterruptibleRunnable(Runnable runnable, gv5 gv5Var) {
        this.run = runnable;
        this.tasks = gv5Var;
    }

    public void cleanup() {
        gv5 gv5Var = this.tasks;
        if (gv5Var != null) {
            gv5Var.b(this);
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        while (true) {
            int i = get();
            if (i >= 2) {
                return;
            }
            if (i == 0) {
                if (compareAndSet(0, 4)) {
                    cleanup();
                    return;
                }
            } else if (compareAndSet(1, 3)) {
                Thread thread = this.thread;
                if (thread != null) {
                    thread.interrupt();
                    this.thread = null;
                }
                set(4);
                cleanup();
                return;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() >= 2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (get() == 0) {
            this.thread = Thread.currentThread();
            if (!compareAndSet(0, 1)) {
                this.thread = null;
                return;
            }
            try {
                this.run.run();
                this.thread = null;
                if (compareAndSet(1, 2)) {
                }
            } finally {
                this.thread = null;
                if (compareAndSet(1, 2)) {
                    cleanup();
                } else {
                    while (get() == 3) {
                        Thread.yield();
                    }
                    Thread.interrupted();
                }
            }
        }
    }
}
