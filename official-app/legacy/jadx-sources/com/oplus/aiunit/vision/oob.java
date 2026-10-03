package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes10.dex */
public final class oob<T> extends k6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o14<? super io.reactivex.rxjava3.disposables.a> f15000j;
    public final o14<? super T> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o14<? super Throwable> f15001l;
    public final Cdo m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Cdo f15002n;
    public final Cdo o;

    public static final class a<T> implements lob<T>, io.reactivex.rxjava3.disposables.a {
        public final lob<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final oob<T> f15003j;
        public io.reactivex.rxjava3.disposables.a k;

        public a(lob<? super T> lobVar, oob<T> oobVar) {
            this.i = lobVar;
            this.f15003j = oobVar;
        }

        public void a() {
            try {
                this.f15003j.f15002n.run();
            } catch (Throwable th) {
                hu6.b(th);
                g4g.u(th);
            }
        }

        public void b(Throwable th) {
            try {
                this.f15003j.f15001l.accept(th);
            } catch (Throwable th2) {
                hu6.b(th2);
                th = new CompositeException(th, th2);
            }
            this.k = DisposableHelper.DISPOSED;
            this.i.onError(th);
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            try {
                this.f15003j.o.run();
            } catch (Throwable th) {
                hu6.b(th);
                g4g.u(th);
            }
            this.k.dispose();
            this.k = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.k.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onComplete() {
            io.reactivex.rxjava3.disposables.a aVar = this.k;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (aVar == disposableHelper) {
                return;
            }
            try {
                this.f15003j.m.run();
                this.k = disposableHelper;
                this.i.onComplete();
                a();
            } catch (Throwable th) {
                hu6.b(th);
                b(th);
            }
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onError(Throwable th) {
            if (this.k == DisposableHelper.DISPOSED) {
                g4g.u(th);
            } else {
                b(th);
            }
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.k, aVar)) {
                try {
                    this.f15003j.f15000j.accept(aVar);
                    this.k = aVar;
                    this.i.onSubscribe(this);
                } catch (Throwable th) {
                    hu6.b(th);
                    aVar.dispose();
                    this.k = DisposableHelper.DISPOSED;
                    EmptyDisposable.error(th, this.i);
                }
            }
        }

        @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            io.reactivex.rxjava3.disposables.a aVar = this.k;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (aVar == disposableHelper) {
                return;
            }
            try {
                this.f15003j.k.accept(t);
                this.k = disposableHelper;
                this.i.onSuccess(t);
                a();
            } catch (Throwable th) {
                hu6.b(th);
                b(th);
            }
        }
    }

    public oob(pob<T> pobVar, o14<? super io.reactivex.rxjava3.disposables.a> o14Var, o14<? super T> o14Var2, o14<? super Throwable> o14Var3, Cdo cdo, Cdo cdo2, Cdo cdo3) {
        super(pobVar);
        this.f15000j = o14Var;
        this.k = o14Var2;
        this.f15001l = o14Var3;
        this.m = cdo;
        this.f15002n = cdo2;
        this.o = cdo3;
    }

    @Override // com.oplus.aiunit.vision.xnb
    public void l(lob<? super T> lobVar) {
        this.i.a(new a(lobVar, this));
    }
}
