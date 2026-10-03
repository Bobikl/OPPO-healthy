package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class hu7<T> extends f6<T, T> {
    public final mpe<? super T> k;

    public static final class a<T> extends kb1<T, T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final mpe<? super T> f12275n;

        public a(it3<? super T> it3Var, mpe<? super T> mpeVar) {
            super(it3Var);
            this.f12275n = mpeVar;
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f13220j.request(1L);
        }

        @Override // com.oplus.aiunit.vision.f4h
        public T poll() throws Throwable {
            g7f<T> g7fVar = this.k;
            mpe<? super T> mpeVar = this.f12275n;
            while (true) {
                T tPoll = g7fVar.poll();
                if (tPoll == null) {
                    return null;
                }
                if (mpeVar.test(tPoll)) {
                    return tPoll;
                }
                if (this.m == 2) {
                    g7fVar.request(1L);
                }
            }
        }

        @Override // com.oplus.aiunit.vision.e7f
        public int requestFusion(int i) {
            return d(i);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.oplus.aiunit.vision.it3
        public boolean tryOnNext(T t) {
            if (this.f13221l) {
                return false;
            }
            if (this.m != 0) {
                return this.i.tryOnNext(null);
            }
            try {
                return this.f12275n.test(t) && this.i.tryOnNext((Object) t);
            } catch (Throwable th) {
                c(th);
                return true;
            }
        }
    }

    public static final class b<T> extends nb1<T, T> implements it3<T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final mpe<? super T> f12276n;

        public b(v2j<? super T> v2jVar, mpe<? super T> mpeVar) {
            super(v2jVar);
            this.f12276n = mpeVar;
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onNext(T t) {
            if (tryOnNext(t)) {
                return;
            }
            this.f14424j.request(1L);
        }

        @Override // com.oplus.aiunit.vision.f4h
        public T poll() throws Throwable {
            g7f<T> g7fVar = this.k;
            mpe<? super T> mpeVar = this.f12276n;
            while (true) {
                T tPoll = g7fVar.poll();
                if (tPoll == null) {
                    return null;
                }
                if (mpeVar.test(tPoll)) {
                    return tPoll;
                }
                if (this.m == 2) {
                    g7fVar.request(1L);
                }
            }
        }

        @Override // com.oplus.aiunit.vision.e7f
        public int requestFusion(int i) {
            return d(i);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.oplus.aiunit.vision.it3
        public boolean tryOnNext(T t) {
            if (this.f14425l) {
                return false;
            }
            if (this.m != 0) {
                this.i.onNext(null);
                return true;
            }
            try {
                boolean zTest = this.f12276n.test(t);
                if (zTest) {
                    this.i.onNext((Object) t);
                }
                return zTest;
            } catch (Throwable th) {
                c(th);
                return true;
            }
        }
    }

    public hu7(wt7<T> wt7Var, mpe<? super T> mpeVar) {
        super(wt7Var);
        this.k = mpeVar;
    }

    @Override // com.oplus.aiunit.vision.wt7
    public void z(v2j<? super T> v2jVar) {
        if (v2jVar instanceof it3) {
            this.f11230j.y(new a((it3) v2jVar, this.k));
        } else {
            this.f11230j.y(new b(v2jVar, this.k));
        }
    }
}
