package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.kv5;

/* JADX INFO: loaded from: classes10.dex */
public final class i<T, B> extends kv5<B> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ObservableWindowBoundarySupplier$WindowBoundaryMainObserver<T, B> f20501j;
    public boolean k;

    public i(ObservableWindowBoundarySupplier$WindowBoundaryMainObserver<T, B> observableWindowBoundarySupplier$WindowBoundaryMainObserver) {
        this.f20501j = observableWindowBoundarySupplier$WindowBoundaryMainObserver;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.f20501j.innerComplete();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (this.k) {
            h4g.r(th);
        } else {
            this.k = true;
            this.f20501j.innerError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(B b) {
        if (this.k) {
            return;
        }
        this.k = true;
        dispose();
        this.f20501j.innerNext(this);
    }
}
