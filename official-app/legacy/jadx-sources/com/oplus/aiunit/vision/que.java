package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class que implements Executor {
    public final ArrayDeque<Runnable> i = new ArrayDeque<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayDeque<Runnable> f15949j = new ArrayDeque<>();
    public final Executor k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Runnable f15950l;

    public class a implements Runnable {
        public final /* synthetic */ Runnable i;

        public a(Runnable runnable) {
            this.i = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.i.run();
            } finally {
                que.this.d();
            }
        }
    }

    public que(@NonNull Executor executor) {
        this.k = executor;
    }

    public synchronized void b(@NonNull Runnable runnable) {
        this.i.offer(e(runnable));
        if (this.f15950l == null) {
            d();
        }
    }

    public synchronized void c(@NonNull Runnable runnable) {
        this.f15949j.offer(e(runnable));
        if (this.f15950l == null) {
            d();
        }
    }

    public final synchronized void d() {
        Runnable runnablePoll = this.i.poll();
        this.f15950l = runnablePoll;
        if (runnablePoll == null) {
            this.f15950l = this.f15949j.poll();
        }
        Runnable runnable = this.f15950l;
        if (runnable != null) {
            this.k.execute(runnable);
        }
    }

    public final Runnable e(@NonNull Runnable runnable) {
        return new a(runnable);
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(@NonNull Runnable runnable) {
        b(runnable);
    }
}
