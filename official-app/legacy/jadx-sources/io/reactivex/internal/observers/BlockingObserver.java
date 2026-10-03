package io.reactivex.internal.observers;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class BlockingObserver<T> extends AtomicReference<cv5> implements bed<T>, cv5 {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public BlockingObserver(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
    }
}
