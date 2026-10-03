package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class cu7<T> implements c3j {
    public final v2j<? super T> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final T f10243j;
    public boolean k;

    public cu7(T t, v2j<? super T> v2jVar) {
        this.f10243j = t;
        this.i = v2jVar;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        if (j2 <= 0 || this.k) {
            return;
        }
        this.k = true;
        v2j<? super T> v2jVar = this.i;
        v2jVar.onNext(this.f10243j);
        v2jVar.onComplete();
    }
}
