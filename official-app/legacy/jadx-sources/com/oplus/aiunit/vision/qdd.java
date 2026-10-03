package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class qdd<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mpe<? super T> f15754j;

    public static final class a<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final aed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final mpe<? super T> f15755j;
        public io.reactivex.rxjava3.disposables.a k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f15756l;

        public a(aed<? super T> aedVar, mpe<? super T> mpeVar) {
            this.i = aedVar;
            this.f15755j = mpeVar;
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
            if (this.f15756l) {
                return;
            }
            this.f15756l = true;
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            if (this.f15756l) {
                g4g.u(th);
            } else {
                this.f15756l = true;
                this.i.onError(th);
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (this.f15756l) {
                return;
            }
            try {
                if (this.f15755j.test(t)) {
                    this.i.onNext(t);
                    return;
                }
                this.f15756l = true;
                this.k.dispose();
                this.i.onComplete();
            } catch (Throwable th) {
                hu6.b(th);
                this.k.dispose();
                onError(th);
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

    public qdd(jdd<T> jddVar, mpe<? super T> mpeVar) {
        super(jddVar);
        this.f15754j = mpeVar;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new a(aedVar, this.f15754j));
    }
}
