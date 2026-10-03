package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.ic8;

/* JADX INFO: loaded from: classes10.dex */
public final class a<K, T> extends ic8<K, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ObservableGroupBy$State<T, K> f20493j;

    public a(K k, ObservableGroupBy$State<T, K> observableGroupBy$State) {
        super(k);
        this.f20493j = observableGroupBy$State;
    }

    public static <T, K> a<K, T> I(K k, int i, ObservableGroupBy$GroupByObserver<?, K, T> observableGroupBy$GroupByObserver, boolean z) {
        return new a<>(k, new ObservableGroupBy$State(i, observableGroupBy$GroupByObserver, k, z));
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super T> bedVar) {
        this.f20493j.subscribe(bedVar);
    }

    public void onComplete() {
        this.f20493j.onComplete();
    }

    public void onError(Throwable th) {
        this.f20493j.onError(th);
    }

    public void onNext(T t) {
        this.f20493j.onNext(t);
    }
}
