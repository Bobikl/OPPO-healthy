package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.Cdo;
import com.oplus.aiunit.vision.a7f;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.m6;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableDoFinally<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Cdo f20562j;

    public static final class DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements aed<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final aed<? super T> downstream;
        final Cdo onFinally;
        a7f<T> qd;
        boolean syncFused;
        io.reactivex.rxjava3.disposables.a upstream;

        public DoFinallyObserver(aed<? super T> aedVar, Cdo cdo) {
            this.downstream = aedVar;
            this.onFinally = cdo;
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
        public void clear() {
            this.qd.clear();
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
        public void dispose() {
            this.upstream.dispose();
            runFinally();
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
        public boolean isEmpty() {
            return this.qd.isEmpty();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            this.downstream.onError(th);
            runFinally();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.upstream, aVar)) {
                this.upstream = aVar;
                if (aVar instanceof a7f) {
                    this.qd = (a7f) aVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
        public T poll() throws Throwable {
            T tPoll = this.qd.poll();
            if (tPoll == null && this.syncFused) {
                runFinally();
            }
            return tPoll;
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.e7f
        public int requestFusion(int i) {
            a7f<T> a7fVar = this.qd;
            if (a7fVar == null || (i & 4) != 0) {
                return 0;
            }
            int iRequestFusion = a7fVar.requestFusion(i);
            if (iRequestFusion != 0) {
                this.syncFused = iRequestFusion == 1;
            }
            return iRequestFusion;
        }

        public void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    hu6.b(th);
                    g4g.u(th);
                }
            }
        }
    }

    public ObservableDoFinally(jdd<T> jddVar, Cdo cdo) {
        super(jddVar);
        this.f20562j = cdo;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        this.i.subscribe(new DoFinallyObserver(aedVar, this.f20562j));
    }
}
