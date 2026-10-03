package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.h4g;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class c<T> implements bed<T>, cv5 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ObservablePublish$InnerDisposable[] f20494l = new ObservablePublish$InnerDisposable[0];
    public static final ObservablePublish$InnerDisposable[] m = new ObservablePublish$InnerDisposable[0];
    public final AtomicReference<c<T>> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<ObservablePublish$InnerDisposable<T>[]> f20495j;
    public final AtomicReference<cv5> k;

    public void a(ObservablePublish$InnerDisposable<T> observablePublish$InnerDisposable) {
        ObservablePublish$InnerDisposable<T>[] observablePublish$InnerDisposableArr;
        ObservablePublish$InnerDisposable[] observablePublish$InnerDisposableArr2;
        do {
            observablePublish$InnerDisposableArr = this.f20495j.get();
            int length = observablePublish$InnerDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (observablePublish$InnerDisposableArr[i].equals(observablePublish$InnerDisposable)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                observablePublish$InnerDisposableArr2 = f20494l;
            } else {
                ObservablePublish$InnerDisposable[] observablePublish$InnerDisposableArr3 = new ObservablePublish$InnerDisposable[length - 1];
                System.arraycopy(observablePublish$InnerDisposableArr, 0, observablePublish$InnerDisposableArr3, 0, i);
                System.arraycopy(observablePublish$InnerDisposableArr, i + 1, observablePublish$InnerDisposableArr3, i, (length - i) - 1);
                observablePublish$InnerDisposableArr2 = observablePublish$InnerDisposableArr3;
            }
        } while (!fue.a(this.f20495j, observablePublish$InnerDisposableArr, observablePublish$InnerDisposableArr2));
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        AtomicReference<ObservablePublish$InnerDisposable<T>[]> atomicReference = this.f20495j;
        ObservablePublish$InnerDisposable<T>[] observablePublish$InnerDisposableArr = m;
        if (atomicReference.getAndSet(observablePublish$InnerDisposableArr) != observablePublish$InnerDisposableArr) {
            fue.a(this.i, this, null);
            DisposableHelper.dispose(this.k);
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.f20495j.get() == m;
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onComplete() {
        fue.a(this.i, this, null);
        for (ObservablePublish$InnerDisposable<T> observablePublish$InnerDisposable : this.f20495j.getAndSet(m)) {
            observablePublish$InnerDisposable.child.onComplete();
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onError(Throwable th) {
        fue.a(this.i, this, null);
        ObservablePublish$InnerDisposable<T>[] andSet = this.f20495j.getAndSet(m);
        if (andSet.length == 0) {
            h4g.r(th);
            return;
        }
        for (ObservablePublish$InnerDisposable<T> observablePublish$InnerDisposable : andSet) {
            observablePublish$InnerDisposable.child.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onNext(T t) {
        for (ObservablePublish$InnerDisposable<T> observablePublish$InnerDisposable : this.f20495j.get()) {
            observablePublish$InnerDisposable.child.onNext(t);
        }
    }

    @Override // com.oplus.aiunit.vision.bed
    public void onSubscribe(cv5 cv5Var) {
        DisposableHelper.setOnce(this.k, cv5Var);
    }
}
