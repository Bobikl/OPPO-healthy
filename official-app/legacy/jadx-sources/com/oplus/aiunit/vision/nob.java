package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class nob<T> extends k6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d08<? super Throwable, ? extends T> f14578j;

    public static final class a<T> implements lob<T>, io.reactivex.rxjava3.disposables.a {
        public final lob<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d08<? super Throwable, ? extends T> f14579j;
        public io.reactivex.rxjava3.disposables.a k;

        public a(lob<? super T> lobVar, d08<? super Throwable, ? extends T> d08Var) {
            this.i = lobVar;
            this.f14579j = d08Var;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.k.dispose();
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
            try {
                T tApply = this.f14579j.apply(th);
                Objects.requireNonNull(tApply, "The itemSupplier returned a null value");
                this.i.onSuccess(tApply);
            } catch (Throwable th2) {
                hu6.b(th2);
                this.i.onError(new CompositeException(th, th2));
            }
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
            this.i.onSuccess(t);
        }
    }

    public nob(pob<T> pobVar, d08<? super Throwable, ? extends T> d08Var) {
        super(pobVar);
        this.f14578j = d08Var;
    }

    @Override // com.oplus.aiunit.vision.xnb
    public void l(lob<? super T> lobVar) {
        this.i.a(new a(lobVar, this.f14578j));
    }
}
