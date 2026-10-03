package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Collection;

/* JADX INFO: loaded from: classes10.dex */
public final class vdd<T, U extends Collection<? super T>> extends m6<T, U> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f4j<U> f17817j;

    public static final class a<T, U extends Collection<? super T>> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final aed<? super U> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.a f17818j;
        public U k;

        public a(aed<? super U> aedVar, U u) {
            this.i = aedVar;
            this.k = u;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.f17818j.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.f17818j.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            U u = this.k;
            this.k = null;
            this.i.onNext(u);
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            this.k = null;
            this.i.onError(th);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            this.k.add(t);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.f17818j, aVar)) {
                this.f17818j = aVar;
                this.i.onSubscribe(this);
            }
        }
    }

    public vdd(jdd<T> jddVar, f4j<U> f4jVar) {
        super(jddVar);
        this.f17817j = f4jVar;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super U> aedVar) {
        try {
            this.i.subscribe(new a(aedVar, (Collection) ExceptionHelper.c(this.f17817j.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            hu6.b(th);
            EmptyDisposable.error(th, aedVar);
        }
    }
}
