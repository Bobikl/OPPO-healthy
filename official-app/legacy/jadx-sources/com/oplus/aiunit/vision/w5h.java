package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class w5h<T> extends f5h<T> {
    public final s6h<T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o14<? super T> f18131j;

    public final class a implements l6h<T> {
        public final l6h<? super T> i;

        public a(l6h<? super T> l6hVar) {
            this.i = l6hVar;
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onError(Throwable th) {
            this.i.onError(th);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            this.i.onSubscribe(aVar);
        }

        @Override // com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            try {
                w5h.this.f18131j.accept(t);
                this.i.onSuccess(t);
            } catch (Throwable th) {
                hu6.b(th);
                this.i.onError(th);
            }
        }
    }

    public w5h(s6h<T> s6hVar, o14<? super T> o14Var) {
        this.i = s6hVar;
        this.f18131j = o14Var;
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super T> l6hVar) {
        this.i.b(new a(l6hVar));
    }
}
