package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class wbd<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f18200j;
    public final TimeUnit k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cfg f18201l;
    public final boolean m;

    public static final class a<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final aed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f18202j;
        public final TimeUnit k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final cfg.c f18203l;
        public final boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.a f18204n;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.wbd$a$a, reason: collision with other inner class name */
        public final class RunnableC0939a implements Runnable {
            public RunnableC0939a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.i.onComplete();
                } finally {
                    a.this.f18203l.dispose();
                }
            }
        }

        public final class b implements Runnable {
            public final Throwable i;

            public b(Throwable th) {
                this.i = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.i.onError(this.i);
                } finally {
                    a.this.f18203l.dispose();
                }
            }
        }

        public final class c implements Runnable {
            public final T i;

            public c(T t) {
                this.i = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.i.onNext(this.i);
            }
        }

        public a(aed<? super T> aedVar, long j2, TimeUnit timeUnit, cfg.c cVar, boolean z) {
            this.i = aedVar;
            this.f18202j = j2;
            this.k = timeUnit;
            this.f18203l = cVar;
            this.m = z;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.f18204n.dispose();
            this.f18203l.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.f18203l.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            this.f18203l.c(new RunnableC0939a(), this.f18202j, this.k);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            this.f18203l.c(new b(th), this.m ? this.f18202j : 0L, this.k);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            this.f18203l.c(new c(t), this.f18202j, this.k);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.f18204n, aVar)) {
                this.f18204n = aVar;
                this.i.onSubscribe(this);
            }
        }
    }

    public wbd(jdd<T> jddVar, long j2, TimeUnit timeUnit, cfg cfgVar, boolean z) {
        super(jddVar);
        this.f18200j = j2;
        this.k = timeUnit;
        this.f18201l = cfgVar;
        this.m = z;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new a(this.m ? aedVar : new ytg(aedVar), this.f18200j, this.k, this.f18201l.c(), this.m));
    }
}
