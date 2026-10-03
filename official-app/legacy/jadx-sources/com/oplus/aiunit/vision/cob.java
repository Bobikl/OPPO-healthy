package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class cob<T> extends k6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mpe<? super T> f10174j;

    public static final class a<T> implements lob<T>, io.reactivex.rxjava3.disposables.a {
        public final lob<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final mpe<? super T> f10175j;
        public io.reactivex.rxjava3.disposables.a k;

        public a(lob<? super T> lobVar, mpe<? super T> mpeVar) {
            this.i = lobVar;
            this.f10175j = mpeVar;
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

        @Override // com.oplus.aiunit.vision.lob
        public void onComplete() {
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onError(Throwable th) {
            this.i.onError(th);
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.k, aVar)) {
                this.k = aVar;
                this.i.onSubscribe(this);
            }
        }

        @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            try {
                if (this.f10175j.test(t)) {
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

    public cob(pob<T> pobVar, mpe<? super T> mpeVar) {
        super(pobVar);
        this.f10174j = mpeVar;
    }

    @Override // com.oplus.aiunit.vision.xnb
    public void l(lob<? super T> lobVar) {
        this.i.a(new a(lobVar, this.f10174j));
    }
}
