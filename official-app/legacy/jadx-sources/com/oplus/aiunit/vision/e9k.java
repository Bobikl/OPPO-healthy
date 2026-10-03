package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class e9k extends cfg {
    public static final e9k k = new e9k();

    public static final class a implements Runnable {
        public final Runnable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final c f10827j;
        public final long k;

        public a(Runnable runnable, c cVar, long j2) {
            this.i = runnable;
            this.f10827j = cVar;
            this.k = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10827j.f10831l) {
                return;
            }
            long jA = this.f10827j.a(TimeUnit.MILLISECONDS);
            long j2 = this.k;
            if (j2 > jA) {
                try {
                    Thread.sleep(j2 - jA);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    g4g.u(e2);
                    return;
                }
            }
            if (this.f10827j.f10831l) {
                return;
            }
            this.i.run();
        }
    }

    public static final class b implements Comparable<b> {
        public final Runnable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f10828j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public volatile boolean f10829l;

        public b(Runnable runnable, Long l2, int i) {
            this.i = runnable;
            this.f10828j = l2.longValue();
            this.k = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iCompare = Long.compare(this.f10828j, bVar.f10828j);
            return iCompare == 0 ? Integer.compare(this.k, bVar.k) : iCompare;
        }
    }

    public static final class c extends cfg.c {
        public final PriorityBlockingQueue<b> i = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicInteger f10830j = new AtomicInteger();
        public final AtomicInteger k = new AtomicInteger();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public volatile boolean f10831l;

        public final class a implements Runnable {
            public final b i;

            public a(b bVar) {
                this.i = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.i.f10829l = true;
                c.this.i.remove(this.i);
            }
        }

        @Override // com.oplus.aiunit.vision.cfg.c
        public io.reactivex.rxjava3.disposables.a b(Runnable runnable) {
            return g(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // com.oplus.aiunit.vision.cfg.c
        public io.reactivex.rxjava3.disposables.a c(Runnable runnable, long j2, TimeUnit timeUnit) {
            long jA = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j2);
            return g(new a(runnable, this, jA), jA);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.f10831l = true;
        }

        public io.reactivex.rxjava3.disposables.a g(Runnable runnable, long j2) {
            if (this.f10831l) {
                return EmptyDisposable.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j2), this.k.incrementAndGet());
            this.i.add(bVar);
            if (this.f10830j.getAndIncrement() != 0) {
                return io.reactivex.rxjava3.disposables.a.i(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f10831l) {
                b bVarPoll = this.i.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f10830j.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!bVarPoll.f10829l) {
                    bVarPoll.i.run();
                }
            }
            this.i.clear();
            return EmptyDisposable.INSTANCE;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.f10831l;
        }
    }

    public static e9k k() {
        return k;
    }

    @Override // com.oplus.aiunit.vision.cfg
    public cfg.c c() {
        return new c();
    }

    @Override // com.oplus.aiunit.vision.cfg
    public io.reactivex.rxjava3.disposables.a g(Runnable runnable) {
        g4g.x(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // com.oplus.aiunit.vision.cfg
    public io.reactivex.rxjava3.disposables.a h(Runnable runnable, long j2, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j2);
            g4g.x(runnable).run();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            g4g.u(e2);
        }
        return EmptyDisposable.INSTANCE;
    }
}
