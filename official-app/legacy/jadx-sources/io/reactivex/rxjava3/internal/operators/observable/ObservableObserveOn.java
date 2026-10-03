package io.reactivex.rxjava3.internal.operators.observable;

import com.oplus.aiunit.vision.a7f;
import com.oplus.aiunit.vision.aed;
import com.oplus.aiunit.vision.cfg;
import com.oplus.aiunit.vision.e9k;
import com.oplus.aiunit.vision.f4h;
import com.oplus.aiunit.vision.g4g;
import com.oplus.aiunit.vision.hu6;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.m6;
import com.oplus.aiunit.vision.xki;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableObserveOn<T> extends m6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cfg f20571j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20572l;

    public static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements aed<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final int bufferSize;
        final boolean delayError;
        volatile boolean disposed;
        volatile boolean done;
        final aed<? super T> downstream;
        Throwable error;
        boolean outputFused;
        f4h<T> queue;
        int sourceMode;
        io.reactivex.rxjava3.disposables.a upstream;
        final cfg.c worker;

        public ObserveOnObserver(aed<? super T> aedVar, cfg.c cVar, boolean z, int i) {
            this.downstream = aedVar;
            this.worker = cVar;
            this.delayError = z;
            this.bufferSize = i;
        }

        public boolean checkTerminated(boolean z, boolean z2, aed<? super T> aedVar) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.error;
            if (this.delayError) {
                if (!z2) {
                    return false;
                }
                this.disposed = true;
                if (th != null) {
                    aedVar.onError(th);
                } else {
                    aedVar.onComplete();
                }
                this.worker.dispose();
                return true;
            }
            if (th != null) {
                this.disposed = true;
                this.queue.clear();
                aedVar.onError(th);
                this.worker.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.disposed = true;
            aedVar.onComplete();
            this.worker.dispose();
            return true;
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (this.outputFused || getAndIncrement() != 0) {
                return;
            }
            this.queue.clear();
        }

        public void drainFused() {
            int iAddAndGet = 1;
            while (!this.disposed) {
                boolean z = this.done;
                Throwable th = this.error;
                if (!this.delayError && z && th != null) {
                    this.disposed = true;
                    this.downstream.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                this.downstream.onNext(null);
                if (z) {
                    this.disposed = true;
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        this.downstream.onError(th2);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        public void drainNormal() {
            f4h<T> f4hVar = this.queue;
            aed<? super T> aedVar = this.downstream;
            int iAddAndGet = 1;
            while (!checkTerminated(this.done, f4hVar.isEmpty(), aedVar)) {
                while (true) {
                    boolean z = this.done;
                    try {
                        T tPoll = f4hVar.poll();
                        boolean z2 = tPoll == null;
                        if (checkTerminated(z, z2, aedVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        } else {
                            aedVar.onNext(tPoll);
                        }
                    } catch (Throwable th) {
                        hu6.b(th);
                        this.disposed = true;
                        this.upstream.dispose();
                        f4hVar.clear();
                        aedVar.onError(th);
                        this.worker.dispose();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, io.reactivex.rxjava3.disposables.a
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onError(Throwable th) {
            if (this.done) {
                g4g.u(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 2) {
                this.queue.offer(t);
            }
            schedule();
        }

        @Override // com.oplus.aiunit.vision.aed
        public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
            if (DisposableHelper.validate(this.upstream, aVar)) {
                this.upstream = aVar;
                if (aVar instanceof a7f) {
                    a7f a7fVar = (a7f) aVar;
                    int iRequestFusion = a7fVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = a7fVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        schedule();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = a7fVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new xki(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f4h
        public T poll() throws Throwable {
            return this.queue.poll();
        }

        @Override // io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.e7f
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        public void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.b(this);
            }
        }
    }

    public ObservableObserveOn(jdd<T> jddVar, cfg cfgVar, boolean z, int i) {
        super(jddVar);
        this.f20571j = cfgVar;
        this.k = z;
        this.f20572l = i;
    }

    @Override // com.oplus.aiunit.vision.lbd
    public void K0(aed<? super T> aedVar) {
        cfg cfgVar = this.f20571j;
        if (cfgVar instanceof e9k) {
            this.i.subscribe(aedVar);
        } else {
            this.i.subscribe(new ObserveOnObserver(aedVar, cfgVar.c(), this.k, this.f20572l));
        }
    }
}
