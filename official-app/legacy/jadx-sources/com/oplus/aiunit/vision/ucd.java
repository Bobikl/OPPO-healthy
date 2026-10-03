package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class ucd<T, U> extends n6<T, U> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j08<? super T, ? extends U> f17413j;

    public static final class a<T, U> extends mb1<T, U> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final j08<? super T, ? extends U> f17414n;

        public a(bed<? super U> bedVar, j08<? super T, ? extends U> j08Var) {
            super(bedVar);
            this.f17414n = j08Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.oplus.aiunit.vision.bed
        public void onNext(T t) {
            if (this.f14008l) {
                return;
            }
            if (this.m != 0) {
                this.i.onNext(null);
                return;
            }
            try {
                this.i.onNext((Object) abd.d(this.f17414n.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // com.oplus.aiunit.vision.g4h
        public U poll() throws Exception {
            T tPoll = this.k.poll();
            if (tPoll != null) {
                return (U) abd.d(this.f17414n.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }

        @Override // com.oplus.aiunit.vision.f7f
        public int requestFusion(int i) {
            return d(i);
        }
    }

    public ucd(kdd<T> kddVar, j08<? super T, ? extends U> j08Var) {
        super(kddVar);
        this.f17413j = j08Var;
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super U> bedVar) {
        this.i.subscribe(new a(bedVar, this.f17413j));
    }
}
