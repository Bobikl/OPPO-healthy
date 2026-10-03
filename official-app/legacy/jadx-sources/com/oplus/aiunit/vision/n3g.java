package com.oplus.aiunit.vision;

import androidx.annotation.CallSuper;

/* JADX INFO: loaded from: classes15.dex */
@Deprecated
public abstract class n3g<T> extends m4g<T> {
    public String k;

    @Override // com.oplus.aiunit.vision.m4g, io.reactivex.rxjava3.disposables.a
    public void dispose() {
        super.dispose();
        g();
    }

    public final void g() {
        if (this.k != null) {
            i3g.b().a(this.k);
        }
    }

    public abstract void h(T t);

    public void j(String str) {
        this.k = str;
    }

    @Override // com.oplus.aiunit.vision.aed
    @CallSuper
    public void onComplete() {
        g();
    }

    @Override // com.oplus.aiunit.vision.aed
    @CallSuper
    public void onError(Throwable th) {
        g();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        try {
            h(t);
        } catch (Exception e2) {
            a7b.b("RxBusReceiver", e2.getMessage() + "");
        }
    }
}
