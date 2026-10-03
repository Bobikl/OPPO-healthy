package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.ec8;
import com.oplus.aiunit.vision.v2j;

/* JADX INFO: loaded from: classes10.dex */
public final class a<K, T> extends ec8<K, T> {
    public final FlowableGroupBy$State<T, K> k;

    public a(K k, FlowableGroupBy$State<T, K> flowableGroupBy$State) {
        super(k);
        this.k = flowableGroupBy$State;
    }

    public static <T, K> a<K, T> D(K k, int i, FlowableGroupBy$GroupBySubscriber<?, K, T> flowableGroupBy$GroupBySubscriber, boolean z) {
        return new a<>(k, new FlowableGroupBy$State(i, flowableGroupBy$GroupBySubscriber, k, z));
    }

    public void onComplete() {
        this.k.onComplete();
    }

    public void onError(Throwable th) {
        this.k.onError(th);
    }

    public void onNext(T t) {
        this.k.onNext(t);
    }

    @Override // com.oplus.aiunit.vision.wt7
    public void z(v2j<? super T> v2jVar) {
        this.k.subscribe(v2jVar);
    }
}
