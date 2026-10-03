package io.reactivex.rxjava3.internal.operators.observable;

import O0O.O00;
import com.oplus.aiunit.vision.a7f;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f4j;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.lbd;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends AtomicInteger implements a7f<T>, Runnable {
        static final int FUSED = 1;
        static final int ON_COMPLETE = 3;
        static final int ON_NEXT = 2;
        static final int START = 0;
        private static final long serialVersionUID = 3880992722410194083L;
        final aed<? super T> observer;
        final T value;

        public ScalarDisposable(aed<? super T> aedVar, T t) {
            this.observer = aedVar;
            this.value = t;
        }

        @Override // com.oplus.aiunit.vision.f4h
        public void clear() {
            lazySet(3);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public void dispose() {
            set(3);
        }

        @Override // io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // com.oplus.aiunit.vision.f4h
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // com.oplus.aiunit.vision.f4h
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // com.oplus.aiunit.vision.f4h
        public T poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.value;
        }

        @Override // com.oplus.aiunit.vision.e7f
        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onNext(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onComplete();
                }
            }
        }

        public boolean offer(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    public static final class a<T, R> extends lbd<R> {
        public final T i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d08<? super T, ? extends jdd<? extends R>> f20583j;

        public a(T t, d08<? super T, ? extends jdd<? extends R>> d08Var) {
            this.i = t;
            this.f20583j = d08Var;
        }

        @Override // com.oplus.aiunit.vision.lbd
        public void K0(aed<? super R> aedVar) {
            try {
                jdd<? extends R> jddVarApply = this.f20583j.apply(this.i);
                Objects.requireNonNull(jddVarApply, "The mapper returned a null ObservableSource");
                jdd<? extends R> jddVar = jddVarApply;
                if (!(jddVar instanceof f4j)) {
                    jddVar.subscribe(aedVar);
                    return;
                }
                try {
                    Object obj = ((f4j) jddVar).get();
                    if (obj == null) {
                        EmptyDisposable.complete(aedVar);
                        return;
                    }
                    ScalarDisposable scalarDisposable = new ScalarDisposable(aedVar, obj);
                    aedVar.onSubscribe(scalarDisposable);
                    scalarDisposable.run();
                } catch (Throwable th) {
                    hu6.b(th);
                    EmptyDisposable.error(th, aedVar);
                }
            } catch (Throwable th2) {
                hu6.b(th2);
                EmptyDisposable.error(th2, aedVar);
            }
        }
    }

    public static <T, U> lbd<U> a(T t, d08<? super T, ? extends jdd<? extends U>> d08Var) {
        return g4g.q(new a(t, d08Var));
    }

    public static <T, R> boolean b(jdd<T> jddVar, aed<? super R> aedVar, d08<? super T, ? extends jdd<? extends R>> d08Var) {
        if (!(jddVar instanceof f4j)) {
            return false;
        }
        try {
            O00 o00 = (Object) ((f4j) jddVar).get();
            if (o00 == null) {
                EmptyDisposable.complete(aedVar);
                return true;
            }
            try {
                jdd<? extends R> jddVarApply = d08Var.apply(o00);
                Objects.requireNonNull(jddVarApply, "The mapper returned a null ObservableSource");
                jdd<? extends R> jddVar2 = jddVarApply;
                if (jddVar2 instanceof f4j) {
                    try {
                        Object obj = ((f4j) jddVar2).get();
                        if (obj == null) {
                            EmptyDisposable.complete(aedVar);
                            return true;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(aedVar, obj);
                        aedVar.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th) {
                        hu6.b(th);
                        EmptyDisposable.error(th, aedVar);
                        return true;
                    }
                } else {
                    jddVar2.subscribe(aedVar);
                }
                return true;
            } catch (Throwable th2) {
                hu6.b(th2);
                EmptyDisposable.error(th2, aedVar);
                return true;
            }
        } catch (Throwable th3) {
            hu6.b(th3);
            EmptyDisposable.error(th3, aedVar);
            return true;
        }
    }
}
