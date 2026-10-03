package io.reactivex.rxjava3.internal.subscribers;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.vu7;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class BlockingSubscriber<T> extends AtomicReference<c3j> implements vu7<T>, c3j {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public BlockingSubscriber(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    public boolean isCancelled() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        this.queue.offer(NotificationLite.next(t));
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        if (SubscriptionHelper.setOnce(this, c3jVar)) {
            this.queue.offer(NotificationLite.subscription(this));
        }
    }

    @Override // com.oplus.aiunit.vision.c3j
    public void request(long j2) {
        get().request(j2);
    }
}
