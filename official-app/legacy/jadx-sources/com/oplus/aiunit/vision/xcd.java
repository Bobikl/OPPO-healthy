package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class xcd<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mpe<? super Throwable> f18576j;

    public static final class a<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final aed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final mpe<? super Throwable> f18577j;
        public io.reactivex.rxjava3.disposables.a k;

        public a(aed<? super T> aedVar, mpe<? super Throwable> mpeVar) {
            this.i = aedVar;
            this.f18577j = mpeVar;
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
            try {
                if (this.f18577j.test(th)) {
                    this.i.onComplete();
                } else {
                    this.i.onError(th);
                }
            } catch (Throwable th2) {
                hu6.b(th2);
                this.i.onError(new CompositeException(th, th2));
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            this.i.onNext(t);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.k, aVar)) {
                this.k = aVar;
                this.i.onSubscribe(this);
            }
        }
    }

    public xcd(jdd<T> jddVar, mpe<? super Throwable> mpeVar) {
        super(jddVar);
        this.f18576j = mpeVar;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new a(aedVar, this.f18576j));
    }
}
