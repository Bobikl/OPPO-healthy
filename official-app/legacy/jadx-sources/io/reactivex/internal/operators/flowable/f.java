package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.lv5;

/* JADX INFO: loaded from: classes10.dex */
public final class f<T, B> extends lv5<B> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FlowableWindowBoundarySupplier$WindowBoundaryMainSubscriber<T, B> f20473j;
    public boolean k;

    public f(FlowableWindowBoundarySupplier$WindowBoundaryMainSubscriber<T, B> flowableWindowBoundarySupplier$WindowBoundaryMainSubscriber) {
        this.f20473j = flowableWindowBoundarySupplier$WindowBoundaryMainSubscriber;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.f20473j.innerComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.k) {
            h4g.r(th);
        } else {
            this.k = true;
            this.f20473j.innerError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(B b) {
        if (this.k) {
            return;
        }
        this.k = true;
        dispose();
        this.f20473j.innerNext(this);
    }
}
