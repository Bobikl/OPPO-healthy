package io.reactivex.subjects;

import com.oplus.aiunit.vision.abd;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.fue;
import com.oplus.aiunit.vision.g5h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.m6h;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleSubject<T> extends g5h<T> implements m6h<T> {
    public static final SingleDisposable[] m = new SingleDisposable[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final SingleDisposable[] f20660n = new SingleDisposable[0];
    public T k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Throwable f20662l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f20661j = new AtomicBoolean();
    public final AtomicReference<SingleDisposable<T>[]> i = new AtomicReference<>(m);

    public static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements cv5 {
        private static final long serialVersionUID = -7650903191002190468L;
        final m6h<? super T> downstream;

        public SingleDisposable(m6h<? super T> m6hVar, SingleSubject<T> singleSubject) {
            this.downstream = m6hVar;
            lazySet(singleSubject);
        }

        @Override // com.oplus.aiunit.vision.cv5
        public void dispose() {
            SingleSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.d(this);
            }
        }

        @Override // com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return get() == null;
        }
    }

    @Override // com.oplus.aiunit.vision.g5h
    public void b(m6h<? super T> m6hVar) {
        SingleDisposable<T> singleDisposable = new SingleDisposable<>(m6hVar, this);
        m6hVar.onSubscribe(singleDisposable);
        if (c(singleDisposable)) {
            if (singleDisposable.isDisposed()) {
                d(singleDisposable);
            }
        } else {
            Throwable th = this.f20662l;
            if (th != null) {
                m6hVar.onError(th);
            } else {
                m6hVar.onSuccess(this.k);
            }
        }
    }

    public boolean c(SingleDisposable<T> singleDisposable) {
        SingleDisposable<T>[] singleDisposableArr;
        SingleDisposable[] singleDisposableArr2;
        do {
            singleDisposableArr = this.i.get();
            if (singleDisposableArr == f20660n) {
                return false;
            }
            int length = singleDisposableArr.length;
            singleDisposableArr2 = new SingleDisposable[length + 1];
            System.arraycopy(singleDisposableArr, 0, singleDisposableArr2, 0, length);
            singleDisposableArr2[length] = singleDisposable;
        } while (!fue.a(this.i, singleDisposableArr, singleDisposableArr2));
        return true;
    }

    public void d(SingleDisposable<T> singleDisposable) {
        SingleDisposable<T>[] singleDisposableArr;
        SingleDisposable[] singleDisposableArr2;
        do {
            singleDisposableArr = this.i.get();
            int length = singleDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (singleDisposableArr[i] == singleDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                singleDisposableArr2 = m;
            } else {
                SingleDisposable[] singleDisposableArr3 = new SingleDisposable[length - 1];
                System.arraycopy(singleDisposableArr, 0, singleDisposableArr3, 0, i);
                System.arraycopy(singleDisposableArr, i + 1, singleDisposableArr3, i, (length - i) - 1);
                singleDisposableArr2 = singleDisposableArr3;
            }
        } while (!fue.a(this.i, singleDisposableArr, singleDisposableArr2));
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onError(Throwable th) {
        abd.d(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f20661j.compareAndSet(false, true)) {
            h4g.r(th);
            return;
        }
        this.f20662l = th;
        for (SingleDisposable<T> singleDisposable : this.i.getAndSet(f20660n)) {
            singleDisposable.downstream.onError(th);
        }
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSubscribe(cv5 cv5Var) {
        if (this.i.get() == f20660n) {
            cv5Var.dispose();
        }
    }

    @Override // com.oplus.aiunit.vision.m6h
    public void onSuccess(T t) {
        abd.d(t, "onSuccess called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f20661j.compareAndSet(false, true)) {
            this.k = t;
            for (SingleDisposable<T> singleDisposable : this.i.getAndSet(f20660n)) {
                singleDisposable.downstream.onSuccess(t);
            }
        }
    }
}
