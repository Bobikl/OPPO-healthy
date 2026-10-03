package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class iu7<T> extends xt7<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kbd<T> f12658j;

    public static final class a<T> implements bed<T>, c3j {
        public final v2j<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public cv5 f12659j;

        public a(v2j<? super T> v2jVar) {
            this.i = v2jVar;
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void cancel() {
            this.f12659j.dispose();
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
            this.i.onNext(t);
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            this.f12659j = cv5Var;
            this.i.onSubscribe(this);
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void request(long j2) {
        }
    }

    public iu7(kbd<T> kbdVar) {
        this.f12658j = kbdVar;
    }

    @Override // com.oplus.aiunit.vision.xt7
    public void g(v2j<? super T> v2jVar) {
        this.f12658j.subscribe(new a(v2jVar));
    }
}
