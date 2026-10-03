package io.reactivex.rxjava3.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.oi1;
import com.oplus.aiunit.vision.vu7;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.queue.SpscArrayQueue;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes10.dex */
final class BlockingFlowableIterable$BlockingFlowableIterator<T> extends AtomicReference<c3j> implements vu7<T>, Iterator<T>, Runnable, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 6695226475494099826L;
    final long batchSize;
    final Condition condition;
    volatile boolean done;
    volatile Throwable error;
    final long limit;
    final Lock lock;
    long produced;
    final SpscArrayQueue<T> queue;

    public BlockingFlowableIterable$BlockingFlowableIterator(int i) {
        this.queue = new SpscArrayQueue<>(i);
        this.batchSize = i;
        this.limit = i - (i >> 2);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        SubscriptionHelper.cancel(this);
        signalConsumer();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (!isDisposed()) {
            boolean z = this.done;
            boolean zIsEmpty = this.queue.isEmpty();
            if (z) {
                Throwable th = this.error;
                if (th != null) {
                    throw ExceptionHelper.h(th);
                }
                if (zIsEmpty) {
                    return false;
                }
            }
            if (!zIsEmpty) {
                return true;
            }
            oi1.b();
            this.lock.lock();
            while (!this.done && this.queue.isEmpty() && !isDisposed()) {
                try {
                    try {
                        this.condition.await();
                    } catch (InterruptedException e2) {
                        run();
                        throw ExceptionHelper.h(e2);
                    }
                } catch (Throwable th2) {
                    this.lock.unlock();
                    throw th2;
                }
            }
            this.lock.unlock();
        }
        Throwable th3 = this.error;
        if (th3 == null) {
            return false;
        }
        throw ExceptionHelper.h(th3);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tPoll = this.queue.poll();
        long j2 = this.produced + 1;
        if (j2 == this.limit) {
            this.produced = 0L;
            get().request(j2);
        } else {
            this.produced = j2;
        }
        return tPoll;
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onComplete() {
        this.done = true;
        signalConsumer();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        signalConsumer();
    }

    @Override // com.oplus.aiunit.vision.v2j
    public void onNext(T t) {
        if (this.queue.offer(t)) {
            signalConsumer();
        } else {
            SubscriptionHelper.cancel(this);
            onError(new MissingBackpressureException("Queue full?!"));
        }
    }

    @Override // com.oplus.aiunit.vision.vu7, com.oplus.aiunit.vision.v2j
    public void onSubscribe(c3j c3jVar) {
        SubscriptionHelper.setOnce(this, c3jVar, this.batchSize);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(EventType.STATE_PACKAGE_CHANGED_REMOVE);
    }

    @Override // java.lang.Runnable
    public void run() {
        SubscriptionHelper.cancel(this);
        signalConsumer();
    }

    public void signalConsumer() {
        this.lock.lock();
        try {
            this.condition.signalAll();
        } finally {
            this.lock.unlock();
        }
    }
}
