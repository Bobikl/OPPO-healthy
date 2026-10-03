package io.reactivex.internal.operators.maybe;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.mob;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
final class MaybeZipArray$ZipCoordinator<T, R> extends AtomicInteger implements cv5 {
    private static final long serialVersionUID = -5556924161382950569L;
    final mob<? super R> downstream;
    final MaybeZipArray$ZipMaybeObserver<T>[] observers;
    final Object[] values;
    final j08<? super Object[], ? extends R> zipper;

    public MaybeZipArray$ZipCoordinator(mob<? super R> mobVar, int i, j08<? super Object[], ? extends R> j08Var) {
        super(i);
        this.downstream = mobVar;
        this.zipper = j08Var;
        MaybeZipArray$ZipMaybeObserver<T>[] maybeZipArray$ZipMaybeObserverArr = new MaybeZipArray$ZipMaybeObserver[i];
        for (int i2 = 0; i2 < i; i2++) {
            maybeZipArray$ZipMaybeObserverArr[i2] = new MaybeZipArray$ZipMaybeObserver<>(this, i2);
        }
        this.observers = maybeZipArray$ZipMaybeObserverArr;
        this.values = new Object[i];
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (getAndSet(0) > 0) {
            for (MaybeZipArray$ZipMaybeObserver<T> maybeZipArray$ZipMaybeObserver : this.observers) {
                maybeZipArray$ZipMaybeObserver.dispose();
            }
        }
    }

    public void disposeExcept(int i) {
        MaybeZipArray$ZipMaybeObserver<T>[] maybeZipArray$ZipMaybeObserverArr = this.observers;
        int length = maybeZipArray$ZipMaybeObserverArr.length;
        for (int i2 = 0; i2 < i; i2++) {
            maybeZipArray$ZipMaybeObserverArr[i2].dispose();
        }
        while (true) {
            i++;
            if (i >= length) {
                return;
            } else {
                maybeZipArray$ZipMaybeObserverArr[i].dispose();
            }
        }
    }

    public void innerComplete(int i) {
        if (getAndSet(0) > 0) {
            disposeExcept(i);
            this.downstream.onComplete();
        }
    }

    public void innerError(Throwable th, int i) {
        if (getAndSet(0) <= 0) {
            h4g.r(th);
        } else {
            disposeExcept(i);
            this.downstream.onError(th);
        }
    }

    public void innerSuccess(T t, int i) {
        this.values[i] = t;
        if (decrementAndGet() == 0) {
            try {
                this.downstream.onSuccess(abd.d(this.zipper.apply(this.values), "The zipper returned a null value"));
            } catch (Throwable th) {
                iu6.b(th);
                this.downstream.onError(th);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() <= 0;
    }
}
