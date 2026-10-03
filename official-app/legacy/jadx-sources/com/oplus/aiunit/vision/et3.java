package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class et3 extends zeg {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f11073l;
    public static final RxThreadFactory m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f11074n = f(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());
    public static final c o;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ThreadFactory f11075j;
    public final AtomicReference<b> k;

    public static final class a extends zeg.c {
        public final eza i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ys3 f11076j;
        public final eza k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final c f11077l;
        public volatile boolean m;

        public a(c cVar) {
            this.f11077l = cVar;
            eza ezaVar = new eza();
            this.i = ezaVar;
            ys3 ys3Var = new ys3();
            this.f11076j = ys3Var;
            eza ezaVar2 = new eza();
            this.k = ezaVar2;
            ezaVar2.a(ezaVar);
            ezaVar2.a(ys3Var);
        }

        @Override // com.oplus.aiunit.vision.zeg.c
        public cv5 b(Runnable runnable) {
            return this.m ? EmptyDisposable.INSTANCE : this.f11077l.e(runnable, 0L, TimeUnit.MILLISECONDS, this.i);
        }

        @Override // com.oplus.aiunit.vision.zeg.c
        public cv5 c(Runnable runnable, long j2, TimeUnit timeUnit) {
            return this.m ? EmptyDisposable.INSTANCE : this.f11077l.e(runnable, j2, timeUnit, this.f11076j);
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            if (this.m) {
                return;
            }
            this.m = true;
            this.k.dispose();
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.m;
        }
    }

    public static final class b {
        public final int a;
        public final c[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f11078c;

        public b(int i, ThreadFactory threadFactory) {
            this.a = i;
            this.b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.b[i2] = new c(threadFactory);
            }
        }

        public c a() {
            int i = this.a;
            if (i == 0) {
                return et3.o;
            }
            c[] cVarArr = this.b;
            long j2 = this.f11078c;
            this.f11078c = 1 + j2;
            return cVarArr[(int) (j2 % ((long) i))];
        }

        public void b() {
            for (c cVar : this.b) {
                cVar.dispose();
            }
        }
    }

    public static final class c extends io.reactivex.internal.schedulers.a {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxComputationShutdown"));
        o = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        m = rxThreadFactory;
        b bVar = new b(0, rxThreadFactory);
        f11073l = bVar;
        bVar.b();
    }

    public et3() {
        this(m);
    }

    public static int f(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    @Override // com.oplus.aiunit.vision.zeg
    public zeg.c a() {
        return new a(this.k.get().a());
    }

    @Override // com.oplus.aiunit.vision.zeg
    public cv5 d(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.k.get().a().f(runnable, j2, timeUnit);
    }

    @Override // com.oplus.aiunit.vision.zeg
    public cv5 e(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        return this.k.get().a().g(runnable, j2, j3, timeUnit);
    }

    public void g() {
        b bVar = new b(f11074n, this.f11075j);
        if (fue.a(this.k, f11073l, bVar)) {
            return;
        }
        bVar.b();
    }

    public et3(ThreadFactory threadFactory) {
        this.f11075j = threadFactory;
        this.k = new AtomicReference<>(f11073l);
        g();
    }
}
