package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableReplay$InnerDisposable<T> extends AtomicInteger implements cv5 {
    private static final long serialVersionUID = 2728361546769921047L;
    volatile boolean cancelled;
    final bed<? super T> child;
    Object index;
    final ObservableReplay$ReplayObserver<T> parent;

    public ObservableReplay$InnerDisposable(ObservableReplay$ReplayObserver<T> observableReplay$ReplayObserver, bed<? super T> bedVar) {
        this.parent = observableReplay$ReplayObserver;
        this.child = bedVar;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        this.parent.remove(this);
        this.index = null;
    }

    public <U> U index() {
        return (U) this.index;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.cancelled;
    }
}
