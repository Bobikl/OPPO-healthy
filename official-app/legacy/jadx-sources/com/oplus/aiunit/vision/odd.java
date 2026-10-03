package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class odd<T> extends m6<T, T> {

    public static final class a<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final aed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.a f14896j;
        public T k;

        public a(aed<? super T> aedVar) {
            this.i = aedVar;
        }

        public void a() {
            T t = this.k;
            if (t != null) {
                this.k = null;
                this.i.onNext(t);
            }
            this.i.onComplete();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.k = null;
            this.f14896j.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.f14896j.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            a();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            this.k = null;
            this.i.onError(th);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            this.k = t;
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.f14896j, aVar)) {
                this.f14896j = aVar;
                this.i.onSubscribe(this);
            }
        }
    }

    public odd(jdd<T> jddVar) {
        super(jddVar);
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new a(aedVar));
    }
}
