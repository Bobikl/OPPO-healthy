package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservablePublish$InnerDisposable<T> extends AtomicReference<Object> implements cv5 {
    private static final long serialVersionUID = -1100270633763673112L;
    final bed<? super T> child;

    public ObservablePublish$InnerDisposable(bed<? super T> bedVar) {
        this.child = bedVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        Object andSet = getAndSet(this);
        if (andSet == null || andSet == this) {
            return;
        }
        ((c) andSet).a(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() == this;
    }

    public void setParent(c<T> cVar) {
        if (compareAndSet(null, cVar)) {
            return;
        }
        cVar.a(this);
    }
}
