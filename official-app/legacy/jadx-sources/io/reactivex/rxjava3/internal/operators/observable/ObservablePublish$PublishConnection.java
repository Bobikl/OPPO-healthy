package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g4g;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservablePublish$PublishConnection<T> extends AtomicReference<ObservablePublish$InnerDisposable<T>[]> implements aed<T>, io.reactivex.rxjava3.disposables.a {
    static final ObservablePublish$InnerDisposable[] EMPTY = new ObservablePublish$InnerDisposable[0];
    static final ObservablePublish$InnerDisposable[] TERMINATED = new ObservablePublish$InnerDisposable[0];
    private static final long serialVersionUID = -3251430252873581268L;
    final AtomicReference<ObservablePublish$PublishConnection<T>> current;
    Throwable error;
    final AtomicBoolean connect = new AtomicBoolean();
    final AtomicReference<io.reactivex.rxjava3.disposables.a> upstream = new AtomicReference<>();

    public ObservablePublish$PublishConnection(AtomicReference<ObservablePublish$PublishConnection<T>> atomicReference) {
        this.current = atomicReference;
        lazySet(EMPTY);
    }

    public boolean add(ObservablePublish$InnerDisposable<T> observablePublish$InnerDisposable) {
        ObservablePublish$InnerDisposable<T>[] observablePublish$InnerDisposableArr;
        ObservablePublish$InnerDisposable[] observablePublish$InnerDisposableArr2;
        do {
            observablePublish$InnerDisposableArr = get();
            if (observablePublish$InnerDisposableArr == TERMINATED) {
                return false;
            }
            int length = observablePublish$InnerDisposableArr.length;
            observablePublish$InnerDisposableArr2 = new ObservablePublish$InnerDisposable[length + 1];
            System.arraycopy(observablePublish$InnerDisposableArr, 0, observablePublish$InnerDisposableArr2, 0, length);
            observablePublish$InnerDisposableArr2[length] = observablePublish$InnerDisposable;
        } while (!compareAndSet(observablePublish$InnerDisposableArr, observablePublish$InnerDisposableArr2));
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        getAndSet(TERMINATED);
        fue.a(this.current, this, null);
        DisposableHelper.dispose(this.upstream);
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return get() == TERMINATED;
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onComplete() {
        this.upstream.lazySet(DisposableHelper.DISPOSED);
        for (ObservablePublish$InnerDisposable<T> observablePublish$InnerDisposable : getAndSet(TERMINATED)) {
            observablePublish$InnerDisposable.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        io.reactivex.rxjava3.disposables.a aVar = this.upstream.get();
        DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
        if (aVar == disposableHelper) {
            g4g.u(th);
            return;
        }
        this.error = th;
        this.upstream.lazySet(disposableHelper);
        for (ObservablePublish$InnerDisposable<T> observablePublish$InnerDisposable : getAndSet(TERMINATED)) {
            observablePublish$InnerDisposable.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onNext(T t) {
        for (ObservablePublish$InnerDisposable<T> observablePublish$InnerDisposable : get()) {
            observablePublish$InnerDisposable.downstream.onNext(t);
        }
    }

    @Override // com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        DisposableHelper.setOnce(this.upstream, aVar);
    }

    public void remove(ObservablePublish$InnerDisposable<T> observablePublish$InnerDisposable) {
        ObservablePublish$InnerDisposable<T>[] observablePublish$InnerDisposableArr;
        ObservablePublish$InnerDisposable[] observablePublish$InnerDisposableArr2;
        do {
            observablePublish$InnerDisposableArr = get();
            int length = observablePublish$InnerDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (observablePublish$InnerDisposableArr[i] == observablePublish$InnerDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            observablePublish$InnerDisposableArr2 = EMPTY;
            if (length != 1) {
                observablePublish$InnerDisposableArr2 = new ObservablePublish$InnerDisposable[length - 1];
                System.arraycopy(observablePublish$InnerDisposableArr, 0, observablePublish$InnerDisposableArr2, 0, i);
                System.arraycopy(observablePublish$InnerDisposableArr, i + 1, observablePublish$InnerDisposableArr2, i, (length - i) - 1);
            }
        } while (!compareAndSet(observablePublish$InnerDisposableArr, observablePublish$InnerDisposableArr2));
    }
}
