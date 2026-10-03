package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class jcd<T, R> extends m6<T, R> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d08<? super T, ? extends Iterable<? extends R>> f12839j;

    public static final class a<T, R> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final aed<? super R> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d08<? super T, ? extends Iterable<? extends R>> f12840j;
        public io.reactivex.rxjava3.disposables.a k;

        public a(aed<? super R> aedVar, d08<? super T, ? extends Iterable<? extends R>> d08Var) {
            this.i = aedVar;
            this.f12840j = d08Var;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.k.dispose();
            this.k = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.k.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            io.reactivex.rxjava3.disposables.a aVar = this.k;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (aVar == disposableHelper) {
                return;
            }
            this.k = disposableHelper;
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            io.reactivex.rxjava3.disposables.a aVar = this.k;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (aVar == disposableHelper) {
                g4g.u(th);
            } else {
                this.k = disposableHelper;
                this.i.onError(th);
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (this.k == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                aed<? super R> aedVar = this.i;
                for (R r : this.f12840j.apply(t)) {
                    try {
                        try {
                            Objects.requireNonNull(r, "The iterator returned a null value");
                            aedVar.onNext(r);
                        } catch (Throwable th) {
                            hu6.b(th);
                            this.k.dispose();
                            onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        hu6.b(th2);
                        this.k.dispose();
                        onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                hu6.b(th3);
                this.k.dispose();
                onError(th3);
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

    public jcd(jdd<T> jddVar, d08<? super T, ? extends Iterable<? extends R>> d08Var) {
        super(jddVar);
        this.f12839j = d08Var;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super R> aedVar) {
        this.i.subscribe(new a(aedVar, this.f12839j));
    }
}
