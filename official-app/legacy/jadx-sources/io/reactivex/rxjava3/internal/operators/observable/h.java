package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.jv5;

/* JADX INFO: loaded from: classes10.dex */
public final class h<T, B> extends jv5<B> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ObservableWindowBoundary$WindowBoundaryMainObserver<T, B> f20611j;
    public boolean k;

    public h(ObservableWindowBoundary$WindowBoundaryMainObserver<T, B> observableWindowBoundary$WindowBoundaryMainObserver) {
        this.f20611j = observableWindowBoundary$WindowBoundaryMainObserver;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.f20611j.innerComplete();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        if (this.k) {
            g4g.u(th);
        } else {
            this.k = true;
            this.f20611j.innerError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(B b) {
        if (this.k) {
            return;
        }
        this.f20611j.innerNext();
    }
}
