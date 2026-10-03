package com.oplus.aiunit.vision;

import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class ku7<T, U> extends f6<T, U> {
    public final d08<? super T, ? extends U> k;

    public static final class a<T, U> extends kb1<T, U> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final d08<? super T, ? extends U> f13414n;

        public a(it3<? super U> it3Var, d08<? super T, ? extends U> d08Var) {
            super(it3Var);
            this.f13414n = d08Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.oplus.aiunit.vision.v2j
        public void onNext(T t) {
            if (this.f13221l) {
                return;
            }
            if (this.m != 0) {
                this.i.onNext(null);
                return;
            }
            try {
                U uApply = this.f13414n.apply(t);
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
            U uApply = this.f13414n.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }

        @Override // com.oplus.aiunit.vision.e7f
        public int requestFusion(int i) {
            return d(i);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.oplus.aiunit.vision.it3
        public boolean tryOnNext(T t) {
            if (this.f13221l) {
                return true;
            }
            if (this.m != 0) {
                this.i.tryOnNext(null);
                return true;
            }
            try {
                U uApply = this.f13414n.apply(t);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                return this.i.tryOnNext((Object) uApply);
            } catch (Throwable th) {
                c(th);
                return true;
            }
        }
    }

    public static final class b<T, U> extends nb1<T, U> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final d08<? super T, ? extends U> f13415n;

        public b(v2j<? super U> v2jVar, d08<? super T, ? extends U> d08Var) {
            super(v2jVar);
            this.f13415n = d08Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.oplus.aiunit.vision.v2j
        public void onNext(T t) {
            if (this.f14425l) {
                return;
            }
            if (this.m != 0) {
                this.i.onNext(null);
                return;
            }
            try {
                U uApply = this.f13415n.apply(t);
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
            U uApply = this.f13415n.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }

        @Override // com.oplus.aiunit.vision.e7f
        public int requestFusion(int i) {
            return d(i);
        }
    }

    public ku7(wt7<T> wt7Var, d08<? super T, ? extends U> d08Var) {
        super(wt7Var);
        this.k = d08Var;
    }

    @Override // com.oplus.aiunit.vision.wt7
    public void z(v2j<? super U> v2jVar) {
        if (v2jVar instanceof it3) {
            this.f11230j.y(new a((it3) v2jVar, this.k));
        } else {
            this.f11230j.y(new b(v2jVar, this.k));
        }
    }
}
