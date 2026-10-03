package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class icd<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mpe<? super T> f12476j;

    public static final class a<T> extends lb1<T, T> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final mpe<? super T> f12477n;

        public a(aed<? super T> aedVar, mpe<? super T> mpeVar) {
            super(aedVar);
            this.f12477n = mpeVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (this.m != 0) {
                this.i.onNext(null);
                return;
            }
            try {
                if (this.f12477n.test(t)) {
                    this.i.onNext((Object) t);
                }
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // com.oplus.aiunit.vision.f4h
        public T poll() throws Throwable {
            T tPoll;
            do {
                tPoll = this.k.poll();
                if (tPoll == null) {
                    break;
                }
            } while (!this.f12477n.test(tPoll));
            return tPoll;
        }

        @Override // com.oplus.aiunit.vision.e7f
        public int requestFusion(int i) {
            return f(i);
        }
    }

    public icd(jdd<T> jddVar, mpe<? super T> mpeVar) {
        super(jddVar);
        this.f12476j = mpeVar;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new a(aedVar, this.f12476j));
    }
}
