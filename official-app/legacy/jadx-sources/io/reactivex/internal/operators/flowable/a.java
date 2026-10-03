package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.fc8;
import com.oplus.aiunit.vision.v2j;

/* JADX INFO: loaded from: classes10.dex */
public final class a<K, T> extends fc8<K, T> {
    public final FlowableGroupBy$State<T, K> k;

    public a(K k, FlowableGroupBy$State<T, K> flowableGroupBy$State) {
        super(k);
        this.k = flowableGroupBy$State;
    }

    public static <T, K> a<K, T> h(K k, int i, FlowableGroupBy$GroupBySubscriber<?, K, T> flowableGroupBy$GroupBySubscriber, boolean z) {
        return new a<>(k, new FlowableGroupBy$State(i, flowableGroupBy$GroupBySubscriber, k, z));
    }

    @Override // com.oplus.aiunit.vision.xt7
    public void g(v2j<? super T> v2jVar) {
        this.k.subscribe(v2jVar);
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
}
