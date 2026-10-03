package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.mv5;

/* JADX INFO: loaded from: classes10.dex */
public final class e<T, B> extends mv5<B> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FlowableWindowBoundary$WindowBoundaryMainSubscriber<T, B> f20537j;
    public boolean k;

    public e(FlowableWindowBoundary$WindowBoundaryMainSubscriber<T, B> flowableWindowBoundary$WindowBoundaryMainSubscriber) {
        this.f20537j = flowableWindowBoundary$WindowBoundaryMainSubscriber;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.f20537j.innerComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.k) {
            g4g.u(th);
        } else {
            this.k = true;
            this.f20537j.innerError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(B b) {
        if (this.k) {
            return;
        }
        this.f20537j.innerNext();
    }
}
