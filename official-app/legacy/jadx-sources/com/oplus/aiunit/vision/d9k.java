package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class d9k extends zeg {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final d9k f10442j = new d9k();

    public static final class a implements Runnable {
        public final Runnable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final c f10443j;
        public final long k;

        public a(Runnable runnable, c cVar, long j2) {
            this.i = runnable;
            this.f10443j = cVar;
            this.k = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10443j.f10447l) {
                return;
            }
            long jA = this.f10443j.a(TimeUnit.MILLISECONDS);
            long j2 = this.k;
            if (j2 > jA) {
                try {
                    Thread.sleep(j2 - jA);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    h4g.r(e2);
                    return;
                }
            }
            if (this.f10443j.f10447l) {
                return;
            }
            this.i.run();
        }
    }

    public static final class b implements Comparable<b> {
        public final Runnable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f10444j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public volatile boolean f10445l;

        public b(Runnable runnable, Long l2, int i) {
            this.i = runnable;
            this.f10444j = l2.longValue();
            this.k = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iB = abd.b(this.f10444j, bVar.f10444j);
            return iB == 0 ? abd.a(this.k, bVar.k) : iB;
        }
    }

    public static final class c extends zeg.c {
        public final PriorityBlockingQueue<b> i = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AtomicInteger f10446j = new AtomicInteger();
        public final AtomicInteger k = new AtomicInteger();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public volatile boolean f10447l;

        public final class a implements Runnable {
            public final b i;

            public a(b bVar) {
                this.i = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.i.f10445l = true;
                c.this.i.remove(this.i);
            }
        }

        @Override // com.oplus.aiunit.vision.zeg.c
        public cv5 b(Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // com.oplus.aiunit.vision.zeg.c
        public cv5 c(Runnable runnable, long j2, TimeUnit timeUnit) {
            long jA = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j2);
            return e(new a(runnable, this, jA), jA);
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            this.f10447l = true;
        }

        public cv5 e(Runnable runnable, long j2) {
            if (this.f10447l) {
                return EmptyDisposable.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j2), this.k.incrementAndGet());
            this.i.add(bVar);
            if (this.f10446j.getAndIncrement() != 0) {
                return io.reactivex.disposables.a.b(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f10447l) {
                b bVarPoll = this.i.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f10446j.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!bVarPoll.f10445l) {
                    bVarPoll.i.run();
                }
            }
            this.i.clear();
            return EmptyDisposable.INSTANCE;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.f10447l;
        }
    }

    public static d9k f() {
        return f10442j;
    }

    @Override // com.oplus.aiunit.vision.zeg
    public zeg.c a() {
        return new c();
    }

    @Override // com.oplus.aiunit.vision.zeg
    public cv5 c(Runnable runnable) {
        h4g.t(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // com.oplus.aiunit.vision.zeg
    public cv5 d(Runnable runnable, long j2, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j2);
            h4g.t(runnable).run();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            h4g.r(e2);
        }
        return EmptyDisposable.INSTANCE;
    }
}
