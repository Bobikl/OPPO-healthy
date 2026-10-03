package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class qbd<T, U> extends m6<T, U> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f4j<? extends U> f15729j;
    public final kd1<? super U, ? super T> k;

    public static final class a<T, U> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final aed<? super U> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final kd1<? super U, ? super T> f15730j;
        public final U k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.a f15731l;
        public boolean m;

        public a(aed<? super U> aedVar, U u, kd1<? super U, ? super T> kd1Var) {
            this.i = aedVar;
            this.f15730j = kd1Var;
            this.k = u;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.f15731l.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.f15731l.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            if (this.m) {
                return;
            }
            this.m = true;
            this.i.onNext(this.k);
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            if (this.m) {
                g4g.u(th);
            } else {
                this.m = true;
                this.i.onError(th);
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (this.m) {
                return;
            }
            try {
                this.f15730j.accept(this.k, t);
            } catch (Throwable th) {
                hu6.b(th);
                this.f15731l.dispose();
                onError(th);
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.f15731l, aVar)) {
                this.f15731l = aVar;
                this.i.onSubscribe(this);
            }
        }
    }

    public qbd(jdd<T> jddVar, f4j<? extends U> f4jVar, kd1<? super U, ? super T> kd1Var) {
        super(jddVar);
        this.f15729j = f4jVar;
        this.k = kd1Var;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super U> aedVar) {
        try {
            U u = this.f15729j.get();
            Objects.requireNonNull(u, "The initialSupplier returned a null value");
            this.i.subscribe(new a(aedVar, u, this.k));
        } catch (Throwable th) {
            hu6.b(th);
            EmptyDisposable.error(th, aedVar);
        }
    }
}
