package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.EmptyComponent;

/* JADX INFO: loaded from: classes10.dex */
public final class xbd<T> extends m6<T, T> {

    public static final class a<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public aed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.a f18564j;

        public a(aed<? super T> aedVar) {
            this.i = aedVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            io.reactivex.rxjava3.disposables.a aVar = this.f18564j;
            this.f18564j = EmptyComponent.INSTANCE;
            this.i = EmptyComponent.asObserver();
            aVar.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.f18564j.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            aed<? super T> aedVar = this.i;
            this.f18564j = EmptyComponent.INSTANCE;
            this.i = EmptyComponent.asObserver();
            aedVar.onComplete();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            aed<? super T> aedVar = this.i;
            this.f18564j = EmptyComponent.INSTANCE;
            this.i = EmptyComponent.asObserver();
            aedVar.onError(th);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            this.i.onNext(t);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.f18564j, aVar)) {
                this.f18564j = aVar;
                this.i.onSubscribe(this);
            }
        }
    }

    public xbd(jdd<T> jddVar) {
        super(jddVar);
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new a(aedVar));
    }
}
