package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
final class ObservablePublishAlt$PublishConnection<T> extends AtomicReference<ObservablePublishAlt$InnerDisposable<T>[]> implements bed<T>, cv5 {
    static final ObservablePublishAlt$InnerDisposable[] EMPTY = new ObservablePublishAlt$InnerDisposable[0];
    static final ObservablePublishAlt$InnerDisposable[] TERMINATED = new ObservablePublishAlt$InnerDisposable[0];
    private static final long serialVersionUID = -3251430252873581268L;
    final AtomicReference<ObservablePublishAlt$PublishConnection<T>> current;
    Throwable error;
    final AtomicBoolean connect = new AtomicBoolean();
    final AtomicReference<cv5> upstream = new AtomicReference<>();

    public ObservablePublishAlt$PublishConnection(AtomicReference<ObservablePublishAlt$PublishConnection<T>> atomicReference) {
        this.current = atomicReference;
        lazySet(EMPTY);
    }

    public boolean add(ObservablePublishAlt$InnerDisposable<T> observablePublishAlt$InnerDisposable) {
        ObservablePublishAlt$InnerDisposable<T>[] observablePublishAlt$InnerDisposableArr;
        ObservablePublishAlt$InnerDisposable[] observablePublishAlt$InnerDisposableArr2;
        do {
            observablePublishAlt$InnerDisposableArr = get();
            if (observablePublishAlt$InnerDisposableArr == TERMINATED) {
                return false;
            }
            int length = observablePublishAlt$InnerDisposableArr.length;
            observablePublishAlt$InnerDisposableArr2 = new ObservablePublishAlt$InnerDisposable[length + 1];
            System.arraycopy(observablePublishAlt$InnerDisposableArr, 0, observablePublishAlt$InnerDisposableArr2, 0, length);
            observablePublishAlt$InnerDisposableArr2[length] = observablePublishAlt$InnerDisposable;
        } while (!compareAndSet(observablePublishAlt$InnerDisposableArr, observablePublishAlt$InnerDisposableArr2));
        return true;
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        getAndSet(TERMINATED);
        fue.a(this.current, this, null);
        DisposableHelper.dispose(this.upstream);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() == TERMINATED;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        this.upstream.lazySet(DisposableHelper.DISPOSED);
        for (ObservablePublishAlt$InnerDisposable<T> observablePublishAlt$InnerDisposable : getAndSet(TERMINATED)) {
            observablePublishAlt$InnerDisposable.downstream.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        this.error = th;
        this.upstream.lazySet(DisposableHelper.DISPOSED);
        for (ObservablePublishAlt$InnerDisposable<T> observablePublishAlt$InnerDisposable : getAndSet(TERMINATED)) {
            observablePublishAlt$InnerDisposable.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        for (ObservablePublishAlt$InnerDisposable<T> observablePublishAlt$InnerDisposable : get()) {
            observablePublishAlt$InnerDisposable.downstream.onNext(t);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this.upstream, cv5Var);
    }

    public void remove(ObservablePublishAlt$InnerDisposable<T> observablePublishAlt$InnerDisposable) {
        ObservablePublishAlt$InnerDisposable<T>[] observablePublishAlt$InnerDisposableArr;
        ObservablePublishAlt$InnerDisposable[] observablePublishAlt$InnerDisposableArr2;
        do {
            observablePublishAlt$InnerDisposableArr = get();
            int length = observablePublishAlt$InnerDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (observablePublishAlt$InnerDisposableArr[i] == observablePublishAlt$InnerDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            observablePublishAlt$InnerDisposableArr2 = EMPTY;
            if (length != 1) {
                observablePublishAlt$InnerDisposableArr2 = new ObservablePublishAlt$InnerDisposable[length - 1];
                System.arraycopy(observablePublishAlt$InnerDisposableArr, 0, observablePublishAlt$InnerDisposableArr2, 0, i);
                System.arraycopy(observablePublishAlt$InnerDisposableArr, i + 1, observablePublishAlt$InnerDisposableArr2, i, (length - i) - 1);
            }
        } while (!compareAndSet(observablePublishAlt$InnerDisposableArr, observablePublishAlt$InnerDisposableArr2));
    }
}
