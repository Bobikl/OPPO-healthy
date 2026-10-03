package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class zbd<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o14<? super T> f19352j;
    public final o14<? super Throwable> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Cdo f19353l;
    public final Cdo m;

    public static final class a<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final aed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final o14<? super T> f19354j;
        public final o14<? super Throwable> k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Cdo f19355l;
        public final Cdo m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.a f19356n;
        public boolean o;

        public a(aed<? super T> aedVar, o14<? super T> o14Var, o14<? super Throwable> o14Var2, Cdo cdo, Cdo cdo2) {
            this.i = aedVar;
            this.f19354j = o14Var;
            this.k = o14Var2;
            this.f19355l = cdo;
            this.m = cdo2;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.f19356n.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.f19356n.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            if (this.o) {
                return;
            }
            try {
                this.f19355l.run();
                this.o = true;
                this.i.onComplete();
                try {
                    this.m.run();
                } catch (Throwable th) {
                    hu6.b(th);
                    g4g.u(th);
                }
            } catch (Throwable th2) {
                hu6.b(th2);
                onError(th2);
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            if (this.o) {
                g4g.u(th);
                return;
            }
            this.o = true;
            try {
                this.k.accept(th);
            } catch (Throwable th2) {
                hu6.b(th2);
                th = new CompositeException(th, th2);
            }
            this.i.onError(th);
            try {
                this.m.run();
            } catch (Throwable th3) {
                hu6.b(th3);
                g4g.u(th3);
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (this.o) {
                return;
            }
            try {
                this.f19354j.accept(t);
                this.i.onNext(t);
            } catch (Throwable th) {
                hu6.b(th);
                this.f19356n.dispose();
                onError(th);
            }
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.f19356n, aVar)) {
                this.f19356n = aVar;
                this.i.onSubscribe(this);
            }
        }
    }

    public zbd(jdd<T> jddVar, o14<? super T> o14Var, o14<? super Throwable> o14Var2, Cdo cdo, Cdo cdo2) {
        super(jddVar);
        this.f19352j = o14Var;
        this.k = o14Var2;
        this.f19353l = cdo;
        this.m = cdo2;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new a(aedVar, this.f19352j, this.k, this.f19353l, this.m));
    }
}
