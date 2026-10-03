package com.oplus.aiunit.vision;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class gdd<T> extends g5h<T> {
    public final kdd<? extends T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final T f11723j;

    public static final class a<T> implements bed<T>, cv5 {
        public final m6h<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final T f11724j;
        public cv5 k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public T f11725l;
        public boolean m;

        public a(m6h<? super T> m6hVar, T t) {
            this.i = m6hVar;
            this.f11724j = t;
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
            if (this.m) {
                return;
            }
            this.m = true;
            T t = this.f11725l;
            this.f11725l = null;
            if (t == null) {
                t = this.f11724j;
            }
            if (t != null) {
                this.i.onSuccess(t);
            } else {
                this.i.onError(new NoSuchElementException());
            }
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            if (this.m) {
                h4g.r(th);
            } else {
                this.m = true;
                this.i.onError(th);
            }
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(T t) {
            if (this.m) {
                return;
            }
            if (this.f11725l == null) {
                this.f11725l = t;
                return;
            }
            this.m = true;
            this.k.dispose();
            this.i.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            if (DisposableHelper.validate(this.k, cv5Var)) {
                this.k = cv5Var;
                this.i.onSubscribe(this);
            }
        }
    }

    public gdd(kdd<? extends T> kddVar, T t) {
        this.i = kddVar;
        this.f11723j = t;
    }

    @Override // com.oplus.aiunit.vision.g5h
    public void b(m6h<? super T> m6hVar) {
        this.i.subscribe(new a(m6hVar, this.f11723j));
    }
}
