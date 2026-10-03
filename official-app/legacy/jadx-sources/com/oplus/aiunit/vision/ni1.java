package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public final class ni1<T> extends mi1<T> {
    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (this.i == null) {
            this.f14073j = th;
        }
        countDown();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        if (this.i == null) {
            this.i = t;
            this.k.dispose();
            countDown();
        }
    }
}
