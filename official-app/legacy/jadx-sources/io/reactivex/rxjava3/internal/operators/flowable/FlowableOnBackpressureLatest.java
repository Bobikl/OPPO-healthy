package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.f6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wt7;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowableOnBackpressureLatest<T> extends f6<T, T> {

    public static final class BackpressureLatestSubscriber<T> extends AbstractBackpressureThrottlingSubscriber<T, T> {
        private static final long serialVersionUID = 163080509307634843L;

        public BackpressureLatestSubscriber(v2j<? super T> v2jVar) {
            super(v2jVar);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.internal.operators.flowable.AbstractBackpressureThrottlingSubscriber, com.oplus.aiunit.vision.v2j
        public void onNext(T t) {
            this.current.lazySet((R) t);
            drain();
        }
    }

    public FlowableOnBackpressureLatest(wt7<T> wt7Var) {
        super(wt7Var);
    }

    @Override // com.oplus.aiunit.vision.wt7
    public void z(v2j<? super T> v2jVar) {
        this.f11230j.y(new BackpressureLatestSubscriber(v2jVar));
    }
}
