package io.reactivex.internal.operators.flowable;

import com.oplus.aiunit.vision.c3j;
import com.oplus.aiunit.vision.c4h;
import com.oplus.aiunit.vision.eo;
import com.oplus.aiunit.vision.g6;
import com.oplus.aiunit.vision.iu6;
import com.oplus.aiunit.vision.v2j;
import com.oplus.aiunit.vision.wr0;
import com.oplus.aiunit.vision.wu7;
import com.oplus.aiunit.vision.xt7;
import com.oplus.aiunit.vision.yki;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes10.dex */
public final class FlowableOnBackpressureBuffer<T> extends g6<T, T> {
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f20469l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final eo f20470n;

    public static final class BackpressureBufferSubscriber<T> extends BasicIntQueueSubscription<T> implements wu7<T> {
        private static final long serialVersionUID = -2514538129242366402L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final v2j<? super T> downstream;
        Throwable error;
        final eo onOverflow;
        boolean outputFused;
        final c4h<T> queue;
        final AtomicLong requested = new AtomicLong();
        c3j upstream;

        public BackpressureBufferSubscriber(v2j<? super T> v2jVar, int i, boolean z, boolean z2, eo eoVar) {
            this.downstream = v2jVar;
            this.onOverflow = eoVar;
            this.delayError = z2;
            this.queue = z ? new yki<>(i) : new SpscArrayQueue<>(i);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, v2j<? super T> v2jVar) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            if (this.delayError) {
                if (!z2) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    v2jVar.onError(th);
                } else {
                    v2jVar.onComplete();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                v2jVar.onError(th2);
                return true;
            }
            if (!z2) {
                return false;
            }
            v2jVar.onComplete();
            return true;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                c4h<T> c4hVar = this.queue;
                v2j<? super T> v2jVar = this.downstream;
                int iAddAndGet = 1;
                while (!checkTerminated(this.done, c4hVar.isEmpty(), v2jVar)) {
                    long j2 = this.requested.get();
                    long j3 = 0;
                    while (j3 != j2) {
                        boolean z = this.done;
                        T tPoll = c4hVar.poll();
                        boolean z2 = tPoll == null;
                        if (checkTerminated(z, z2, v2jVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        }
                        v2jVar.onNext(tPoll);
                        j3++;
                    }
                    if (j3 == j2 && checkTerminated(this.done, c4hVar.isEmpty(), v2jVar)) {
                        return;
                    }
                    if (j3 != 0 && j2 != Long.MAX_VALUE) {
                        this.requested.addAndGet(-j3);
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onComplete() {
            this.done = true;
            if (this.outputFused) {
                this.downstream.onComplete();
            } else {
                drain();
            }
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            if (this.outputFused) {
                this.downstream.onError(th);
            } else {
                drain();
            }
        }

        @Override // com.oplus.aiunit.vision.v2j
        public void onNext(T t) {
            if (this.queue.offer(t)) {
                if (this.outputFused) {
                    this.downstream.onNext(null);
                    return;
                } else {
                    drain();
                    return;
                }
            }
            this.upstream.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.onOverflow.run();
            } catch (Throwable th) {
                iu6.b(th);
                missingBackpressureException.initCause(th);
            }
            onError(missingBackpressureException);
        }

        @Override // com.oplus.aiunit.vision.wu7, com.oplus.aiunit.vision.v2j
        public void onSubscribe(c3j c3jVar) {
            if (SubscriptionHelper.validate(this.upstream, c3jVar)) {
                this.upstream = c3jVar;
                this.downstream.onSubscribe(this);
                c3jVar.request(Long.MAX_VALUE);
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.g4h
        public T poll() throws Exception {
            return this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.c3j
        public void request(long j2) {
            if (this.outputFused || !SubscriptionHelper.validate(j2)) {
                return;
            }
            wr0.a(this.requested, j2);
            drain();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, com.oplus.aiunit.vision.f7f
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }
    }

    public FlowableOnBackpressureBuffer(xt7<T> xt7Var, int i, boolean z, boolean z2, eo eoVar) {
        super(xt7Var);
        this.k = i;
        this.f20469l = z;
        this.m = z2;
        this.f20470n = eoVar;
    }

    @Override // com.oplus.aiunit.vision.xt7
    public void g(v2j<? super T> v2jVar) {
        this.f11648j.f(new BackpressureBufferSubscriber(v2jVar, this.k, this.f20469l, this.m, this.f20470n));
    }
}
