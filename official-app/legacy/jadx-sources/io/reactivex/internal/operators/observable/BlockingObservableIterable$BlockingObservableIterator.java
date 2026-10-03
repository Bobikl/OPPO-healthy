package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.pi1;
import com.oplus.aiunit.vision.yki;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes10.dex */
final class BlockingObservableIterable$BlockingObservableIterator<T> extends AtomicReference<cv5> implements bed<T>, Iterator<T>, cv5 {
    private static final long serialVersionUID = 6695226475494099826L;
    final Condition condition;
    volatile boolean done;
    Throwable error;
    final Lock lock;
    final yki<T> queue;

    public BlockingObservableIterable$BlockingObservableIterator(int i) {
        this.queue = new yki<>(i);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        this.condition = reentrantLock.newCondition();
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        DisposableHelper.dispose(this);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            boolean z = this.done;
            boolean zIsEmpty = this.queue.isEmpty();
            if (z) {
                Throwable th = this.error;
                if (th != null) {
                    throw ExceptionHelper.d(th);
                }
                if (zIsEmpty) {
                    return false;
                }
            }
            if (!zIsEmpty) {
                return true;
            }
            try {
                pi1.a();
                this.lock.lock();
                while (!this.done && this.queue.isEmpty()) {
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
                throw ExceptionHelper.d(e2);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
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

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.done = true;
        signalConsumer();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        signalConsumer();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        this.queue.offer(t);
        signalConsumer();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this, cv5Var);
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
