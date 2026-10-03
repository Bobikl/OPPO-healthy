package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class fdd<T> extends xnb<T> {
    public final jdd<T> i;

    public static final class a<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final lob<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.a f11301j;
        public T k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f11302l;

        public a(lob<? super T> lobVar) {
            this.i = lobVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.f11301j.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.f11301j.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            if (this.f11302l) {
                return;
            }
            this.f11302l = true;
            T t = this.k;
            this.k = null;
            if (t == null) {
                this.i.onComplete();
            } else {
                this.i.onSuccess(t);
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            if (this.f11302l) {
                g4g.u(th);
            } else {
                this.f11302l = true;
                this.i.onError(th);
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (this.f11302l) {
                return;
            }
            if (this.k == null) {
                this.k = t;
                return;
            }
            this.f11302l = true;
            this.f11301j.dispose();
            this.i.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.f11301j, aVar)) {
                this.f11301j = aVar;
                this.i.onSubscribe(this);
            }
        }
    }

    public fdd(jdd<T> jddVar) {
        this.i = jddVar;
    }

    @Override // com.oplus.aiunit.vision.xnb
    public void l(lob<? super T> lobVar) {
        this.i.subscribe(new a(lobVar));
    }
}
