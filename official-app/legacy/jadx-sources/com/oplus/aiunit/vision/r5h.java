package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class r5h<T> extends f5h<T> {
    public final s6h<? extends T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f16072j;
    public final TimeUnit k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cfg f16073l;
    public final boolean m;

    public final class a implements l6h<T> {
        public final SequentialDisposable i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final l6h<? super T> f16074j;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.r5h$a$a, reason: collision with other inner class name */
        public final class RunnableC0922a implements Runnable {
            public final Throwable i;

            public RunnableC0922a(Throwable th) {
                this.i = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f16074j.onError(this.i);
            }
        }

        public final class b implements Runnable {
            public final T i;

            public b(T t) {
                this.i = t;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f16074j.onSuccess(this.i);
            }
        }

        public a(SequentialDisposable sequentialDisposable, l6h<? super T> l6hVar) {
            this.i = sequentialDisposable;
            this.f16074j = l6hVar;
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            SequentialDisposable sequentialDisposable = this.i;
            cfg cfgVar = r5h.this.f16073l;
            RunnableC0922a runnableC0922a = new RunnableC0922a(th);
            r5h r5hVar = r5h.this;
            sequentialDisposable.replace(cfgVar.h(runnableC0922a, r5hVar.m ? r5hVar.f16072j : 0L, r5hVar.k));
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            this.i.replace(aVar);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            SequentialDisposable sequentialDisposable = this.i;
            cfg cfgVar = r5h.this.f16073l;
            b bVar = new b(t);
            r5h r5hVar = r5h.this;
            sequentialDisposable.replace(cfgVar.h(bVar, r5hVar.f16072j, r5hVar.k));
        }
    }

    public r5h(s6h<? extends T> s6hVar, long j2, TimeUnit timeUnit, cfg cfgVar, boolean z) {
        this.i = s6hVar;
        this.f16072j = j2;
        this.k = timeUnit;
        this.f16073l = cfgVar;
        this.m = z;
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super T> l6hVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        l6hVar.onSubscribe(sequentialDisposable);
        this.i.b(new a(sequentialDisposable, l6hVar));
    }
}
