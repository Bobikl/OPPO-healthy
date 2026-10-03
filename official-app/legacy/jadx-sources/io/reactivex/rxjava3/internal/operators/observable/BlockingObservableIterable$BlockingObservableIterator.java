package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.oi1;
import com.oplus.aiunit.vision.xki;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes10.dex */
final class BlockingObservableIterable$BlockingObservableIterator<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements aed<T>, Iterator<T>, io.reactivex.rxjava3.disposables.a {
    private static final long serialVersionUID = 6695226475494099826L;
    final Condition condition;
    volatile boolean done;
    volatile Throwable error;
    final Lock lock;
    final xki<T> queue;

    public BlockingObservableIterable$BlockingObservableIterator(int i) {
        this.queue = new xki<>(i);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        DisposableHelper.dispose(this);
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
            try {
                oi1.b();
                this.lock.lock();
                while (!this.done && this.queue.isEmpty() && !isDisposed()) {
                    try {
                        this.condition.await();
                    } catch (Throwable th2) {
                        this.lock.unlock();
                        throw th2;
                    }
                }
                this.lock.unlock();
            } catch (InterruptedException e2) {
                DisposableHelper.dispose(this);
                signalConsumer();
                throw ExceptionHelper.h(e2);
            }
        }
        Throwable th3 = this.error;
        if (th3 == null) {
            return false;
        }
        throw ExceptionHelper.h(th3);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return DisposableHelper.isDisposed(get());
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            return this.queue.poll();
        }
        throw new NoSuchElementException();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        this.done = true;
        signalConsumer();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        signalConsumer();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        this.queue.offer(t);
        signalConsumer();
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this, aVar);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(EventType.STATE_PACKAGE_CHANGED_REMOVE);
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
