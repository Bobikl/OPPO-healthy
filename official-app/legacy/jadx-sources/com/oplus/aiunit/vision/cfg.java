package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class cfg {
    public static boolean i = Boolean.getBoolean("rx3.scheduler.use-nanotime");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f10061j = a(Long.getLong("rx3.scheduler.drift-tolerance", 15).longValue(), System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes"));

    public static final class a implements io.reactivex.rxjava3.disposables.a, Runnable {
        public final Runnable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final c f10062j;
        public Thread k;

        public a(Runnable runnable, c cVar) {
            this.i = runnable;
            this.f10062j = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            if (this.k == Thread.currentThread()) {
                c cVar = this.f10062j;
                if (cVar instanceof io.reactivex.rxjava3.internal.schedulers.a) {
                    ((io.reactivex.rxjava3.internal.schedulers.a) cVar).k();
                    return;
                }
            }
            this.f10062j.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.f10062j.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.k = Thread.currentThread();
            try {
                this.i.run();
                dispose();
                this.k = null;
            } catch (Throwable th) {
                try {
                    g4g.u(th);
                    throw th;
                } catch (Throwable th2) {
                    dispose();
                    this.k = null;
                    throw th2;
                }
            }
        }
    }

    public static final class b implements io.reactivex.rxjava3.disposables.a, Runnable {
        public final Runnable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final c f10063j;
        public volatile boolean k;

        public b(Runnable runnable, c cVar) {
            this.i = runnable;
            this.f10063j = cVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.k = true;
            this.f10063j.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.k;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.k) {
                return;
            }
            try {
                this.i.run();
            } catch (Throwable th) {
                dispose();
                g4g.u(th);
                throw th;
            }
        }
    }

    public static abstract class c implements io.reactivex.rxjava3.disposables.a {

        public final class a implements Runnable {
            public final Runnable i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final SequentialDisposable f10064j;
            public final long k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public long f10065l;
            public long m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public long f10066n;

            public a(long j2, Runnable runnable, long j3, SequentialDisposable sequentialDisposable, long j4) {
                this.i = runnable;
                this.f10064j = sequentialDisposable;
                this.k = j4;
                this.m = j3;
                this.f10066n = j2;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0034  */
            @Override // java.lang.Runnable
            public void run() {
                long j2;
                this.i.run();
                if (this.f10064j.isDisposed()) {
                    return;
                }
                c cVar = c.this;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jA = cVar.a(timeUnit);
                long j3 = cfg.f10061j;
                long j4 = jA + j3;
                long j5 = this.m;
                if (j4 >= j5) {
                    long j6 = this.k;
                    if (jA >= j5 + j6 + j3) {
                        long j7 = this.k;
                        long j8 = jA + j7;
                        long j9 = this.f10065l + 1;
                        this.f10065l = j9;
                        this.f10066n = j8 - (j7 * j9);
                        j2 = j8;
                    } else {
                        long j10 = this.f10066n;
                        long j11 = this.f10065l + 1;
                        this.f10065l = j11;
                        j2 = j10 + (j11 * j6);
                    }
                } else {
                    long j12 = this.k;
                    long j13 = jA + j12;
                    long j14 = this.f10065l + 1;
                    this.f10065l = j14;
                    this.f10066n = j13 - (j12 * j14);
                    j2 = j13;
                }
                this.m = jA;
                this.f10064j.replace(c.this.c(this, j2 - jA, timeUnit));
            }
        }

        public long a(TimeUnit timeUnit) {
            return cfg.b(timeUnit);
        }

        public io.reactivex.rxjava3.disposables.a b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract io.reactivex.rxjava3.disposables.a c(Runnable runnable, long j2, TimeUnit timeUnit);

        public io.reactivex.rxjava3.disposables.a f(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable runnableX = g4g.x(runnable);
            long nanos = timeUnit.toNanos(j3);
            long jA = a(TimeUnit.NANOSECONDS);
            io.reactivex.rxjava3.disposables.a aVarC = c(new a(jA + timeUnit.toNanos(j2), runnableX, jA, sequentialDisposable2, nanos), j2, timeUnit);
            if (aVarC == EmptyDisposable.INSTANCE) {
                return aVarC;
            }
            sequentialDisposable.replace(aVarC);
            return sequentialDisposable2;
        }
    }

    public static long a(long j2, String str) {
        if ("seconds".equalsIgnoreCase(str)) {
            return TimeUnit.SECONDS.toNanos(j2);
        }
        return "milliseconds".equalsIgnoreCase(str) ? TimeUnit.MILLISECONDS.toNanos(j2) : TimeUnit.MINUTES.toNanos(j2);
    }

    public static long b(TimeUnit timeUnit) {
        return !i ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public abstract c c();

    public long f(TimeUnit timeUnit) {
        return b(timeUnit);
    }

    public io.reactivex.rxjava3.disposables.a g(Runnable runnable) {
        return h(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public io.reactivex.rxjava3.disposables.a h(Runnable runnable, long j2, TimeUnit timeUnit) {
        c cVarC = c();
        a aVar = new a(g4g.x(runnable), cVarC);
        cVarC.c(aVar, j2, timeUnit);
        return aVar;
    }

    public io.reactivex.rxjava3.disposables.a j(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        c cVarC = c();
        b bVar = new b(g4g.x(runnable), cVarC);
        io.reactivex.rxjava3.disposables.a aVarF = cVarC.f(bVar, j2, j3, timeUnit);
        return aVarF == EmptyDisposable.INSTANCE ? aVarF : bVar;
    }
}
