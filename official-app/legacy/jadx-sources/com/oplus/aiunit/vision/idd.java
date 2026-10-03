package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class idd<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f12483j;

    public static final class a<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final aed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f12484j;
        public io.reactivex.rxjava3.disposables.a k;

        public a(aed<? super T> aedVar, long j2) {
            this.i = aedVar;
            this.f12484j = j2;
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
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            this.i.onError(th);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            long j2 = this.f12484j;
            if (j2 != 0) {
                this.f12484j = j2 - 1;
            } else {
                this.i.onNext(t);
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.k, aVar)) {
                this.k = aVar;
                this.i.onSubscribe(this);
            }
        }
    }

    public idd(jdd<T> jddVar, long j2) {
        super(jddVar);
        this.f12483j = j2;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new a(aedVar, this.f12483j));
    }
}
