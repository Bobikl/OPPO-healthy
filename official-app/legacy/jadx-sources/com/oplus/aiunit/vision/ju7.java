package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class ju7<T> extends wt7<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jdd<T> f13034j;

    public static final class a<T> implements aed<T>, c3j {
        public final v2j<? super T> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.a f13035j;

        public a(v2j<? super T> v2jVar) {
            this.i = v2jVar;
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void cancel() {
            this.f13035j.dispose();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            this.i.onComplete();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            this.i.onError(th);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            this.i.onNext(t);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            this.f13035j = aVar;
            this.i.onSubscribe(this);
        }

        @Override // com.oplus.aiunit.vision.c3j
        public void request(long j2) {
        }
    }

    public ju7(jdd<T> jddVar) {
        this.f13034j = jddVar;
    }

    @Override // com.oplus.aiunit.vision.wt7
    public void z(v2j<? super T> v2jVar) {
        this.f13034j.subscribe(new a(v2jVar));
    }
}
