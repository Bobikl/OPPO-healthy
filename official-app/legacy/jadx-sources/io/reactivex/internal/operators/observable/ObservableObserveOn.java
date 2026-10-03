package io.reactivex.internal.operators.observable;

import com.oplus.aiunit.vision.b7f;
import com.oplus.aiunit.vision.bed;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.d9k;
import com.oplus.aiunit.vision.g4h;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.kdd;
import com.oplus.aiunit.vision.n6;
import com.oplus.aiunit.vision.yki;
import com.oplus.aiunit.vision.zeg;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableObserveOn<T> extends n6<T, T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zeg f20484j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f20485l;

    public static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements bed<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final int bufferSize;
        final boolean delayError;
        volatile boolean disposed;
        volatile boolean done;
        final bed<? super T> downstream;
        Throwable error;
        boolean outputFused;
        g4h<T> queue;
        int sourceMode;
        cv5 upstream;
        final zeg.c worker;

        public ObserveOnObserver(bed<? super T> bedVar, zeg.c cVar, boolean z, int i) {
            this.downstream = bedVar;
            this.worker = cVar;
            this.delayError = z;
            this.bufferSize = i;
        }

        public boolean checkTerminated(boolean z, boolean z2, bed<? super T> bedVar) {
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
                    bedVar.onError(th);
                } else {
                    bedVar.onComplete();
                }
                this.worker.dispose();
                return true;
            }
            if (th != null) {
                this.disposed = true;
                this.queue.clear();
                bedVar.onError(th);
                this.worker.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.disposed = true;
            bedVar.onComplete();
            this.worker.dispose();
            return true;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
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
            g4h<T> g4hVar = this.queue;
            bed<? super T> bedVar = this.downstream;
            int iAddAndGet = 1;
            while (!checkTerminated(this.done, g4hVar.isEmpty(), bedVar)) {
                while (true) {
                    boolean z = this.done;
                    try {
                        T tPoll = g4hVar.poll();
                        boolean z2 = tPoll == null;
                        if (checkTerminated(z, z2, bedVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        } else {
                            bedVar.onNext(tPoll);
                        }
                    } catch (Throwable th) {
                        iu6.b(th);
                        this.disposed = true;
                        this.upstream.dispose();
                        g4hVar.clear();
                        bedVar.onError(th);
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

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.cv5
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onError(Throwable th) {
            if (this.done) {
                h4g.r(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onNext(T t) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 2) {
                this.queue.offer(t);
            }
            schedule();
        }

        @Override // com.oplus.aiunit.vision.bed
        public void onSubscribe(cv5 cv5Var) {
            if (DisposableHelper.validate(this.upstream, cv5Var)) {
                this.upstream = cv5Var;
                if (cv5Var instanceof b7f) {
                    b7f b7fVar = (b7f) cv5Var;
                    int iRequestFusion = b7fVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = b7fVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        schedule();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = b7fVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new yki(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.g4h
        public T poll() throws Exception {
            return this.queue.poll();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, com.oplus.aiunit.vision.f7f
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

    public ObservableObserveOn(kdd<T> kddVar, zeg zegVar, boolean z, int i) {
        super(kddVar);
        this.f20484j = zegVar;
        this.k = z;
        this.f20485l = i;
    }

    @Override // com.oplus.aiunit.vision.kbd
    public void A(bed<? super T> bedVar) {
        zeg zegVar = this.f20484j;
        if (zegVar instanceof d9k) {
            this.i.subscribe(bedVar);
        } else {
            this.i.subscribe(new ObserveOnObserver(bedVar, zegVar.a(), this.k, this.f20485l));
        }
    }
}
