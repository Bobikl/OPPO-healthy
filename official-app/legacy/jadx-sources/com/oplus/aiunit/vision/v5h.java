package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.exceptions.CompositeException;

/* JADX INFO: loaded from: classes10.dex */
public final class v5h<T> extends f5h<T> {
    public final s6h<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o14<? super Throwable> f17723j;

    public final class a implements l6h<T> {
        public final l6h<? super T> i;

        public a(l6h<? super T> l6hVar) {
            this.i = l6hVar;
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            try {
                v5h.this.f17723j.accept(th);
            } catch (Throwable th2) {
                hu6.b(th2);
                th = new CompositeException(th, th2);
            }
            this.i.onError(th);
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

    public v5h(s6h<T> s6hVar, o14<? super Throwable> o14Var) {
        this.i = s6hVar;
        this.f17723j = o14Var;
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super T> l6hVar) {
        this.i.b(new a(l6hVar));
    }
}
