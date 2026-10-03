package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class hcd<T> extends n6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final npe<? super T> f12103j;

    public static final class a<T> extends mb1<T, T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final npe<? super T> f12104n;

        public a(bed<? super T> bedVar, npe<? super T> npeVar) {
            super(bedVar);
            this.f12104n = npeVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.oplus.aiunit.vision.bed
        public void onNext(T t) {
            if (this.m != 0) {
                this.i.onNext(null);
                return;
            }
            try {
                if (this.f12104n.test(t)) {
                    this.i.onNext((Object) t);
                }
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // com.oplus.aiunit.vision.g4h
        public T poll() throws Exception {
            T tPoll;
            do {
                tPoll = this.k.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f12104n.test(tPoll));
            return tPoll;
        }

        @Override // com.oplus.aiunit.vision.f7f
        public int requestFusion(int i) {
            return d(i);
        }
    }

    public hcd(kdd<T> kddVar, npe<? super T> npeVar) {
        super(kddVar);
        this.f12103j = npeVar;
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super T> bedVar) {
        this.i.subscribe(new a(bedVar, this.f12103j));
    }
}
