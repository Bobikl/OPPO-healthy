package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class vbd<T> extends n6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f17789j;
    public final TimeUnit k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zeg f17790l;
    public final boolean m;

    public static final class a<T> implements bed<T>, cv5 {
        public final bed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f17791j;
        public final TimeUnit k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final zeg.c f17792l;
        public final boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public cv5 f17793n;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.vbd$a$a, reason: collision with other inner class name */
        public final class RunnableC0934a implements Runnable {
            public RunnableC0934a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.i.onComplete();
                } finally {
                    a.this.f17792l.dispose();
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
                    a.this.f17792l.dispose();
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

        public a(bed<? super T> bedVar, long j2, TimeUnit timeUnit, zeg.c cVar, boolean z) {
            this.i = bedVar;
            this.f17791j = j2;
            this.k = timeUnit;
            this.f17792l = cVar;
            this.m = z;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            this.f17793n.dispose();
            this.f17792l.dispose();
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.f17792l.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            this.f17792l.c(new RunnableC0934a(), this.f17791j, this.k);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            this.f17792l.c(new b(th), this.m ? this.f17791j : 0L, this.k);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(T t) {
            this.f17792l.c(new c(t), this.f17791j, this.k);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            if (DisposableHelper.validate(this.f17793n, cv5Var)) {
                this.f17793n = cv5Var;
                this.i.onSubscribe(this);
            }
        }
    }

    public vbd(kdd<T> kddVar, long j2, TimeUnit timeUnit, zeg zegVar, boolean z) {
        super(kddVar);
        this.f17789j = j2;
        this.k = timeUnit;
        this.f17790l = zegVar;
        this.m = z;
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super T> bedVar) {
        this.i.subscribe(new a(this.m ? bedVar : new ztg(bedVar), this.f17789j, this.k, this.f17790l.a(), this.m));
    }
}
