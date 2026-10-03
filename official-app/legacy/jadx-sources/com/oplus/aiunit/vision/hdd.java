package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class hdd<T> extends f5h<T> {
    public final jdd<? extends T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final T f12110j;

    public static final class a<T> implements aed<T>, io.reactivex.rxjava3.disposables.a {
        public final l6h<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final T f12111j;
        public io.reactivex.rxjava3.disposables.a k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public T f12112l;
        public boolean m;

        public a(l6h<? super T> l6hVar, T t) {
            this.i = l6hVar;
            this.f12111j = t;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.k.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.k.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            if (this.m) {
                return;
            }
            this.m = true;
            T t = this.f12112l;
            this.f12112l = null;
            if (t == null) {
                t = this.f12111j;
            }
            if (t != null) {
                this.i.onSuccess(t);
            } else {
                this.i.onError(new NoSuchElementException());
            }
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
            if (this.f12112l == null) {
                this.f12112l = t;
                return;
            }
            this.m = true;
            this.k.dispose();
            this.i.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.k, aVar)) {
                this.k = aVar;
                this.i.onSubscribe(this);
            }
        }
    }

    public hdd(jdd<? extends T> jddVar, T t) {
        this.i = jddVar;
        this.f12110j = t;
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super T> l6hVar) {
        this.i.subscribe(new a(l6hVar, this.f12110j));
    }
}
