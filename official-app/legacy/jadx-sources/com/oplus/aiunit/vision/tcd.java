package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class tcd<T> extends f5h<T> {
    public final jdd<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final T f16968j;

    public static final class a<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final l6h<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final T f16969j;
        public io.reactivex.rxjava3.disposables.a k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public T f16970l;

        public a(l6h<? super T> l6hVar, T t) {
            this.i = l6hVar;
            this.f16969j = t;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.k.dispose();
            this.k = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.k == DisposableHelper.DISPOSED;
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            this.k = DisposableHelper.DISPOSED;
            T t = this.f16970l;
            if (t != null) {
                this.f16970l = null;
                this.i.onSuccess(t);
                return;
            }
            T t2 = this.f16969j;
            if (t2 != null) {
                this.i.onSuccess(t2);
            } else {
                this.i.onError(new NoSuchElementException());
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            this.k = DisposableHelper.DISPOSED;
            this.f16970l = null;
            this.i.onError(th);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            this.f16970l = t;
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.k, aVar)) {
                this.k = aVar;
                this.i.onSubscribe(this);
            }
        }
    }

    public tcd(jdd<T> jddVar, T t) {
        this.i = jddVar;
        this.f16968j = t;
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super T> l6hVar) {
        this.i.subscribe(new a(l6hVar, this.f16968j));
    }
}
