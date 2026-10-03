package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public abstract class zeg {
    public static final long i = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public static final class a implements cv5, Runnable {
        public final Runnable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final c f19388j;
        public Thread k;

        public a(Runnable runnable, c cVar) {
            this.i = runnable;
            this.f19388j = cVar;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            if (this.k == Thread.currentThread()) {
                c cVar = this.f19388j;
                if (cVar instanceof io.reactivex.internal.schedulers.a) {
                    ((io.reactivex.internal.schedulers.a) cVar).h();
                    return;
                }
            }
            this.f19388j.dispose();
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.f19388j.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.k = Thread.currentThread();
            try {
                this.i.run();
            } finally {
                dispose();
                this.k = null;
            }
        }
    }

    public static final class b implements cv5, Runnable {
        public final Runnable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final c f19389j;
        public volatile boolean k;

        public b(Runnable runnable, c cVar) {
            this.i = runnable;
            this.f19389j = cVar;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            this.k = true;
            this.f19389j.dispose();
        }

        @Override // com.oplus.aiunit.vision.cv5
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
                iu6.b(th);
                this.f19389j.dispose();
                throw ExceptionHelper.d(th);
            }
        }
    }

    public static abstract class c implements cv5 {

        public final class a implements Runnable {
            public final Runnable i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final SequentialDisposable f19390j;
            public final long k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public long f19391l;
            public long m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public long f19392n;

            public a(long j2, Runnable runnable, long j3, SequentialDisposable sequentialDisposable, long j4) {
                this.i = runnable;
                this.f19390j = sequentialDisposable;
                this.k = j4;
                this.m = j3;
                this.f19392n = j2;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0034  */
            @Override // java.lang.Runnable
            public void run() {
                long j2;
                this.i.run();
                if (this.f19390j.isDisposed()) {
                    return;
                }
                c cVar = c.this;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jA = cVar.a(timeUnit);
                long j3 = zeg.i;
                long j4 = jA + j3;
                long j5 = this.m;
                if (j4 >= j5) {
                    long j6 = this.k;
                    if (jA >= j5 + j6 + j3) {
                        long j7 = this.k;
                        long j8 = jA + j7;
                        long j9 = this.f19391l + 1;
                        this.f19391l = j9;
                        this.f19392n = j8 - (j7 * j9);
                        j2 = j8;
                    } else {
                        long j10 = this.f19392n;
                        long j11 = this.f19391l + 1;
                        this.f19391l = j11;
                        j2 = j10 + (j11 * j6);
                    }
                } else {
                    long j12 = this.k;
                    long j13 = jA + j12;
                    long j14 = this.f19391l + 1;
                    this.f19391l = j14;
                    this.f19392n = j13 - (j12 * j14);
                    j2 = j13;
                }
                this.m = jA;
                this.f19390j.replace(c.this.c(this, j2 - jA, timeUnit));
            }
        }

        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public cv5 b(Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract cv5 c(Runnable runnable, long j2, TimeUnit timeUnit);

        public cv5 d(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable runnableT = h4g.t(runnable);
            long nanos = timeUnit.toNanos(j3);
            long jA = a(TimeUnit.NANOSECONDS);
            cv5 cv5VarC = c(new a(jA + timeUnit.toNanos(j2), runnableT, jA, sequentialDisposable2, nanos), j2, timeUnit);
            if (cv5VarC == EmptyDisposable.INSTANCE) {
                return cv5VarC;
            }
            sequentialDisposable.replace(cv5VarC);
            return sequentialDisposable2;
        }
    }

    public abstract c a();

    public long b(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public cv5 c(Runnable runnable) {
        return d(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public cv5 d(Runnable runnable, long j2, TimeUnit timeUnit) {
        c cVarA = a();
        a aVar = new a(h4g.t(runnable), cVarA);
        cVarA.c(aVar, j2, timeUnit);
        return aVar;
    }

    public cv5 e(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        c cVarA = a();
        b bVar = new b(h4g.t(runnable), cVarA);
        cv5 cv5VarD = cVarA.d(bVar, j2, j3, timeUnit);
        return cv5VarD == EmptyDisposable.INSTANCE ? cv5VarD : bVar;
    }
}
