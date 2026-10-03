package io.reactivex.rxjava3.internal.observers;

import com.oplus.aiunit.vision.aed;
import io.reactivex.rxjava3.disposables.a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class BlockingObserver<T> extends AtomicReference<a> implements aed<T>, a {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public BlockingObserver(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        if (DisposableHelper.dispose(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == DisposableHelper.DISPOSED;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }
}
