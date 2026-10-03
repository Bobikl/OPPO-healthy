package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.hc8;

/* JADX INFO: loaded from: classes10.dex */
public final class a<K, T> extends hc8<K, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ObservableGroupBy$State<T, K> f20606j;

    public a(K k, ObservableGroupBy$State<T, K> observableGroupBy$State) {
        super(k);
        this.f20606j = observableGroupBy$State;
    }

    public static <T, K> a<K, T> t1(K k, int i, ObservableGroupBy$GroupByObserver<?, K, T> observableGroupBy$GroupByObserver, boolean z) {
        return new a<>(k, new ObservableGroupBy$State(i, observableGroupBy$GroupByObserver, k, z));
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.f20606j.subscribe(aedVar);
    }

    public void onComplete() {
        this.f20606j.onComplete();
    }

    public void onError(Throwable th) {
        this.f20606j.onError(th);
    }

    public void onNext(T t) {
        this.f20606j.onNext(t);
    }
}
