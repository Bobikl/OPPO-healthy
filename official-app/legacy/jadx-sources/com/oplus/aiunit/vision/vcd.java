package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class vcd<T, U> extends m6<T, U> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d08<? super T, ? extends U> f17803j;

    public static final class a<T, U> extends lb1<T, U> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final d08<? super T, ? extends U> f17804n;

        public a(aed<? super U> aedVar, d08<? super T, ? extends U> d08Var) {
            super(aedVar);
            this.f17804n = d08Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (this.f13616l) {
                return;
            }
            if (this.m != 0) {
                this.i.onNext(null);
                return;
            }
            try {
                U uApply = this.f17804n.apply(t);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                this.i.onNext((Object) uApply);
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // com.oplus.aiunit.vision.f4h
        public U poll() throws Throwable {
            T tPoll = this.k.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f17804n.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }

        @Override // com.oplus.aiunit.vision.e7f
        public int requestFusion(int i) {
            return f(i);
        }
    }

    public vcd(jdd<T> jddVar, d08<? super T, ? extends U> d08Var) {
        super(jddVar);
        this.f17803j = d08Var;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super U> aedVar) {
        this.i.subscribe(new a(aedVar, this.f17803j));
    }
}
