package com.oplus.aiunit.vision;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class ybd<T> extends n6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p14<? super T> f18957j;
    public final p14<? super Throwable> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final eo f18958l;
    public final eo m;

    public static final class a<T> implements bed<T>, cv5 {
        public final bed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final p14<? super T> f18959j;
        public final p14<? super Throwable> k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final eo f18960l;
        public final eo m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public cv5 f18961n;
        public boolean o;

        public a(bed<? super T> bedVar, p14<? super T> p14Var, p14<? super Throwable> p14Var2, eo eoVar, eo eoVar2) {
            this.i = bedVar;
            this.f18959j = p14Var;
            this.k = p14Var2;
            this.f18960l = eoVar;
            this.m = eoVar2;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            this.f18961n.dispose();
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.f18961n.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            if (this.o) {
                return;
            }
            try {
                this.f18960l.run();
                this.o = true;
                this.i.onComplete();
                try {
                    this.m.run();
                } catch (Throwable th) {
                    iu6.b(th);
                    h4g.r(th);
                }
            } catch (Throwable th2) {
                iu6.b(th2);
                onError(th2);
            }
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            if (this.o) {
                h4g.r(th);
                return;
            }
            this.o = true;
            try {
                this.k.accept(th);
            } catch (Throwable th2) {
                iu6.b(th2);
                th = new CompositeException(th, th2);
            }
            this.i.onError(th);
            try {
                this.m.run();
            } catch (Throwable th3) {
                iu6.b(th3);
                h4g.r(th3);
            }
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(T t) {
            if (this.o) {
                return;
            }
            try {
                this.f18959j.accept(t);
                this.i.onNext(t);
            } catch (Throwable th) {
                iu6.b(th);
                this.f18961n.dispose();
                onError(th);
            }
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            if (DisposableHelper.validate(this.f18961n, cv5Var)) {
                this.f18961n = cv5Var;
                this.i.onSubscribe(this);
            }
        }
    }

    public ybd(kdd<T> kddVar, p14<? super T> p14Var, p14<? super Throwable> p14Var2, eo eoVar, eo eoVar2) {
        super(kddVar);
        this.f18957j = p14Var;
        this.k = p14Var2;
        this.f18958l = eoVar;
        this.m = eoVar2;
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super T> bedVar) {
        this.i.subscribe(new a(bedVar, this.f18957j, this.k, this.f18958l, this.m));
    }
}
