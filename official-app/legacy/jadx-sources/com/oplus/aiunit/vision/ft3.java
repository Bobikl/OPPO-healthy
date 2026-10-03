package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.schedulers.RxThreadFactory;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class ft3 extends cfg {
    public static final b m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final RxThreadFactory f11496n;
    public static final int o = k(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx3.computation-threads", 0).intValue());
    public static final c p;
    public final ThreadFactory k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference<b> f11497l;

    public static final class a extends cfg.c {
        public final dza i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final xs3 f11498j;
        public final dza k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final c f11499l;
        public volatile boolean m;

        public a(c cVar) {
            this.f11499l = cVar;
            dza dzaVar = new dza();
            this.i = dzaVar;
            xs3 xs3Var = new xs3();
            this.f11498j = xs3Var;
            dza dzaVar2 = new dza();
            this.k = dzaVar2;
            dzaVar2.a(dzaVar);
            dzaVar2.a(xs3Var);
        }

        @Override // com.oplus.aiunit.vision.cfg.c
        public io.reactivex.rxjava3.disposables.a b(Runnable runnable) {
            return this.m ? EmptyDisposable.INSTANCE : this.f11499l.g(runnable, 0L, TimeUnit.MILLISECONDS, this.i);
        }

        @Override // com.oplus.aiunit.vision.cfg.c
        public io.reactivex.rxjava3.disposables.a c(Runnable runnable, long j2, TimeUnit timeUnit) {
            return this.m ? EmptyDisposable.INSTANCE : this.f11499l.g(runnable, j2, timeUnit, this.f11498j);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            if (this.m) {
                return;
            }
            this.m = true;
            this.k.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.m;
        }
    }

    public static final class b {
        public final int a;
        public final c[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f11500c;

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
                return ft3.p;
            }
            c[] cVarArr = this.b;
            long j2 = this.f11500c;
            this.f11500c = 1 + j2;
            return cVarArr[(int) (j2 % ((long) i))];
        }

        public void b() {
            for (c cVar : this.b) {
                cVar.dispose();
            }
        }
    }

    public static final class c extends io.reactivex.rxjava3.internal.schedulers.a {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxComputationShutdown"));
        p = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        f11496n = rxThreadFactory;
        b bVar = new b(0, rxThreadFactory);
        m = bVar;
        bVar.b();
    }

    public ft3() {
        this(f11496n);
    }

    public static int k(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    @Override // com.oplus.aiunit.vision.cfg
    public cfg.c c() {
        return new a(this.f11497l.get().a());
    }

    @Override // com.oplus.aiunit.vision.cfg
    public io.reactivex.rxjava3.disposables.a h(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f11497l.get().a().h(runnable, j2, timeUnit);
    }

    @Override // com.oplus.aiunit.vision.cfg
    public io.reactivex.rxjava3.disposables.a j(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        return this.f11497l.get().a().j(runnable, j2, j3, timeUnit);
    }

    public void l() {
        b bVar = new b(o, this.k);
        if (fue.a(this.f11497l, m, bVar)) {
            return;
        }
        bVar.b();
    }

    public ft3(ThreadFactory threadFactory) {
        this.k = threadFactory;
        this.f11497l = new AtomicReference<>(m);
        l();
    }
}
