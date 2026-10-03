package io.reactivex.rxjava3.internal.operators.maybe;

import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.lob;
import com.oplus.aiunit.vision.pob;
import com.oplus.aiunit.vision.xnb;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class MaybeZipArray<T, R> extends xnb<R> {
    public final pob<? extends T>[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d08<? super Object[], ? extends R> f20546j;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements io.reactivex.rxjava3.disposables.a {
        private static final long serialVersionUID = -5556924161382950569L;
        final lob<? super R> downstream;
        final ZipMaybeObserver<T>[] observers;
        Object[] values;
        final d08<? super Object[], ? extends R> zipper;

        public ZipCoordinator(lob<? super R> lobVar, int i, d08<? super Object[], ? extends R> d08Var) {
            super(i);
            this.downstream = lobVar;
            this.zipper = d08Var;
            ZipMaybeObserver<T>[] zipMaybeObserverArr = new ZipMaybeObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                zipMaybeObserverArr[i2] = new ZipMaybeObserver<>(this, i2);
            }
            this.observers = zipMaybeObserverArr;
            this.values = new Object[i];
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (ZipMaybeObserver<T> zipMaybeObserver : this.observers) {
                    zipMaybeObserver.dispose();
                }
                this.values = null;
            }
        }

        public void disposeExcept(int i) {
            ZipMaybeObserver<T>[] zipMaybeObserverArr = this.observers;
            int length = zipMaybeObserverArr.length;
            for (int i2 = 0; i2 < i; i2++) {
                zipMaybeObserverArr[i2].dispose();
            }
            while (true) {
                i++;
                if (i >= length) {
                    return;
                } else {
                    zipMaybeObserverArr[i].dispose();
                }
            }
        }

        public void innerComplete(int i) {
            if (getAndSet(0) > 0) {
                disposeExcept(i);
                this.values = null;
                this.downstream.onComplete();
            }
        }

        public void innerError(Throwable th, int i) {
            if (getAndSet(0) <= 0) {
                g4g.u(th);
                return;
            }
            disposeExcept(i);
            this.values = null;
            this.downstream.onError(th);
        }

        public void innerSuccess(T t, int i) {
            Object[] objArr = this.values;
            if (objArr != null) {
                objArr[i] = t;
            }
            if (decrementAndGet() == 0) {
                try {
                    R rApply = this.zipper.apply(objArr);
                    Objects.requireNonNull(rApply, "The zipper returned a null value");
                    this.values = null;
                    this.downstream.onSuccess(rApply);
                } catch (Throwable th) {
                    hu6.b(th);
                    this.values = null;
                    this.downstream.onError(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return get() <= 0;
        }
    }

    public static final class ZipMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.a> implements lob<T> {
        private static final long serialVersionUID = 3323743579927613702L;
        final int index;
        final ZipCoordinator<T, ?> parent;

        public ZipMaybeObserver(ZipCoordinator<T, ?> zipCoordinator, int i) {
            this.parent = zipCoordinator;
            this.index = i;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onError(Throwable th) {
            this.parent.innerError(th, this.index);
        }

        @Override // com.oplus.aiunit.vision.lob
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            DisposableHelper.setOnce(this, aVar);
        }

        @Override // com.oplus.aiunit.vision.lob, com.oplus.aiunit.vision.l6h
        public void onSuccess(T t) {
            this.parent.innerSuccess(t, this.index);
        }
    }

    public final class a implements d08<T, R> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.d08
        public R apply(T t) throws Throwable {
            R rApply = MaybeZipArray.this.f20546j.apply(new Object[]{t});
            Objects.requireNonNull(rApply, "The zipper returned a null value");
            return rApply;
        }
    }

    public MaybeZipArray(pob<? extends T>[] pobVarArr, d08<? super Object[], ? extends R> d08Var) {
        this.i = pobVarArr;
        this.f20546j = d08Var;
    }

    @Override // com.oplus.aiunit.vision.xnb
    public void l(lob<? super R> lobVar) {
        pob<? extends T>[] pobVarArr = this.i;
        int length = pobVarArr.length;
        if (length == 1) {
            pobVarArr[0].a(new io.reactivex.rxjava3.internal.operators.maybe.a.C1030a(lobVar, new a()));
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(lobVar, length, this.f20546j);
        lobVar.onSubscribe(zipCoordinator);
        for (int i = 0; i < length && !zipCoordinator.isDisposed(); i++) {
            pob<? extends T> pobVar = pobVarArr[i];
            if (pobVar == null) {
                zipCoordinator.innerError(new NullPointerException("One of the sources is null"), i);
                return;
            }
            pobVar.a(zipCoordinator.observers[i]);
        }
    }
}
