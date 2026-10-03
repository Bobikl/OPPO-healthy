package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservableReplay$ReplayObserver<T> extends AtomicReference<cv5> implements bed<T>, cv5 {
    static final ObservableReplay$InnerDisposable[] EMPTY = new ObservableReplay$InnerDisposable[0];
    static final ObservableReplay$InnerDisposable[] TERMINATED = new ObservableReplay$InnerDisposable[0];
    private static final long serialVersionUID = -533785617179540163L;
    final d<T> buffer;
    boolean done;
    final AtomicReference<ObservableReplay$InnerDisposable[]> observers = new AtomicReference<>(EMPTY);
    final AtomicBoolean shouldConnect = new AtomicBoolean();

    public ObservableReplay$ReplayObserver(d<T> dVar) {
        this.buffer = dVar;
    }

    public boolean add(ObservableReplay$InnerDisposable<T> observableReplay$InnerDisposable) {
        ObservableReplay$InnerDisposable[] observableReplay$InnerDisposableArr;
        ObservableReplay$InnerDisposable[] observableReplay$InnerDisposableArr2;
        do {
            observableReplay$InnerDisposableArr = this.observers.get();
            if (observableReplay$InnerDisposableArr == TERMINATED) {
                return false;
            }
            int length = observableReplay$InnerDisposableArr.length;
            observableReplay$InnerDisposableArr2 = new ObservableReplay$InnerDisposable[length + 1];
            System.arraycopy(observableReplay$InnerDisposableArr, 0, observableReplay$InnerDisposableArr2, 0, length);
            observableReplay$InnerDisposableArr2[length] = observableReplay$InnerDisposable;
        } while (!fue.a(this.observers, observableReplay$InnerDisposableArr, observableReplay$InnerDisposableArr2));
        return true;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        this.observers.set(TERMINATED);
        DisposableHelper.dispose(this);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.observers.get() == TERMINATED;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.buffer.complete();
        replayFinal();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        if (this.done) {
            h4g.r(th);
            return;
        }
        this.done = true;
        this.buffer.error(th);
        replayFinal();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        if (this.done) {
            return;
        }
        this.buffer.next(t);
        replay();
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        if (DisposableHelper.setOnce(this, cv5Var)) {
            replay();
        }
    }

    public void remove(ObservableReplay$InnerDisposable<T> observableReplay$InnerDisposable) {
        ObservableReplay$InnerDisposable[] observableReplay$InnerDisposableArr;
        ObservableReplay$InnerDisposable[] observableReplay$InnerDisposableArr2;
        do {
            observableReplay$InnerDisposableArr = this.observers.get();
            int length = observableReplay$InnerDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (observableReplay$InnerDisposableArr[i].equals(observableReplay$InnerDisposable)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                observableReplay$InnerDisposableArr2 = EMPTY;
            } else {
                ObservableReplay$InnerDisposable[] observableReplay$InnerDisposableArr3 = new ObservableReplay$InnerDisposable[length - 1];
                System.arraycopy(observableReplay$InnerDisposableArr, 0, observableReplay$InnerDisposableArr3, 0, i);
                System.arraycopy(observableReplay$InnerDisposableArr, i + 1, observableReplay$InnerDisposableArr3, i, (length - i) - 1);
                observableReplay$InnerDisposableArr2 = observableReplay$InnerDisposableArr3;
            }
        } while (!fue.a(this.observers, observableReplay$InnerDisposableArr, observableReplay$InnerDisposableArr2));
    }

    public void replay() {
        for (ObservableReplay$InnerDisposable<T> observableReplay$InnerDisposable : this.observers.get()) {
            this.buffer.replay(observableReplay$InnerDisposable);
        }
    }

    public void replayFinal() {
        for (ObservableReplay$InnerDisposable<T> observableReplay$InnerDisposable : this.observers.getAndSet(TERMINATED)) {
            this.buffer.replay(observableReplay$InnerDisposable);
        }
    }
}
