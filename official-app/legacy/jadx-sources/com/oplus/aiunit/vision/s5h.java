package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes10.dex */
public final class s5h<T> extends f5h<T> {
    public final s6h<T> i;

    public static final class a<T> implements l6h<T>, io.reactivex.rxjava3.disposables.a {
        public l6h<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.a f16478j;

        public a(l6h<? super T> l6hVar) {
            this.i = l6hVar;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.i = null;
            this.f16478j.dispose();
            this.f16478j = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.f16478j.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            this.f16478j = DisposableHelper.DISPOSED;
            l6h<? super T> l6hVar = this.i;
            if (l6hVar != null) {
                this.i = null;
                l6hVar.onError(th);
            }
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.f16478j, aVar)) {
                this.f16478j = aVar;
                this.i.onSubscribe(this);
            }
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            this.f16478j = DisposableHelper.DISPOSED;
            l6h<? super T> l6hVar = this.i;
            if (l6hVar != null) {
                this.i = null;
                l6hVar.onSuccess(t);
            }
        }
    }

    public s5h(s6h<T> s6hVar) {
        this.i = s6hVar;
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super T> l6hVar) {
        this.i.b(new a(l6hVar));
    }
}
