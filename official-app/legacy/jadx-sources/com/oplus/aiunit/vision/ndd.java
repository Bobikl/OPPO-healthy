package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes10.dex */
public final class ndd<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f14456j;

    public static final class a<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final aed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f14457j;
        public io.reactivex.rxjava3.disposables.a k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f14458l;

        public a(aed<? super T> aedVar, long j2) {
            this.i = aedVar;
            this.f14458l = j2;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.k.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.k.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            if (this.f14457j) {
                return;
            }
            this.f14457j = true;
            this.k.dispose();
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            if (this.f14457j) {
                g4g.u(th);
                return;
            }
            this.f14457j = true;
            this.k.dispose();
            this.i.onError(th);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (this.f14457j) {
                return;
            }
            long j2 = this.f14458l;
            long j3 = j2 - 1;
            this.f14458l = j3;
            if (j2 > 0) {
                boolean z = j3 == 0;
                this.i.onNext(t);
                if (z) {
                    onComplete();
                }
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.k, aVar)) {
                this.k = aVar;
                if (this.f14458l != 0) {
                    this.i.onSubscribe(this);
                    return;
                }
                this.f14457j = true;
                aVar.dispose();
                EmptyDisposable.complete(this.i);
            }
        }
    }

    public ndd(jdd<T> jddVar, long j2) {
        super(jddVar);
        this.f14456j = j2;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new a(aedVar, this.f14456j));
    }
}
