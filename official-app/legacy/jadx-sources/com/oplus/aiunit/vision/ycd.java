package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;

/* JADX INFO: loaded from: classes10.dex */
public final class ycd<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d08<? super Throwable, ? extends jdd<? extends T>> f18973j;

    public static final class a<T> implements aed<T> {
        public final aed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d08<? super Throwable, ? extends jdd<? extends T>> f18974j;
        public final SequentialDisposable k = new SequentialDisposable();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f18975l;
        public boolean m;

        public a(aed<? super T> aedVar, d08<? super Throwable, ? extends jdd<? extends T>> d08Var) {
            this.i = aedVar;
            this.f18974j = d08Var;
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            if (this.m) {
                return;
            }
            this.m = true;
            this.f18975l = true;
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            if (this.f18975l) {
                if (this.m) {
                    g4g.u(th);
                    return;
                } else {
                    this.i.onError(th);
                    return;
                }
            }
            this.f18975l = true;
            try {
                jdd<? extends T> jddVarApply = this.f18974j.apply(th);
                if (jddVarApply != null) {
                    jddVarApply.subscribe(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th);
                this.i.onError(nullPointerException);
            } catch (Throwable th2) {
                hu6.b(th2);
                this.i.onError(new CompositeException(th, th2));
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (this.m) {
                return;
            }
            this.i.onNext(t);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            this.k.replace(aVar);
        }
    }

    public ycd(jdd<T> jddVar, d08<? super Throwable, ? extends jdd<? extends T>> d08Var) {
        super(jddVar);
        this.f18973j = d08Var;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        a aVar = new a(aedVar, this.f18973j);
        aedVar.onSubscribe(aVar.k);
        this.i.subscribe(aVar);
    }
}
