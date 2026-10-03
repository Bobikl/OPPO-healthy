package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.lv5;

/* JADX INFO: loaded from: classes10.dex */
public final class e<T, B> extends lv5<B> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FlowableWindowBoundary$WindowBoundaryMainSubscriber<T, B> f20472j;
    public boolean k;

    public e(FlowableWindowBoundary$WindowBoundaryMainSubscriber<T, B> flowableWindowBoundary$WindowBoundaryMainSubscriber) {
        this.f20472j = flowableWindowBoundary$WindowBoundaryMainSubscriber;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.f20472j.innerComplete();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        if (this.k) {
            h4g.r(th);
        } else {
            this.k = true;
            this.f20472j.innerError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(B b) {
        if (this.k) {
            return;
        }
        this.f20472j.innerNext();
    }
}
