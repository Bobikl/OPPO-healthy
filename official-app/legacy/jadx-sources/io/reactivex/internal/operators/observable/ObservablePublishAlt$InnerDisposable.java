package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservablePublishAlt$InnerDisposable<T> extends AtomicReference<ObservablePublishAlt$PublishConnection<T>> implements cv5 {
    private static final long serialVersionUID = 7463222674719692880L;
    final bed<? super T> downstream;

    public ObservablePublishAlt$InnerDisposable(bed<? super T> bedVar, ObservablePublishAlt$PublishConnection<T> observablePublishAlt$PublishConnection) {
        this.downstream = bedVar;
        lazySet(observablePublishAlt$PublishConnection);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        ObservablePublishAlt$PublishConnection<T> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.remove(this);
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() == null;
    }
}
