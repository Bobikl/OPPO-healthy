package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class k6h<T, R> extends f5h<R> {
    public final s6h<? extends T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d08<? super T, ? extends R> f13174j;

    public static final class a<T, R> implements l6h<T> {
        public final l6h<? super R> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d08<? super T, ? extends R> f13175j;

        public a(l6h<? super R> l6hVar, d08<? super T, ? extends R> d08Var) {
            this.i = l6hVar;
            this.f13175j = d08Var;
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
                R rApply = this.f13175j.apply(t);
                Objects.requireNonNull(rApply, "The mapper function returned a null value.");
                this.i.onSuccess(rApply);
            } catch (Throwable th) {
                hu6.b(th);
                onError(th);
            }
        }
    }

    public k6h(s6h<? extends T> s6hVar, d08<? super T, ? extends R> d08Var) {
        this.i = s6hVar;
        this.f13174j = d08Var;
    }

    @Override // com.oplus.aiunit.vision.f5h
    public void x(l6h<? super R> l6hVar) {
        this.i.b(new a(l6hVar, this.f13174j));
    }
}
