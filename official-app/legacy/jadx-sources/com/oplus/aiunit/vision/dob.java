package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class dob<T> extends xnb<T> {
    public final s6h<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mpe<? super T> f10638j;

    public static final class a<T> implements l6h<T>, io.reactivex.rxjava3.disposables.a {
        public final lob<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final mpe<? super T> f10639j;
        public io.reactivex.rxjava3.disposables.a k;

        public a(lob<? super T> lobVar, mpe<? super T> mpeVar) {
            this.i = lobVar;
            this.f10639j = mpeVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            io.reactivex.rxjava3.disposables.a aVar = this.k;
            this.k = DisposableHelper.DISPOSED;
            aVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.k.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            this.i.onError(th);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.k, aVar)) {
                this.k = aVar;
                this.i.onSubscribe(this);
            }
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            try {
                if (this.f10639j.test(t)) {
                    this.i.onSuccess(t);
                } else {
                    this.i.onComplete();
                }
            } catch (Throwable th) {
                hu6.b(th);
                this.i.onError(th);
            }
        }
    }

    public dob(s6h<T> s6hVar, mpe<? super T> mpeVar) {
        this.i = s6hVar;
        this.f10638j = mpeVar;
    }

    @Override // com.oplus.aiunit.vision.xnb
    public void l(lob<? super T> lobVar) {
        this.i.b(new a(lobVar, this.f10638j));
    }
}
