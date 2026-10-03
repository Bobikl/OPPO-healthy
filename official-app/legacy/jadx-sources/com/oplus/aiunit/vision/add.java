package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class add<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d08<? super Throwable, ? extends T> f9300j;

    public static final class a<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final aed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d08<? super Throwable, ? extends T> f9301j;
        public io.reactivex.rxjava3.disposables.a k;

        public a(aed<? super T> aedVar, d08<? super Throwable, ? extends T> d08Var) {
            this.i = aedVar;
            this.f9301j = d08Var;
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
                T tApply = this.f9301j.apply(th);
                if (tApply != null) {
                    this.i.onNext(tApply);
                    this.i.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.i.onError(nullPointerException);
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

    public add(jdd<T> jddVar, d08<? super Throwable, ? extends T> d08Var) {
        super(jddVar);
        this.f9300j = d08Var;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new a(aedVar, this.f9300j));
    }
}
