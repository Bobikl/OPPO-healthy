package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class pcd<T> extends m6<T, T> {

    public static final class a<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final aed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.a f15317j;

        public a(aed<? super T> aedVar) {
            this.i = aedVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.f15317j.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.f15317j.isDisposed();
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
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            this.f15317j = aVar;
            this.i.onSubscribe(this);
        }
    }

    public pcd(jdd<T> jddVar) {
        super(jddVar);
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new a(aedVar));
    }
}
