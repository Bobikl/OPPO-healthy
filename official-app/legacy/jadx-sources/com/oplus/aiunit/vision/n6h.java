package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* JADX INFO: loaded from: classes10.dex */
public final class n6h<T> extends f5h<T> {
    public final s6h<? extends T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d08<? super Throwable, ? extends T> f14364j;
    public final T k;

    public final class a implements l6h<T> {
        public final l6h<? super T> i;

        public a(l6h<? super T> l6hVar) {
            this.i = l6hVar;
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            T tApply;
            n6h n6hVar = n6h.this;
            d08<? super Throwable, ? extends T> d08Var = n6hVar.f14364j;
            if (d08Var != null) {
                try {
                    tApply = d08Var.apply(th);
                } catch (Throwable th2) {
                    hu6.b(th2);
                    this.i.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                tApply = n6hVar.k;
            }
            if (tApply != null) {
                this.i.onSuccess(tApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th);
            this.i.onError(nullPointerException);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            this.i.onSubscribe(aVar);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            this.i.onSuccess(t);
        }
    }

    public n6h(s6h<? extends T> s6hVar, d08<? super Throwable, ? extends T> d08Var, T t) {
        this.i = s6hVar;
        this.f14364j = d08Var;
        this.k = t;
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super T> l6hVar) {
        this.i.b(new a(l6hVar));
    }
}
