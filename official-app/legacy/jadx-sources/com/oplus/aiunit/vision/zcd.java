package com.oplus.aiunit.vision;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class zcd<T> extends n6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j08<? super Throwable, ? extends T> f19367j;

    public static final class a<T> implements bed<T>, cv5 {
        public final bed<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final j08<? super Throwable, ? extends T> f19368j;
        public cv5 k;

        public a(bed<? super T> bedVar, j08<? super Throwable, ? extends T> j08Var) {
            this.i = bedVar;
            this.f19368j = j08Var;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            this.k.dispose();
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.k.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            try {
                T tApply = this.f19368j.apply(th);
                if (tApply != null) {
                    this.i.onNext(tApply);
                    this.i.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.i.onError(nullPointerException);
                }
            } catch (Throwable th2) {
                iu6.b(th2);
                this.i.onError(new CompositeException(th, th2));
            }
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(T t) {
            this.i.onNext(t);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            if (DisposableHelper.validate(this.k, cv5Var)) {
                this.k = cv5Var;
                this.i.onSubscribe(this);
            }
        }
    }

    public zcd(kdd<T> kddVar, j08<? super Throwable, ? extends T> j08Var) {
        super(kddVar);
        this.f19367j = j08Var;
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super T> bedVar) {
        this.i.subscribe(new a(bedVar, this.f19367j));
    }
}
