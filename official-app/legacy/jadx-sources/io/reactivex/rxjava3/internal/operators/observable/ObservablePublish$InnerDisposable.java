package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservablePublish$InnerDisposable<T> extends AtomicReference<ObservablePublish$PublishConnection<T>> implements io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 7463222674719692880L;
    final aed<? super T> downstream;

    public ObservablePublish$InnerDisposable(aed<? super T> aedVar, ObservablePublish$PublishConnection<T> observablePublish$PublishConnection) {
        this.downstream = aedVar;
        lazySet(observablePublish$PublishConnection);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        ObservablePublish$PublishConnection<T> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.remove(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == null;
    }
}
