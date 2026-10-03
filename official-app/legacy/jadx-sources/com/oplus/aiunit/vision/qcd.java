package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class qcd<T> extends qr3 {
    public final kdd<T> i;

    public static final class a<T> implements bed<T>, cv5 {
        public final bs3 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public cv5 f15747j;

        public a(bs3 bs3Var) {
            this.i = bs3Var;
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            this.f15747j.dispose();
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.f15747j.isDisposed();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            this.i.onError(th);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(T t) {
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            this.f15747j = cv5Var;
            this.i.onSubscribe(this);
        }
    }

    public qcd(kdd<T> kddVar) {
        this.i = kddVar;
    }

    @Override // com.oplus.aiunit.vision.qr3
    public void b(bs3 bs3Var) {
        this.i.subscribe(new a(bs3Var));
    }
}
